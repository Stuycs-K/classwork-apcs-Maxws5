public Class MyArray{
  public static void main(String[] args)
  {

  }
  public static String artToString(int[] nums)
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
    return res;
  }
}
