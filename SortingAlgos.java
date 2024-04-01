public class SortingAlgos{
    public static void main(String[] args) {
        int[] arr = {10,3,6,2,8,1,0,4};

        System.out.print("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        //Selection Sort 
        // for(int i = 0; i < arr.length - 1;i++){
        //     int min = i;
        //     for(int j = i;j < arr.length; j++){
        //         if( arr[j] < arr[min])
        //             min = j;
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[min];
        //     arr[min] = temp;
        // }


        //Bubble Sort
        // for(int i = 0; i < arr.length - 1;i++){
        //     for(int j = 0;j < arr.length - i - 1; j++){
        //         if( arr[j+1] < arr[j]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;            
        //         }
        //     }
        // }

        //Insertion Sort

        for(int i = 0;i < arr.length;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp; 
                j--;
            }
        }

        System.out.print("\nAfter Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}