public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,1,3,6,8,5,2,4};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr,int left,int right) {
        if(left < right){
            int index = partSort(arr, left, right);
            quickSort(arr,left,index-1);
            quickSort(arr,index+1,right);
        }
    }

    //找分区点(快速排序算法的优化都是针对分区点的优化)
    public static int partSort(int[] arr,int left,int right) {
        int key = arr[left];//最开始以第一个元素作为分区点
        while (left < right) {
            //从右往左找第一个小于key的数
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];
            //从左往右找第一个大于key的数
            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }

}
