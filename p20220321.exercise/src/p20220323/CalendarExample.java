package p20220323;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		createCalendar(2022,7);
		
	}
	public static void createCalendar(int year,int month) {
//		Calendar now = Calendar.getInstance();
//		int mon = now .get(Calendar.MONTH)+1;
	
	
	
//	public static void main(String[] args) {
		
//		int year = 2022;
//		int month = 5; //5월
//		

		
//	createCalendar(year,month);
		
		Calendar today = Calendar.getInstance();
		month = month-1; //1월 0 배열느낌~~
		//날짜지정
		today.set(year,month, 1);// 2022년 3월 1일
		System.out.println("올해는: " + today.get(Calendar.YEAR));
		System.out.println("이번달은: " + (today.get(Calendar.MONTH) + 1)); // 1월이 0부터 시작
		System.out.println("오늘은: " + today.get(Calendar.DATE));
		System.out.println("요일정보: " + today.get(Calendar.DAY_OF_WEEK)); // 1은 일요일 2:월 3:화 ~~
		System.out.println("마지막날의 정보: " + today.getActualMaximum(Calendar.DATE));
		System.out.println("==================================================");

		
		
		
		int gepDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		//요일정보출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		//1일의 위치 지정
		for (int i = 1; i < gepDay; i++) {
			System.out.printf("%4s", "");
		}
		//실제 날짜 출력 
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gepDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
		//프로그램 끝 부분 
		System.out.println("\n end of prog");
	}

}
