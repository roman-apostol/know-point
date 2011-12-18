


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

       SearchQuery query = new SearchQuery();
       Price price = new Price();
       price.setCriteria("<=");
       price.setValue(300.0f);
       query.setPrice(price);

       assertEquals(query, processor.process("Я хочу учить Китайский в пятницу или четвер с 20:30 до 18:00 или сейчас возле Протассового Яра менее 300 дол"));
   }
}
