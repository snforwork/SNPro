package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.04.11(01+02+03)
		//1.整数
		int z=1;
	    z= 1;
	    System.out.println("int型:"+z);

		short sht1=(short) 1234567890;
		long lg2=1234567890123456789L;


		//2.小数
		float f1=1.1F;

		double d2=123.9;
		System.out.println("double型:"+ d2);


		//3.boolean true&false
		boolean flg=true;

		if(flg) {
			System.out.println("boolean型:true"+flg);
		}else {
			System.out.println("boolean型:false"+flg);
		}


		//4.文字列 String
		//char ar="a"
		String str = "abc";
		System.out.println("String型:"+str);

	    int x1=0;
	    Integer x2=0;
	    System.out.println(x1);
	    System.out.println(x2);


	    //5.定数
	    //例:π　3.1415926
	    final int AA=0;

	    int inta=0;//=0
	    Integer intA=null;//int=null


	    //6.算術演算
	    int a1=10;
	    int a2=15;
	    System.out.println("int型:"+a1*a2);

	    int a4=100;
	    double a5=7.0;
	    //int a5=7;
	    System.out.println("週:"+a4/a5);
	    System.out.println("天:"+a4%a5);


	    //宿題　
	    //int boolean string 変数設定
	    int a;
	    a=3;
	    int b;
	    b=0;

	    int c = 5;
	    if(c>10) {
	    	System.out.println("boolean型：true"+c);
	    }else {
	    	System.out.println("boolean型:false"+c);
	    }

	    String d="abcd";
	    System.out.println("String型:"+d);
	    String e="efg";
	    System.out.println("String型:"+e);


	    //01型＆式――質問集
	    //質問1
	    //int i = 10;//i=10
	    //int n = i%5;//n=0

	    //質問2
	    //右の式解釈してください:aq2=aq2>10?11:0;
	    int aq2=0;
	    //方法1
	    aq2=aq2>10?11:0;//カバレージ問題ある
	    //方法２
	    if(aq2>10) {
	    	aq2=11;
	    }else {
	    	aq2=0;
	    }

	    //質問3
	    //変数値を比較する演算子は"==";

	    //質問4
	    //ブリアン（ boolean）変数に設定可能の値は"true"&"false"


	    //02型（文字列）――質問集
	    //質問1
	    //System.out.println("this is line1\this line2");は何行出力しますか。１行

	    //質問2
	    //Stringを比較方法は、 equals

	    //質問3
	    //Float値⇒String文字列変更する場合、どうなメソッドを利用しますか.String.valueOf("1.0F")

	    //質問4
	    //以下式の値を記載してください.
	    //1. 1.0 + 2.0 = 3.0
	    //2. 1.0 + "2.0" = "1.02.0"

	    //質問5
	    int a6 =1;
		System.out.println("a6");


	    //03フロー制御――質問集
	    //質問1
	    //成績ランキング判断を作成する「90以上:A、80-89:B、70-79:C、60-69:D、60以下:E」
	    int b1 = 56;
	    System.out.println("成績ランキング判断、入力値:"+ b1);
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