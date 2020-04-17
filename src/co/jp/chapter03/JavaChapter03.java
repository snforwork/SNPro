package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



        //03宿題
        //質問１
		   int a = 56;
		   int A;
		   int B;
		   int C;
		   int D;
		   int E;
		   System.out.println("成績ランキング判断。入力値=" + a);

		   if(a>=90) {
			   System.out.println("成績ランキング判断。入力値=" + "A");
		   }else if(a>=80){
			   System.out.println("成績ランキング判断。入力値=" + "B");
		   }else if(a>=70){
			   System.out.println("成績ランキング判断。入力値=" + "C");
		   }else if(a>=60){
			   System.out.println("成績ランキング判断。入力値=" + "D");
		   }else{
			   System.out.println("成績ランキング判断。入力値=" + "E");
		   }


		   //質問２

		   //   日本硬貨　１，５，１０，５０，１００，５００
		   // input 総額
		   // output 各額度の枚数
			   int money = 999;
			   int tmp = 0;
			   int m500 = 0;
               int m100 = 0;
               int m50 = 0;
               int m10 = 0;
               int m5 = 0;
			   int m1 = 0;
			   if(money%500>0) {
				   tmp = money%500;
				   m500 = money/500;
				   System.out.println("500円:" + m500 + "枚");

			   }if(tmp%100>0){
				   m100 = tmp/100;
				   tmp = tmp%100;
				   System.out.println("100円:" + m100 + "枚");
			   }if(tmp%50>0){
				   m50 = tmp/50;
				   tmp = tmp%50;
				   System.out.println("50円:" + m50 + "枚");
			   }if(tmp%10>0){
				   m10 = tmp/10;
				   tmp = tmp%10;
				   System.out.println("10円:" + m10 + "枚");
			   }if(tmp%5>0){
				   m5 = tmp/5;
				   tmp = tmp%5;
				   System.out.println("5円:" + m5 + "枚");
			   }if(tmp%1>0){
				   m1 = tmp/1;
				   tmp = tmp%1;
				   System.out.println("1円:" + m1 + "枚");
			   }








	}

}
