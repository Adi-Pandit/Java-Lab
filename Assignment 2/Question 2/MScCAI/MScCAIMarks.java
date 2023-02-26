package MScCAI;

public class MScCAIMarks
{
	int semITotal,semIITotal;

	public MScCAIMarks() {}

	public MScCAIMarks(int semITotal, int semIITotal)
	{
		this.semITotal = semITotal;
		this.semIITotal = semIITotal;
	}

	public int TotalMarks(int semITotal, int semIITotal)
	{
		
		return semITotal+semIITotal;
		
	}
}
