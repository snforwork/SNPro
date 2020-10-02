package co.jp.chapter08;

public class HomeWork8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/**質問１**/
		String x = "a";
		String y = "a";
		if(x == y){
			System.out.println(true);
		}else {System.out.println(false);}
		System.out.println(x == y); //true:false:メモリアドレスは一致します。 
		System.out.println(x.equals(y)); // true:String型の比較がequalsを使う 

/**質問３**/
		/**public class Parent {
	
	}
	// Child.java
	public class Child extends Parent {
	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
	
	System.out.println("child method");
	
	}
	// Kicker.java
	public class Kicker {
		public static void print(Child v) {
			v.hello();
	}
	public static void main(String...args) {
		Parent a= new Parent();
		Child b = new Child();
		}
}
**/
	}
	
}
