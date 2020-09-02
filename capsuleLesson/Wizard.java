public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void setName(String name){
		if(name.length()<3){
			throw new IllegalArgumentException("名前は3文字以上です");
		}
		this.name=name;
	}
	public void heal(Hero h){
		int basePoint=10;
		int recovPoint=(int)(basePoint*Wand.getPower());
		h.setHp(h.getHP()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した！");
	}
}
