public class Q6_8{
	public static void main(String[] args){
		for(int i=11;i<=20;i++){
			System.out.println(term(i));
		}
	}
	public static int term(int num){
		int[] fibonacci=new int[21];	
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int i=2;i<fibonacci.length;i++){
			fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
		}
		return fibonacci[num];
	}
}
