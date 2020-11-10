import java.util.Arrays;
public class ArrLesson3{
	public static void main(String[] args){
		int[] detaA={3,5,10};
		int[] detaB=new int[] {4,6,10};
		for (int i=0;i<detaA.length;i++){
			System.out.print(detaA[i]);
		}
		//拡張for文detaBの要素を未読が無くなるまで全部取り出す
		for (int n : detaB){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(detaA));
	}
}
//String[] strs={hoge,fuga,bar};
//for (int i=0;i<strs.length;i++){
//System.out.println(strs[i]);
//}
//for (String words : strs){
//System.out.println(words);
//}
