import java.util.Scanner;
class P7{
	
	public static void print(int n){
		if(n>=1){
			System.out.print(n+" ");
			n--;
			print(n);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		print(num);
		
	}
}