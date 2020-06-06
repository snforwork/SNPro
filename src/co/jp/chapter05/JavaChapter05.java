package co.jp.chapter05;

public class JavaChapter05 {

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




	}

}
