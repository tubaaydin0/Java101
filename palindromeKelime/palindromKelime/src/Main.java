// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //YÖNTEM 1
    static boolean isPalindrome(String kelime){
        int i=0;
        int j= kelime.length()-1;
        while(i<j){
        if (kelime.charAt(i)!= kelime.charAt(j)){
            return false;
        }
        i++;
        j--;
        }
        return true;
    }
    // YÖNTEM 2
    static  boolean isPalindrome2(String kelime) {
        String reverse = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            reverse += kelime.charAt(i);
        }
        return kelime.equals(reverse);
    }
    public static void main(String[] args) {
        //palindromik kelimeler aba, asa,kayak...
        System.out.println(isPalindrome("abya"));
        System.out.println(isPalindrome2("abba"));
    }
}