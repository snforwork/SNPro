package co.jp;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// int string boolean 各生成两个变量
		//宿題
//        int y1 = 1;
//        int y2 = 2;
//        String z1 = "abc";
//        String z2 = "efg";
//        boolean q1 = true;
//        boolean q2 = false;


        //質問集
        //1.1 int i = 10; int n = i%5; nの値は0;
        //1.2 a = a > 10? 11:0; a＞10はtrueの場合a値は11、falseの場合aは0；
        //1.3=は値の代入 ==は等しい；
        //ブリアン変数に設定可能は値はtrue，false；

        //2.1 System.out.println(“this is line1\tthis line2“);は1行；
        //2.2 Stringを比較方法はequals；
        //2.3 Float値→String文字列変更する場合 String.valueOf("1.0F");
        //2.4 1.0+2.0=3.0 1.0+"2.0"=1.02.0;
        //2.5int a = 10;  System.out.println("a"); 出力はa;

        //3.1
        int a = 56;
		System.out.println("成績ランキング判断。入力値＝"+a);
		if(a>90) {
			System.out.println("A");
		}else if(a>80) {
			System.out.println("B");
		}else if(a>700) {
			System.out.println("C");
		}else if(a>60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}


		System.out.println("***************************");


		//3.2
		int m = 3340;

        int k[] = {0,0,0,0,0,0};

         while(m>0){
       	 if(m>=500) {
       		 m = m - 500;
       		 k[0]++;

       	 }else if(m>=100&&m<500) {
       		 m = m -100;
       		 k[1]++;
       	 }else if(m>=50&&m<100) {
       		 m = m -50;
       		 k[2]++;
       	 } else if(m>=10&&m<50) {
       		 m = m -10;
       		 k[3]++;
       	 }else if(m>=5&&m<10) {
       		 m = m -5 ;
       		 k[4]++;
       	 }else {
       		 k[5]++;
       	 }



         }

        System.out.println("500円の枚数は:"+k[0]);
    	 System.out.println("100円の枚数は:"+k[1]);
    	 System.out.println("50円の枚数は:"+k[2]);
    	 System.out.println("10円の枚数は:"+k[3]);
    	 System.out.println("5円の枚数は:"+k[4]);
    	 System.out.println("1円の枚数は:"+k[5]);


			}


}
