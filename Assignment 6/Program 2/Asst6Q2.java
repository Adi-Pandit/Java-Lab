import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;

/*
<applet code = "Asst6Q2" width = 300 height = 200>
</applet>
*/

public class Asst6Q2 extends Applet
{
	Calendar cal = Calendar.getInstance();
	Date d = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String date = formatter.format(d);
	
	int hour = cal.get(Calendar.HOUR);
	int min = cal.get(Calendar.MINUTE);
	int sec = cal.get(Calendar.SECOND);
	
	int am_pm = cal.get(Calendar.AM_PM);
	String time = hour+":"+min+":"+sec;
	
	public void paint(Graphics g)
	{
		g.drawString("Current date : "+date,20,20);
		//g.drawString(String.valueOf(am_pm),20,60);
		if(am_pm==0)
		{
			g.drawString("Current time : "+time+" AM",20,40);
			showStatus("Good Morning");
		}
		else
		{
			g.drawString("Current time : "+time+" PM",20,40);
			if(hour>=5 && hour<8)
				showStatus("Good Evening");
			else if(hour>=8 && hour<12)
				showStatus("Good Night");
			else
				showStatus("Good Afternoon");
		}
	}
}
