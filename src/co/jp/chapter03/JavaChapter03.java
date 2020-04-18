package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1 成績ランキング判断を作成する「90以上︓A, 80-89︓B, 70-79︓C, 60-69︓D, 59以下︓E」
		//		int a = -1;
		//		System.out.println("成績ランキング判断。⼊⼒値=" + a);
		//		// 以下コードを完成してください。
		//		if (a >= 90) {
		//			System.out.println("A");
		//		} else if (80 <= a && a < 90) {
		//			System.out.println("B");
		//		} else if (70 <= a && a < 80) {
		//			System.out.println("C");
		//		} else if (60 <= a && a < 70) {
		//			System.out.println("D");
		//		} else {
		//			System.out.println("E");
		//		}

		//		//   日本硬貨　１，５，１０，５０，１００，５００
		//		// input 総額
		//		// output 各額度の枚数
		//		int money = 999;
		//
		//		if (true) {
		//			// true の場合、実行
		//
		//			// syukudai
		//
		//			//  XXXXXXXXXXXXX
		//		} else {
		//			// falseの場合、実行
		//		}
		//
		//
		//
		//
		//
		//		// before
		//		System.out.println("loop start");
		//        // loop  初期値　;　終了条件　;　自増減変数　　　　i++  ==  i= i+1
		//		for (int i = 0     ;        i < 15       ;                i++) {// ①該当行の修正のみ
		//			// 　② 業務修正のみ
		//			System.out.println(53 - i );
		//		}
		//		// after
		//		System.out.println("loop end");
		//
		//		// before
		//		System.out.println("loop start");
		//        // loop  初期値　;　終了条件　;　自増減変数　　　　i++  ==  i= i+1
		//		for (int i = 53     ;        i >38       ;                i--) {// ①該当行の修正のみ
		//			// 　②修正のみ
		//			System.out.println(i);
		//		}
		//		// after
		//		System.out.println("loop end");
		//
		//		//  15回　53＝39

		//		int i = 0;
		//		// loop 1 回目
		//		if (i<10) {
		//			System.out.println(i);
		//			i = i+1; // i++  or  ++i
		//		} else {
		//			// ループ終了
		//		}
		//		// loop 2 回目
		//		if (i<10) {
		//			System.out.println(i);
		//			i = i+1; // i++  or  ++i
		//		}
		//		// loop 3 回目
		//		if (i<10) {
		//			System.out.println(i);
		//			i = i+1; // i++  or  ++i
		//		}

		//    NGNGNGNGNGNNGNGNGNG
		//		for (;;) {
		//			System.out.println("dead loop");
		//		}

		//		// guaguale   0-9
		//		int ateru = 5;
		//		for (int i =0 ;i<10;i++) {
		//			if ( i == ateru ) {
		//				System.out.println(" 数値["+i+"]は当てる！！");
		//				break;
		//			} else {
		//				System.out.println(" 数値["+i+"]は当てない！！");
		//				continue;
		//			}
		//		}

		// 	⽇本のコインを１円、５円、１０円、５０円、１００円、５００円があります。
		// ３３４０円のコイン数をもとめください。
		int money = 3348;
		int m500 = 0;
		int m100 = 0;
		int m50 = 0;
		int m10 = 0;
		int m5 = 0;
		int m1 = 0;
		// 算出枚数
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
		// 出力枚数
		System.out.println(" ５００円のコインが[" + m500 + "]枚です");
		System.out.println(" １００円のコインが[" + m100 + "]枚です");
		System.out.println(" ５０円のコインが[" + m50 + "]枚です");
		System.out.println(" １０円のコインが[" + m10 + "]枚です");
		System.out.println(" ５円のコインが[" + m5 + "]枚です");
		System.out.println(" １円のコインが[" + m1 + "]枚です");

	}

}
