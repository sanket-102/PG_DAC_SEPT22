import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num,num1,digits,num2=0,num_ref,num3;
	int count =0;
	System.out.println("Enter the number: ");
	num = sc.nextInt();
	num1=num;
	num_ref=num;
	while(num_ref>0){
		num_ref=num_ref/10;
		count++;
	}
	int power = count;
	while(num>0){
		num3=num%10;
		num2=num2+(int)Math.pow(num3,power);
		num=num/10;
		
	}
	if(num1==num2)
		System.out.println(num1+" is armstrong number.");
	else
		System.out.println(num1+" is not armstrong number");
	}
}