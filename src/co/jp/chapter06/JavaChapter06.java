package co.jp.chapter06;

public class JavaChapter06 {
	protected String aaa ;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaChapter06 obj = new JavaChapter06();

//		String word = "x  !Hello world!  x";
//		obj.spcak(word);
//
//		int a = 10;
//		int b = 100;
//		String c = "111";
//		obj.sum(1, 2,0);
////		obj.sum(a,b,c);

//		int c = 0;
//		obj.sum(1,2,c);
//		System.out.println(c);

		int pay = 6700;
		double tax = 0.1;

		JavaChapter06.taxKeisan(pay,tax);

		String strTax = JavaChapter06.taxKeisan(pay,tax);
		obj.spcak(strTax);

		int x = 1;
		String y = "10%";
		JavaChapter06.taxKeisan(x, y);


	}

	// 根計算ロジック
	static String taxKeisan (int pay, double tax) {
		String rsault = String.valueOf(pay*tax);
		return rsault;
	}
	// 値転換後
	static String  taxKeisan (int pay, String tax) {
		return taxKeisan(pay, Double.valueOf(tax));
	}

	//
	 void spcak (String str) {
	}


	void sum () {

	}
	void sum (int a) {

	}
	void sum (int a , int b, int c) {
		c = a + b;
	}



	public void sampleMethod() {}
	public void sampleMethod(int a) {} // 引数
	public void sampleMethod(int a, int b) {} //
//	public void sampleMethod(int c) {} // NG 不可、メソッド#2と重複
	public void sampleMethod(float a) {} // OK 引数の型が異なる
//	public int sampleMethod(char c) { return 1; } // NG不可、メソッド#1到着



}
