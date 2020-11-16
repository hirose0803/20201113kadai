import java.util.*;
public class ArrLesson2{
	public static void main(String[] args){
		int[][] deta1={
			{15,34,12},
			{25,44,4,9},
			{7,19,},
		};
		System.out.println(deta1[1][2]);//4
		int[][] deta2=new int[3][];
		deta2[0]=new int[]{15,34,12,};
		deta2[1]=new int[]{25,44,4,9,};
		deta2[2]=new int[]{7,19,};
		System.out.println(deta2[2][1]);//19
		int[][] deta3=new int[3][];
		deta3[0]=new int[3];
		deta3[1]=new int[4];
		deta3[2]=new int[2];
		for(int i=0;i<deta3.length;i++){
			for(int j=0;j<deta3[i].length;j++){
				deta3[i][j]+=i+1;
				System.out.printf("%2d",deta3[i][j]);
			}
		System.out.println();
		}
	}
}
