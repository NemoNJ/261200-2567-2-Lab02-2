public class Main {
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
        hp1Book.applyDiscount(-20);
        hp1Book.applyDiscount(0);
        hp1Book.applyDiscount(0.5);
        hp1Book.applyDiscount(25.00);
        hp1Book.applyDiscount(50);
        hp1Book.applyDiscount(100.00);
        hp1Book.applyDiscount(150);
    }
}
class Book{
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Engineering Dynamics";
        this.author = "Meriam and Kraige";
        this.price = 500.5;
    }
    public Book(String title,String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }
    public void displayDetails() {
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price + "\n");
        // TODO: Complete the rest of this method.
    }
    public void updatePrice(double newPrice) {
        if(newPrice <= 0) newPrice =  -1*newPrice;
        this.price = newPrice;
    }
    public void applyDiscount(double discount){
         if(discount > 0.00 && discount < 100.00){
             this.price = this.price*(1-discount/100.00);
             System.out.println("This discount percentage applied");
             System.out.println("Discount is " + discount + " %");
             System.out.println("Updated price is "+ this.price+"\n");
         }else{
             System.out.println("Error this discount is invalid");
             System.out.println("Price is "+this.price+" so it not update!\n");
         }

    }
}
