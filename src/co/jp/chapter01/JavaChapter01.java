package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ

		// 1, int 整型　1,2,3,4,5,6
		int i;// 変数の宣言 int →型　i →変数名
		i = 123;// 変数値の設定
		//		i = 1.1;
		int j = 1234567890; //  変数宣言、かつ、初期化
		short sht1 = (short) 1234567890;
		long lg2 = 1234567890123456789L;
		System.out.println("int 型：" + i);// 1

		// 2,小数
		float f1 = 1.1F;// 単精度小数　キャスト
		double d2 = 123.9;// ダブル精度小数
		System.out.println("double 型：" + d2); //2

		// 3 True False  boolean 布尔型    1 : true  0 : false
		boolean flg = false;
		Boolean flg2 = null;
		if (flg) {
			// True の場合のみ実行
			System.out.println("boolean 型：true       " + flg); //3
		} else {
			// False の場合のみ実行
			System.out.println("boolean 型：false      " + flg);//4
		}

		// 4 文字列　ストリング　　String
		//		char ar = "a";
		String str = "abc";
		System.out.println("String 型:" + str);

		int y = 0;
		//		int y =1;

		int catAge = 5;
		// 10000step

		//		int x1 = 0;
		//		Integer x2 = null;
		//		System.out.println(x1);
		//		System.out.println(x2.toString());

		// String

		// 宿題   int boolean string  6つ変数
		int a;
		a = 3;
		String b = "";
		// 定数　π　3.1415926......
		final int AA = 0;

		int inta = 0;// inta = 0
		Integer intA = null; // intA = null
		if (intA != null) {
			System.out.println(intA.toString());// NullPointerE
		}

		System.out.println(String.valueOf(intA));

		int a1 = 50; // データ総件数
		//		double a2 = 7;
		int a2 = 10;//毎ページ表示数
		int page = 0;
//		System.out.println("週：" + a1 / a2);
//		System.out.println("天：" + a1 % a2);

		if (a1 % a2 != 0) {
			page = a1 / a2 + 1;
		} else {
			page = a1 / a2;
		}
		System.out.println("ページ数：" + page);





		// Q1 N=0

		// Q2     aq2 = aq2 > 10 ? 11 : 0;

		int aq2 = 0;
		// 1
		aq2 = aq2 > 10 ? 11 : 0;//　カバレージ問題ある
		// 2   dead code デッド・コード
		if (true) {
			aq2 = 11; // true
		} else {
			aq2 = 0; // false
		}

		String strtest = "12\\\\3";
		System.out.println(strtest);

	}

}
