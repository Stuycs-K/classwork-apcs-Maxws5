import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class Day2{
  public static String[] work(String filename){
    try {
      File newFile = new File (filename);
      Scanner temp = new Scanner(newFile);
      String temp2 = temp.nextLine();
      //System.out.println(temp2);
      String[] input = temp2.split("\n");
      return input;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      String[] idk = new String[8];
      return idk;
    }
    public static String work2(String[] lines){
      String res = "";
      String[][] keypad = [[1,2,3],[4,5,6],[7,8,9]];
      for (int i = 0; i < lines.length;i++){
        res = res +"1";
      }
    }
    return res;
  }
