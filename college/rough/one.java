// get only sum  of columns.

package rough;

public class one {
        public static void columnSum(int[][] arr){
        int[] columnsum = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                columnsum[j] = columnsum[j] + arr[i][j];
            }
        }
        for(int i = 0; i<columnsum.length; i++){
            System.out.println(columnsum[i]);
        }
        
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        printArr(arr);
        columnSum(arr);
    }
}
