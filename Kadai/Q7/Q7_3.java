public class Q7_3{
	public static void main(String[] args){
		Dog d=new Dog();
		d.setName("たま");
		d.setAge(5);
		Dog d2=new Dog();
		d2.setName("ポチ");
		d2.setAge(1);
		d.showProfile();
		d2.showProfile();
	}
}

class Dog{
		String name;
		int age;
		public void setName(String name){
			this.name=name;
		}
		public void setAge(int age){
			this.age=age;
		}
		public void showProfile(){
			System.out.println("名前は、"+this.name+"年齢は、"+this.age+"歳です。");
		}
}
