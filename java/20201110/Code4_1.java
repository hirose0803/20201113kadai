public class Code4_1{
	public static void main(String[] args){
		int[] sub={20,30,40,50,80};
		int sum=0;
		for(int n:sub){
			sum+=n;
		}
		int avg=sum/sub.length;
		System.out.printlm("合計点"+sum);
		System.out.printlm("平均点"+avg);
	}
}
