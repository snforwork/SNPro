package co.jp.chapter06;

import co.jp.chapter06.JavaChapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaChapter06 obj = new JavaChapter06();


        //2020.05.02(06)
        //06.関数
        String word ="x !Hello world! x";
        obj.spcak(word);

        int a = 10;
        int b = 100;
        String c = "111";
        obj.sum(1,2,0);
        obj.sum(a,b,c);

        int c1 = 0;
        obj.sum(1,2,c1);
        System.out.println(c1);

        int pay = 6700;
        double tax = 0.1;
        obj.taxKeisan(pay,tax);

        String strTax = obj.taxKeisan(pay,tax);
        obj.spcak(strTax);

        int x = 1;
        String y = "10%";
        obj.taxKeisan(x,y);
    }

	private void taxKeisan(int x, String y) {
		// TODO 自動生成されたメソッド・スタブ
	}

	private void sum(int a, int b, String c) {
		// TODO 自動生成されたメソッド・スタブ
	}

	private void sum(int i, int j, int k) {
		// TODO 自動生成されたメソッド・スタブ
	}

	private static String taxKeisan(int pay, double tax) {
		// TODO 自動生成されたメソッド・スタブ

        System.out.println(pay*tax);
		return null;
	}

	void spcak(String str){
		System.out.println(str);
	}

    void sum(int a,int b){
    	System.out.println(a+b);
    }


        //根計算ロジック
    static String taxKeisan1(int pay, double tax) {
    	String rsault = String.valueOf(pay * tax);
    	return rsault;
    }


        //値転換後
    static String taxKeisan1(int pay, String tax) {
    	return taxKeisan(pay, Double.valueOf(tax));
    }

    void spcak1(String str) {
    }

    void sum() {
    }

    void sum(int a) {
    }

    void sum1(int a, int b, int c) {
    	c = a + b;
    }


        //関数のオーバーロード
    public void sampleMethod() {}
    //public void sampleMethod(int a) {} // 引数
    //public void sampleMethod(int a, int b) {} //
    //public void sampleMethod(int c) {} // NG不可、メソッド#2と重複
    //public void sampleMethod(float a) {} // OK 引数の型が異なる
    //public void sampleMethod(char c) {return 1;} //NG不可、メソッド#1到着


        //06関数――質問集
        //質問1
    //public static void main(String[] args)
        //修飾子、返却型、関数名、引数

        //質問2
    public static void max(int[] datas) {
    	System.out.println();
    }

        //質問3
    public static class Kicker{
    	private static void sayHello(String y) {
    		y = "Hello world";
    	}
    	public static void main(String args[]) {
    		String x = null;
    		sayHello(x);
    		System.out.println();
    	}
    }

        //質問4
    public static class Kicker1{
    	private static void fillArray(String[] array) {
    		array[0] = "value2";
    	}
    	public static void main(String args[]) {
    		String[] array = new String[] {"value1"};
    		fillArray(array);
        	System.out.println(array[0]);
    	}
    }

        //質問5
    public static class Kicker2{
    	private static void fillArray(String[] array) {
    		array = new String[] {"1","2"};
    	}
    	public static void main(String args[]) {
    		String[] array = null;
    		fillArray(array);
    		System.out.println(array == null);
    	}
    }



}