import java.util.Scanner;

public class mainClass {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(x == 0){
		
			System.out.print("Inserisci un numero: ");
			
			
			Object numero = sc.next();
			
			if(((String) numero).matches("[a-zA-Z]+")){
				System.out.println("Inserisci un numero non una lettera!1!");
				x = 0;
				
			}if(((String) numero).matches("[0-9]+")){
				System.out.println("Bravo hai inserito un numero");
				x = 1;
			}
			
			}
		
		
		
		
		
		
		
	}
	}
