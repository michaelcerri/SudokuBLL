package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest() {
		
			int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
			LatinSquare ls=new LatinSquare(myArray);
			assertFalse(ls.ContainsZero());
	}

}
