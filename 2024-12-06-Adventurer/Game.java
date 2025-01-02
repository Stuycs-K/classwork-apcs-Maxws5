import java.util.Scanner;
import java.util.Random;
public class Game{
  public static void main(String[] args){
    Adventurer tester;
    if(args.length==1){
      tester = new EagleFan(args[0],10, 3);
    }
    else{
      tester = new EagleFan("Abraham Lincoln",10, 3);
    }

    Adventurer tester2 = new CodeWarrior("Robert E. Lee",10);
    boolean done = false;
    Scanner userInput = new Scanner(System.in);
    while(!done){
      System.out.println("\n\n\n"+tester+", "+tester.getHP()+"/"+tester.getmaxHP()+" HP, "+tester.getSpecial()+"/"+tester.getSpecialMax()+" "+tester.getSpecialName());
      System.out.println(tester2+", "+tester2.getHP()+"/"+tester2.getmaxHP()+" HP, "+tester2.getSpecial()+"/"+tester2.getSpecialMax()+" "+tester2.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      boolean keepGoing = true;
      if (input.equals("quit"))System.exit(0);
      else{
        if (input.equals("attack")||input.equals("a"))System.out.println(tester.attack(tester2));
        else{
          if (input.equals("special")||input.equals("sp"))System.out.println(tester.specialAttack(tester2));
          else{
            if (input.equals("support")||input.equals("su"))System.out.println(tester.support());
            else{
              System.out.println("Invalid input, try again");
              keepGoing = false;
            }
          }
        }
      }
      if(keepGoing){
        if (tester2.getHP()>0){
          int rand = (int)(Math.random()*3);
          if(rand == 0){
            System.out.println(tester2.attack(tester));
          }
          if(rand == 1){
            System.out.println(tester2.specialAttack(tester));
          }
          if(rand == 2){
            System.out.println(tester2.support());
          }
        }
        else{
          System.out.println("You won! You killed your opponent. Do you feel good? There is blood on your hands. Well, now I have to go tell "+tester2+"'s kids that they won't be coming home tonight.");
          done = true;
        }
        if(tester.getHP()<=0){
          System.out.println("YOU DIED! What a loser. This game is so easy.");
          done = true;
        }
      }
    }
  }
}
