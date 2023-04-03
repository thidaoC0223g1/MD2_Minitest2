package book;

public class FictionBook extends Book{
    private String category;


    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author); //tạo đối tượng thuộc lớp cha trước do đó constructor super phải đứng đầu tiên .
        this.category = category;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()+
                "category='" + category + '\'' ;
    }
}
