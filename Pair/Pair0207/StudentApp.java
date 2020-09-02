import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("生徒は何人>");
		int memberNum=sc.nextInt();
		sc.nextLine();
		Student[] students=new Student[memberNum];
		for(int i=0;i<memberNum;i++){
			System.out.printf("%d人目の名前>",(i+1));
			String name=sc.nextLine();
			System.out.printf("%d人目の点数>",(i+1));
			int score=sc.nextInt();
			sc.nextLine();
			students[i]=new Student(i,name,score);
		}
		for(Student n:students){
			n.showInfo();
		}
		while(true){
			System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
			int num =sc.nextInt();
			switch(num){
				case 1:
					sortStudents(students,"id");
					for(Student n:students){
						n.showInfo();
					}
					break;
				case 2:
					sortStudents(students,"score");
					for(Student n:students){
						n.showInfo();
					}
					break;
				case 3:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
	public static void sortStudents(Student[] data,String key){
		if(key.equals("id")){
			for(int i=0;i<data.length-1;i++){
				for(int j=i+1;j<data.length;j++){
					if(data[i].id > data[j].id){
						Student temp=data[i];
						data[i]=data[j];
						data[j]=temp;
					}
				}
			}
		}else{
			for(int i=0;i<data.length-1;i++){
				for(int j=i+1;j<data.length;j++){
					if(data[i].score < data[j].score){
						Student temp=data[i];
						data[i]=data[j];
						data[j]=temp;
					}
				}
			}
		}
	}
}
