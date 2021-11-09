import java.util.*;
public class EN{
  public static void main(String[] args) {
    Person oj = new Person();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name=");
	String name = sc.nextLine();
	
    oj.setName(name);
    System.out.println("Enter Name is ="+oj.getName());
  }
}