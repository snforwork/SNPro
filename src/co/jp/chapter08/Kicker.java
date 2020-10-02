package co.jp.chapter08;

public class Kicker {
	public static void print(Child v) {
		v.hello();
		}
	public static void main(String...args) {
		/**質問2**/
		
		Employee x = new Employee("1234");
		Employee y = new Employee("1234");
		System.out.println(x == y); // false:メモリアドレスは一致しません。
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		/**質問3**/
		//子クラスに親クラスのHello()メソッドを呼び出す。以下の部分をコメント化にする
//		print(new Parent());
		
		print(new Child());
		}
}
