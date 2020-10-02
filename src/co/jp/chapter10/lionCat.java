package co.jp.chapter10;

public class lionCat extends Pet{
   
	lionCat(String name, int age, String type){
	//super
	super(0,name,age,type);
	count();
	System.out.println("-----------------");
	System.out.println("レオ:" + lioncount);
	System.out.println("レオ:" + name);
	System.out.println("レオ:" + age);
	System.out.println("レオ:" + type);
	System.out.println("-----------------");
	}

    @Override
    void count() {
    	lioncount++;
    	super.count();
    	System.out.println("レオ��:" + count);
    }

}
