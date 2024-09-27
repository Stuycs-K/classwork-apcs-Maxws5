public class MyArray{
  public static void main(String[] args)
  {
    System.out.println("This should output [1, 2, 3, 4]: outputs" + aryToString(new int[] {1,2,3,4}));
    System.out.println("This should output [0]: outputs" + aryToString(new int[] {0}));
    System.out.println("This should output []: outputs" + aryToString(new int[] {}));
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
}
