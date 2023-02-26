package MScCAII;

public class MScCAIIMarks
{
	int semITotal,semIITotal;

	public MScCAIIMarks() {}

	public MScCAIIMarks(int semITotal, int semIITotal)
	{
		this.semITotal = semITotal;
		this.semIITotal = semIITotal;
	}

	public int TotalMarks(int semITotal, int semIITotal)
	{
		return semITotal+semIITotal;
	}
}
