package co.jp.chapter08;
public class JavaChapter08 {

	public JavaChapter08() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str  = "A";
		str = "B";
		str = str + "B";

		int total = 20;
		int zan = 0;

		//logic

		//Animal an1 = new Animal();

		//Animal an2 = new Animal();
		//Animal an3 = new Animal();
		//Animal an4 = new Animal();
		//Animal an5 = new Animal();

		Animal an = new Animal("1","tom",20,"");

		Cat cat = new Cat("HELLOKITTY",5,"メス");
		cat.count();
		Fish fish = new Fish("NIMO",1,"オス");
		Brid brid = new Brid("UOI",10,"オス");

		zan = total - Animal.count;

//		System.out.println(zan);




		//宿題
				//08OOP-その２――質問集
				//質問1
				//以下コードの出力するを回答してください。
//				String x = "a";
//				String y = "a";
//				System.out.println(x == y);//true
//				System.out.println(x.equals(y));//true
//				String empty = "";
//				String nullString = null;
			    //System.out.println(nullString.equals(empty));//false
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