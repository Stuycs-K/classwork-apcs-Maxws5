public class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
    this.noise = noise;
    this.age = age;
    this.name = name;
  }

  //2.
  /*speak() should print the following message replacing
  the ?'s with name/age/noise:
  My name is ?.
  I am ? years old.
  I say ?.

  Note: you MUST use getName() getNoise() here! You will see why later.
  */
  public void speak(){
    System.out.println("My name is "+this.getName()+".\n I am "+this.getAge()+" years old.\n I say "+this.getNoise()+".");
  }

  public String getName(){
    return name;
  }
  public String getNoise(){
    return noise;
  }
  public int getAge(){
    return age;
  }
}
