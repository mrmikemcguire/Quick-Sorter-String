
public class QSDemoString
	{

	public static void main (String args[])
		{
		String arrayToBeSorted[] = {"Eric", "Alec", "Evan", "Vince", "MacKenzie", "Tyler", 
				"Sean", "Vince H", "Kyle", "Matt", "Casey", "Alec", "JD", "Nguyen", "David", 
				"Kerek", "Vincent", "Shea", "Steven", "Nick"};
		int i;
		
		System.out.println("Original array: ");
		for (i = 0; i < arrayToBeSorted.length; i++)
			{
			System.out.print(arrayToBeSorted[i] + " ");
			}
		
		QuicksortString.qsort(arrayToBeSorted);
		System.out.println();
		
		System.out.println("Sorted array: ");
		for (i = 0; i < arrayToBeSorted.length; i++)
			{
			System.out.print(arrayToBeSorted[i] + " ");
			}
	}
}
