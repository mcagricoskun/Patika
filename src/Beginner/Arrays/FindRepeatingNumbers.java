package Beginner.Arrays;
import java.util.Arrays;
public class FindRepeatingNumbers {

    //duplicate içine atacağımız değer daha önceden bu liste içinde var mı diye sorguladık
    static boolean isFind(int[] arr , int value){
        for (int i :arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //int[] list  = {3,7,3,3,2,9,10,21,1,33,9,1};
        int[] list  = new int[1000];
        for (int i=0; i<1000;i++)
        {
            list[i] = (int)(Math.random()*50);
        }
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        int count =0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++) {
                count++;
                //kendisine bakaması için i = değil j dedik
                if((i!=j) && (list[i] == list[j])){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
        //sout daki 0 ları atmak için
        for (int value : duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
        System.out.println("toplam dönme: "+count);
    }
}
