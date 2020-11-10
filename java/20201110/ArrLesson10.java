import java.util.*;
public class ArrLesson10{
	public static void main(String[] args){
		int[] ball=new int[99];
		for(int i=0;i<ball.length;i++){
			ball[i]=i+1;
		}
		int[] scoreA=new int[5];
		int[] scoreB=new int[5];
		int winA=0;
		int winB=0;
	for(int j=0;j<5;j++){
		for(int k=0;k<2;k++){
			int index=new Random().nextInt(ball.length-k);
			int temp=ball[index];
      ball[index]=ball[ball.length-1-k];
      ball[ball.length-1-k]=temp;
			if(k%2==0){
				scoreA[j]=index;
			}else{
				scoreB[j]=index;
			}
		}
			System.out.printf("%d回戦%nA:%d,B:%d...",j+1,scoreA[j],scoreB[j]);
			if(scoreA[j]==scoreB[j]){
				System.out.println("あいこ");
			}else if(scoreA[j]>scoreB[j]){
				System.out.println("Aの勝ち");
				winA++;
			}else{
				System.out.println("Bの勝ち");
				winB++;
			}
	}
	if(winA==winB){
		System.out.printf("%d対%dであいこ%n",winA,winB);
	}else if(winA>winB){
		System.out.printf("%d対%dでAの勝ち",winA,winB);
	}else{
		System.out.printf("%d対%dでBの勝ち",winA,winB);
	}
	}
}

