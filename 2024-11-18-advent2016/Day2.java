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
    //System.out.println(Arrays.toString(lines));
    String[][] keypad = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    for (int i = 0; i < lines.size();i++){
      res = res +"1";
    }
    return res;
  }
  public static void main(String[] args){
    System.out.println(work2(work("advent.txt")));
  }
}
