import java.util.*;
public class Arr1{
	public static void main(String[] args){
		int[] nums=new int[5];
		for (int i=0;i<nums.length;i++){
			int n=new Random().nextInt(101);
			nums[i]=n;
		}
		for (int f=0;f<nums.length;f++){
			System.out.println("nums["+f+"]:"+nums[f]);
		}
	}
}