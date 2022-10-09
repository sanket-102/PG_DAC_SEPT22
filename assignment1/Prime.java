import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter the number: ");
		int num = sc.nextInt();
		
			
			int c =0;
			for(int b =1; b<=num; b++)	{
				
				if(num%b == 0)	{
					c++;
				}
			}
			if (c==2) {
				System.out.println("Prime");	
			}
			else
				System.out.println("not prime");
		
	}
}