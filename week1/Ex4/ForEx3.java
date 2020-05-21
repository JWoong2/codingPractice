package week1.Ex4;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String abc = "ABCDEFGHIJKLMNOPQRSTUVWXY";
	        String[] abcSplit = new String[abc.length()];
	        
	        int i = 0;
	        for(String s : abc.split("")) {
	        	abcSplit[i++] = s;
	        }
	        
	        for(int a = 0 ; a<abcSplit.length; a++) {
	        	if(a % 5 == 0) {
	        		System.out.println("");
	        	}
	        	System.out.print(abcSplit[a]);
	        }
	        
	}

}
