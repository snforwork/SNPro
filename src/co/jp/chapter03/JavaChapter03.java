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
		   }else if(a>=80&&a<90){
			   System.out.println("成績ランキング判断。入力値=" + "B");
		   }else if(a>=70&&a<80){
			   System.out.println("成績ランキング判断。入力値=" + "C");
		   }else if(a>=60&&a<70){
			   System.out.println("成績ランキング判断。入力値=" + "D");
		   }else{
			   System.out.println("成績ランキング判断。入力値=" + "E");
		   }


		   //質問２

		   //   日本硬貨　１，５，１０，５０，１００，５００
		   // input 総額
		   // output 各額度の枚数
//			   int money = 999;
//			   int tmp = 0;
//			   int m500 = 0;
//               int m100 = 0;
//               int m50 = 0;
//               int m10 = 0;
//               int m5 = 0;
//			   int m1 = 0;
//			   if(money%500>0) {
//				   tmp = money%500;
//				   m500 = money/500;
//				   System.out.println("500円:" + m500 + "枚");
//
//			   }if(tmp%100>0){
//				   m100 = tmp/100;
//				   tmp = tmp%100;
//				   System.out.println("100円:" + m100 + "枚");
//			   }if(tmp%50>0){
//				   m50 = tmp/50;
//				   tmp = tmp%50;
//				   System.out.println("50円:" + m50 + "枚");
//			   }if(tmp%10>0){
//				   m10 = tmp/10;
//				   tmp = tmp%10;
//				   System.out.println("10円:" + m10 + "枚");
//			   }if(tmp%5>0){
//				   m5 = tmp/5;
//				   tmp = tmp%5;
//				   System.out.println("5円:" + m5 + "枚");
//			   }if(tmp%1>0){
//				   m1 = tmp/1;
//				   tmp = tmp%1;
//				   System.out.println("1円:" + m1 + "枚");
//			   }
//
		   //before
		   System.out.println("loop start");

		   //loop 初始值；终了条件；自增减变数  i++ == i=i+1


//		   for(int i = 0;i < 10;i++) {
//			   System.out.println(i);
//		   }
//
//		   int i =0;
//		   //loop 1
//		   if(i<10) {
//			   System.out.println(i);
//			   i = i +1;
//		   }
//
//		   //loop 2
//		   if(i<10) {
//			   System.out.println(i);
//			   i = i +1;
//		   }
//
//		   //loop 3
//		   if(i<10) {
//			   System.out.println(i);
//			   i = i +1;
//		   }
//
//
//		   //after
//		   System.out.println("loop end");


//		   System.out.println("loop start");
//
//		   for(int i = 53;i >38;i--) {
//			   System.out.println(i);
//		   }


//		   System.out.println("loop start");
//
//		   for(int i = 0;i < 15;i++) {
//
//			   int j =53;
//			   j=j-i;
//			   System.out.println(j);
//		   }
//
//		   System.out.println("loop end");






		   //guaguale
//		   int ateru = 8;
//		   for(int i =0;i<10;i++) {
//			   System.out.println("index = "+i);
//			   if(i == ateru) {
//				   System.out.println("当てる！！");
//				   break;
//			   }
//		   }

//		   int ateru = 5;
//		   for(int i =0;i<10;i++) {
//			   System.out.println("index = "+i);
//			   if(i == ateru) {
//				   System.out.println("当てる！！");
//				   break;
//			   }
//		   }


		   int money = 3348;
		   int m500 = 0;
		   int m100 = 0;
		   int m50 = 0;
		   int m10 = 0;
		   int m5 = 0;
		   int m1 = 0;
		   for (;;) {
				// 500
				if (money >= 500 && money % 500 != 0 ) {
					m500 = money / 500;
					money = money % 500;
					// 100
				} else if (money >= 100 && money % 100 != 0) {
					m100 = money / 100;
					money = money % 100;
					// 50
				} else if (money >= 50 && money % 50 != 0) {
					m50 = money / 50;
					money = money % 50;
					// 10
				} else if (money >= 10 && money % 10 != 0) {
					m10 = money / 10;
					money = money % 10;
					// 5
				} else if (money >= 5 && money % 5 != 0) {
					m5 = money / 5;
					money = money % 5;
					// 1
				} else if (money >= 1) {
					m1 = money / 1;
					money = money % 1;
				} else {
					break;
				}
			}


		   System.out.println("500円のコインが["+m500+"]枚です");
		   System.out.println("500円のコインが["+m100+"]枚です");
		   System.out.println("500円のコインが["+m50+"]枚です");
		   System.out.println("500円のコインが["+m10+"]枚です");
		   System.out.println("500円のコインが["+m5+"]枚です");
		   System.out.println("500円のコインが["+m1+"]枚です");




	}

}
