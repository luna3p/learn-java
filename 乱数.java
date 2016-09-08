package 第2章;

public class 乱数 {
	public static void main (String[] args){
		int r = new java.util.Random().nextInt(100);//100>r>=0以上の整数を代入する。
		System.out.println(r);
	}
}
