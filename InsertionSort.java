public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,5,3,2,4,8,6};
        int len = a.length;
        for(int i=1;i<len;i++){
            int value = a[i];//要插入的数据
            int j = i -1;
            //查找插入的位置
            for(;j>=0;j--){
                if(a[j] > value){
                    a[j+1] =a[j];//数据移动
                }else{
                    break;
                }

            }
            a[j+1] = value;//插入数据
        }

        for(int k=0;k<len;k++){
            System.out.println(a[k] +"\n");
        }
    }
}
