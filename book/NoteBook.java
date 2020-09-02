public class NoteBook extends Book{
	String content="";
	public NoteBook(int bookPage,int price){
		super(bookPage,price);
	}
	public void content(String content){
		this.content+=content;
	}
	public void print(){
		super.print();
		System.out.printf("内容:%s%n",this.content);
	}
}
