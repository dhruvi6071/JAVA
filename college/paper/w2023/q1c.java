public class q1c {
    public static int add(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans + arr[i];
        }
        return ans;
    }

    public static int max(int[] arr){
        int max = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int search(int[] arr, int index){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == index){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(add(arr));
        System.out.println(max(arr));
        System.out.println(search(arr, 3));
        
    }
}
