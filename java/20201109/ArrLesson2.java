public class ArrLesson2{
	public static void main(String[] args){
		int[] deta=new int[5];
		System.out.println(deta[0]);
		System.out.println(deta.length);
		deta[0]=100;
		deta[deta.length-1]=150;
		deta[2]=120;
		deta[1]=deta[2]-deta[0];
			System.out.println(deta[1]);
	}
}
