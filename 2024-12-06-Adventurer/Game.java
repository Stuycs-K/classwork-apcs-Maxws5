import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    Adventurer tester = new EagleFan(args[0],10, 17);
    Adventurer tester2 = new CodeWarrior("Robert E. Lee",10);
    boolean done = false;
    Scanner userInput = new Scanner(System.in);
    while(!done){
      System.out.println(tester+", "+tester.getHP()+"/"+tester.getmaxHP()+" HP, "+tester.getSpecial()+"/"+tester.getSpecialMax()+" "+tester.getSpecialName());
      System.out.println(tester2+", "+tester2.getHP()+"/"+tester2.getmaxHP()+" HP, "+tester2.getSpecial()+"/"+tester2.getSpecialMax()+" "+tester2.getSpecialName());
      done = true;
    }
  }
}
