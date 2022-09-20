package testvag;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

public class wicketKeeperCount {

	public void CheckWicketKeeper()
	{
		List<Players> Teamlist = new ArrayList<Players>();
		int totalPlayer = Teamlist.size();
		int wicket_keeper = 0;

		for(Players player:Teamlist)
		{
		String Role = player.role;
			if(Role.equals("Wicket-keeper"))
			{
				wicket_keeper++;
			}
		}
		System.out.println("No of wicket_Keepers"+ wicket_keeper);
		if(wicket_keeper==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}


