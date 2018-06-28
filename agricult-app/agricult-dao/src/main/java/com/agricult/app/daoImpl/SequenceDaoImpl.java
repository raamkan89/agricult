package com.agricult.app.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.SequenceDao;
import com.agricult.app.dao.entities.SequenceId;
import com.agricult.app.exception.SequenceException;
import com.mongodb.WriteResult;

@Repository
public class SequenceDaoImpl implements SequenceDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public long getNextSequenceId(String key) {
		System.out.println("---------------inside DaoImpl");
		//get SequenceId
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(key));
		System.out.println("---------------inside DaoImpl" + query);
		//Increase sequence by 1
		Update update = new Update();
		update.inc("seq", 1);
		
		System.out.println("---------------inside DaoImpl MongoTemplate ---------------- " + mongoTemplate);
		SequenceId sequenceId = mongoTemplate.findAndModify(query, update, SequenceId.class);
		System.out.println("---------------inside DaoImpl" + sequenceId);
		if(sequenceId == null) {
			throw new SequenceException("Unable to get sequence id for key : " + key);
		}
		return sequenceId.getSeq();
	}

}
