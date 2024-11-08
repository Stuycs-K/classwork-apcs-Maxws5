/* When calling .speak() with the Bird object, it accesses the overriden version of getName(),
   instead of the original getName() in the Animal Class. However if you call the .speak() method
   with an Animal object, it will use the original getName(). */
/* Any class that is-A another class, will work when being compiled into that class.
Animal is-A Animal; Bird is-A Bird; Bird is-A Animal; but Animal is not a Bird.
*/
public class Driver{
  public static void main(String[] args){
    Animal toucan = new Animal("squack", 5, "Lenny");
    toucan.speak();
    Bird LennyJr = new Bird("SQUACK", 2, "Lenny Jr", 10.5, "rainbow");
    LennyJr.speak();
    Animal a1 = new Animal("a1", 5, "Lennster");
    Bird b1 = new Bird("a2", 2, "Lenny Sr", 100, "black");
    //Bird b2 = new Animal("a3", 90, "Len");
    Animal a2 = new Bird("a4", 3456, "Lennington", 1, "white");
  }
}
