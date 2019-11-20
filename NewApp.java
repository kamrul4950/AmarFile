import java.util.Scanner;
public class NewApp{

	public static void nameFun(String name){
		System.out.println("Welcome " +name);
	}


	public static void main(String[] Args){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
			String name=value.next();
			nameFun(name);
		


	}

	
}