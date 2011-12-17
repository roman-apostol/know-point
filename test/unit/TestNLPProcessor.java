


import junit.framework.TestCase;
import org.junit.Test;
import com.kpoint.doumixer.nlp;

/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class TestNLPProcessor extends TestCase{
   @Test
   void testNativeQuery() {
       NLPProcessor proccessor = new NLPProcessor();

       assertEquals("zzz.txt", getName(fileSpec));
   }
}
