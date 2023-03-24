public class Policy
{
  //declaring fields
  private int policyNum;
  private String providerName;
  private String policyHolderFirstName;
  private String policyHolderLastName;
  private int policyHolderAge;
  private String policyHolderSmokingStat;
  private double policyHolderHeight;
  private double policyHolderWeight;
  
  //no-arg constructor that sets default value for all fields
  public Policy()
  {
    policyNum = 0;
    providerName = "";
    policyHolderFirstName = "";
    policyHolderLastName = "";
    policyHolderAge = 0;
    policyHolderSmokingStat = "";
    policyHolderHeight = 0.0;
    policyHolderWeight = 0.0;
  }
  //constructor that accepts arguments
  //parameters num, provider, firstName, lastName, age, smokeStat, height, weight to store info
  public Policy(int num, String provider, String first, String last, int age, String smokeStat, double height, double weight)
  {
    policyNum = num;
    providerName = provider;
    policyHolderFirstName = first;
    policyHolderLastName = last;
    policyHolderAge = age;
    policyHolderSmokingStat = smokeStat;
    policyHolderHeight = height;
    policyHolderWeight = weight;
  }
  //setter methods
  /**
   set policy num will set the policy number
  */
  public void setPolicynum(int num)
  {
   policyNum = num;
  }
  
  public void setProviderName(String provider)
  {
   providerName = provider;
  }
  
  public void setFirstName(String first)
  {
   policyHolderFirstName = first;
  }
  
  public void setLastName(String last)
  {
   policyHolderLastName = last;
  }
  
  public void setAge(int age)
  {
   policyHolderAge = age;
  }
  
  public void setSmokingStatus(String smokeStat)
  {
   policyHolderSmokingStat = smokeStat;
  }
  
  public void setHeight(double height)
  {
   policyHolderHeight = height;
  }
  
  public void setWeight(double weight)
  {
   policyHolderWeight = weight;
  }
  
  //getter methods
  public int getPolicyNum()
  {
   return policyNum;
  }
  
  public String getProviderName()
  {
   return providerName;
  }
  
  public String getFirstName()
  {
   return policyHolderFirstName;
  }
  
  public String getLastName()
  {
   return policyHolderLastName;
  }
  
  public int getAge()
  {
   return policyHolderAge;
  }
  
  public String getSmokingStatus()
  {
   return policyHolderSmokingStat;
  }
  
  public double getHeight()
  {
   return policyHolderHeight;
  }
  
  public double getWeight()
  {
   return policyHolderWeight;
  }

  //calculateBMI
  public double calculateBMI()
  {
   final int BMI_NUM = 703;
   return (policyHolderWeight * BMI_NUM)/(policyHolderHeight*policyHolderHeight);
  }
  
  //calculate and return the price of insurance policy
  public double calculateInsurancePolicy()
  {
   final int BASE_FEE = 600;
   double additionalFee = 0;
   
   if(policyHolderAge > 50)
   {
    additionalFee += 75;
   }
   
 
   //determine if Policy Holder is a smoker
   if(policyHolderSmokingStat.equalsIgnoreCase("smoker"))
   {
    additionalFee += 100;
   }
   
   //determine if policy holder has a BMI over 35
   if(calculateBMI() > 35)
   { 
    additionalFee +=(calculateBMI() - 35)*20;
   }
   
   return BASE_FEE + additionalFee;
 
  }
  
  public void displayInformation()
  {
   System.out.println("Policy Number: " + getPolicyNum());
   System.out.println("Provider Name: " + getProviderName());
   System.out.println("Policyholder's First Name: " + getFirstName());
   System.out.println("Policyholder's Last Name: " + getLastName());
   System.out.println("Policyholder's Age: " + getAge());
   System.out.println("Policyholder's Smoking Status: " + getSmokingStatus());
   System.out.println("Policyholder's Height: " + getHeight());
   System.out.println("Policyholder's Weight: " + getWeight());
   System.out.printf("Policyholder's BMI: %.2f\n ", calculateBMI());
   System.out.printf("Policy Price: $%.2f ", calculateInsurancePolicy());
  }
  
}//end of class