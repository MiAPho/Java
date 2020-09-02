public class Akira{
public	int hp;
public	String name;
public	punch punch;
	public void morning(){
		System.out.println(this.name+"はHPが2上がった");
		this.hp+=2;
	}
	public void school(int hour){
		System.out.println(this.name+"はHPが"+hour+"下がった");
		this.hp-=1;
	}
	public void teacherAngry(){
		System.out.print(this.name+"は先生から"+this.punch.damage+"のダメージを喰らった");
	}
}
