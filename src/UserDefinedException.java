


class UserDefinedException extends Exception{
	   public UserDefinedException(){
	 }
	   public UserDefinedException(String str){
	   super(str);
	 }
	  public String toString(String msg){
	   return msg;
	}

	}