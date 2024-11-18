import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> res = new ArrayList<String>(size);
    for(int i=0;i <= size;i++)
    {
      double tem = 11*Math.random();
      int temp = (int)(tem);
      //System.out.println(tem);
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
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> res = new ArrayList<String>(original.size());
    for (int i = original.size()-1;i>=0;i--)
    {
      res.add(original.get(i));
    }
    return res;
  }
  public static void main(String[] args)
  {
    ArrayList<String> test1 = createRandomArray((int)(12*Math.random()));
    System.out.println(createRandomArray(5));
    System.out.println(test1);
    replaceEmpty(test1);
    System.out.println(test1);
    System.out.println(makeReversedList(test1));
    ArrayList<String> test2 = createRandomArray(200000);
    replaceEmpty(test2);
    System.out.println(makeReversedList(test2));
    //System.out.println(test2);
  }
}
