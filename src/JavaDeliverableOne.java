import java.util.Scanner;

public class JavaDeliverableOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scnr.next();
        boolean passwordFlag = true;
        char ch;
        boolean capitalFlag = false;
	    boolean lowerCaseFlag = false;

	    
	    
	    for(int i=0;i < password.length();i++) {
	    	
	        ch = password.charAt(i);
	 
	        
	    //At least one uppercase letter   
	        if (Character.isUpperCase(ch)) {
	        	capitalFlag = true;
	        }
	        
	      //At least one lowercase letter
	        if  (Character.isLowerCase(ch)) {
	        	lowerCaseFlag = true;
	        	
	        }
	            
 
       
	    }
	    
	    if(!capitalFlag) {   
        	passwordFlag = false;
        }
	    
	    if(!lowerCaseFlag) {   
        	passwordFlag = false;
        }
        
        
        
        //At least minimum 7 characters
        if(password.length() < 7) {
        	passwordFlag = false;
        	
        }
        //At lease maximum 12 characters
        if (password.length() > 12) {
        	passwordFlag = false;
        	
        }
        
        
        //An exclamation point:!
        
        if(!password.contains("!")) {
        	passwordFlag = false;
        	
        }
        
        
        
        if(passwordFlag) {
        	System.out.println("Password valid and accepted");
       	
        }else {
        	System.out.println("Error");
        	
        }
	    
	}
}

	
	    


	