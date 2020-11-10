import java.util.*;
public class ArrLesson8{
	public static void main(String[] args){
		int[] nums=new int[5];
		for (int i=0;0<nums.length;i++){
			int num=new Random().nextInt(101);
			nums[i]=num;
			System.out.println("nums["+i+"]:"+nums[i]);
		}
	}
}
