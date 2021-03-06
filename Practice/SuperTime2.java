import java.util.*;
public class SuperTime2{
	public static void main(String[] args){
		int count=0;
		long start=0;
		long end=0;
		long time=0;
		for(int j=0;j<3;j++){
			for(long i=1000000000;;i++){
				start=System.currentTimeMillis();
				boolean prime=judge(i);
				if(prime && count<10){
					count++;
					System.out.println(i);
				}
				if(count==10){
					count=0;
					end=System.currentTimeMillis();
					break;
				}
			}
			System.out.print(j+1+"回目:"+(end-start)+"(ms)");
			new Scanner(System.in).nextLine();
			if(j==0){
				time=end-start;
			}else if(time>end-start){
				time=end-start;
			}
		}
		System.out.println("最速は"+time+"(ms)");
	}
	public static boolean judge(long num){
		int i;
		for(i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
