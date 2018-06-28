package com.agricult.app.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.agricult.app.dao.SignUpDao;
import com.agricult.app.dao.entities.User;
import com.agricult.app.repository.SignUpLoginRepository;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	private static int count = 0;

	@Autowired
	private SignUpLoginRepository signUpLoginRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public User signUpDetails(User userDetails) {
		userDetails.setId(++count);
		return signUpLoginRepository.save(userDetails);
	}

	@Override
	public User userIdDetails(String firstName, String dob) {
		User user = signUpLoginRepository.findByFirstNameAndDob(firstName, dob);
		System.out.println("----User Details for get operation----" + user);
		return user;
	}

	@Override
	public User confirmRegister(String dob, String userId, String password) {
		System.out.println("---------------inside confirmRegister DAO Impl");
		// get SequenceId
		Query query = new Query();
		query.addCriteria(Criteria.where("dob").is(dob));
		query.addCriteria(Criteria.where("userId").is(userId));
		System.out.println("---------------query inside DaoImpl" + query);
		User user = mongoTemplate.findOne(query, User.class);
		System.out.println("---------------inside DaoImpl" + user);
		user.setPassword(password);
		mongoTemplate.save(user);
		return user;
	}

}
