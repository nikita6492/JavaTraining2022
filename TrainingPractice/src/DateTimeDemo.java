import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today =LocalDate.now();
		System.out.println("CurrentDate::"+today);
		
		LocalDate firstDay = LocalDate.of(2018, Month.APRIL, 25);
		System.out.println("SpecificDate::"+firstDay);
		
		LocalDate todayKol =LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("ZoneDate::"+todayKol);
		
		LocalDate dateFromBase =LocalDate.ofEpochDay(365);
		System.out.println("365th day from base::"+dateFromBase);
		
		LocalDate day2021 = LocalDate.ofYearDay(2021, 50);
		System.out.println("50th day of year::"+day2021);
	}

}
