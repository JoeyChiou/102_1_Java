import java.io.*;
import java.util.Scanner;
public class TeamH_A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入一個四位元整數:");
		int a,b,c,d,e,f,g,h,i,result; 
		a = sc.nextInt();	//題目要求一次輸入
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		i = a*1000+b*100+c*10+d;
		System.out.println(+i);
		e = (a+5)%10;
		f = (b+5)%10;
		g = (c+5)%10;
		h = (d+5)%10;
		result = h*1000+e+f*10+g*100;
		System.out.println("加密後的數字為:"+result);

	}

}