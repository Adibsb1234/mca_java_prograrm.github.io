

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
    number=Math.abs(number);
        int rem,rev=0,num;
        num=number;
        while (num>0) {
        rem=num%10;
         rev=rev*10+rem;
          num=num/10;
            
        }
        return rev==number;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
}
