import java.util.*;
public class Jn1_1{
	public static void main(String[] args){
		System.out.print("整数A:");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数B:");
		int b=new Scanner(System.in).nextInt();
		/*
		int min=a<b ? a:b;
		System.out.printf("小さいほうの数は%dです%n",min);
		*/
		System.out.println("小さいほうの数は"+(a<b ? a:b)+"です。");
	}
}
