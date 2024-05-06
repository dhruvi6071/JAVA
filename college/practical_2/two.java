package practical_2;

public class two {
    public static void printarr(int arr[][]) {
        for(int i= 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }

        
    }
    public static void arrindex(int arr[][]) {
        int[] index = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.println(index[0] + " " + index[1]);
    }
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                
                    arr[i][j] = i-j;
                
            }
        }

        printarr(arr);
        arrindex(arr);
    }
}
