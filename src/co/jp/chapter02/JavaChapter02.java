package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String strA = "123";
		String strB = new String("123");
		// スコープ
		System.out.println(strA == strB);// Stringの場合、＝＝比較　アドレス　＆　バリュー
		System.out.println(strA.equals(strB));// バリューのみ比較


		int inta = 123;
		Integer intb = new Integer(123);
		System.out.println(inta == intb);
		System.out.println(intb.equals(inta));

	}

}
