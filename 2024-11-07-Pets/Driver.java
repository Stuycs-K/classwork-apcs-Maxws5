/* When calling .speak() with the Bird object, it accesses the overriden version of getName(),
   instead of the original getName() in the Animal Class. However if you call the .speak() method
   with an Animal object, it will use the original getName(). */
public class Driver{
  public static void main(String[] args){
    Animal toucan = new Animal("squack", 5, "Lenny");
    toucan.speak();
    Bird LennyJr = new Bird("SQUACK", 2, "Lenny Jr", 10.5, "rainbow");
    LennyJr.speak();
  }
}
