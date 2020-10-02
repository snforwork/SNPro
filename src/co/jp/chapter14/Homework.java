package co.jp.chapter14;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Homework {

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


	//質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。
	
	}

}
