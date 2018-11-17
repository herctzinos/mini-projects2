
import java.util.Objects;


public class  Bunny implements Comparable{

    int bunnyNumber;
      int age;
      String name;

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Bunny() {

    }

    public Bunny(int bunnyNumber, String name, int age) {
        this.bunnyNumber = bunnyNumber;
        this.name=name;
        this.age=age;
    }

    public String hop() {
        String s = "is hopping";
        return s;
    }

    public int getBunnynumber() {
        return bunnyNumber;
    }

public boolean equals (Object other){
    if (other==this) return true;
    if(other==null) return false;
    if(getClass()!=other.getClass()) return false;
    Bunny bunny=(Bunny)other;
    return(
    (name==bunny.name||
            (name !=null &&name.equals(bunny.getName())))&&
            (age==bunny.age ));
}
public int hashCode(){
    return Objects.hash(this.age, this.name);
}
@Override  
    public int compareTo(Object o){
        return this.age-((Bunny)o).age;
    }
}

 