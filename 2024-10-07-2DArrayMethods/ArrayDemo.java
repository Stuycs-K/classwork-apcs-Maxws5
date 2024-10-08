import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[][] r = new int[][]{{2,3,4},{5,6,7,5,5},{2,4,9}};
    System.out.println("Expected output true\n actual output; " + (Arrays.deepToString(r).equals(arrToString(r)))+"\n");
    r = new int[][]{{},{},{},{}};
    System.out.println("Expected output true\n actual output; "+ (Arrays.deepToString(r).equals(arrToString(r)))+"\n");
    r = new int[][]{{-2,-30,-4},{5,6,7}};
    System.out.println("Expected output true\n actual output; "+ (Arrays.deepToString(r).equals(arrToString(r)))+"\n");
    r = new int[][]{{0}};
    System.out.println("Expected output true\n actual output; "+ (Arrays.deepToString(r).equals(arrToString(r)))+"\n");
    r = new int[][]{{},{},{},{}};
    System.out.println("Expected output 0\n actual output; "+ (countZeros2D(r))+"\n");
    r = new int[][]{{0},{0},{0},{0}};
    System.out.println("Expected output 4\n actual output; "+ (countZeros2D(r))+"\n");
    r = new int[][]{{-2},{-1},{0},{1}};
    System.out.println("Expected output 1\n actual output; "+ (countZeros2D(r))+"\n");
    r = new int[][]{{0,0,0},{-1,-2,0},{10,20,30}};
    System.out.println("Expected output 4\n actual output; "+ (countZeros2D(r))+"\n");
    r = new int[][]{{30},{-30},{100000,0},{}};
    System.out.println("Expected output 1\n actual output; "+ (countZeros2D(r))+"\n");
    r = new int[][]{{},{},{},{}};
    System.out.println("Expected output <table><tr></tr><tr></tr><tr></tr><tr></tr></table>\n actual output; "+ (htmlTable(r))+"\n");
    r = new int[][]{{0},{0},{0},{0}};
    System.out.println("Expected output <table><tr><td>0</td></tr><tr><td>0</td></tr><tr><td>0</td></tr><tr><td>0</td></tr></table>\n actual output; "+ (htmlTable(r))+"\n");
    r = new int[][]{{-2},{-1},{0},{1}};
    System.out.println("Expected output <table><tr><td>-2</td></tr><tr><td>-1</td></tr><tr><td>0</td></tr><tr><td>1</td></tr></table>\n actual output; "+ (htmlTable(r))+"\n");
    r = new int[][]{{0,0,0,0},{-1,-2,-3},{-3,4,6},{10,20,30}};
    System.out.println("Expected output <table><tr><td>0</td><td>0</td><td>0</td><td>0</td></tr><tr><td>-1</td><td>-2</td><td>-3</td></tr><tr><td>-3</td><td>4</td><td>6</td></tr><tr><td>10</td><td>20</td><td>30</td></tr></table>\n actual output; "+ (htmlTable(r))+"\n");
    r = new int[][]{{30},{-30},{100000,0},{}};
    System.out.println("Expected output <table><tr><td>30</td></tr><tr><td>-30</td></tr><tr><td>100000</td><td>0</td></tr><tr></tr></table>\n actual output; "+ (htmlTable(r))+"\n");
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String res = "[";
    for (int i = 0; i < ary.length;i++)
    {
      res = res + ary[i];
      if (i < ary.length-1)
      {
        res = res + ", ";
      }
    }
    res = res + "]";
    return res;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String res = "[";
    for (int i=0; i < ary.length; i++)
    {
      if (i < ary.length - 1) {
        res += arrToString(ary[i]) + ", ";
      }
      else {
        res += arrToString(ary[i]) + "]";
      }
    }
    return res;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int res = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int t = 0; t < nums[i].length; t++)
      {
        if (nums[i][t]==0)
        {
          res++;
        }
      }
    }
    return res;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][] nums){
     int res = 0;
     for (int i = 0; i < nums.length; i++)
     {
       for (int t = 0; t < nums[i].length; t++)
       {
         res = nums[i][t] + res;
       }
     }
     return res;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i=0; i<vals.length; i++){
      for (int t=0; t<vals[i].length;t++){
        if (vals[i][t]<0){
          if(i==t){
            vals[i][t]=1;
          }
          else{
            vals[i][t]=0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] res = new int[nums.length][];
    for (int i=0;i<nums.length;i++)
    {
      res[i]=returnCopy(nums[i]);
    }
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

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int row = nums.length;
    int column = nums[0].length;
    int[][] result = new int[column][row];
    for (int i =0; i<column; i++)
    {
      for (int t =0; t<row; t++)
      {
        result[i][t]=nums[t][i];
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String res = "<table>";
    for (int i = 0; i < nums.length; i++)
    {
      res = res + "<tr>";
      for (int t = 0; t < nums[i].length; t++)
      {
        res = res + "<td>";
        res = res + nums[i][t];
        res = res + "</td>";
      }
      res = res + "</tr>";
    }
    res = res + "</table>";
    return res;
  }
}
