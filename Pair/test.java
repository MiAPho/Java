public class test{
	public static void main(String[] args){
		int i=109;
		while(true){
			i/=10;
			System.out.println(i);
			if(i==0){
				break;
			}
		}
	}
}
