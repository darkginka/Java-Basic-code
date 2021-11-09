abstract class Animal {
  public abstract void animalSound();
  
  public void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends Animal {
  public void animalSound() {
    System.out.println("wee wee");
  }
}

class Goat extends Animal{
    public void animalSound(){
        System.out.print("BEEE");
    }
}

class Abr {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    Goat myGoat = new Goat();
    myGoat.animalSound();

    //myPig.animalSound();
    //myPig.sleep();
  }
}