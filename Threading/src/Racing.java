
import java.util.InputMismatchException;
import java.util.Scanner;

//Allows threading.
abstract class Racing implements Runnable {
    
    public static void main (String[] args) {
        
        
        
       
        Scanner input = new Scanner(System.in);
        int UserNumber = 0;
        
        System.out.println("I am going to race 6 cars. The number of cycles will be determined by the number of dice I will ask you to choose.");
        try{
        System.out.printf ("How many dice do you want to roll? 1 Thorugh 3 please.");
        UserNumber = input.nextInt();
        }
        catch (NumberFormatException exception) {
            System.out.println("Invalid input sorry. Goodbye");
        }
        
      
       
        int diceRoll = Dice.rollDice(UserNumber);
        
        
        Automobile FirstCar = new Automobile (2010, "Ford", "Focus", "Black", "First Car", 5, diceRoll);
        Automobile SecondCar = new Automobile (2007, "Honda", "Civic", "Blue", "Second Car", 5, diceRoll);
        Automobile ThirdCar = new Automobile (2017, "VW", "Golf", "Silver", "Third Car", 5, diceRoll);
        
        
        Automobile Truck = new Automobile (2009, "Ford", "F-150", "Black", "Truck", 3, diceRoll);
        Automobile Van = new Automobile (2010, "Ford", "CreeperVan", "Invisible", "Van", 4, diceRoll);
        Automobile SportCar = new Automobile (2015, "Dodge", "Viper", "Red", "Sport car", 7, diceRoll);
        
       //A for loop displaying the number of cycle depending on the dice rolled.
        for (int cycle=0; cycle<diceRoll; cycle++) {
            
            System.out.printf("\nOperating Cycle %d \n", cycle+1);
            
            
            FirstCar.setOperatingCycle(cycle+1);
            SecondCar.setOperatingCycle(cycle+1);
            ThirdCar.setOperatingCycle(cycle+1);
            Truck.setOperatingCycle(cycle+1);
            Van.setOperatingCycle(cycle+1);
            SportCar.setOperatingCycle(cycle+1);
            FirstCar.setCurrentGear ();
            SecondCar.setCurrentGear ();
            ThirdCar.setCurrentGear ();
            Truck.setCurrentGear ();
            Van.setCurrentGear ();
            SportCar.setCurrentGear ();
            FirstCar.setCurrentSpeed ();
            SecondCar.setCurrentSpeed ();
            ThirdCar.setCurrentSpeed ();
            Truck.setCurrentSpeed ();
            Van.setCurrentSpeed ();
            SportCar.setCurrentSpeed();
            FirstCar.setdistanceTraveled();
            SecondCar.setdistanceTraveled();
            ThirdCar.setdistanceTraveled();
            Truck.setdistanceTraveled();
            Van.setdistanceTraveled();
            SportCar.setdistanceTraveled();
            
            
            System.out.println( FirstCar.toString());
            System.out.println( SecondCar.toString());
            System.out.println( ThirdCar.toString());
            System.out.println( Truck.toString());
            System.out.println( Van.toString());
            System.out.println( SportCar.toString());
            Automobile.Prr();
            Automobile.Sput();
            Automobile.Vroom();
            //The total distances.
            Automobile.Total();

            System.out.println("Goodbye. Im gonna miss you :(");
        }
    }

	public void run() {
		// TODO Auto-generated method stub
		
	}
    

}