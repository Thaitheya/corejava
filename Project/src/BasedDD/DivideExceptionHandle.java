package BasedDD;
public class DivideExceptionHandle{
	public static void Vote(int age)
	{
		if(age < 18) {
			throw new ArithmeticException("Access Denied");
		}else {
			System.err.println("You are eligible for vote ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
   		
     
Vote(18);

}
}

