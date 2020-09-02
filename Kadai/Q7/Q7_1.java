public class Q7_1{
	public static void main(String[] args){
		Dog d=new Dog();
		d.setName("たま");
		d.showProfile();
	}
}

class Dog{
		String name;
		public void setName(String name){
			this.name=name;
		}
		public void showProfile(){
			System.out.println("名前は、"+this.name+"です。");
		}
}
