/* This will be a program that will show my understanding of COP2006
 * My app will calculate the total of a meal and/or provide the user 
 * with budgeting advice. It was an app that I had originally developed
 * within COP 1500.*/
import java.util.Scanner;
/*Java.util.Scanner  is going to be the import that allows the Scanner class
 * allowing us to recieve input from the user.*/
import java.text.DecimalFormat;
/*This is going to be a package that contains proper formatting.
 * I will be using this one as a means to format any currencies that 
 * I have to calculate. 
 */

/**
 * @author Joseph Serrano
 *
 */

public class Integration {
	
	
	private static Scanner sc;

	public static void main(String[] args) {
		int countDown;
		for(countDown = 3; countDown >= 0; countDown--) {
			System.out.println(countDown);
		}
		/*The term variable is some sort of data that has an allocated portion of memory
		 * and is typically used to store values and information to use within your program
		 */
		/*Scope in computer programming typically is the lifetime of a specified variable.
		 * Basically how long that variable will be accessible. 
		 */
		System.out.println("Done!");
		
		sc = new Scanner(System.in);
		
		DecimalFormat df2 = new DecimalFormat("#.##");
		Greeting GreetingObject = new Greeting ();
		System.out.println("Hello, please start by entering your name now");
		final String userName = sc.nextLine();
		/*The keyword FINAL in essence makes the value 
		 * not able to be edited after it has been entered
		 * or put in a variable. 
		 */
		GreetingObject.Greet(userName);

		System.out.println("To calculate the total for a meal, enter meal,"
				+ "if you would like to budget please type budget now."
				+ " If you would like to close the app, type exit.");
		String optionSelect = sc.nextLine();


			System.out.println("First, enter the total price of your meal: ");
			double mealPrice = sc.nextDouble();
			
			System.out.println("Next, enter your local sales tax percentage(i.e. "
					+ ".06): ");
			double taxPercentage = sc.nextDouble();
			
			System.out.println("Finally, enter your desired tip percentage(i.e. "
					+ ".15, .18, or .2): ");
			double tipPercentage = sc.nextDouble();
			
			double totalWithouttip = (mealPrice * taxPercentage);
		
			double totalWithouttax = (mealPrice * tipPercentage);
			
			double totalPrice = (totalWithouttip + totalWithouttax + mealPrice);
			
			System.out.println("The total cost of your meal is going to be: " + df2.format(totalPrice));
			
			System.out.println("Did you also need help budgeting your finances " + userName+"?");
			System.out.println("If so, please type yes, otherwise please type no now.");
			String testVariable = sc.nextLine();
			
			if (testVariable.equals("Yes") || testVariable.equals("yes")) {
				optionSelect.equals("Budget");
		}
			if (testVariable.equals("No") || testVariable.equals("no")) {
				optionSelect.equals("Exit");
			}
		
		if (optionSelect.equals("Budget") || optionSelect.equals("budget")); {
			
			System.out.println("The next series of questions will be within the "
					+ "time frame of a monthly basis.");
			
			System.out.println("Start now by entering your monthly income: ");
			double monthlyIncome = sc.nextDouble();
			
			System.out.println("Now, is there any money that you make on the side?"
					+ "(i.e. disposable income): ");
			double disposableIncome = sc.nextDouble();
			
			System.out.println("Now we can properly plan your budget sheet. Thirdly,"
					+ "please enter the total of your rent and utilities: ");
			double rentAndutilities = sc.nextDouble();
			
			System.out.println("How much money do you spend on yourself?(i.e. eating out,"
					+ "shopping, gas): ");
			double monthlyExcessspending = sc.nextDouble();
			
			System.out.println("Finally, about how much would you say that you "
					+ "spend on groceries every month?: ");
			double monthlyGrocerycost = sc.nextDouble();
			
			double income = (monthlyIncome + disposableIncome);
					
			double expenses = (rentAndutilities + monthlyExcessspending + monthlyGrocerycost);
			
			double amountBudgeted = (income - expenses);
			
			double principle = (amountBudgeted * .10);
			double dividendRate = .04;
			double timeInyears = 3;
			double compoundInterest = (principle * Math.pow(1+(dividendRate / 100 * timeInyears), amountBudgeted));
			
			if (expenses > income) {
				System.out.println(userName + ", you need to start saving: $" + df2.format(-amountBudgeted));
			}
			if (expenses < income) {
				System.out.println(userName + ", you appear to have an extra: $" + df2.format(amountBudgeted));
				
				System.out.println("If you put just 10% of this extra money into a "
						+ "normal dividend yield account, you will make an extra $" + df2.format(compoundInterest) + " in 3 years!");
			}
			
			
		if (optionSelect.equals("Exit") || optionSelect.equals("exit")) {
			System.out.println("Okay, thank you, Have great day!");
		}
		}
	}
	
}
