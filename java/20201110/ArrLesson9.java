import java.util.*;
public class ArrLesson9{
	public static void main(String[] args){
		int[] nums1=new int[5];
		int[] nums2=new int[5];
		System.out.println("***nums1***");
		for (int i=0;i<nums1.length;i++){
			int index=new Random().nextInt(100)+1;
			nums1[i]=index;
			System.out.println(nums1[i]);
		}
		System.out.println("***nums2***");
		for (int j=0;j<nums1.length;j++){
			nums2[j]=nums1[j]*3;
			System.out.println(nums2[j]);
		}
	}
}
