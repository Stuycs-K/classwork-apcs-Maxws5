import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{
  public static String[] work(String filename){
    try {
      File newFile = new File (filename);
      Scanner temp = new Scanner(newFile);
      String temp2 = temp.nextLine();
      System.out.println(temp2);
      String[] input = temp2.split(", ");
      System.out.println(toString());
      return input;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      String[] idk = new String[8];
      return idk;
    }
  }
  public static void main(String[] args){
    System.out.println(work("advent.txt"));
  }
}
