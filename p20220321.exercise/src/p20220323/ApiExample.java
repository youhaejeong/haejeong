package p20220323;

public class ApiExample {
	public static void main(String[] args) {
		Math.random(); //new Math();
		long result =Math.round(3.5); //반올림 
		System.out.println("Math.round 반올림결과값: " +result);
		double r1 = Math.ceil(3.1);
		System.out.println("Math.ceil 올림결과값: "+r1);
		r1 = Math.floor(3.9);
		System.out.println("Math.floor의 소수점아래는 버림: "+r1);
		r1 = Math.abs(-30);
		System.out.println("Math.abs의 절대값: "+r1);
		
		System.out.println("===end of prog===");
	}

}
