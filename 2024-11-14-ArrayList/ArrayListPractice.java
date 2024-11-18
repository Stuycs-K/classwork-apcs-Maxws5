import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> res = new ArrayList<String>(size);
    for(int i=0;i <= size;i++)
    {
      double tem = 11*Math.random();
      int temp = (int)(tem);
      System.out.println(tem);
      res.add("" + temp);
      if (res.get(i).equals("0"))
      {
        res.set(i, "");
      }
    }
    return res;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i = 0; i < original.size();i++)
  {
    if(original.get(i).equals(""))
    {
      original.set(i, "Empty");
    }
  }
}
  public static void main(String[] args)
  {
    ArrayList<String> test1 = createRandomArray((int)(12*Math.random()));
    System.out.println(createRandomArray(5));
    replaceEmpty(test1);
    System.out.println(test1);
  }
}
