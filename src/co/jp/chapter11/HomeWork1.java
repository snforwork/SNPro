package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/**質問１︓駅クラス（STATION）、路線クラス（LINE）を作成して。路線をインスタンス化してオブジ
		ェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してください。*/
		
		List<String> Stations = new ArrayList<>();

		Stations.add("新宿");
		Stations.add("新橋");
		Stations.add("日暮里");
		Stations.add("池袋");
		Stations.add("高田馬場");
		System.out.println("山手線駅："+ Stations);
		
		/**質問２︓質問１に作成した⼭⼿線の駅をforeach ⽂を繰り返して、新橋駅は路線内であるかを判断す
る。*/
		Stations.forEach(n->{
			if(n.equals("新橋")) {
				System.out.println("新橋駅は路線内である");
			}else {
				System.out.println("");
			}
		});
		/**質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログラミングし
てください。（for⽂で旅客作成しても構わない）*/
		
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			List<String> list = new ArrayList<>();
			for(int n = 0; n < 5; n++) {
				list.add(String.valueOf(i*5+n+1));
				if( (i*5+n+1) <=31) {
					System.out.print("人");
			    }else {
					System.out.print("空");
				}
	    	}
	    	map.put(String.valueOf(i+1),list);
	    	System.out.println();
	    }
	    System.out.println(map);
		
//		for(int i=0;i<10;i++) {
//			List<String> List = new ArrayList<>();
//			for(int j =0;j<5;j++) {
//				List.add(String.valueOf(i*5+j+1));
////				System.out.println(List);
//				if((i*5+j+1)<32) {
//					System.out.println("人");
//				}else {
//					System.out.println("空");
//				}
//			}
//		}


 }
	}


