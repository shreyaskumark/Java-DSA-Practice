import java.util.Arrays;
import java.util.Iterator;

public class DynamicArrays implements Iterable<Integer> {

    private static int DEFAULT_CAP = 8;

    public int[] arr;
    public int len = 0;
    public int capacity = 0;
    
    public static void main(String[] args) {
        DynamicArrays ar = new DynamicArrays(50);
        ar.add(3);
        ar.add(7);
        ar.add(6);
        ar.add(-2);

        ar.sort(); // [-2, 3, 6, 7]

        // Prints [-2, 3, 6, 7]
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Prints [-2, 3, 6, 7]
        System.out.println(ar);
    }

    public DynamicArrays() {
        this(DEFAULT_CAP);
    }

    public DynamicArrays(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity : " + capacity);
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public DynamicArrays(int[] array){
        if(arr == null) throw new IllegalArgumentException("Array cannot be null");
        arr = Arrays.copyOf(array, array.length);
        capacity = len = array.length;
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int elem) {
        arr[index] = elem;
    }

    public void add(int elem) {
        if (len + 1 >= capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;

            arr = Arrays.copyOf(arr, capacity);
        }
        arr[len++] = elem;
    }

    public void removeAt(int rm_index) {
        System.arraycopy(arr, rm_index + 1, arr, rm_index, len - rm_index - 1);
        --len;
        --capacity;
    }

    public boolean remove(int elem) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == elem) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public void reverse() {
        for (int i = 0; i < len / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
    }

    public void sort() {
        Arrays.sort(arr, 0, len);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;

            public boolean hasNext() {
                return index < len;
            }

            public Integer next() {
                return arr[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        if (len == 0)
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for (int i = 0; i < len - 1; i++)
                sb.append(arr[i] + ", ");
            return sb.append(arr[len - 1] + "]").toString();
        }
    }
}
