import java.util.Scanner;

public class q3b1 {
    
    public static void main(String[] args) {
        String str[] = new String[5];
        Scanner scan = new Scanner(System.in);
               
        try{
            for(int i = 0; i<6; i++){
                str[i] = scan.next();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bound");
        }
        finally{
            scan.close();
            System.out.println("code run successfully");
        }
    }
}
