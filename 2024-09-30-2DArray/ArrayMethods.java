public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.
  // Mottaqi Abedin - mottaqia2789@nycstudents.net
  // Max Abraham - maxa39@nycstudents.net
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static void main (String[] args) {
    int[][] r = new int[][]{{2,3,4},{5,6,7,5,5},{2,4,9}};
    System.out.println("Expected output [[2, 3, 4], [5, 6, 7, 5, 5], [2, 4, 9]]\n actual output; " + arrToString(r));
    r = new int[][]{{},{},{},{}};
    System.out.println("Expected output [[], [], [], []]\n actual output; "+ arrToString(r));
    r = new int[][]{{-2,-30,-4},{5,6,7}};
    System.out.println("Expected output [[-2, -30, -4], [5, 6, 7]]\n actual output; "+ arrToString(r));
    r = new int[][]{{0}};
    System.out.println("Expected output [[0]]\n actual output; "+ arrToString(r));
    r = new int[][]{{2,3,4},{5,6,7},{2,4}};
    System.out.println("Expected output: 33 \n actual output; " + arr2DSum(r));
    r = new int[][]{{},{},{},{}};
    System.out.println("Expected output 0 \n actual output; "+ arr2DSum(r));
    r = new int[][]{{-2,-3,-4},{50,6,7}};
    System.out.println("Expected output 54 \n actual output; "+ arr2DSum(r));
    r = new int[][]{{0}};
    System.out.println("Expected output 0 \n actual output; "+ arr2DSum(r));
    r = new int[][]{{-1,-2,-3},{1,2,3}};
    System.out.println("Expected output [[-1, 1], [-2, 2], [-3, 3]] \n actual output; "+ arrToString(swapRC(r)));
    r = new int[][]{{0,1},{-20,-1}};
    System.out.println("Expected output [[0, -20], [1, -1]] \n actual output; "+ arrToString(swapRC(r)));
    r = new int[][]{{1,2,3,40,5}};
    System.out.println("Expected output [[1], [2], [3], [40], [5]] \n actual output; "+ arrToString(swapRC(r)));
    r = new int[][]{{1},{2},{3},{4},{50}};
    System.out.println("Expected output [[1, 2, 3, 4, 50]] \n actual output; "+ arrToString(swapRC(r)));
    r = new int[][]{{},{},{},{}};
    replaceNegative(r);
    System.out.println("Expected output [[], [], [], []]\n actual output; "+ arrToString(r));
    r = new int[][]{{-1},{-1,-2},{-1,-2,-3},{-1,-2,-3,-4}};
    replaceNegative(r);
    System.out.println("Expected output [[1], [0, 1], [0, 0, 1], [0, 0, 0, 1]]\n actual output; "+ arrToString(r));
    r = new int[][]{{},{},{},{}};
    replaceNegative(r);
    System.out.println("Expected output [[], [], [], []]\n actual output; "+ arrToString(r));
    r = new int[][]{{2},{-1,2},{-1,2,3},{1,-1,2,-3}};
    replaceNegative(r);
    System.out.println("Expected output [[2], [0, 2], [0, 2, 3], [1, 0, 2, 1]]\n actual output; "+ arrToString(r));
    r = new int[][]{{-1000,-2000,-3000},{-20000},{},{},{0,0,0,0,-90}};
    replaceNegative(r);
    System.out.println("Expected output [[1, 0, 0], [0], [], [], [0, 0, 0, 0, 1]]\n actual output; "+ arrToString(r));
    r = new int[][]{{2,3,4},{5,6,7,5,5},{2,4,9}};
    int[][] c = copy(r);
    System.out.println("Expected output [[2, 3, 4], [5, 6, 7, 5, 5], [2, 4, 9]]\n actual output; " + arrToString(c));
    System.out.println("Expected output false \n real output " + (c == r));
    r = new int[][]{{},{},{},{}};
    c = copy(r);
    System.out.println("Expected output [[], [], [], []]\n actual output; "+ arrToString(c));
    System.out.println("Expected output false \n real output " + (c == r));
    r = new int[][]{{-2,-30,-4},{5,6,7}};
    c = copy(r);
    System.out.println("Expected output [[-2, -30, -4], [5, 6, 7]]\n actual output; "+ arrToString(c));
    System.out.println("Expected output false \n real output " + (c == r));
    r = new int[][]{{0}};
    c = copy(r);
    System.out.println("Expected output [[0]]\n actual output; "+ arrToString(c));
    System.out.println("Expected output false \n real output " + (c == r));
  }

  public static String arrToString(int[] nums)
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
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

    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      int res = 0;
      for (int i = 0; i < nums.length; i++)
      {
        for (int t = 0; t < nums[i].length; t++)
        {
          res = nums[i][t] + res;
        }
      }
      return res;//place holder return value so it compiles.
    }

    /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
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
}
