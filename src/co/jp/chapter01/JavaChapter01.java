package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.04.11(01)
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




	}

}