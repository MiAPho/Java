import java.util.*;
public class Lesson4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("数値いれてね>");
		int n=scan.nextInt();scan.nextLine();
		System.out.print("名前入れてね>");
		String name=scan.nextLine();
		System.out.printf("%sさんは%dといれました%n",name,n);
	}
}
