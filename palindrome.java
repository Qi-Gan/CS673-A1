import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if(isPalindrome(input.toLowerCase())){
            System.out.println(input + "is a palindrome string.");
        }
        else{
            System.out.println(input+ " is not a palindrome string.");
        }
    }
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;

        while(left <right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }

}
