public class q4a1 {
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int i=0;
        int j = str.length()-1;
        while(i<=j) {
            if((int)str.charAt(i) != (int)str.charAt(j)){
                System.out.println("is not palindrome");
                return false;
            }
            i++;
            j--;
        }
      System.out.println("is palindrome ");
      return true;
    }
    public static void main(String[] args) {
        int num = 12321;
        isPalindrome(num);
    }
}
