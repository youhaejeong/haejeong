package p20220322.exercise;
// 문제1 정수형 변수 넘 1과 넘 2를 선언 학 ㅗ두수중에서 큰수에서 작은수를 뺀 결과를 저장하는 변수 result
public class Exam1 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 =25;
		num2 = 30;
		if(num1 > num2) {
			result = num1 - num2;
		}else {
			result = num2 - num1;
		}
		System.out.println("result=> "+result);
	}

}
