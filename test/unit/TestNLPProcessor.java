


import junit.framework.TestCase;
import org.junit.Test;
import com.kpoint.doumixer.nlp.*;

/**
 * Created by IntelliJ IDEA.
 * User: MatFuck
 * Date: 17.12.11
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class TestNLPProcessor extends TestCase{
   @Test
  public void testNativeQuery() {
       NLPProcessor processor = new NLPProcessor();


       assertEquals("($PRICE<=2400.0)(18:00<= $TIME AND $TIME <= 20:30) OR ($DAY = 5) OR ($DAY = 4) OR ($STREET = 1) OR ($REGION = 2) OR $TAGS{учить(0.5)Китайский(1.0)}",
               processor.process("Я хочу учить Китайский в пятницу или четвер с 20:30 до 18:00 или сейчас возле Протассового Яра или на Троещине менее 300 дол").toString());
   }
}
