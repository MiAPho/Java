public class Monkey{
	String name;
	int age;
	public void aisatu(){
		System.out.printf("こんにちは%s(%d)です。よろしく!%n",this.name,this.age);
	}
	public void takeuma(){
		System.out.println(this.name+"は上手に竹馬に乗った！");
	}
	public void sakadati(){
		System.out.println(this.name+"はひょいと逆立ちをした!");
	}
	public void appEnd(){
		System.out.println("アプリケーションを終了します。");
	}
}
