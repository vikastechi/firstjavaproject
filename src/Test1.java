
public class Test1 {

	
	public String show(int marks) throws UserDefinedException {
		String msg = "";
		   if (marks <= 50) {
			   throw new UserDefinedException();
			   }
		
			  if (marks > 50)  {
			   msg = "You have Passed"; 
			  }
			   return msg;
	   }
}
