package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.04.11(03)
	    //03フロー制御――質問集
	    //質問1
	    //成績ランキング判断を作成する「90以上:A、80-89:B、70-79:C、60-69:D、60以下:E」
	    int b1 = 56;
	    System.out.println("成績ランキング判断、入力値:"+ b1);
	    int a = 0;
		//以下コードを完成してください。
	    if(a>=90){
	    	System.out.println("A");
	    }else if(80<=a&&a<90){
	    	System.out.println("B");
	    }else if(70<=a&&a<80){
	    	System.out.println("C");
	    }else if(60<=a&&a<70){
	    	System.out.println("D");
	    }else{
	    	System.out.println("E");
	    }

	    //質問2
	    //日本のコインを1円、5円、10円、100円、500円があります。3340円のコイン数をまとめください。
	    //input　統額
	    //output 各額度の枚数
	    int money = 3340;
	    int k = 0;
	    int m500 = 0;
        int m100 = 0;
        int m50 = 0;
        int m10 = 0;
        int m5 = 0;
	    int m1 = 0;
		if(money%500>0) {
			k = money%500;
		    m500 = money/500;
		    System.out.println("500円:" + m500 + "枚");
		}if(k%100>0){
				   m100 = k/100;
				   k = k%100;
				   System.out.println("100円:" + m100 + "枚");
		}if(k%50>0){
				   m50 = k/50;
				   k = k%50;
				   System.out.println("50円:" + m50 + "枚");
		}if(k%10>0){
				   m10 = k/10;
				   k = k%10;
				   System.out.println("10円:" + m10 + "枚");
		}if(k%5>0){
				   m5 = k/5;
				   k = k%5;
				   System.out.println("5円:" + m5 + "枚");
		}if(k%1>0){
				   m1 = k/1;
				   k = k%1;
				   System.out.println("1円:" + m1 + "枚");
				   }



	}

}