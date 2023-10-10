import java.util.Hashtable;

public class TableHash {
    
    public static void main(String[] args) {
       System.out.println(getPrice("morango"));

    }

    private static float getPrice(String text){
        Hashtable<String,Float> hashtable = new Hashtable<>();
        hashtable.put("abacate", 15.2f);
        hashtable.put("morango", 23.5f);
        return hashtable.get(text);
    }
    
}
