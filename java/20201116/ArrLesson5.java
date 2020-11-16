import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		System.out.println("---掛け算表---");
		System.out.print("行(1~99)?>");
		int row=new Scanner(System.in).nextInt();
		System.out.print("列(1~99)?>");
		int col=new Scanner(System.in).nextInt();
		int[][] nums=new int[row][col];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				if(j<nums[i].length-1){
					System.out.printf("%4d|",nums[i][j]);
				}else{
					System.out.printf("%4d",nums[i][j]);
				}
			}
			System.out.println();
		}
	}
}
