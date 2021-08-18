import java.util.Scanner;

public class FatGramCal {

	public static void main(String[] args) {
//		System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		double totalNumberOfCalories;
		double fatGrams;
		double caloriesFromFat;
		double percentageOfCaloriesFromFat;
		
		System.out.println("Please Enter the number of calories");
		totalNumberOfCalories = sc.nextDouble();
		
		System.out.println("Please Enter the number of fat Gram in the food");
		fatGrams = sc.nextDouble();
		
		caloriesFromFat = fatGrams*9;
		
		percentageOfCaloriesFromFat = caloriesFromFat/totalNumberOfCalories;
		
		if(caloriesFromFat > totalNumberOfCalories) {
			System.out.println("The input is invalid ");
		}else {
			
			if(caloriesFromFat < 0.30 * totalNumberOfCalories) {
				System.out.println("The food is low in fat");
							
			}
			System.out.printf("The percentage of calories that come from fat is %.2f%%",percentageOfCaloriesFromFat);
		}
		
		

	}

}
