public class Wordy{
  public static void main(String[] args){
    makeWords(3,"","abcdefghijklmnopqrstuvwxyz");
  }
  public static void makeWords(int letters, String soFar, String alpha){
    if (letters==0){
      System.out.println(soFar);
    }
    else{
      for(int i = 0; i < alpha.length(); i++){
        makeWords(letters-1,soFar+alpha.substring(i,i+1),alpha);
      }
    }
  }
}
