package co.jp.chapter10;

public class マル extends Pet{


	    マル(String name, int age, String type){
		//super
		super(0,name,age,type);
		count();
		System.out.println("-----------------");
		System.out.println("マル��:" + マルcount);
		System.out.println("マル��ǰ:" + name);
		System.out.println("マル���h:" + age);
		System.out.println("マル�Ԅe:" + type);
		System.out.println("-----------------");
		}

	    @Override
	    void count() {
	    	マルcount++;
	    	super.count();
	    	System.out.println("マル��:" + count);
	    }


}
