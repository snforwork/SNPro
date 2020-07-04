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
/**質問2**/
		/**public class Employee {
			private String id;
			public Employee(String id) {
			this.id = id;
			}
			@Override
			public boolean equals(Object another) {
			if (another instanceof Employee)
				Employee an = (Employee) another;
			return an.id.equals(id);
			}
			return false;
			}
			}
			// Kicker.java
			public class Kicker {
			public static void main(String...args) {
			Employee x = new Employee("1234");
			Employee y = new Employee("1234");
			System.out.println(x == y); // true:メモリアドレスは一致します。
			System.out.println(x.equals(y)); // true:String型の比較がequalsを使う
			}
			}*/
/**質問３**/
		/**public class Parent {
	public void hello() {
		System.out.println("parent method");
	}
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
