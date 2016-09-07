package 第1章;
//型"final"は変数を書き換えないようにする。
	//型"final"が書き換えられた場合エラーになる。
public class final型 {
	public static void main (String[] args){
		final double TAX = 1.08;
		int a = 4000;
		double b = TAX*a-a ;
		//final double TAX=1.05;
		//上のコメントを取り除き、コンパイルしてみてfinal型がちゃんと働いているか確認しよう。
		System.out.println("代金は" + a*TAX + "円、消費税は" + b + "です。");
	}
}