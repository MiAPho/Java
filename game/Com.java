public class Com{
	public static boolean reach(int order,String[] gameBord){
		for(int i=0;i<3;i++){
			if(gameBord[i*3].equals(gameBord[i*3+1]) && (!gameBord[i*3+2].equals("○") && !gameBord[i*3+2].equals("×"))){
				if(order==0){
					gameBord[i*3+2]="×";
					return true;
				}else{
					gameBord[i*3+2]="○";
					return true;
				}
			}else if(gameBord[i*3+2].equals(gameBord[i*3+1]) && (!gameBord[i*3].equals("○") && !gameBord[i*3].equals("×"))){
				if(order==0){
					gameBord[i*3]="×";
					return true;
				}else{
					gameBord[i*3]="○";
					return true;
				}
			}else if(gameBord[i*3].equals(gameBord[i*3+2]) && (!gameBord[i*3+1].equals("○") && !gameBord[i*3+1].equals("×"))){
				if(order==0){
					gameBord[i*3+1]="×";
					return true;
				}else{
					gameBord[i*3+1]="○";
					return true;
				}
			}
			if(gameBord[i].equals(gameBord[i+3]) && (!gameBord[i+6].equals("○") && !gameBord[i+6].equals("×"))){
				if(order==0){
					gameBord[i+6]="×";
					return true;
				}else{
					gameBord[i+6]="○";
					return true;
				}
			}else if(gameBord[i+6].equals(gameBord[i+3]) && (!gameBord[i].equals("○") && !gameBord[i].equals("×"))){
				if(order==0){
					gameBord[i]="×";
					return true;
				}else{
					gameBord[i]="○";
					return true;
				}
			}else if(gameBord[i].equals(gameBord[i+6]) && (!gameBord[i+3].equals("○") && !gameBord[i+3].equals("×"))){
				if(order==0){
					gameBord[i+3]="×";
					return true;
				}else{
					gameBord[i+3]="○";
					return true;
				}
			}
		}
		if(gameBord[0].equals(gameBord[4]) && (!gameBord[8].equals("○") && !gameBord[8].equals("×"))){
			if(order==0){
				gameBord[8]="×";
				return true;
			}else{
				gameBord[8]="○";
				return true;
			}
		}else if(gameBord[4].equals(gameBord[8]) && (!gameBord[0].equals("○") && !gameBord[0].equals("×"))){
			if(order==0){
				gameBord[0]="×";
				return true;
			}else{
				gameBord[0]="○";
				return true;
			}
		}else if(gameBord[0].equals(gameBord[8]) && (!gameBord[4].equals("○") && !gameBord[4].equals("×"))){
			if(order==0){
				gameBord[4]="×";
				return true;
			}else{
				gameBord[4]="○";
				return true;
			}
		}else if(gameBord[2].equals(gameBord[4]) && (!gameBord[6].equals("○") && !gameBord[6].equals("×"))){
			if(order==0){
				gameBord[6]="×";
				return true;
			}else{
				gameBord[6]="○";
				return true;
			}
		}else if(gameBord[4].equals(gameBord[6]) && (!gameBord[2].equals("○") && !gameBord[2].equals("×"))){
			if(order==0){
				gameBord[2]="×";
				return true;
			}else{
				gameBord[2]="○";
				return true;
			}
		}else if(gameBord[2].equals(gameBord[6]) && (!gameBord[4].equals("○") && !gameBord[4].equals("×"))){
			if(order==0){
				gameBord[4]="×";
				return true;
			}else{
				gameBord[4]="○";
				return true;
			}
		} 
		return false;
	}
	public static boolean priority(int order,String[] gameBord){
		if(!gameBord[4].equals("○") && !gameBord[4].equals("×")){
			if(order==0){
				gameBord[4]="×";
				return true;
			}else{
				gameBord[4]="○";
				return true;
			}
		}else if(!gameBord[0].equals("○") && !gameBord[0].equals("×")){
			if(order==0){
				gameBord[0]="×";
				return true;
			}else{
				gameBord[0]="○";
				return true;
			}
		}else if(!gameBord[2].equals("○") && !gameBord[2].equals("×")){
			if(order==0){
				gameBord[2]="×";
				return true;
			}else{
				gameBord[2]="○";
				return true;
			}
		}else if(!gameBord[6].equals("○") && !gameBord[6].equals("×")){
			if(order==0){
				gameBord[6]="×";
				return true;
			}else{
				gameBord[6]="○";
				return true;
			}
		}else if(!gameBord[8].equals("○") && !gameBord[8].equals("×")){
			if(order==0){
				gameBord[8]="×";
				return true;
			}else{
				gameBord[8]="○";
				return true;
			}
		}
		return false;
	}
	public static void input(int order,String[] gameBord){
		if(!reach(order,gameBord)){
			if(!priority(order,gameBord)){
				if(!gameBord[1].equals("○") && !gameBord[1].equals("×")){
					if(order==0){
						gameBord[1]="×";
					}else{
						gameBord[1]="○";
					}
				}else if(!gameBord[3].equals("○") && !gameBord[3].equals("×")){
					if(order==0){
						gameBord[3]="×";
					}else{
						gameBord[3]="○";
					}
				}else if(!gameBord[5].equals("○") && !gameBord[5].equals("×")){
					if(order==0){
						gameBord[5]="×";
					}else{
						gameBord[5]="○";
					}
				}else if(!gameBord[7].equals("○") && !gameBord[7].equals("×")){
					if(order==0){
						gameBord[7]="×";
					}else{
						gameBord[7]="○";
					}
				}
			}
		}
	}
}
