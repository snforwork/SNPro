package co.jp.chapter08;

public class HomeWork8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/**質問１**/
		String x = "a";
		String y = "a";
		System.out.println(x == y); // false:メモリアドレスは一致しません。
		System.out.println(x.equals(y)); // true:String型の比較がequalsを使う 
		String empty = "";
		String nullString = null;
	//	System.out.println(nullString.equals(empty)); // false:""はオブジェクト、nullはオブジェクトではありません
	}

}
