package p202220322.exercise;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum =ssn.substring(0,6); //배열 0부터 6개
		System.out.println(firstNum);
		
		String secondNum =ssn.substring(7);
		System.out.println(secondNum);
	}

}