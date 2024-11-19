import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class Day1{
  public static String[] work(String filename){
    try {
      File newFile = new File (filename);
      Scanner temp = new Scanner(newFile);
      String temp2 = temp.nextLine();
      System.out.println(temp2);
      String[] input = temp2.split(", ");
      return input;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      String[] idk = new String[8];
      return idk;
    }
  }
  public static int work2(String[] input){
    int North = 0;
    int South = 0;
    int East = 0;
    int West = 0;
    int direct = 0;
    for (int i = 0; i < input.length; i++){
      String lor = input[i].substring(0,1);
      int move = Integer.parseInt(input[i].substring(1));
      if (lor.equals("R")) direct += 1;
      else direct -= 1;
      if (direct==-1) direct = 3;
      if (direct == 5)direct = 1;
      if (direct%4==0)North+=move;
      if (direct%4==1)East+=move;
      if (direct%4==2)South+=move;
      if (direct%4==3)West+=move;
    }
    int res = Math.abs(North-South) + Math.abs(East-West);
    return res;
  }
  public static void main(String[] args){
    System.out.print(work2(work("advent.txt")));
  }
}
