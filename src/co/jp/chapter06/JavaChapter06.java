package co.jp.chapter06;

public class JavaChapter06 {

	public JavaChapter06() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		JavaChapter06 obj = new JavaChapter06();

//		String word = "x Hello world! x";
//		obj.spcak(word);
//
//		int a =1;
//		int b = 2;
//		int c = 3;
//		obj.sum(1, 2,0);
//		obj.sum(a, b,c);

		int pay =6700;
		double tax = 0.1;
		obj.sfs(pay,tax);


		String strTax = obj.sfs(pay,tax);
		obj.spcak(strTax);

//		int x = 1;
//		String y = "10%";
//		obj.taxKeisan(x, y);

		System.out.println(123456);

	}

	// 根計算ロジック
	static String sfs (int pay, double tax) {
		String rsault = String.valueOf(pay*tax);
		return rsault;
	}
	// 値転換後
	static String  sfs (int pay, String tax) {
		return sfs(pay, Double.valueOf(tax));
	}



	//
	void spcak(String str) {

		System.out.println(str);
	}

	void sum() {

	}

	void sum(int a){

	}

	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

//	void sfs(int pay,double tax) {
//		System.out.println(pay*tax);
//	}

//	String sys(int pay,double tax) {
//		String rsault = String.valueOf(pay*tax);
//		return rsault;
//	}


	public void sampleMethod() {}
	public void sampleMethod(int a) {} // 引数
	public void sampleMethod(int a, int b) {} //
//	public void sampleMethod(int c) {} // NG 不可、メソッド#2と重複
	public void sampleMethod(float a) {} // OK 引数の型が異なる
//	public int sampleMethod(char c) { return 1; } // NG不可、メソッド#1到着













}
