import java.math.BigDecimal;
import java.util.*;
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your name : ");
			String name = scan.nextLine(); 
			System.out.println("Enter your Age: ");
			Integer age = scan.nextInt(); 			
			System.out.println("Enter your salary :");
			BigDecimal salary=scan.nextBigDecimal();
			
			System.out.println("hello"+name +"age"+ age + "salary" +salary);
	}

}
