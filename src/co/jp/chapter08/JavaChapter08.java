package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.05.23(08)
		int total = 20;
		int zan = 0;

		//logic
		//Animal an1 = new Animal();
		//Animal an2 = new Animal();
		//Animal an3 = new Animal();
		//Animal an4 = new Animal();
		//Animal an5 = new Animal();

		//Animal an = new Animal("1", "tom", 20, "メス");
		//an.count("1");
		//Cat cat = new Cat("HELLOKITTY", 5, "メス");
		//cat.conut("1");

		Cat cat = new Cat("HELLOKITTY", 5, "メス");
		Fish fish = new Fish("NIMO", 6, "メス");
		Bird bird = new Bird("UDI", 7, "メス");

		zan = total - Animal.count;
		System.out.println(zan);


		//宿題
		//08OOP-その２――質問集
		//質問1
		//以下コードの出力するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y);//false
		System.out.println(x.equals(y));//true
		String empty = "";
		String nullString = null;
	    System.out.println(nullString.equals(empty));//false

		//質問2
		//以下コードの出力するを回答してください。
		class Employee {
			private String id;
		    public Employee(String id) {
		    	this.id = id;
		    }
		    @Override
		    public boolean equals(Object another) {
		    	if (another instanceof Employee) {
		    		Employee an = (Employee) another;
			        return an.id.equals(id);
			    }
			    return false;
		    }
		}
		//Kicker.java
		class Kicker {
			public void main(String...args) {
				Employee x1 = new Employee("1234");
                Employee y1 = new Employee("1234");
		        System.out.println(x1 == y1); //true
		        System.out.println(x1.equals(y1)); //true
		    }
		}

		//質問3
		//以下コンパイルを修正してください。
		//Parent.java
		class Parent{
			public void hello() {
				System.out.println("parent method");
			}
		}
		//Child.java
		class Child extends Parent{
			@Override //親クラスの強制的にOverrideする意味（アノテーション）
			public void hello() {
				System.out.println("child method");
			}
		}
		//Kicker.java
		class Kicker1{
			public void print(Child v) {
				v.hello();
			}
			public void main(String...args) {
				print(new Parent());
				print(new Child());
			}
			private void print(Parent parent) {
				// TODO 自動生成されたメソッド・スタブ
			}
		}






	}

}
