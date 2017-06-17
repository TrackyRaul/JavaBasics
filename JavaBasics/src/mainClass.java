import java.util.Scanner;

public class mainClass {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Inserisci un numero: ");
		
		
		Object numero = sc.next();
		
		if(((String) numero).matches("[a-zA-Z]+")){
			System.out.println("Inserisci un numero: ");
			
		}if(((String) numero).matches("[0-9]+")){
			System.out.println("Bravo hai inserito un numero");
		}
		
		
		
		
		
		
		
		
	}
	}
