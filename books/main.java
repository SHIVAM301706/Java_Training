package books;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<book> ar=new ArrayList<>();
        ar.add(new book(101,"let us c","yashavant " ));
        ar.add(new book(102,"let us c++","dhgdfgjgdf " ));
        System.out.println("--All Books");
        for(book nbn : ar ){
            System.out.println(nbn);


        }
    }
}
