import java.util.*;
public class Sato{
	public static void main(String[] args){
		int[] nums=new int[10];
		System.out.print("好きな数字を入力してください>");
		int favorite=new Scanner(System.in).nextInt();
		int counter=0;
		for(int i=0;i<nums.length;i++){
			int num=new Random().nextInt(10)+1;
			nums[i]=num;
			System.out.print(nums[i]+",");
			if(nums[i]==favorite){
				counter++;
			}
		}
		System.out.println();
		if(counter>0){
		System.out.println(favorite+"は"+counter+"回出ました");
		}else{
			System.out.println(favorite+"は出ませんでした");
		}
	}
}
