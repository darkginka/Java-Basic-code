public class Demo {
     public static void main(String[] args) {
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
      }
    
}
