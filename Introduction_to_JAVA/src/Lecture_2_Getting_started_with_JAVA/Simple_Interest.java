package Lecture_2_Getting_started_with_JAVA;
import java.util.Scanner;

public class Simple_Interest 
{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		double roi = sc.nextDouble();
		int t = sc.nextInt();
		int si = (int)(p * roi * t) / 100;
		System.out.println(si);
		sc.close();
	}
}