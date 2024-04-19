public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,3,6,2,8,1,0,4};
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){

        if(low >= high)
            return;

        int pIndex = partition(arr, low, high);

        quickSort(arr, low, pIndex - 1);

        quickSort(arr, pIndex + 1, high);
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }

            while(arr[j] > pivot && j >= low + 1){
                j--;
            }

            if( i < j)
                swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;

    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
