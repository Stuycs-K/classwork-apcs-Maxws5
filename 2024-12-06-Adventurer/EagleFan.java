public class EagleFan extends Adventurer{
  private String specialName;
  private int special,specialMax;
  public EagleFan(String name, int special){
    super(name);
    this.specialName = "dubs";
    this.special = special;
    this.specialMax = 17;
  }

  public EagleFan(String name, int hp, int special){
    super(name,hp);
    this.specialName = "dubs";
    this.special = special;
    this.specialMax = 17;
  }
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return specialName;
  }
  //accessor methods
  public int getSpecial(){
    return special;
  }
  public void setSpecial(int n){
    if (n>specialMax)special=17;
    special = n;
  }
  public int getSpecialMax(){
    return specialMax;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(1);
    return(this+" spat on "+other.getName());
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.applyDamage(-1);
    return(this+" gave a drink to "+other.getName());
  }

  //heall or buff self
  public String support(){
    this.applyDamage(-1);
    return(this+" drank a magical elixer");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(3);
    this.setSpecial(this.getSpecial()-1);
    return(this+" rubbed the dub in "+other.getName()+"'s face'");
  }
}
