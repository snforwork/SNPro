package co.jp.chapter08;

public class JavaChapter08 {
	public static void main(String[] args) {
		String strFather = "A";
		String strSon="";
		//AB
		//①
		strSon ="AB";//もったいないソース
		//②
		strSon =strFather +"B";
		int total= 20;
		int zan = 0;
		//logic
//		Animal an1 = new Animal();
//		Animal an2 = new Animal();
//		Animal an3 = new Animal();
//		Animal an4 = new Animal();
//		Animal an = new Animal("1",20,"A","メス");
//		an.count("1");
		
		Cat cat = new Cat( 5,SEX.MAIL, "メス");
//		cat.count("1");
		
		Fish fish=new Fish(2,SEX.MAIL, "カス");
		Brid brid=new Brid(3,SEX.MAIL, "チス");
		
		zan=total-Animal.count;
		
		System.out.println(zan);
		}
}
