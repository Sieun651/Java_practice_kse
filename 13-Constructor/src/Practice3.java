
class BookShop {
	private String bookName;
	private String author;
	private int price;
	
	public BookShop() {		
	}
	public void setBook(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public void viewBook() {
		System.out.println("책이름 : " + bookName);
		System.out.println("저  자 : " + author);
		System.out.println("가  격 : " + price + "원");
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void getBname() {
		System.out.println("책이름 : " + bookName);
	}
	public void getAuthor() {
		System.out.println("저  자 : " + author);
	}
	public void getPrice() {
		System.out.println("가  격 : " + price + "원");
	}
}

public class Practice3 {
	public static void main(String[] args) {
		BookShop bookShop = new BookShop();
		bookShop.setBook("자바완성", "황완성", 25000);
		bookShop.viewBook();
		
		bookShop.setBookName("JSP잡기");
		bookShop.setAuthor("송길동");
		bookShop.setPrice(35000);
		System.out.println();
		bookShop.getBname();
		bookShop.getAuthor();
		bookShop.getPrice();
	}
}
