import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date); //Fri Nov 30 17:08:06 CET 2018

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z", Locale.US); //2018-12-03 10:16:15.165 CET

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.GERMANY); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.GERMAN); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.FRANCE); //2018-11-30 17:08:06.27 CET

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.FRENCH); //2018-11-30 17:08:06.27 CET

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z", Locale.CANADA_FRENCH); //2018-11-30 17:08:06.27 CET

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z", Locale.US); //2018-11-30 17:08:06.27 CET

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z"); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S zzz"); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS z"); //2018-11-30 17:08:06.027 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS z"); //2018-11-30 17:08:06.027 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S", Locale.GERMANY); //2018-12-03 10:16:15.165

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S"); //2018-12-03 10:16:15.165
		SimpleDateFormat sdfmt = new SimpleDateFormat();
		sdfmt.applyPattern( "EEEE', 'dd. MMMM yyyy hh:mm" );
		System.out.println( sdfmt.format(new Date()) ); //Freitag, 30. November 2018 05:08

		sdfmt.applyPattern( "yyyy-MM-dd HH:mm:ss.SSS z");
		System.out.println( sdfmt.format(new Date()) ); //2018-11-30 17:08:06.089 MEZ
	}

	private static void printDateFormat(Date date, String format) {
		SimpleDateFormat simpleDateFormatCa = new SimpleDateFormat(format);
		System.out.println(simpleDateFormatCa.format(date));
	}

	private static void printDateFormat( Date date, String format, Locale locale) {
		SimpleDateFormat simpleDateFormatCa = new SimpleDateFormat(format, locale);
		System.out.println(simpleDateFormatCa.format(date));
	}

}
