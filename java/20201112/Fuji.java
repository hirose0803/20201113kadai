import java.util.*;
public class Fuji{
	public static void main(String[] args){
		int[] nums=new int[99];
		for (int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		System.out.print("何人>");
		int people=new Scanner(System.in).nextInt();
		int[] scores=new int[people];
		String[] names=new String[people];
		for (int i=0;i<people;i++){
			System.out.print((i+1)+"人目の名前>");
			String name=new Scanner(System.in).nextLine();
			names[i]=name;
			int score=new Random().nextInt(nums.length-i);
			scores[i]=score;
			nums[i]=score;
			int temp=nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
			System.out.println(names[i]+"さんの点数:"+scores[i]+"点");
		}
	}
}
