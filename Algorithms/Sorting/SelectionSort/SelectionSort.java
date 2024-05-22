public class SelectionSort{
    public static void main(Strng[] args){
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr){
            System.out.println(num + " ");
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min_idx = 1;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //Swap the found minimum elemnt witht he first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
    }

}
