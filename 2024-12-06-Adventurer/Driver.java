public class Driver{
  public static void main(String[] args){
    Adventurer tester = new EagleFan("Bob",10, 17);
    Adventurer tester2 = new EagleFan("dick",10);
    System.out.println(tester.attack(tester2));
  }
}
