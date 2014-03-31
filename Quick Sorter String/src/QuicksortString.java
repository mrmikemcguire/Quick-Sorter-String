public class QuicksortString
	{

	static void qsort(String items[])
		{
		qs(items, 0, items.length - 1);
		}
	
	private static void qs(String items[], int left, int right)
		{
		int leftIndex, rightIndex;
		String pivotPosition, temporarySwapSpot;
		
		leftIndex = left;
		rightIndex = right;
		pivotPosition = items [(left + right) / 2];
		
		do
			{
			while ((items [leftIndex].compareTo(pivotPosition) < right) 
					&& (leftIndex < rightIndex))
				{
				leftIndex++;
				}
			
			while ((items [rightIndex].compareTo(pivotPosition) > left)
					&& (rightIndex > left))
				{
				rightIndex--;
				}
				
			if (leftIndex <= rightIndex)
				{
				temporarySwapSpot = items [leftIndex];
				items [leftIndex] = items [rightIndex];
				items [rightIndex] = temporarySwapSpot;
				leftIndex++;
				rightIndex--;
				}
			}
		while (leftIndex <= rightIndex);
		
		if (left < rightIndex)
			{
			qs (items, left, rightIndex);
			}
		if (leftIndex < right)
			{
			qs (items, leftIndex, right);
			}
		}	
	}
	
	
	
