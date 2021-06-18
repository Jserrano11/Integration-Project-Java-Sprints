/**
 * @author Joseph Serrano
 *
 */
import java.util.Scanner;

public class Greeting {
		Scanner scan = new Scanner(System.in);
		private String name; 
		
		public String getUserName() {
			return name; 
		}
		public void setUserName(String name) {
			System.out.println("Hi there, please start by entering your name!");
			name = scan.next();
			this.name = name;
			}
		public void Greet(String name) {
			System.out.println("Hello "+this.name+", great to see you!");
		}
}
