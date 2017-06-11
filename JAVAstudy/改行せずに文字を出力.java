package 第2章;
//"println"ではなく、"print"にすることで、改行せずに表示される。
public class 改行せずに文字を出力 {
	public static void main (String[] args){
		int a, b, c;
		a=8 ; b=3;
		c=a*b;
		String sum = a + "+" + b +"=";
		System.out.print(sum);
		System.out.print(c);
	}
}
