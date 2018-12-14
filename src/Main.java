import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date); //Fri Nov 30 17:08:06 CET 2018

		SimpleDateFormat sdfmt = new SimpleDateFormat();

		sdfmt.applyPattern( "EEEE', 'dd. MMMM yyyy hh:mm" );

		System.out.println( sdfmt.format(date) ); //Freitag, 30. November 2018 05:08

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z", Locale.US); //2018-12-03 10:16:15.165 CET

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.GERMANY); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date,"yyyy-MM-dd HH:mm:ss.S z", Locale.FRANCE); //2018-11-30 17:08:06.27 CET

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S z"); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S zzz"); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS z"); //2018-11-30 17:08:06.027 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSSZ"); //2018-11-30 17:08:06.027 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S", Locale.GERMANY); //2018-12-03 10:16:15.165

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S"); //2018-12-03 10:16:15.165

		sdfmt.applyPattern( "yyyy-MM-dd HH:mm:ss.SSS z");

		System.out.println( sdfmt.format(date) ); //2018-11-30 17:08:06.089 MEZ

		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S zzz", Locale.US);

		DateFormat formatter = new SimpleDateFormat( "dd-MM-yyyy" );


		try {
			date = dateFormatter.parse("2018-11-30 17:08:06.27 CET");
			System.out.println( formatter.parse( "29-02-2008" ) ); // Fri Feb 29 00:00:00 CET 2008
			System.out.println( formatter.parse( "29-02-2007" ) ); // Thu Mar 01 00:00:00 CET 2007
			System.out.println( formatter.parse( "33-02-2008" ) ); // Tue Mar 04 00:00:00 CET 2008
		} catch (ParseException e) {
			e.printStackTrace();
		}

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.S zzz"); //2018-11-30 17:08:06.27 MEZ

		printDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS z"); //2018-11-30 17:08:06.027 MEZ


	}

	private static void printDateFormat(Date date, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		System.out.println(simpleDateFormat.format(date));
	}

	private static void printDateFormat( Date date, String format, Locale locale) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, locale);
		System.out.println(simpleDateFormat.format(date));
	}

}
