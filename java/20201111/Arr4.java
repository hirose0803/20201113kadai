import java.util.*;
public class Arr4{
	public static void main(String[] args){
		int[] nums=new int[10];
		String[] odds=new String[10];
		for (int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			System.out.print(n+",");
			nums[i]=n;
		}
		System.out.println();
		for (int i=0;i<nums.length;i++){
     	odds[i]=nums[i]%2==0 ? "偶数":"奇数";
		}
		System.out.println(Arrays.toString(odds));
	}
}
