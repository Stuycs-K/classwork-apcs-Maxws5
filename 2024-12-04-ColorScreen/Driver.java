import java.util.Random;
import java.util.Arrays;
public class Driver{
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  public static void main(String[] args) {
      System.out.print(Text.CLEAR_SCREEN);
      System.out.print(Text.HIDE_CURSOR);
      int[] test = randArray();
      border(CYAN);
      addInt(test, CYAN);
      System.out.print(Text.SHOW_CURSOR);
      System.out.print(Text.RESET);
      Text.go(31, 1);
  }

  public static void border(int color) {
      for (int col = 1; col <= 80; col++) {
          Text.go(1, col);
          Text.color(color, Text.background(color));
          System.out.print(" ");
          Text.go(30, col);
          System.out.print(" ");
      }
      for (int row = 2; row <= 29; row++) {
          Text.go(row, 1);
          System.out.print(" ");
          Text.go(row, 80);
          System.out.print(" ");
      }
      for (int row = 2; row <= 29; row++) {
          for (int col = 2; col <= 79; col++) {
              Text.go(row, col);
              Text.color(BLACK, Text.background(Text.BLACK));
              System.out.print(" ");
          }
      }
  }

  public static void addInt (int[] arr, int color) {
      int spacing = 20;
      int startCol = 10;
      for (int i = 0; i < arr.length; i++) {
          Text.go(2, startCol + i * spacing);
          if (arr[i] < 25) {
              Text.color(RED, Text.background(Text.BLACK));
          } else if (arr[i] > 75) {
              Text.color(GREEN, Text.background(Text.BLACK));
          } else {
              Text.color(WHITE, Text.background(Text.BLACK));
          }
          System.out.printf("%02d", arr[i]);
      }
      Text.color(color, Text.background(Text.BLACK));
      for (int col = 2; col <= 79; col++) {
          Text.go(3, col);
          System.out.print("-");
      }
    }

  public static int[] randArray(){
    int[] res = new int[3];
    res[0]=(int)(Math.random()*100.0);
    res[1]=(int)(Math.random()*100.0);
    res[2]=(int)(Math.random()*100.0);
    return res;
  }
}
