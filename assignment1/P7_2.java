import java.util.Scanner;
class P7_2{
	
	public static void print(int m, int n){
		if(m<=n){
			System.out.print(m+" ");
			m++;
			print(m,n);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		print(num1,num2);
		
	}
}