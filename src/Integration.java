/**
 * @author Joseph Serrano
 *
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Java.util.Scanner  is going to be the import that allows the Scanner class
 * allowing us to recieve input from the user.*/
import java.text.DecimalFormat;
/*This is going to be a package that contains proper formatting.
 * I will be using this one as a means to format any currencies that 
 * I have to calculate. 
 */

public class Integration {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		int countDown;
		
		for(countDown = 3; countDown >= 0; countDown--) {
			System.out.println(countDown);
		}
		
		/*Polymorphism - Something that you create to store base class types can also store derived types.*/
		
		/*Inheritance - The idea that any child or sub class can inherit methods and fields from any super or 
		 * parent class. Inheritance lets us use and reuse code without having to be rewritten over and over 
		 * again.*/
		
		/*The term VARIABLE is some sort of data that has an allocated portion of memory
		 * and is typically used to store values and information to use within your program
		 */
		/*SCOPE in computer programming typically refers to the idea that a variable can only be 
		 * accessed within a certain method.
		 */
		
		/*Java Built-in Data Types 
		 * There are 8 java built in data types and they go as following:
		 *  
		 * Boolean: Returns true or false values based on relational statements. This data
		 * type represents one bit of information.
		 * 
		 * Byte: An 8-bit integer. It has a minimum value of -128 and a maximum 
		 * value of 127(inclusive). Also not really used either, instead people
		 * use int too. 
		 * 
		 * Char: A single 16-bit unicode character. it has a minimum value of "\u0000"(or 0) and a maximum
		 * value of "\uffff"(or 65,535 inclusive). Used generally for showing specific character values. 
		 * 
		 * Short: A 16 bit integer. It has a minimum value of -32,768 and a maximum
		 * value of 32,767(inclusive).  Not really used any more, should instead use
		 * int.
		 * 
		 * Int: The int data type is a 32-bit integer value. It has a minimum value of -2^31 and a maximum
		 * value of 2^31-1. Generally the used number data type for whole numbers. 
		 * 
		 * Long: A 64 bit integer. The minimum is the value of -2^63 and the maximum value
		 * is 2^63-1.
		 * 
		 * Float: A precision based 32 bit floating point number. This means that 
		 * its minimum and maximum value are so big its not really known. You should
		 * instead use double.  
		 * 
		 * Double: The double data type is a 32-bit floating point number. The range is also
		 * unknown, but this is double the accuracy of a floating point number. 
		 * */
		
		/*Operator precedence is the idea that java evaluates from the highest point of precedence to the
		 * lowest. Up top, you have your increment and decrement operators which appear with the highest precedence. 
		 * Then comes multiplicative and then comes additive just a little lower on the precedence scale. We then see 
		 * an instance of the relational and equality. This means that Java will evaluate out multiplication and addition 
		 * before it goes to the conditional or equality statement. If operators have the same or equal precedence, rules 
		 * will decide what is next. Operators that assign are evaluated from right to left and the binary operators are 
		 * evaluated from left to right. */
		
		/*Important Operations that were not used within my application -
		 *MODULUS - % This will do the number divided by the other and return the remainder*/
		System.out.println("Done!");
		
		sc = new Scanner(System.in);
		Random randomInt = new Random();
		DecimalFormat df2 = new DecimalFormat("#.##");
		Greeting myGreeting = new Greeting ();
		/*Constructor for greeting class*/
		final String name = myGreeting.getUserName();
		/*The keyword FINAL in essence makes the value 
		 * not able to be edited after it has been entered
		 * or put in a variable. 
		 */
		myGreeting.setUserName(name);
		myGreeting.greetUser(name);
		
		/*Method Overloading Usage*/
		int myNum1 = add(8, 2);
		int myNum2 = add(8, 2, 3);
		
		System.out.println(myNum1+ ", " +myNum2);
		
		System.out.println("See now this is how you overload a method!!");
		/*Public getters and setters and constructor with and without parameters*/
		
