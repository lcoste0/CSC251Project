public class Policy
{
  //declaring fields
  private String policyNum;
  private String providerName;
  private static int countPolicyObj;

  //no-arg constructor that sets default value for all fields
  public Policy()
  {
    policyNum = "";
    providerName = "";
  }
  /**
  constructor that accepts arguments
  @param num, provider, firstName, lastName, age, smokeStat, height, weight to store info
  */
  public Policy(String num, String provider)
  {
    policyNum = num;
    providerName = provider;
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
   ToString method
   display the policy number and provider name
  */
  public String toString()
  {
   String policyStr = "Policy Number: " + policyNum + "\nProvider Name: " + providerName;
   return policyStr;
  }
   
}//end of class