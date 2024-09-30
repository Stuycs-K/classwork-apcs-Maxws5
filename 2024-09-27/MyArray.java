public class MyArray{
  public static void main(String[] args)
  {
    System.out.println("THIS IS TESTS FOR aryToString:");
    System.out.println("This should output [1, 2, 3, -4]: outputs " + aryToString(new int[] {1,2,3,-4}));
    System.out.println("This should output [0]: outputs " + aryToString(new int[] {0}));
    System.out.println("This should output [-1, -2, 3]: outputs " + aryToString(new int[] {-1,-2,3}));
    System.out.println("This should output []: outputs " + aryToString(new int[] {}));
    System.out.println("\nTHIS IS TESTS FOR returnCopy:");
    System.out.println("This should output [1, 2, 3, 5, 4]: outputs" + aryToString(new int[] {returnCopy(new int[] {1,2,3,5,4})}));
    System.out.println("This should output [0]: outputs" + aryToString(new int[] {returnCopy(new int[] {0})}));
    System.out.println("This should output []: outputs" + aryToString(new int[] {returnCopy(new int[] {})}));
    System.out.println("This should output [-1, -2, 3]: outputs" + aryToString(new int[] {returnCopy(new int[] {-1,-2,3})}));
    System.out.println("\nTHIS IS TESTS FOR concatArray:");
    System.out.println("This should output [1, 2, 3, 2, 3, 4]: outputs" + aryToString(new int[] {concatArray(new int[] {1,2,3},new int[] {2,3,4})}));
    System.out.println("This should output [-1, 2, -3, 2, 3, -4]: outputs" + aryToString(new int[] {concatArray(new int[] {-1,2,-3},new int[] {2,3,-4})}));
    System.out.println("This should output []: outputs" + aryToString(new int[] {concatArray(new int[] {},new int[] {})}));
    System.out.println("This should output [0, 0]: outputs" + aryToString(new int[] {concatArray(new int[] {0},new int[] {0})}));
    System.out.println("This should output [1, 2, 3, -2, -3, -4]: outputs" + aryToString(new int[] {concatArray(new int[] {1,2,3},new int[] {-2,-3,-4})}));
  }
  public static String aryToString(int[] nums)
  {
    String res = "[";
    for (int i = 0; i < nums.length;i++)
    {
      res = res + nums[i];
      if (i < nums.length-1)
      {
        res = res + ", ";
      }
    }
    res = res + "]";
    return res;
  }
  public static int[] returnCopy(int[]ary)
  {

  }
  public static int[] concatArray(int[]ary1,int[]ary2)
  {

  }
}
