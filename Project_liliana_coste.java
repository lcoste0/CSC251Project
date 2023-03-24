import java.util.Scanner;

public class Project_liliana_coste
{
 public static void main(String[] args)
 {
  Scanner keyboard = new Scanner(System.in);
  //declaring variables
  int policyNum,
  policyHolderAge;
  String providerName, 
  policyHolderFirstName,
  policyHolderLastName,
  policyHolderSmokingStat;
  double policyHolderHeight,
  policyHolderWeight;
  
  //get user input
  System.out.print("Please enter the Policy Number: ");
  policyNum = keyboard.nextInt();
  
  //clearing buffer
  keyboard.nextLine();
  
  System.out.print("Please enter the Provider Name: ");
  providerName = keyboard.nextLine();
  
  System.out.print("Please enter the Policyholder's First Name: ");
  policyHolderFirstName = keyboard.nextLine();
  
  System.out.print("Please enter the Policyholder's Last Name: ");
  policyHolderLastName = keyboard.nextLine();
  
  System.out.print("Please enter the Policyholder's Age: ");
  policyHolderAge = keyboard.nextInt();
  
  keyboard.nextLine();
  
  System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
  policyHolderSmokingStat = keyboard.nextLine();
  
  System.out.print("Please enter the Policyholder's Height (in inches): ");
  policyHolderHeight = keyboard.nextDouble();
  
  System.out.print("Please enter the Policyholder's Weight (in pounds): ");
  policyHolderWeight = keyboard.nextDouble();

  //create instance of Policy class that accepts arguments
  Policy ins = new Policy(policyNum, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStat, policyHolderHeight, policyHolderWeight);
  
  //display information
  ins.displayInformation();
  }//end of main method
}//end of class