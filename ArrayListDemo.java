import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");


 Iterator itr=cars.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next()); 
  }  

    //System.out.println(cars);
    //System.out.println(cars.get(1));
    //System.out.println(cars.set(3,"Tata"));
    //System.out.println(cars.remove(1));
    //System.out.println(cars.size());
    //cars.clear();

  }
}