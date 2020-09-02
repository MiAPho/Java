public class Main{
	public static void main(String[] args){
		Book b1=new Book();
		Book b2=new Book("頭の体操");
		Book b3=new Book("君の名は",1200);
		b1.showStatus();
		b2.showStatus();
		b3.showStatus();
	}
}
