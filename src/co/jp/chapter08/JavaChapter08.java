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

		System.out.println(zan);

	}

}
