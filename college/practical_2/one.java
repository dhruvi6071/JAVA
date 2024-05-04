package practical_2;

public class one {
    public static void printarr(int arr[][]) {
        for(int i= 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }

        
    }

    public static void main(String[] args) {

        // int countRow = 0;
        // int countColumn = 0;

        int[][] arr = new int[6][6];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if((i+j) % 2 == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] == 1){
                    // countRow++;
            }
            
        }
        printarr(arr);
       
    }
}
}
