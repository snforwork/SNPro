package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1, int 整型　1,2,3,4,5,6
		int i;// 変数の宣言 int →型　i →変数名
		i = 123;// 変数値の設定
		//		i = 1.1;
/*
 * 使ってない変数をコメント化にする
 */
//		int j = 1234567890; //  変数宣言、かつ、初期化
//		short sht1 = (short) 1234567890;
//		long lg2 = 1234567890123456789L;
		
		System.out.println("int 型：" + i);// 1

		// 2,小数
//		float f1 = 1.1F;// 単精度小数　キャスト
		double d2 = 123.9;// ダブル精度小数
		System.out.println("double 型：" + d2); //2

		// 3 True False  boolean 布尔型    1 : true  0 : false
		boolean flg = false;
/*
 * 使ってない変数をコメント化にする
 */
//		Boolean flg2 = null;
		
		
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

/*
 * 使ってない変数をコメント化にする
 */
//		int y = 0;
//		int y =1;
//
//		int catAge = 5;
		// 10000step

		//		int x1 = 0;
		//		Integer x2 = null;
		//		System.out.println(x1);
		//		System.out.println(x2.toString());

	}

}
