public class SlimeApp{
	public static void main(String[] args){
		Slime surarin=new Slime();
		surarin.name="スラリン";
		Slime surakiti=new Slime();
		surakiti.name="スラキチ";
		surarin.appear();
		surakiti.appear();
		Slime surachi=new Slime("スラッチ");
		surachi.appear();
		//Slime[] slimes={surarin,surakiti,surachi};
		Slime[] slimes=new Slime[3];
		slimes[0]=surarin;
		slimes[1]=surakiti;
		slimes[2]=surachi;
		for(Slime n:slimes){
			n.run();
		}
	}
}