		System.out.println("Did you want to also see some arrays? Please type yes now, if not type no. ");
		String selectOption = sc.nextLine();
		String selectOption1 = selectOption.toUpperCase();
		if(selectOption1.equals("YES")) {
		
		System.out.println("This is known as an array. Please start by typing in "
				+ "the amount of numbers you would like in the array, then"
				+ " type each number followed by the enter key to find the sum and "
				+ "minimum of the array.");
		/*Finding the minimum value and sum of a custom array of input*/
		int sum = 0;
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		for (int j = 0; j < n; j++) {
			arr[j] = sc.nextInt();
			sum = sum + arr[j];
			int min = arr[0];
			if(arr[j] < min) {
				min = arr[j];
			}
			
			System.out.println(sum);
			System.out.println(min);
		}
		
		
		/*2-D Arrays*****/
		
		System.out.println("This here is a 2-D version of an array instead of a 1-D model. Please enter"
				+ " a number for columns followed by rows and type a number to be printed each time and observe!");
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int [] [] arr1 = new int [r][g];
		for (int t = 0; t < r; t++) {
			for(int l = 0; l < g; l ++) {
				arr1 [t][l] = sc.nextInt();
			for(int i = 0; i<r; i++) {
				for(int j = 0; j<g; j++) {
					System.out.print(arr1[t][l]+ " ");
				}
				System.out.println("");
			}
			}
		}
		sc.close();
		ArrayList <String> arrList = new ArrayList<String>();
		System.out.println("This gets the index of the listed element.");
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Three");
		String arrListPosition = arrList.get(2);
		System.out.println(arrListPosition);
		}
		
		if (selectOption1.equals("NO")) {
		}
		
		System.out.println("Would you like to see a switch statement?");
		String operationSelection;
		operationSelection = sc.nextLine();
		String opSelect = operationSelection.toUpperCase();
		
		switch(opSelect) {
			case ("YES"):
				optionYes();
				break;
			case "NO":
				optionNo();
				break;
		}
		/*These String escape sequences can be helpful, below will tab the sentence forward
		 * (place 4 spaces in front of it) and then put double quotations around the word 
		 * number, pretty cool huh? */
		System.out.println("\t Welcome, here, please take this \"number\" so we can identify you!");
		System.out.println(randomInt.nextInt(100000));
		
		System.out.println("Enter two strings you wish to compare");
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		System.out.println("The variable "+a+" and "+b+" are going to have their length compared. Where"
				+ " it should tell you the total amount of characters in both a and b. "
				+ "Then whether a or b comes first is compared. If a is before b, it will print before,"
				+ "if a is after b, it will print after. ");
		
		System.out.println("The sum of your lengths are "+(a.length() + b.length())+" characters long.");
		String comparedAB;
		comparedAB = (a.compareTo(b)<=0) ? a+" comes before "+b : a+" comes after "+b;
		System.out.println(comparedAB);
		
		/*The == sign mainly compares strings whether or not 
		 * they are they are the same object not compare the value being held
		 * within the variable. So you can use the "==" on numbers such as
		 * integers and doubles, but should never be used on Strings, use .equals
		 * instead. */
		
		System.out.println("Please enter a number to convert or cast to a double.");
		int conversion = sc.nextInt();
		double d = conversion;
		System.out.println("Your new number is: "+d);
		/*Casting is when you alter and assign a value from one data type to another within java.
		 * In this scenario, I used casting to convert and integer taken from the user, and to 
		 * cast it to a double to show the user what it does within this part of the app. */
		
		boolean continueProgram = true;
		
