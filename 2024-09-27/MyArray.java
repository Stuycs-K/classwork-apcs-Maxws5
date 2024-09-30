public class MyArray{
  public static void main(String[] args)
  {
    System.out.println("THIS IS TESTS FOR aryToString:");
    System.out.println("This should output [1, 2, 3, -4]: outputs " + aryToString(new int[] {1,2,3,-4}));
    System.out.println("This should output [0]: outputs " + aryToString(new int[] {0}));
    System.out.println("This should output [-1, -2, 3]: outputs " + aryToString(new int[] {-1,-2,3}));
    System.out.println("This should output []: outputs " + aryToString(new int[] {}));
    System.out.println("\nTHIS IS TESTS FOR returnCopy:");
    int[] a = {1,2,3,5,4};
    System.out.println("This should output [1, 2, 3, 5, 4]: outputs " + aryToString(returnCopy(a)));
    System.out.println("This should output false: outputs " + (a == returnCopy(a)));
    int[] b = {0};
    System.out.println("This should output [0]: outputs " + aryToString(returnCopy(b)));
    System.out.println("This should output false: outputs " + (b== returnCopy(b)));
    int[] c = {};
    System.out.println("This should output []: outputs " + aryToString(returnCopy(c)));
    System.out.println("This should output false: outputs " + (c == returnCopy(c)));
    int[] d = {-1,-2,3};
    System.out.println("This should output [-1, -2, 3]: outputs " + aryToString(returnCopy(d)));
    System.out.println("This should output false: outputs " + (d == returnCopy(d)));
    System.out.println("\nTHIS IS TESTS FOR concatArray:");
    System.out.println("This should output [1, 2, 3, 2, 3, 4]: outputs " + aryToString(concatArray(new int[] {1,2,3},new int[] {2,3,4})));
    System.out.println("This should output [-1, 2, -3, 2, 3, -4]: outputs " + aryToString(concatArray(new int[] {-1,2,-3},new int[] {2,3,-4})));
    System.out.println("This should output []: outputs " + aryToString(concatArray(new int[] {},new int[] {})));
    System.out.println("This should output [0, 0]: outputs " + aryToString(concatArray(new int[] {0},new int[] {0})));
    System.out.println("This should output [1, 2, 3, -2, -3, -4]: outputs " + aryToString(concatArray(new int[] {1,2,3},new int[] {-2,-3,-4})));
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
  public static int[] returnCopy(int[] ary)
  {
    int[] res = new int[ary.length];
    for (int i=0;i<ary.length;i++)
    {
      res[i]=ary[i];
    }
    return res;
  }
  public static int[] concatArray(int[] ary1,int[] ary2)
  {
    int[] res = new int[ary1.length+ary2.length];
    for (int i=0;i<(ary1.length+ary2.length);i++)
    {
      if (i<ary1.length)
      {
        res[i]=ary1[i];
      }
      else
      {
        res[i]=ary2[i-ary1.length];
      }
    }
    return res;
  }
}
