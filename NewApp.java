import java.util.Scanner;
public class NewApp{
	
	public static int sumutionFun(int a,int b){
		int sum = a+b;
		return sum;
	}
	
	public static int multiplaction(int a,int b) {
		return a*b;
	}

	public static int subtractionFun(int a, int b){
		return a-b;
	}
	


	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Two Integer Number : ");

			int num1 = input.nextInt();
			int num2 = input.nextInt();
		System.out.println("The Sum is :" + sumutionFun(num1,num2));
		System.out.println("The Multiplaction is :" + multiplaction(num1,num2) );

		System.out.println("The Subtraction Is :" + subtractionFun(num1,num2));


	}
}