
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) {

        Bunny bun1 = new Bunny(3, "eve", 8);
        Bunny bun2 = new Bunny(1, "mitsos", 4);

    
        TreeSet<Bunny> test2 = new TreeSet<Bunny>();
        test2.add(bun1);
        test2.add(bun2);
        
        Iterator<Bunny> itr=test2.iterator();
        while (itr.hasNext()){
        Bunny b= itr.next();
        System.out.println("age ="+b.age+"name ="+b.name);
    }

  
    }
}
