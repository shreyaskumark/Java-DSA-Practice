import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,3,6,2,8,1,0,4};
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length - 1);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left , mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        ArrayList<Integer> list = new ArrayList<>();
        int l = left;
        int r = mid + 1;

        while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                list.add(arr[l]);
                l++;
            }
            else{
                list.add(arr[r]);
                r++;
            }
        }
            
        while(l <= mid){
                list.add(arr[l]);
                l++;
        }

        while(r <= right){
                list.add(arr[r]);
                r++;
        }

        for(int i = left;i <= right;i++){
                arr[i] = list.get(i - left);
        }
    }
}

