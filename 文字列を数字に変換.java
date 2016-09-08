package 第2章;
//String型が数ではない場合、エラーを起こす。
public class 文字列を数字に変換 {
	public static void main (String[] args){
		String num = "15";
		int n = Integer.parseInt (num);
		System.out.println(n);
	}
}
