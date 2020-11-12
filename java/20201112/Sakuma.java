import java.util.*;
public class Sakuma{
	public static void main(String[] args){
		System.out.print("要素数を入力>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		int one=0;
		int seven=0;
		int seventeen=0;
		for (int i=0;i<nums.length;i++){
			int number=new Random().nextInt(20)+1;
			nums[i]=number;
			if(nums[i]==1){
				one++;
			}else if(nums[i]==7){
				seven++;
			}else if(nums[i]==17){
				seventeen++;
			}else{
				nums[i]=0;
			}
		}
		if (one==0){
			System.out.println("1はでませんでした");
		}else{
			System.out.println("1は"+one+"回出ました");
		}
			if (seven==0){
			System.out.println("7はでませんでした");
		}else{
			System.out.println("7は"+seven+"回出ました");
		}
			if (seventeen==0){
			System.out.println("17はでませんでした");
		}else{
			System.out.println("17は"+seventeen+"回出ました");
		}

	}
}
