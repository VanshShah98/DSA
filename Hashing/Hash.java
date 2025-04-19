package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class Hash {
    public static void main(String[] args) {
        //Creating HashSet.
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        // if(set.contains(1)){
        //     System.out.println(true);
        // }
        // if(!set.contains(9)){
        //     System.out.println(false);
        // }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }

    }
}
