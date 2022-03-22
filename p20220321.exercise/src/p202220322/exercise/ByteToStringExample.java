package p202220322.exercise;

public class ByteToStringExample {
	//아스키 코드활용함 바이트 안에 숫자는 아스키 코드 
	public static void main(String[] args) {
		byte[] bytes = {72 ,101,108,108,111,32,74,97,118,97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
	}

}
