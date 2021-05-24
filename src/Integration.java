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
		/*Scope in computer programming typically refers to the idea that a variable can only be 
		 * accessed within a certain method.
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
/*Get the input of whether user would like to calculate a meal, budget,or exit*/
		System.out.println("To calculate the total for a meal, enter meal,"
				+ "if you would like to budget please type budget now."
				+ " If you would like to close the app, type exit.");
		String optionSelect = sc.next();

//Get the total price of the meal
			System.out.println("First, enter the total price of your meal: ");
			double mealPrice = sc.nextDouble();
//Get the Local Sales Tax in the area
			System.out.println("Next, enter your local sales tax percentage(i.e. "
					+ ".06): ");
			double taxPercentage = sc.nextDouble();
//Get the desired tip percentage
			System.out.println("Finally, enter your desired tip percentage(i.e. "
					+ ".15, .18, or .2): ");
			double tipPercentage = sc.nextDouble();
			/*calculate total without tip and total without tax and add that to your
			 * original meal price.*/
			double totalWithouttip = (mealPrice * taxPercentage);
		
			double totalWithouttax = (mealPrice * tipPercentage);
			
			double totalPrice = (totalWithouttip + totalWithouttax + mealPrice);
//Output total cost of meal
			System.out.println("The total cost of your meal is going to be: " + df2.format(totalPrice));
			/*Test wheter or not the user wants to also budget or exit the app now*/
			System.out.println("Did you also need help budgeting your finances " + userName+"?");
			System.out.println("If so, please type yes, otherwise please type no now.");
			String testVariable = sc.next();
			
			if (testVariable.equals("Yes") || testVariable.equals("yes")) {
				optionSelect.equals("Budget");
		}
			if (testVariable.equals("No") || testVariable.equals("no")) {
				optionSelect.equals("Exit");
			}
//Budgeting portion of the app
		if (optionSelect.equals("Budget") || optionSelect.equals("budget")); {
			
			System.out.println("The next series of questions will be within the "
					+ "time frame of a monthly basis.");
//Get monthly income from user
			System.out.println("Start now by entering your monthly income: ");
			double monthlyIncome = sc.nextDouble();
//Get extra money or disposable income
			System.out.println("Now, is there any money that you make on the side?"
					+ "(i.e. disposable income): ");
			double disposableIncome = sc.nextDouble();
//Get rent and utilities
			System.out.println("Now we can properly plan your budget sheet. Thirdly,"
					+ "please enter the total of your rent and utilities: ");
			double rentAndutilities = sc.nextDouble();
//Get excess expense
			System.out.println("How much money do you spend on yourself?(i.e. eating out,"
					+ "shopping, gas): ");
			double monthlyExcessspending = sc.nextDouble();
//Get monthly cost of groceries
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
