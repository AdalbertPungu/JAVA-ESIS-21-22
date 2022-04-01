import java.util.Scanner;

public class ConvertirGallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double gallon = 5;
        // double liter = gallon*3.785;
        // System.out.println(gallon + " gallons est equivalent a " + liter + " liters");

        System.out.println("combien de gallons souhaitez-vous convertir ?");  
		double gallon = sc.nextDouble();    
		double liter = gallon * 3.8;
		System.out.println(gallon + " gallons equivaut a: " + liter + " liters");
    }
}

