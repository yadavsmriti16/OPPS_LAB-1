import java.util.Scanner;

class Room

{

	boolean AC;

	String floor;

	String occupancy;

	String input;

	Room(String s1)

	{

		input = s1;

		if (s1.charAt(20) == 's' || s1.charAt(24) == 's')

			this.floor = "second floor";

		else if (s1.charAt(20) == 'f' || s1.charAt(24) == 'f')

			this.floor = "first floor";

		this.occupancy = s1.substring(0, 6);

		String a = s1.substring(17, 19);

		if (a.equals("AC"))

			this.AC = true;

		else

			this.AC = false;
	}

String secondfloor()

{

if (this.AC==true&&this.occupancy.equals("Single"))

{ 

return "Room nuomber: 201, second floor, air conditioned, singleoccupancy, estimated: Rs.3000 / day";

}

else if(this. AC==false&&this.occupancy.equals("Single"))

{

return "Room nuomber: 202, second floor, non-air conditioned, singleoccupancy, estimated Rs. 2000 / day";

 }

else if(this.AC==true&&this.occupancy.equals("Double"))

{

return "Room nuomber: 203, second floor, air conditioned, doubleoccupancy, estimated: Rs. 4000 / day";

}

else if(this. AC==true&&this.occupancy.equals("Triple"))

{ 

return "Room nuomber: 204, second floor, air conditioned, singleoccupancy, estimated: Rs. 5000 / day";

}

else

{

return this.input+" room not available";

}

}

	String firstfloor()

	{

		if (this.AC == true && this.occupancy.equals("Single"))

		{

			return "Room nuomber: 101, first floor, air conditioned, singleoccupancy, estimated: Rs. 3000 / day";

		}

		else if (this.AC == true && this.occupancy.equals("Double"))

		{

			return "Room nuomber: 102, first floor, air conditioned, doubleoccupancy, estimated: Rs. 4000 / day";

		}

		else if (this.AC == false && this.occupancy.equals("Double"))

		{
			return "Room nuomber: 103, first floor, air conditioned, doubleoccupancy, estimated: Rs. 3000 / day";

		}

		else

		{

			return this.input + " room not available";

		}

	}
}

public class Main {
public static void main(String arg[])
{

Scanner s= new Scanner(System.in); 
String s1[]=new String[10]; 
Room r[]=new Room [10]; 
int length; 
for(int i=0;i<10; i++)
{
s1[i]=s.nextLine(); 
length=s1[i].length(); 
if(length>25)
{
r[i]=new Room (s1[i]); 
if(r[i].floor.equals("second floor")) 
{
if(i==0) 
{

System.out.println(r[i].secondfloor());
}
else
{
for (int j=i-1;j>=0;j--)
{
if(r[j].floor.equals("second floor"))
{
if(r[j].occupancy.equals(r[i].occupancy)&&r[j].AC==r[i].AC)
{
 System.out.println(s1[i]+" room not available"); 
 break;

}

else

{

System.out.println(r[i].secondfloor());

break;

}

}

else
{
if(j==0)

{

System.out.println(r[i].secondfloor()); 
break;

}}}}}
else if(r[i].floor.equals("first floor"))

	{

	if(i==0)

	{

	System.out.println(r[i].firstfloor());

	}

	else

	{

	for(int j = i - 1;j>=0;j--)
	{
		if (r[j].floor.equals("first floor"))

		{
			if (r[j].occupancy.equals(r[i].occupancy) && r[j].AC == r[i].AC) {

				System.out.println(s1[i] + " room not available");
				break;
			}

			else {
				System.out.println(r[i].firstfloor());
				break;
			}
		} 
		else

		{

			if (j == 0)

			{

				System.out.println(r[i].firstfloor());
				break;

			}

		}

	}

}
	    
	}
    
}
    
}
    
}
}