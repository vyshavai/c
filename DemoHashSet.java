import javax.lang.model.util.ElementScanner14;

part java.util.HashSet

public class DemoHashSet {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(20);
        hs.add(12);
        hs.add(54);
        hs.add(6);
        System.out.println(hs);
        if(hs.contains(54)){
            System.out.println("Item Found");
        else
            System.out.println("Item not found");
        }
    }
}
