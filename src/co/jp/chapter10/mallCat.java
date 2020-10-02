package co.jp.chapter10;

public class mallCat extends Pet{

//	 public mallCat(int i, String name2, int age2, String type2) {
//		super(i, name2, age2, type2);
//		// TODO 自動生成されたコンストラクター・スタブ
//	}

	 mallCat(String name, int age, String type){
			super(0,name,age,type);
			count();
			System.out.println("マル:" + mallcount);
			System.out.println("マル:" + name);
			System.out.println("マル:" + age);
			System.out.println("マル:" + type);
			}

		    @Override
		    void count() {
		    	mallcount++;
		    	super.count();
		    	System.out.println("マル��:" + count);
		    }

}
