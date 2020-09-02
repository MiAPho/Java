public abstract class Character{
	String name;
	int hp;
	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
	public abstract void attack(Matango m);
}
abstract class Dancer extends Character{
	public void dance(){
		System.out.println("ダンスで魅了した");
	}
}
class salsaDancer extends Dancer{
	@Override
	public void attack(Matango m){
		this.dance();
		System.out.println("マタンゴはつられて踊った");
	}
}
class Hero extends Character{
	@Override
	public void attack(Matango m){
		System.out.println("マタンゴに攻撃した");
		m.hp-=10;
	}
}
