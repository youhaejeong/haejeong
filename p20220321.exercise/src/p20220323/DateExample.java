package p20220323;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		
		Date today=new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf.format(today));
		System.out.println("==================================================");
		Date today1 = new Date("2022/01/01/ 00:00:00");
		today1.setYear(1); //기준 1900년
		System.out.println(today1);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf1.format(today1));
		System.out.println("==================================================");
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear()+"년");
		System.out.println("==================================================");
	}

}
