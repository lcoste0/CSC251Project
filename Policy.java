public class Policy
{
  //declaring fields
  private String policyNum;
  private String providerName;
  private static int countPolicyObj = 0;
  private PolicyHolder policyHolder;

  public Policy()
  {
    policyNum = "";
    providerName = "";
    PolicyHolder holder;
  }
  /**
  constructor that accepts arguments
  @param num, provider, holder
  */
  public Policy(String num, String provider, PolicyHolder holder)
  {
    policyNum = num;
    providerName = provider;
    policyHolder = new PolicyHolder(holder);
    countPolicyObj++;
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
    @param holder, a PolicyHolder object
  */
  public void setPolicyHolder(PolicyHolder holder)
  {
   policyHolder = new PolicyHolder(holder);
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
  public PolicyHolder getPolicyHolder()
  {
   return new PolicyHolder(policyHolder);
  }
  /**
   The getObjectCount returns the number of objects created 
   @return the number of objects created
  */
  public static int getObjectCount()
  {
   return countPolicyObj;
  }
    /**
   ToString method
   display the policy number and provider name
  */
  public String toString()
  {
   String policyStr = "Policy Number: " + policyNum + "\nProvider Name: " + providerName + policyHolder.toString();
   return policyStr;
  }
   
}//end of class