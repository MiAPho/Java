public class Hero{
	String name="ミナト";
	int hp=100;
	public Hero(String name){
		this.name=name;
		System.out.println("Heroのコンストラクタが動作");
	}	
	public void attack(Matango m){
		System.out.println(this.name+"攻撃!");
		m.hp-=5;
		System.out.println("5ポイントのダメージを与えた");
	}
	public void run(){
		System.out.println(this.name+"は逃げ出した!");
	}
}