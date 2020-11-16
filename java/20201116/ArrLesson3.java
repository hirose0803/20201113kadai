import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		System.out.print("何クラス？>");
		int classes=new Scanner(System.in).nextInt();
		int[][] deta=new int[classes][];
		for (int i=0;i<deta.length;i++){
			System.out.print("クラス"+(i+1)+"は何人？>");
			int people=new Scanner(System.in).nextInt();
			deta[i]=new int[people];
			for (int j=0;j<deta[i].length;j++){
				System.out.print((j+1)+"人目の点数>");
				int score=new Scanner(System.in).nextInt();
				deta[i][j]=score;
			}
		}
		System.out.println("---結果---");
		for (int i=0;i<deta.length;i++){
			for (int j=0;j<deta[i].length;j++){
				System.out.printf("%4d",deta[i][j]);
			}
		System.out.println();
		}
	}
}
