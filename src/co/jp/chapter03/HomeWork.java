package co.jp.chapter03;

public class HomeWork {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
// 宿題   int boolean string  6つ変数
		
		int i1= 3;
		short i2=(short) 123456789;
		double i3=123.333;
		float i4=(float) 1.111;
		boolean flg1=true;
		String b = "string";
		if(b=="string") {
			System.out.println(flg1);
		}else {
			System.out.println(i1+i2+i3+i4);
		}
		
//成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		
        int a = 56;
		System.out.println("成績ランキング判断。入力値＝"+a);
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
//日本のコインを１円、５円、１０円、５０円、１００円、５００円があります。
		// ３３４０円のコイン数をもとめください。
		int money=3340;
		int m500=0;
		int m100 = 0;
		int m50 = 0;
		int m10 = 0;
		int m5 = 0;
		int m1 = 0;
		// 算出枚数
		for(;;) {
			//500
			if(money>=500 && money % 500!=0) {
				m500= money / 500;
				money= money % 500;
				//100
			}else if(money>=100 && money % 100!=0) {
				m100= money / 100;
				money= money % 100;
				//50
			}else if(money>=50 && money % 50!=0) {
				m50= money / 50;
				money= money % 50;
				//10
			}else if(money>=10 && money % 10!=0) {
				m100= money / 10;
				money= money % 10;
				//5
			}else if (money >= 5 && money % 5 != 0) {
				m5 = money / 5;
				money = money % 5;
				// 1
			} else if (money >= 1) {
				m1 = money / 1;
				money = money % 1;
			}  else {
				break;
			}
		}
		// 出力枚数
				System.out.println(" ５００円のコインが" + m500 + "枚です");
				System.out.println(" １００円のコインが" + m100 + "枚です");
				System.out.println(" ５０円のコインが" + m50 + "枚です");
				System.out.println(" １０円のコインが" + m10 + "枚です");
				System.out.println(" ５円のコインが" + m5 + "枚です");
				System.out.println(" １円のコインが" + m1 + "枚です");
	}

}
