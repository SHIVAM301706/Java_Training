package books;

public class book {
    int bid;
    String bname;
    String aname;
    book(  int bid,String bname ,String aname){
        this.bid=bid;
        this.bname=bname;
        this.aname=aname;
    }

    public String toString(){
        return "bookid: " +  bid + bname + aname ;
    }
}
