package designPatterns;

/**
 * Created by Mate on 2017. 05. 17..
 */
public class Main2 {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5};
        int i = ints.length-1;
        while (i >= 0) {
           // System.out.println(ints[i]);
            i--;
        }

        String aaa = new String("(123) 333-2333");
        System.out.println(aaa.matches("[(]123[)].*\\s\\d{3}.*-.*\\d{4}"));



        System.out.println( trueOrFalse(true, true));
    }

    public static boolean trueOrFalse(boolean first, boolean second){
        return first | second && first!=second;
    }
}
