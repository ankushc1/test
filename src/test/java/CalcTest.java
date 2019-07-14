import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.qaagility.controller.*;

public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test
      public void testCalc() {
        Count countObject= new Count();
        int result=countObject.compare(4,2);
        assertEquals("Result", result, 2);
      }

	@Test
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }


    }
