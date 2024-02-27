import java.util.Vector;

public class SortArrayRecursion {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(0);
        vector.add(3);
        vector.add(2);
        vector.add(5);
        vector.add(4);

        System.out.println("Before Sorting : "+vector);
        sort(vector);
        System.out.println("After Sorting : "+vector);
    }

    public static void sort(Vector<Integer> vector){
        if(vector.size() == 1)
            return;

        int value = vector.get(vector.size()-1);
        vector.removeLast();                    // 1 0 3 2  // 1 0 3  // 1 0  // 1  // null
        sort(vector);
        insert(vector, value);
        
    }

    public static void insert(Vector<Integer> vector, int temp){
        if(vector.size() == 0 || vector.elementAt(vector.size()-1) <= temp)
            {
                vector.add(temp);
                return;
            }
        
        int value = vector.get(vector.size()-1);
        vector.removeLast();
        insert(vector, temp);
        vector.add(value);
    }
}
