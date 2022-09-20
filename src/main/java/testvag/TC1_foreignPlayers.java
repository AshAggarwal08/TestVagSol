package testvag;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

public class TC1_foreignPlayers<Players> {
	public void checkForeignPlayer()
	{
		List<Players> Teamlist = new ArrayList<Players>();
		int totalPlayer = Teamlist.size();
		int IndianPlayers=0;
		int ForeignPlayers=0;
	
		for(Players player:Teamlist)
		{
		String Country = player.country;
			if(Country.equals("India"))
			{
				IndianPlayers++;	
			}
		}
		ForeignPlayers= totalPlayer-IndianPlayers;
		System.out.println("No of Foreign Player :"+ ForeignPlayers);
		if(ForeignPlayers==4)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
		
	}


