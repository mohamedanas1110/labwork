package lab2;
import java.util.Scanner;
class Ladder {
	public static void main(String arr[])
	{
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number of rows");
	int a=scan.nextInt();
	for(int i=1;i<=a;i++)
	 {
	 for(int j=1;j<=i;j++)
	 System.out.print(j);
	 for(int k=i-1;k>=1;k--)
	 System.out.print(k);
	 System.out.print("\n");
	 }
	scan.close();
	} 
}
