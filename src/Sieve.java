
public class Sieve 
{
	private boolean[] array;
	public Sieve()
	{
		array = new boolean[2];
		initArray();
	}
	public void initArray()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = true;
		}
	}
}
