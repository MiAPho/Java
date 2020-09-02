import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		String word=new Scanner(System.in).next();
		String word2=word.replaceAll("[aiueo]","");
		System.out.println(word2);
	}
}
