import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Project_liliana_coste
{
 public static void main(String[] args) throws IOException
 {
  
  //use scanner class to read input from a file
  Scanner keyboard = new Scanner(System.in);
  File myFile = new File("PolicyInformation.txt");
  Scanner inputFile = new Scanner(myFile);
  //declaring variables
  String policyNum = "";
  int policyHolderAge = 0, i = 0;
  String providerName = "", 
  policyHolderFirstName = "",
  policyHolderLastName = "",
  policyHolderSmokingStat = "";
  double policyHolderHeight = 0.0,
  policyHolderWeight = 0.0;
  int smokers = 0, nonSmokers=0;
  ArrayList<Policy>list = new ArrayList<Policy>();

  //read array elements to the file
  while(inputFile.hasNext()){

  // System.out.print("Please enter the Policy Number: ");
  policyNum = inputFile.nextLine();
  
 //  System.out.print("Please enter the Provider Name: ");
   providerName = inputFile.nextLine();
  
 //  System.out.print("Please enter the Policyholder's First Name: ");
  policyHolderFirstName = inputFile.nextLine();
  
 //  System.out.print("Please enter the Policyholder's Last Name: ");
  policyHolderLastName = inputFile.nextLine();
  
  // System.out.print("Please enter the Policyholder's Age: ");
   policyHolderAge = Integer.parseInt(inputFile.nextLine());
   
  // System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
    policyHolderSmokingStat = inputFile.nextLine();
  
 //  System.out.print("Please enter the Policyholder's Height (in inches): ");
   policyHolderHeight = Double.parseDouble(inputFile.nextLine());  
  // System.out.print("Please enter the Policyholder's Weight (in pounds): ");
   policyHolderWeight = Double.parseDouble(inputFile.nextLine()); 
   if(inputFile.hasNext())
   {
    inputFile.nextLine();
   } 
   Policy policy = new Policy(policyNum, providerName,policyHolderFirstName,policyHolderLastName,policyHolderAge, policyHolderSmokingStat, policyHolderHeight, policyHolderWeight);
  list.add(policy);
  }//end of while loop
  

for(Policy policy:list)
{
   System.out.println("Policy Number: " + policy.getPolicyNum());
   System.out.println("Provider Name: " +  policy.getProviderName());
   System.out.println("Policyholder's First Name: " +  policy.getFirstName());
   System.out.println("Policyholder's Last Name: " + policy.getLastName());
   System.out.println("Policyholder's Age: " +  policy.getAge());
   System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
   System.out.println("Policyholder's Height: " +  policy.getHeight());
   System.out.println("Policyholder's Weight: " +  policy.getWeight());
   System.out.printf("Policyholder's BMI: %.2f ",  policy.calculateBMI());
   System.out.printf("\nPolicy Price: $%.2f ",  policy.calculateInsurancePolicy());
 }
 //display number of smokers and non smokers
 for(int index = 0; index < list.size(); index++)
 {
   if(list.get(index).getSmokingStatus().equalsIgnoreCase("smoker"))
   {
     smokers ++;
   }
   if(list.get(index).getSmokingStatus().equalsIgnoreCase("non-smoker"))
   {
    nonSmokers ++;
   }
  }//end of for loop
  
 System.out.println("\nThe number of policies with a smoker is:" + smokers);
 System.out.print("The number of policies with a non-smoker is:" + nonSmokers);
 inputFile.close();
 }//end of main method
}// end of class