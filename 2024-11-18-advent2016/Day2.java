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
    String[][] keypad = {{"0","0","1"},{"0","2","3","4"},{"5","6","7","8","9"},{"0","A","B","C"},{"0","0","D"}};
    int xpos = 0;
    int ypos = 2;
    boolean works = true;
    for (int i = 0; i < lines.size();i++){
      for (int b = 0; b < lines.get(i).length();b++){
        works = true;
        if ((lines.get(i).substring(b,b+1).equals("L"))){
          try {
            "5".equals(keypad[ypos][xpos-1]);
          }
          catch (ArrayIndexOutOfBoundsException ex){
            works = false;
          }
          if (works)
          {
            if(!("0".equals(keypad[ypos][xpos-1]))){
              xpos--;
              System.out.println(keypad[ypos][xpos]);
            }
          }
        }
        if ((lines.get(i).substring(b,b+1).equals("R"))){
          try {
            "5".equals(keypad[ypos][xpos+1]);
          }
          catch (ArrayIndexOutOfBoundsException ex){
            works = false;
          }
          if (works)
          {
            if(!("0".equals(keypad[ypos][xpos+1]))){
              xpos++;
              System.out.println(keypad[ypos][xpos]);
            }
          }
        }
        if ((lines.get(i).substring(b,b+1).equals("U"))){
          try {
            "5".equals(keypad[ypos-1][xpos]);
          }
          catch (ArrayIndexOutOfBoundsException ex){
            works = false;
          }
          if (works)
          {
            if(!("0".equals(keypad[ypos-1][xpos]))){
              ypos--;
              System.out.println(keypad[ypos][xpos]);
            }
          }
        }
        if ((lines.get(i).substring(b,b+1).equals("D"))){
          try {
            "5".equals(keypad[ypos+1][xpos]);
          }
          catch (ArrayIndexOutOfBoundsException ex){
            works = false;
          }
          if (works)
          {
            if(!("0".equals(keypad[ypos+1][xpos]))){
              ypos++;
              System.out.println(keypad[ypos][xpos]);
            }
          }
        }
      }
      res = res + keypad[ypos][xpos];
    }
    return res;
  }
  public static void main(String[] args){
    //String[][] test = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    //System.out.println(test[0][0]);
    //System.out.println(test[-1][0]);
    //System.out.println(test[0][-1]);
    //System.out.println(test[2][8]);
    System.out.println(work2(work("advent.txt")));
  }
}
