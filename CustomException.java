package Exception4_10;
import java.util.Scanner;

class CheckPassword extends Exception{
	
public CheckPassword(String msg)
{
	super(msg);    //calling parent class constrctor
}
}
public class CustomException {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		String password= sc.next();
		
		try
		{
			if(password.length() < 8)
				System.out.println("Password length should be more than 8 characters....");
			else if(password.matches("[A-Za-z0-9 ]*"))
				System.out.println("Password should have spacial character.....");
			else
				System.out.println("Valid Password");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

}
}

