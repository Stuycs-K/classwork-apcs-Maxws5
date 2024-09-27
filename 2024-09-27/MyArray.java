public class MyArray{
  public static void main(String[] args)
  {
    System.out.println("This should output [1, 2, 3, 4]: outputs" + aryToString({1;2;3;4});
    System.out.println("This should output [Hi, my, name, is, max]: outputs" + aryToString({"Hi"; "my"; "name"; "is"; "max"}));
    System.out.println("This should output [0]: outputs" + aryToString({0});
    System.out.println("This should output []: outputs" + aryToString({}));
  }
  public static String aryToString(int[] nums)
  {
    String res = "[";
    for (int i = 0; i < nums.length;i++)
    {
      res = res + nums[i];
      if (i >1)
      {
        res = res + ", ";
      }
    }
    res = res + "]"
    return res;
  }
}
