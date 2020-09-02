public class Main{
	public static void main(String[] args){
		Akira a=new Akira();
		a.hp=100;
		a.name="宮田";
		a.morning();
		a.school(3);
		punch teacherPunch=new punch();
		teacherPunch.name="愛のビンタ";
		teacherPunch.damage=100;
		a.punch=teacherPunch;
		a.teacherAngry();
	}
}
