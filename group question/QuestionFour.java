import java.util.Scanner;

public class QuestionFour{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	
	for(int count = 0; count <= 20 ; count++){
		System.out.print("Enter your name");
		String name = scan.nextLn();
		System.out.print("Enter your income");
		int income = scan.nextInt();
		System.out.print("Enter your expenditure");
		int expenditure = scan.nextInt();
		System.out.print("Enter your tax percentage");
		int percentage = scan.nextInt();
		

		int sum =(income*expenditure)/percentage ;
		System.out.print("\nNAME : "+name+"\nmontly income: "+income+"\nexpenditure: "+ expenditure + "\npercentage"+percentage+"the tax"+sum);
}}}

		