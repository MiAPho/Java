public class Q7_4{
	public static void main(String[] args){
		Dog d=new Dog("ブルドッグ");
		d.setName("たま");
		d.setAge(5);
		d.showProfile();
	}
}

class Dog{
		String name;
		int age;
		String type;
		public Dog(String type){
			this.type=type;
		}
		public void setName(String name){
			this.name=name;
		}
		public void setAge(int age){
			this.age=age;
		}
		public void showProfile(){
			System.out.println("犬種は"+this.type+"で、名前は、"+this.name+"年齢は、"+this.age+"歳です。");
		}
}
