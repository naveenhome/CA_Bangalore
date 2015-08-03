package main.java;


public class RidePosting {
	
	public String SaveRide(Ride ride)
	{
		if(ride!=null)
		{
			if(ride.empolyeeName.isEmpty())
			{
				return "Name cannot be blank";
			
			}
		return "Post was successful.";
		}
		else
		{
			return "Post was unsuccessful.";
		}
	}

}
