public class Kail{
	public static void main(String[] args){
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		Hero h1=new Hero("ジェシカ");
		h1.hp=90;
		Hero h2=new Hero("カイル",70);
		h.run();
		h1.run();
		h2.run();
	}
}
