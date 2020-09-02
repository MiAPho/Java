public class SuperTime{
	public static void main(String[] args){
		long start=System.currentTimeMillis();
	  long x=1;
		long y=1;
		while(x<100000000){
			x++;
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start+"(ms)");
	}
}
