package p20220322.exercise;

//1~6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성
//생성된 값을 정수배열 (크기 5)를 선언 후 값을 저장후 가장 큰값을 구하는 코드 작성
public class Exam4 {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 6) + 1; // 0<= X <6
		}
		// 가장 큰값 구하기
		int max = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (max < intAry[i]) {
				max = intAry[i];
			}

		}
		System.out.println("최대값: "+max);
	}
}