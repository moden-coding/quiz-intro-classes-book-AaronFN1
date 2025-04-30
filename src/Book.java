public class Book {
    private String title;
    private String author;
    private int publishingYear;
    private boolean isAvailable;

    public Book(String title, String authour, int publishingYear){
        this.title = title;
        this.author = authour;
        this.publishingYear = publishingYear;
        isAvailable = true;
    }

    public String toString(){
        return "Title: "+title+", Author: "+author+", Year Published: "+publishingYear+", Available: "+isAvailable;
    }

    public void borrowBook(){
        if(isAvailable){
            System.out.println(title+" borrowed");
            isAvailable = false;
        }
        else{
            System.out.println(title+" is not available");
        }
    }

    public void returnBook(){
        if(isAvailable == false){
            System.out.println(title+" returned");
            isAvailable = true;
        }
        else{
            System.out.println(title+" already available");
        }
    }
}
