public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static final String greenPeriod = "\u001b[42m.";
  public static final String brownPeriod = "\u001b[40m.";
  public static final String redPeriod = "\u001b[41m.";
  public static final String reset = "\u001b[0m";
  public static void main(String[] args){
    tree(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
  }
  public static void tree(int width, int treeWidth){
    for(int i = 0; i <= width/2 +1; i++){
      String res = "";
      for (int b = 0; b < width/2-i;b++){
        res+=redPeriod+reset;
      }
      for (int c = 0; c < i; c++){
        res+=greenPeriod+greenPeriod+reset;
      }
      for (int b = 0; b < width/2-i;b++){
        res+=redPeriod+reset;
      }
      System.out.println(res);
      if (treeWidth == i*2)break;
    }
    String finals = "";
    for (int b = 0; b < width/2-1;b++){
      finals+=redPeriod+reset;
    }
    finals+=brownPeriod+brownPeriod+reset;
    for (int b = 0; b < width/2-1;b++){
      finals+=redPeriod+reset;
    }
    System.out.println(finals);
  }
}
