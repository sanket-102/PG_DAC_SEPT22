import java.util.Scanner;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num;
		num = sc.nextInt();
		if(num%2==0){
			System.out.println(num+" is EVEN number.");
		}
		else
			System.out.println(num+" is ODD number.");
	}
}