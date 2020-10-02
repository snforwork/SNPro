package co.jp.chapter08;

public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		int total = 20;
         int zan = 0;

         //logic



//      Animal an = new Animal();
//      Animal an1 = new Animal();
//      Animal an2 = new Animal();
//      Animal an3 = new Animal();
//      Animal an4 = new Animal();
//        Animal an5 = new Animal("1","Tom",20,"オス");
//           an5.count("1");
      Cat cat = new Cat("HelloKitty",5,"メス");
     // cat.count("1");
      Fish fish = new Fish("NIMO",1,"オス");
       Bird brid = new Bird("UDI",10,"オス");



      zan = total - Animal.count;

      System.out.println("残位置："+zan);




      //質問１
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true:String型の比較がequalsを使う
		System.out.println(x.equals(y)); //false:メモリアドレスは一致しません。
		String empty = "";
		String nullString = null;
	//	System.out.println(nullString.equals(empty)); false:""はオブジェクト、nullはオブジェクトではありません
//質問2
		/*public class Employee {
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
			System.out.println(x == y); // false:メモリアドレスは一致しません。
			System.out.println(x.equals(y)); // true:String型の比較がequalsを使う
			}
			}*/
//質問３
		/*public class Parent {
	public void hello() {
		System.out.println("parent method");
	}
	}
	// Child.java
	public class Child extends Parent {
	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
       public void hello() {
	System.out.println("child method");
       }
	}
	// Kicker.java
	public class Kicker {
		public static void print(parent v) {
			v.hello();
	}
	public static void main(String...args) {
		print(new Parent());
		print(new Child());
		}
}
*/











	}

}
