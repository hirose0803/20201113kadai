import java.util.*;
public class Saku{
	public static void main(String[] args){
		System.out.print("何人>");
		int man = new Scanner(System.in).nextInt();
		int[] mans=new int[man];
		for (int i=0;i<mans.length;i++){
			System.out.print((i+1)+"人目の点数>");
			int n=new Scanner(System.in).nextInt();
			mans[i]=n;
		}
		System.out.println(Arrays.toString(mans));
	}
}
