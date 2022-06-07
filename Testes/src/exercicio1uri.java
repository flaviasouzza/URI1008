import java.io.IOException;
	import java.util.Scanner;

public class exercicio1uri {
	public static void main(String[] args) throws IOException {
		
        Scanner entrada = new Scanner(System.in);
        
        int employee = entrada.nextInt();
        int hours = entrada.nextInt();
        float valueforhours = entrada.nextFloat();
        
        double salary = hours * valueforhours;
        
        System.out.println("NUMBER = " + employee);
        System.out.println(String.format("SALARY = U$ %.2f" , salary));
        
        entrada.close();
    }
	
}