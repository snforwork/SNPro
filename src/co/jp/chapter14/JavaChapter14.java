package co.jp.chapter14;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import co.jp.chapter11.Station;

public class JavaChapter14 {


	    //14日付――質問集
        //質問1
	    //質問1: 以下共通メソッドを作成してください。
	    Date currentDate = new Date();
	    System.out.println(currentDate);

	    Calendar c = Calendar.getInstance();
	    c.setTime(currentDate);
        System.out.println(c.getDate());
	    List<String> datas = new ArrayList<>();
	    c.add(2020-03-05);
	    c.add(2020-03-06);
	    c.add(2020-03-07);
	    c.add(2020-03-08);
	    c.add(2020-03-09);
	    c.add(2020-03-10);
	    c.add(2020-03-11);
	    c.add(2020-03-12);
	    c.add(2020-03-13);
	    c.add(2020-03-14);
	    c.add(2020-03-15);
	    System.out.println(Date);

	    datas.forEach(data -> {
	    	Object data;
			if("2020-03-10".equals(data)) {
    	    System.out.println("2020-03-10で出力します。");
	        }

        });
	    
	    
	    //質問2
	    //勤務表の集計。以下CSVファイルは「2019年06月度」の勤務期間です。集計してください。



}
