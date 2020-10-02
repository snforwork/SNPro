package co.jp.chapter10;

public class Pet {
	  //トータル数
    static int count = 0;
    static int miMicount = 0;
    static int lioncount = 0;
    static int mallcount = 0;


    //名前
    String name;
    //年齢
    int age;
    //種類
    String type;
    
    Pet(String name, int age, String type){
		this.name = name;
		this.age = age;
		this.type = type;
		}
    public Pet(int i, String name2, int age2, String type2) {
 			// TODO 自動生成されたコンストラクター・スタブ
 		}


 		void count(){
 		count = miMicount + lioncount + mallcount;
 		System.out.println("Pet数:" + count);

 		  //みみ・レオ・マル
 	      if("1".equals(type)) {
 	    	 miMicount++;
 	    	  }else if("0".equals(type)){
 	    	lioncount++;
 		      }else if("0".equals(type)) {
 		      mallcount++;
 		      }
 	    }
}
