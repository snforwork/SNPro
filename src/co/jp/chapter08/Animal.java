package co.jp.chapter08;

public class Animal {

	//PET トータル数
	static int count = 0; 
	static int catcount = 0; 
	static int fishcount = 0; 
	static int birdcount = 0; 
	
	//種類　1陸　2海　3空
	String type;
	//名前
	String name;
	//年齢
	int age;
	//性別
	String sex;
	
	Animal(String type,String name, int age, String sex){
		this.type = type;
		this.name = name;
		this.age = age;
		this.sex = sex;
		//count(type);
	}
	
	void count(){
		count = catcount + fishcount + birdcount;
		//System.out.println("Animal数:" + count);
		
		//陸・海・空
	    //if("1".equals(type)) {
		//   catcount++;
	    //}else if("2".equals(type)){
		//   fishcount++;
	    //}else if("3".equals(type)) {
		//   birdcount++;
	    }	
    

	
}
	