package 第2章;

public class 文字列の連結 {
	public static void main (String[] args){
		String prf = "name\n" + 52 + "歳";
		System.out.println(prf);
		String name = "name";
		int num = 45;
		String nn = name + num;//型が違う変数でも繋げることができる。
		System.out.println(nn);
	}
}
