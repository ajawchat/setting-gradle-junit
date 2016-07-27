package test.java.com.practicalunittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.java.com.practicalunittesting.YoungBrother;

@RunWith(JUnitParamsRunner.class)
public class YoungBrotherTest {
	
	// Parameterized Test
	private static final Object[] getNewLines(){
		Object[] params = new Object[]{
			 new Object[] {new String[]{"jhgu", "", "a", "kjl"}, 2, 4},
			 new Object[] {new String[]{"","","","","vhtoqhthisojnovivdavhafa","wjbjtwwxuglxceeypnnvkuxwolaycvrwtdaugej","",""}, 3, 21}
		};
		return params;
	}
	
	@Test
	@Parameters(method = "getNewLines")
	public void checkValidValues(String[] newLines, int n, int k){
		YoungBrother brother = new YoungBrother();
		String[] res = brother.restoreWords(newLines, n, k);
		
		// Check if the result string size matches n
		assertEquals(res.length, n);
		
		// Check if each line has k characters
		for(String line : res){
			assertEquals(line.length(), k);
		}
		
	}
	
	
}
