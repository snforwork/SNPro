package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

          JavaChapter06 obj = new JavaChapter06();
          String word = "x!Hello world x";
              obj.spcak(word);
              int a = 10;
              int b = 100;
              obj.sum(a, b);


              int pay = 6700;
              double tax = 0.1;
              obj.x(pay,tax);


            String strTax = obj.taxKeisan(pay,tax);
            obj.spcak(strTax);


}

    String taxKeisan(int pay,double tax) {
    	String rsault = String.valueOf(pay*tax);
    	return rsault;
    }
	void spcak(String str) {
		System.out.println(str);
	}

	void sum(int a,int b) {
		System.out.println(a+b);
	}
    void x(int pay,double tax) {
    	System.out.println(pay+pay*tax);
    }


	}