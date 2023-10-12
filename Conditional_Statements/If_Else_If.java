package Conditional_Statements;

public class If_Else_If {
	public static void main(String[] args) {
		int players=10;
		if(players>5 && players<9) {
			System.out.println("A");
		}
		else if(players>7 && players<9){
			System.out.println("B"); 
		}
		else if(players>0 && players<15){
			System.out.println("C");
		}
		else if(players>1 && players<11){
			System.out.println("D");
		}
		else {
			System.out.println("no match");
		}
	}

}
