import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //this section of the code prompts the user to enter the amount of employees 
        Scanner x = new Scanner(System.in);
        System.out.println("how many employees are you creating?");
        int numbOfEmployee = x.nextInt();
        System.out.println("you created " + numbOfEmployee + " employees" );


        //takes the users input and puts it in a for loop
        for (int i = 0; i < numbOfEmployee; i++){

        ArrayList employee = new  ArrayList(numbOfEmployee);
            
        System.out.println("Employee data for: "+ i +" out of " + numbOfEmployee);
        
        //ask the user to select the type of employee salaried, hourly, commission
        Scanner emp = new Scanner(System.in);
        System.out.println("Choose the type of employee to add. \n 1. Salaried \n 2. Hourly \n 3. Commission");

        int empNumb = emp.nextInt();

        if (empNumb == 1){
            System.out.println("You selected salaried");

        }
        else if (empNumb == 2){
            System.out.println("you selected hourly");
        }
        else if (empNumb == 3){
            System.out.println("you selected commission");
        }
        else{
            emp.close();
            System.out.println("please pick a valid number please");
            return;
        }

   //finding basic info of the selected employee id, first and last name
     Scanner iD = new Scanner(System.in);
       System.out.println("Employee ID: ");
       int empID = iD.nextInt();
       
    Scanner fName = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = fName.nextLine();

    Scanner lName = new Scanner(System.in);
       System.out.println("Last name: ");
       String lastName = lName.nextLine();
       
        }//end of for loop
    }
}
