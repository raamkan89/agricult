package com.agricult.app.utility;

public class AgricultUtility {

	private static int farmerId;
	private static int merchantId;
	private static int consumerId;

	public static String generateUserId(Occupation type) {
		if ((type.toString()).equals("FARMER")) {
			System.out.println("----FARMER----" + type.toString());
			return generateFarmerId("FARM");
		} else if ((type.toString()).equals("MERCHANT")) {
			System.out.println("----MERCHANT----" + type.toString());
			return generateMerchantId("MERC");
		} else if ((type.toString()).equals("CONSUMER")) {
			System.out.println("----CONSUMER----" + type.toString());
			return generateConsumerId("CONS");
		}
		System.out.println("----NO ENUM----");
		return "";
	}

	private static String generateFarmerId(String type) {
		StringBuilder sb = new StringBuilder();
		farmerId++;
		sb.append(type).append(generateId(farmerId)).toString();
		return sb.toString();
	}

	private static String generateMerchantId(String type) {
		StringBuilder sb = new StringBuilder();
		merchantId++;
		sb.append(type).append(generateId(merchantId)).toString();
		return sb.toString();
	}

	private static String generateConsumerId(String type) {
		StringBuilder sb = new StringBuilder();
		consumerId++;
		sb.append(type).append(generateId(consumerId)).toString();
		return sb.toString();
	}

	private static String generateId(int id) {
		StringBuilder sbBuilder = new StringBuilder();
		String userId = String.valueOf(id);
		while (sbBuilder.length() + userId.length() < 6) {
			sbBuilder.append('0');
		}
		sbBuilder.append(userId);
		return sbBuilder.toString();
	}

}
