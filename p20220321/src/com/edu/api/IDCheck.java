package com.edu.api;

public class IDCheck {

	public String getGender(String ssn) {
		String ment = null;
		char sex = 0;
		int length = ssn.length();
		if (length == 14) {
			sex = ssn.charAt(7);

		} else if (length == 13) {
			sex = ssn.charAt(6);

		}
		switch (sex) {
		case '1':
		case '3':
			ment = "남자입니다";
			break;
		case '2':
		case '4':
			ment = "여자입니다";
			break;

//		} else if (length == 13) {
//			char sex = ssn.charAt(6);
//			switch (sex) {
//			case '1':
//			case '3':
//				ment = "남자입니다";
//				break;
//			case '2':
//			case '4':
//				ment = "여자입니다";
//				break;
//			}
//		}else {
//			ment="잘못된 값입니다";
//		}

//	}
		}
		return ment;
	}
}