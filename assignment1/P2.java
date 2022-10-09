import java.util.Scanner;
class P2{
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		int num,num1;
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		num1 = num;
		for(int i=num;num>=1;num--){
			factorial=factorial*num;
		}
		System.out.println("Factorial of "+num1+" is "+factorial);
	}
}