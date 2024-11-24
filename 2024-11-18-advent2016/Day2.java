import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Day2{
  public static ArrayList<String> work(String filename){
    try {
      File newFile = new File (filename);
      Scanner temp = new Scanner(newFile);
      ArrayList<String> res = new ArrayList<String>(1);
      while (temp.hasNextLine())
      {
        res.add(temp.nextLine());
      }
      return res;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      ArrayList<String> idk = new ArrayList<String>(1);
      return idk;
    }
  }
  public static String work2(ArrayList<String> lines){
    String res = "";
    String[][] keypad = {{"1"},{"2","3","4"},{"5","6","7","8","9"},{"A","B","C"},{"D"}};
    int xpos = 1;
    int ypos = 1;
    for (int i = 0; i < lines.size();i++){
      for (int b = 0; b < lines.get(i).length();b++)
      {
        if ((lines.get(i).substring(b,b+1).equals("L"))&&(xpos>0)){
          xpos--;
          System.out.println(keypad[ypos][xpos]);
        }
        if ((lines.get(i).substring(b,b+1).equals("R"))&&(xpos<2)){
          xpos++;
          System.out.println(keypad[ypos][xpos]);
        }
        if ((lines.get(i).substring(b,b+1).equals("U"))&&(ypos<2)){
          ypos++;
          System.out.println(keypad[ypos][xpos]);
        }
        if ((lines.get(i).substring(b,b+1).equals("D"))&&(ypos>0)){
          ypos--;
          System.out.println(keypad[ypos][xpos]);
        }
      }
      res = res + keypad[ypos][xpos];
    }
    return res;
  }
  public static void main(String[] args){
    System.out.println(work2(work("advent.txt")));
  }
}
