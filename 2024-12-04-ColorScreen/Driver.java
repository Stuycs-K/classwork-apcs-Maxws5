public class Driver{
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  public static void main(String[] args){
    border(RED);
  }
  public static void border(int color){
    Text.color(color,Text.background(color));
    for (int i =0; i < 80;i++){
      System.out.print(" ");
    }
    System.out.println(Text.RESET);
    for (int i = 0;i<30;i++){
      Text.color(color,Text.background(color));
      System.out.print(" ");
      System.out.print(Text.RESET);
      for (int b = 0; b <78;b++){
        System.out.print(" ");
      }
      Text.color(color,Text.background(color));
      System.out.print(" ");
      System.out.println(Text.RESET);
    }
    Text.color(color,Text.background(color));
    for (int i =0; i < 79;i++){
      System.out.print(" ");
    }
  }
  public 
}
