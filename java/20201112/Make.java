import java.util.*;
public class Make{
	public static void main(String[] args){
	int[] nums=new int[50];
	for(int i=0;i<nums.length;i++){
		nums[i]=i+1;
	}
	System.out.print("何回ひく？(1~10)>");
	int times=new Scanner(System.in).nextInt();
	int sumA=0;
	int sumB=0;
	for(int i=0;i<times;i++){
		for(int j=0;j<2;j++){
			int point=new Random().nextInt(nums.length-(i*2-j));
			int score=nums[point];
			nums[point]=nums[nums.length-j-1-(i*2-j)];
			nums[nums.length-j-1-(i*2-j)]=score;
		if(j==0){
				sumA+=score;
				System.out.print((i+1)+"回目Aさん:"+score);
			}else{
				sumB+=score;
				System.out.println(",Bさん:"+score);
			}
		}
	}
	System.out.println("合計:Aさん"+sumA+",Bさん"+sumB);
	if(sumA==sumB){
		System.out.println("引き分け");
	}else if(sumA>sumB){
		System.out.println("Aさんの勝ち");
	}else{
		System.out.println("Bさんの勝ち");
	}
	}
}
