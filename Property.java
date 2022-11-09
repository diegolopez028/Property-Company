
public class Property extends Plot {

	//Instance variables for property name, city, rental amount, owner, and plot. 
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	
	
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0;
		this.plot = new Plot(0,0,1,1);
		
		
	}

	public Property(String propertyName, String city, double rentalAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentalAmount;
		this.plot = new Plot();
		
		
		
	}
	public Property(String propertyName, String city, double rentalAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentalAmount;
		this.plot = new Plot(x,y,width,depth); 
		
		
		
	}
	
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = new Plot(otherProperty.plot);
		
	}
	
	public void setRentProperty(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x,y,width,depth);
	}

	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setRentAmount(double rentalAmount) {
		this.rentAmount = rentalAmount;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString()
	{
		return propertyName+","+city+","+owner+","+rentAmount;
	}
	

}
