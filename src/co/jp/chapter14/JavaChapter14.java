package co.jp.chapter14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class JavaChapter14 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
//質問１︓以下共通メソッドを作成してください。
		Calendar c = Calendar.getInstance();

		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = dateFormat1.parse("2014-05-01");
		Date endDate = dateFormat1.parse("2014-06-25");
		Date date= beginDate;
		while(!date.equals(endDate)) {
			System.out.println(date);
			c.setTime(date);
			c.add(Calendar.DATE,1);
			date = c.getTime();
		}
		 //start时间
//		  String str="2017-08-05";
		  //end时间
//		  String str1="2017-08-10";
//		  String str="2015-08-31 21:08:06";
//          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//          Date date = (Date) sdf.parse(str);

//		Date currentDate = new Date();
//		System.out.println(currentDate);
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Calendar start = Calendar.getInstance();
//		Calendar end = Calendar.getInstance();
//		Calendar calendar = Calendar.getInstance();
//		Date date = (Date) format.parse(str);
//		 System.out.println(date.getTime());
//		start.setTime(str1);
//		System.out.println(start);
//		try {
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

//			Date date1 = (Date)format.parse(str);
//			Date date2 = format.parse(str1);

//			System.out.println(date);
//			} catch (ParseException ex) {
//			Logger.getLogger(FileStreamSample.class.getName()).log(Level.SEVERE, null, ex);
//			}
//		TRY {
//		    START.SETTIME(FORMAT.PARSE(STR));
//		    END.SETTIME(FORMAT.PARSE(STR1));
//		  } CATCH (JAVA.TEXT.PARSEEXCEPTION E) {
//		    E.PRINTSTACKTRACE();
//		  }
//		while(date1.before(date2))
//		  {
//			 start.add(Calendar.DAY_OF_MONTH,1);
//		      System.out.println(start.getTime());
//
//		  }
//		DateFormat beginDate= new SimpleDateFormat("2020-06-25");
//		DateFormat endDate= new SimpleDateFormat("2020-06-29");
//		DateFormat date = beginDate;
//		if (!date.equals(endDate)) {
//	        System.out.println(beginDate);
//	    }else {
//	    	System.out.println(dateString);
	    }}