package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//日本硬貨　1,5,10、50,100,500
		//input 総額
		//output各額度の枚数
	/*	int money = 999;
		int outPut;
		if() {

			//trueの場合　実行
		}else {
			//falseの場合　実行
		}
*/
         //宿題１
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


	   //宿題２
		int money = 3340;
		int y1 = 1;
		int y2 = 5;
	    int y3 = 10;
	    int y4 = 100;
	    int y5 = 500;
	    if(money%5!=0) {
	    	System.out.println("500円玉数は:"+money/y5);
	    }














	}




}
