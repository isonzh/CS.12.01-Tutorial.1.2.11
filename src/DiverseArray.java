public class DiverseArray {
    public static int arraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr){
        int sum[]=new int[arr.length];
    for (int i=0;i<arr.length;i++){
        int rowsum=0;
        for(int j=0;j<arr[0].length;j++){
          rowsum+=arr[i][j];
        }
        sum[i]=rowsum;
    }
        return sum;
    }
    public static boolean isDiverse(int[][]arr){
        int sum[]=rowSums(arr);
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length;j++){
                if(sum[i]==sum[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

