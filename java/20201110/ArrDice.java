import java.util.*;
public class ArrDice{
	public static void main(String[] args){
		int[] index=new int[10];
		for (int i=0;i<index.length;i++){
			int dice=new Random().nextInt(6)+1;
			index[i]=dice;
		}
	System.out.println(Arrays.toString(index));
	}
}
