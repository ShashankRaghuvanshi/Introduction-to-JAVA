package Lecture_2_Getting_started_with_JAVA;
import java.util.Scanner;

public class Average_Marks 
{
	public static void main(String[] args) 
    {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		int avg = (i+j+k)/3;
		System.out.println(ch);
		System.out.println(avg);


    }
}
