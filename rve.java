package rv;

import java.util.ArrayList;

public class rve {
    public static void main(String[] args) {
        ArrayList<String> rev = new ArrayList<>();
        ArrayList<String> rev1 = new ArrayList<>();
        rev.add("apple");
        rev.add("orange");
        rev.add("Grapes");
        rev.add("Kiwi");
        int i =0;
        int j=rev.size()-1;
        while(i<j){
            String a= rev.get(i);
            String b= rev.get(j);

            rev.set(i,b);
            rev.set(j,a);

            i++;
            j--;



        }

        System.out.println(rev);

    }


}
