import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		String[] hands={"グー","チョキ","パー"};
		System.out.print("手を入力0.グー1.チョキ2.パー>");
		int index=new Scanner(System.in).nextInt();
		int handsPC=new Random().nextInt(hands.length);
		System.out.printf("PCは%s%n",hands[handsPC]);
	if (index==handsPC){
		System.out.println("あいこ");
	}else if(index==0){
		if(handsPC==1){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}else if(index==1){
		if(handsPC==0){
			System.out.println("あなたの負けです");
		}else{
			System.out.println("あなたの勝ちです");
		}
	}else{
		if(handsPC==0){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
	}
}
