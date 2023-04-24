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
  //declaring variables for policy 
  String policyNum = "";
  int policyHolderAge = 0, i = 0;
  String providerName = "", 
  //declaring variables for PolicyHolder
  policyHolderFirstName = "",
  policyHolderLastName = "",
  policyHolderSmokingStat = "";
  double policyHolderHeight = 0.0,
  policyHolderWeight = 0.0;
  int smokers = 0, nonSmokers=0, objectCount;
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

    //create a new PolicyHolder object based off information gathered
  PolicyHolder holder = new PolicyHolder(policyHolderFirstName,policyHolderLastName,policyHolderAge,policyHolderSmokingStat,policyHolderHeight,policyHolderWeight);
  
  //create a policy object passing all info 
  Policy myPolicy = new Policy(policyNum,providerName,holder);
  
  list.add(myPolicy);
  if(inputFile.hasNext())
   {
    inputFile.nextLine();
   } 
   
  
   if(policyHolderSmokingStat.equalsIgnoreCase("smoker"))
   {
     smokers ++;
   }
   if(policyHolderSmokingStat.equalsIgnoreCase("non-smoker"))
   {
    nonSmokers ++;
   }
   
  }//end of while loop
  
  

 //print out information
 for(int index = 0; index < list.size(); index++)
 {
   System.out.println(list.get(index));
   
 }//end of for loop
 System.out.print("There were " + Policy.getObjectCount() + " Policy objects created.");
 System.out.println("\nThe number of policies with a smoker is:" + smokers);
 System.out.println("The number of policies with a non-smoker is:" + nonSmokers);
 inputFile.close();
 }//end of main method
}// end of class