		while(continueProgram) {
/*Get the input of whether user would like to calculate a meal, budget,or exit*/
		System.out.println("To calculate the total for a meal, enter meal,"
				+ "if you would like to budget please type budget now."
				+ " If you would like to close the app, type exit.");
		String optionSelect = sc.next();
		String varSelect = optionSelect.toUpperCase();
		if(varSelect.equals("MEAL")) {
			//Get the total price of the meal
			
			/*Using exception handling to ensure good input*/
			boolean gotGoodInput = false;
			double mealPrice = 0;
			while (gotGoodInput == false) {
				System.out.println("First, enter the total price of your meal: ");
				try {
					double mealPrice1 = sc.nextDouble();
					gotGoodInput = true;
					mealPrice = mealPrice1;
				}
				catch (InputMismatchException ex) {
					System.out.println("That was not a valid input. Please try again.");
					sc.nextLine();
				}
				
			}
//Get the Local Sales Tax in the area
			boolean gottenGoodInput = false; 
			double taxPercentage = 0;
			while (gottenGoodInput == false) {
				System.out.println("Next, enter your local sales tax percentage(i.e. "
						+ ".06): ");
				try {
					double taxPercentage1 = sc.nextDouble();
					gottenGoodInput = true;
					taxPercentage = taxPercentage1;
				}
				catch (InputMismatchException ex) {
					System.out.println("That was not a valid input. Please try again.");
					sc.nextLine();
				}
				
			}
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
			System.out.println("The total cost of your meal is going to be: "+"$"+df2.format(totalPrice));
		}
//Budgeting portion of the app
		if (varSelect.equals("BUDGET")) {

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
			double timeInYears = 3;
			/*The METHOD CALL is the "compoundInterest" typed out before the parentheses
			 * and the arguments.*/
			double cI = compoundInterest(principle, dividendRate, timeInYears, amountBudgeted); 
			/*This compoundInterest problem uses the Math class by using the power function. 
			 * It takes the numbers after Math.pow.*/
			
			/*Here in the cI variable, the METHOD CALL to compoundInterest takes the ARGUMENTS principle, dividendRate, and timeInYears
			 * are going to be the*/
			if (expenses > income) {
				System.out.println(myGreeting.getUserName() + ", you need to start saving: $" + df2.format(-amountBudgeted));
			}
			if (expenses < income) {
				System.out.println(myGreeting.getUserName() + ", you appear to have an extra: $" + df2.format(amountBudgeted));
				
				System.out.println("If you put just 10% of this extra money into a "
						+ "normal dividend yield account, you will make an extra $" + df2.format(cI) + " in 3 years!");
			}
			System.out.println("Are you completely finished? If so, enter yes. if you would like to run the app again,"
					+ " please type no now.");
			String lastVariable = sc.next();
			
			if(lastVariable.equals ("yes") || lastVariable.equals ("Yes")) {
				break;
				/*The BREAK statement generally jumps out of a switch or loop. 
				 * The whole loop is terminated and the program continues to 
				 * any code just after outside of the loop brackets.*/
			}
			if(lastVariable.equals ("no") || lastVariable.equals("No")) {
				continue;
			/*The CONTINUE statement continues and completes a full iteration
			 * within the loop as long as a specified condition occurs. Once it gets this, it will not run
			 * anything below this line, and will circle back to the top of the loop. */
			}
			
		}
		
		if(varSelect.equals("EXIT")) {
			continueProgram = false;
		}
		
		}
			System.out.println("Thank you "+ myGreeting.getUserName() +", have an amazing rest of your day!");
		}

	private static void optionYes() {
		System.out.println("Yep, this is a switch statement.");
		
	}

	private static void optionNo() {
		System.out.println("You may not have wanted it but you still used the switch"
				+ " statement :)");	
	}
	
	public static double compoundInterest(double principle, double dividendRate, double timeInYears, double amountBudgeted) {
		return (principle * Math.pow(1+(dividendRate / 100 * timeInYears), amountBudgeted));
		/*The method header is going to be the whole line going from public static all the way to the end parentheses just
		 * after timeInYears. 
		 * The parameters are the double principle, double dividendRate, and double timeInYears.*/
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}
	
	
	

