
public class ManagementCompany {
	public final int MAX_PROPERTY = 5;
	public final int MGMT_WIDTH = 10;
	public final int MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private double mgmFee;
	private Plot plot;
	private Property[] properties;
	
	
	
	
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
		
	}

	
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}

	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x,y,width,depth);
		this.properties = new Property[MAX_PROPERTY];
		
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{		
		this.properties = new Property[MAX_PROPERTY];
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.plot = otherCompany.plot;
	}
	


	
	/**
	 * 
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner)
	{
		return addProperty(new Property(name, city,rent,owner));

	}
	

	/**
	 * 
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner, int x , int y, int width , int depth)
	{
		
		return addProperty(new Property(name,city,rent,owner,x,y,width,depth));		
	}
		 

	/**
	 * 
	 * @param property
	 * @return
	 */
	public int addProperty(Property propertyOne)
	{
		 if (propertyOne == null) 
		 	{
		      return -2;
		    }
		 
		  if (!plot.encompasses(propertyOne.getPlot())) 
		  {
		      return -3;
		  }
		   
		  
		  
		  for (int j = 0;j < properties.length;j++) 
		  {
		      if (properties[j] != null) 
		      {
		    	  if (properties[j].getPlot().overlaps(propertyOne.getPlot())) 
		    	  {
		    		  return -4;
		    	  }
		      } 
		      
		      else 
		      {  
		    	  properties[j]=propertyOne;
		    	  return j;
		      } 
		   }
		   
		      return -1;

	}
		
	
	public void removeLastProperty()
	{
		properties[MAX_PROPERTY] = null;
		
	}
	
	public boolean isPropertiesFull()
	{
		boolean flag = true;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				flag = false;
			}
		}
		
		return flag;
	}
	
	
	
	public int getPropertiesCount ()
	{

		int c = 0;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			c++;
		
		}
		return c;
	}
	
	
	
	public Property getHighestRentProperty()
	{
		
		Property highest = properties[0];
		// loop through array
		for(int i =0; i < getPropertiesCount(); i++)
		{
			if(properties[i].getRentAmount() > highest.getRentAmount())
			{
				highest = properties[i];

			}
        }
		
        for(int i = 0; i < getPropertiesCount(); i++) 
        {
            if(properties[i].getRentAmount() > highest.getRentAmount()) 
            {
            	highest = properties[i];
            }
        }
        return highest; //return a property type obejct
		
	}
	

	public double getTotalRent()
	{
		int total1 = 0;
		for(Property prop : properties)
		{
			if(prop != null)
				total1 += prop.getRentAmount();
		}
		return total1;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public boolean isMangementFeeValid()
	{
		boolean flag = true;
		if(getMgmFee() < 0 || getMgmFee() > 100)
		{
			flag = false;
		}
		
		return flag;
		
	}

	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxID() {
		return taxID;
	}
	
	public void setPlot(Plot plot) {
		this.plot = new Plot(plot);
	}
	
	public Plot getPlot() {
		return this.plot;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public double getMgmFee() {
		return this.mgmFee;
	}
	public void setMgmFee(double mgmFee) {
		this.mgmFee = mgmFee;
	}
	
	public Property[] getProperties()
	{
		return this.properties;
	}
	
	public void setProperties(Property[] properties)
	{
		this.properties = properties;
	}
	
	
	@Override
	public String toString()
	{
		String str = "";
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				str += properties[i] + "\n";
			}
				
				
		}
		return str;
		
		// not finished must print out for eveyr new property
	}
	
	
}
	
	

