package Beginner.Arrays;

public class PalindromikKelime {
    static boolean isPalindrome(String str) {
        // baştan ve sondan başlayarak karşılaştırmaya başlıyoruz
        //abba mesela 0 ile 3 1 ile 2 gibi
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        //terse çevirerek str atanıp karşılaştırıldı
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
