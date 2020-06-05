package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork11 {
	public static void main(String[] args) {
		Station yamate = new Station();
         yamate.setName  ("山手線");
		  System.out.println(yamate.getName());
		List<String> datas = new ArrayList<>();
		   datas.add("原宿");
		   datas.add("池袋");
		   datas.add("日暮里");
		   datas.add("上野");
		   datas.add("新橋");
		   System.out.println(datas);


	     datas.forEach(data -> {
			  if("新橋".equals(data)) {
				  System.out.println("新橋駅は路線内である");
			  }

		  });

	    Map<String, List<String>> map2 = new HashMap<>();



       for (int k = 0;k<10;k++) {
    	   List<String> list = new ArrayList<>();
    	   for(int p = 0;p<5;p++) {
    		   list.add(String.valueOf(k*5+p+1));
    		   if( (k*5+p+1)<=31) {
				   System.out.print("人");
			   }else {
				   System.out.print("空");
			   }
    	   }
    	   map2.put(String.valueOf(k+1),list);
    	   System.out.println();
       }
       System.out.println(map2);

	}
}
