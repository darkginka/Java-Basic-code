import java.util.Scanner;

public class StaticDemo {
	static int res(int n){
		int[] i = {51,20,34,4};
		return i[n];
		}

	static void res1(){
		int[] i = {51,20,34,4};
		System.out.println(i[i.length-2]);
		}

	int display(){
		return 10;
		}
		

 
    public static void main(String[] args){
     /* 	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number between 0-3 =");
	int n = s.nextInt();
	System.out.println(res(n));
	*/


	//if we  use static word in method
	res1();    


	
	/*
	//Without static word in method
	demo e =new demo();
	System.out.println(e.display());
	*/
	

    }
  }