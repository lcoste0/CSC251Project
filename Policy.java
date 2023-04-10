public class Policy
{
  //declaring fields
  private String policyNum;
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
    policyNum = "";
    providerName = "";
    policyHolderFirstName = "";
    policyHolderLastName = "";
    policyHolderAge = 0;
    policyHolderSmokingStat = "";
    policyHolderHeight = 0.0;
    policyHolderWeight = 0.0;
  }
  /**
  constructor that accepts arguments
  @param num, provider, firstName, lastName, age, smokeStat, height, weight to store info
  */
  public Policy(String num, String provider, String first, String last, int age, String smokeStat, double height, double weight)
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
   setPolicyNum will set the policy number
   @param num The policy number
  */
  public void setPolicynum(String num)
  {
   policyNum = num;
  }
  /**
   setProviderName will set the provider's name
   @param provider The provider's name
  */
  public void setProviderName(String provider)
  {
   providerName = provider;
  }
  /**
   setFirstName will set the first name of the policy holder
   @param first The policy holder's first name
  */
  public void setFirstName(String first)
  {
   policyHolderFirstName = first;
  }
  /**
   setLastName will set the last name of the policy holder
   @param last The policy holder's last name
  */
  public void setLastName(String last)
  {
   policyHolderLastName = last;
  }
  /**
   setAge will set the age of the policy holder
   @param age The policy holder's age
  */
  public void setAge(int age)
  {
   policyHolderAge = age;
  }
  /**
   setSmokingStatus will set the smoking status of the policy holder
   @param smokeStat The policy holder's smoking status
  */
  public void setSmokingStatus(String smokeStat)
  {
   policyHolderSmokingStat = smokeStat;
  }
  /**
   setHeight will set the height of the policy holder
   @param height The policy holder's height
  */
  public void setHeight(double height)
  {
   policyHolderHeight = height;
  }
  /**
   setWeight will set the weight of the policy holder
   @param weight The policy holder's weight
  */
  public void setWeight(double weight)
  {
   policyHolderWeight = weight;
  }
  
  //getter methods
  /**
   getPolicyNum method
   @return The policy number
  */
  public String getPolicyNum()
  {
   return policyNum;
  }
  /**
   getProviderName method
   @return The provider's name
  */
  public String getProviderName()
  {
   return providerName;
  }
  /**
   getFirstName method
   @return The policy holder's first name
  */
  public String getFirstName()
  {
   return policyHolderFirstName;
  }
  /**
   getLastName method
   @return The policy holder's last name
  */
  public String getLastName()
  {
   return policyHolderLastName;
  }
  /**
   getAge method
   @return The policy holder's age
  */
  public int getAge()
  {
   return policyHolderAge;
  }
  /**
   getSmokingStatus method
   @return The policy holder's smoking status
  */
  public String getSmokingStatus()
  {
   return policyHolderSmokingStat;
  }
  /**
   getHeight method
   @return The policy holder's height
  */
  public double getHeight()
  {
   return policyHolderHeight;
  }
  /**
   getWeight method
   @return The policy holder's weight
  */
  public double getWeight()
  {
   return policyHolderWeight;
  }

  /**
   calculateBMI method
   @return The policy holder's BMI
  */
  public double calculateBMI()
  {
   final int BMI_NUM = 703;
   return (policyHolderWeight * BMI_NUM)/(policyHolderHeight*policyHolderHeight);
  }
  
  //calculate and return the price of insurance policy
  /**
   calculateinsurancePolicy method
   @return The calculation of the policy holder's insurance policy
  */
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
  /**
   displayInformation method
   display the policy holder's information
  */
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