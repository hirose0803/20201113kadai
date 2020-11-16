import java.util.*;
public class ArrLesson4{
	public static void main(String[] args){
		String[] wwww={"いつ","誰が","どこで","何をした",};
		String[][] deta=new String[4][];
		for (int i=0;i<deta.length;i++){
			System.out.print(wwww[i]+"はいくつ>");
			int times=new Scanner(System.in).nextInt();
			deta[i]=new String[times];
			for (int j=0;j<deta[i].length;j++){	
				System.out.print(wwww[i]+"をいれて>");
				String toDo=new Scanner(System.in).nextLine();
				deta[i][j]=toDo;
			}
		}
		String[] seps={"","が","で",""};
		for (int i=0;i<deta.length;i++){
			int index=new Random().nextInt(deta[i].length);
			System.out.print(deta[i][index]+seps[i]);
		}
		System.out.println();
	}
}
