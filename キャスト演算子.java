package 第2章;
//元のデータを失ってもデータを強制的に変換する。あまり使わないほうが良い。
public class キャスト演算子 {
	public static void main (String[] args){
		double a=3.8;
		int b=(int) a;
		double c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//このようにa→b→cのようにするとa=cにはならない。
	}
}
