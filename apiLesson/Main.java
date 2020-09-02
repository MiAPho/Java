import java.util.*;
public class Main{
	public static void main(String[] args){
		String s1="Java and JavaScript";
		if(s1.contains("Java")){
			System.out.println("含まれています");
		}
		String s2=s1.substring(0,4);
		System.out.println(s2);//Java
		String s3=s1.substring(5,8);//and
		sop(s3);
		sop("Java");
		sop(100);
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		sb.append(" World");
		sb.append(System.lineSeparator());//改行
		sb.append("Bye!");
		sop(sb.toString());
		String name="B334890Z";
		if(isValidPlayerNam(name)){
			sop(name+"はOK");
			sop(name.replaceAll("[\\d]","x"));
		}
		int i=sumOf(1,2,3,4,5,6,7,8,9,10);
		sop(i);
		int[] arr=createArr(1,2,3,4,5);
		sop(Arrays.toString(arr));
	}
	static void sop(Object obj){
		System.out.println(obj);
	}
	static boolean isValidPlayerNam(String name){
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	static int sumOf(int a,int b,int... nums){
		int sum=a+b;
		for(int n:nums){
			sum+=n;
		}
		return sum;
	}
	static int[] createArr(int... nums){
		return nums;
	}
}
