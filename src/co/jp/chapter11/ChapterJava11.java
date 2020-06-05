package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChapterJava11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     String str;
     int[]arr = new int[4];
    // arr[0] = "123";
//     System.out.println("Array:"+arr.length);
//     System.out.println(arr[0]);

     List<Integer> list = new ArrayList();
    //list.add("1234");
 //    System.out.println("List:"+ list.size());

      list.add(1234567890);
//      System.out.println("List:"+ list.size());
//      System.out.println("List:"+ list.get(0));

      //3
 //     int []arr3 = new int[] {1,2,6,7,9,6,2,1};
     // int max = 0;
     // int min = 0;
//      for(int i = 0;i<arr3.length;i++) {
//
//   	   if(arr3[i]>max) {
//   		   max = arr3[i];
//   	   }
//   	   if(arr3[i]<min) {
//   		   min = arr3[i];
//   	   }}
//   	   System.out.println("MAX:"+max);
//   	   System.out.println("MIN:"+min);


   	   List<Integer> list1 = new ArrayList<Integer>();
   	   list1.add(1);
   	   list1.add(2);
   	   list1.add(6);
   	   list1.add(7);
   	   list1.add(9);
   	   list1.add(6);
   	   list1.add(2);
   	   list1.add(1);
       int max =list1.get(0);
       int min =list1.get(0);
       for(int i = 0;i<list1.size();i++) {
    	   if(list1.get(i)>max) {
    		   max = list1.get(i);

    	   }
    	   if(list1.get(i)<min) {

    		   min = list1.get(i);
    	   }
       }
//       System.out.println("MAX:"+max);
//       System.out.println("MIN:"+min);
//       System.out.println(list1);
//  List<int[]> list2 = Arrays.asList()arr3;
       Collections.sort(list1);
 //      System.out.println(list1);
       Collections.sort(list1,(t1,t2) ->{
    	   return t2.compareTo(t1);
       });
      // list1.remove(4);
     //  System.out.println(list1);



       //Map
       Map<String, Object> map = new HashMap<>();
       map.put("101","A");
       map.put("54","B");
       map.put("15","B");
       map.put("101","D");
       map.put("102","A");
       map.put("ZZ","101");
       map.remove("101");
       System.out.println(map);
       System.out.println(map.getOrDefault("111"," "));

       Map<String, List<String>> map2 = new HashMap<>();

       for(int i = 0;i<10;i++) {
    	   List<String> list2 = new ArrayList<>();

    	   for(int j = 0;j<10;j++) {
    		  list2.add(String.valueOf(i*10+j+1));

    	  }
            map2.put(String.valueOf(i+1),list2);

       }

        System.out.println(map2);








	}

}
