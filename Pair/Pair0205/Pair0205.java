import java.util.*;
public class Pair0205{
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        String[] spells={"a","b","c","d","e","f","g",
                        "h","i","j","k","l","m","n",
                        "o","p","q","r","s","t","u",
                        "v","w","x","y","z"};
        String randomSpells;
        int count=0;
        while(true){
            randomSpells="";
            for(int i=0;i<10;i++){
                int ran=new Random().nextInt(26);
                randomSpells+=spells[ran];
            }
            System.out.println(randomSpells);
            String userAns=new Scanner(System.in).nextLine();
            if(randomSpells.equals(userAns)){
                count++;
                if(count==3){
                    long end=System.currentTimeMillis();
                    System.out.println(end-start+"(ms)");
                    break;
                }
            }else{
                System.out.println("ミス");
            }
        }
        System.out.println();
    }
}
