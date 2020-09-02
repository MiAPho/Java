import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("1.立方体/2.球/3.終了>");
			int input=scan.nextInt();
			switch(input){
				case 1:
					System.out.print("1辺の長さを入力してください>");
					double y=scan.nextDouble();
					Cube c=new Cube(y);
					c.displayAreaInfo();
					break;
				case 2:
					System.out.print("半径を入力してください>");
					y=scan.nextDouble();
					Sphere s=new Sphere(y);
					s.displayAreaInfo();
					break;
				case 3:
					System.out.println("アプリケーションを終了します。>");
					return;
			}
		}
	}
}

interface SolidFigure{
	void displayAreaInfo();
}
class Cube implements SolidFigure{
	double x;
	Cube(double x){
		this.x=x;
	}
	@Override
		public void displayAreaInfo(){
			System.out.printf("立方体　1辺の長さ=%.2f 体積=%.2f 表面積=%.2f%n",this.x,Math.pow(this.x,3),6*Math.pow(this.x,2));
		}
}
class Sphere implements SolidFigure{
	double x;
	public Sphere(double x){
		this.x=x;
	}
	@Override
	public	void displayAreaInfo(){
			System.out.printf("球　球の半径=%.2f 体積=%.2f 表面積=%.2f%n",this.x,4*Math.PI*Math.pow(this.x,3)/3,4*Math.PI*this.x*this.x);
		}
}

