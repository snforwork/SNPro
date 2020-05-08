package co.jp.chapter06;

//質問３、４
public class Kicker {
//	private static void sayHello(String y) {
//		y = "Hello world";
//	}

//	public Kicker() {
		// TODO 自動生成されたコンストラクター・スタブ
//	}

//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
//	public static void main(String args[]) {
//		String x = null;
//		sayHello(x);
//		System.out.println(x);
//	}
//	private static void fillArray(String[] array) {
//		array[0] = "value2";
//	}
//	public static void main(String arg[]) {
//		String[] array = new String[]{"value1"};
//		fillArray(array);
//		System.out.println(array[0]);
//	}
//

	private static void fillArray(String[] array) {
		array = new String[] {"1","2"};
	}
	  public static void main(String args[]) {
		  String[] array = null;
		  fillArray(array);
		  System.out.println(array == null);
	  }

	  public static void printArray(Object[] objs) {
		  if(objs == null) {
			  System.out.println("null");
			  return;
		  }
		  String prefix = "";
		  StringBuilder sb = new StringBuilder();
		  sb.append("[");
		  for(Object obj : objs) {
			  sb.append(prefix);
			  sb.append(String.valueOf(obj));
              prefix = ",";
		  }
		  sb.append("]");
		  System.out.println(sb.toString());

	  }




  }
