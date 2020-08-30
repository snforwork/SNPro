package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JavaChapter14 {


	    //14日付――質問集
        //質問1
	    //以下共通メソッドを作成してください。
public static eachEveryday[] SEeachEveryday(eachEveryday start, eachEveryday end) {

		eachEveryday[] result = new eachEveryday[2];

		if (start != null && !"".equals(start) && end != null
				&& !"".equals(end)) {
			result[0] = start;
			result[1] = end;
			return result;
		}
		return result;
}

        @SuppressWarnings("null")
public static void main(String[] args) throws ParseException {
		//SEeachEveryday("", "");
		String sd = "2018/01/01";
		String sd2 = "2020/01/01";

		SimpleDateFormat s = new SimpleDateFormat("yyyy/mm/dd");
		eachEveryday d1 = null;
		System.out.println(d1.getTime());
		eachEveryday d2 = null;
		System.out.println(d2.getTime());
}



}


	    //質問2
	    //勤務表の集計。以下CSVファイルは「2019年06月度」の勤務期間です。集計してください。
        //1. 毎日の作業時間（X時間Y分）。（15分切り）





