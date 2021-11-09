import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            	int[] myNumbers = {1, 2, 3};
		Scanner sc = new Scanner(System.in);
 	    	System.out.print("Enter Number = ");
    		//String no = sc.nextLine();
		Integer no = sc.nextInt();

		//double ss = no;
		//String ss = no.toString();
		//System.out.println(ss);
		//System.out.println(ss.length());
            	//System.out.println(myNumbers[no]);



        } 
	catch (Exception e) {
            	System.out.println("Out Of Index Error or type error");
        }

	finally {
      		System.out.println("The 'try catch' is finished.");
    	}

 
/*
		if(no>10){
		throw new InputMismatchException("Please Enter right input!!");
		}
*/
		
    
    }
}
