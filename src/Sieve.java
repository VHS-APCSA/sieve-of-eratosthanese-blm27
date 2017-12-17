
public class Sieve 
{
	private boolean[] array;
	public Sieve()
	{
		array = new boolean[1000];
		initArray();
	}
	public void initArray()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = true;
		}
	}
	public void findprimeNums()
		{
			for(int i = 2; i*i < array.length; i++)
			{
				if(array[i])
				{
					for(int i2 = i*2; i2 < array.length; i2 += i)
					{
						array[i2] = false;
					}
				}
			}
		}
	public String toString()
	{
		String ret = "{";
		for(int i = 2; i < array.length; i++)
		{
			if(array[i]) 
			{
				ret += i + ", ";	
			}
		}
		return ret + "}";
	}
}
