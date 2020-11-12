import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] nums=new int[10];
		
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		System.out.println(Arrays.toString(nums));

		for(int val : nums){
			System.out.println(val);
		}

		for(int i=0;i<nums.length/2;i++){
			int temp=nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(nums));

		for(int i=0;i<nums.length-1;i++){
		int n=new Random().nextInt(nums.length);
		int t=nums[n];
		nums[n]=nums[nums.length-i-1];
		nums[nums.length-i-1]=t;
		}
		System.out.println(Arrays.toString(nums));

		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
