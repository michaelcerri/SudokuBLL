package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] myLatinSquare;
	
	public LatinSquare(int [][] twoDimArray)
	{
		this.myLatinSquare=twoDimArray;
	}
	
	public int[][] getMyLatinSquare() {
		return myLatinSquare;
	}

	public void setMyLatinSquare(int[][] myLatinSquare) {
		this.myLatinSquare = myLatinSquare;
	}

	public boolean ContainsZero()
	{
		for(int iCol=0; iCol<myLatinSquare.length; iCol++)
		{
			for (int iRow=0; iRow<myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iCol][iRow]==0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean doesElementExist(int arr[],int iValue)
	{
		for (int i : arr)
		{
			if (i==iValue)
				return true;
		}
		return false;
	}
	
	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates= false;
		
		if(arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i =0; i<arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				hasDuplicates=true;
				break;
			}
		}
		return hasDuplicates;
	}
		
	
	public boolean isLatinSquare() {
		//check rows for duplicates
		for (int i=0; i<myLatinSquare.length; i++)
		{
			if (myLatinSquare.hasDuplicates(getRow(i))==true)
				return false;
		}
		//check columns for duplicates
		for (int i=0; i<myLatinSquare.length; i++)
		{
			if (myLatinSquare.hasDuplicates(getCol(i))==true)
				return false;
		}
		//check to make sure each element in the first row is found in every other row
		for (int i=1; i<myLatinSquare.length; i++)
		{
			if (myLatinSquare.hasAllValues(getRow(0),getRow(i))==false)
				return false;
		}
		//check to make sure each element in the first col is found in every other col
		for (int i=1;i<myLatinSquare.length; i++)
		{
			if (myLatinSquare.hasAllValues(getCol(0),getCol(i))==false)
				return false;
		}
		return true;
				
	}
}
