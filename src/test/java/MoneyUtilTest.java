import org.junit.Assert;
import org.junit.Test;
import org.opson.utils.MoneyUtil;

public class MoneyUtilTest {

    @Test
    public void testMoney(){
        String format = MoneyUtil.format(1000.0);
        Assert.assertEquals("$1000.00",format);
    }

    @Test
    public void negativeMoneyTest(){
        String money = MoneyUtil.format(-1000.0);
        Assert.assertEquals("-$1000.00",money);
    }

    @Test
    public void euroMoneyTest(){
        String money = MoneyUtil.format(-1000.0,"€");
        Assert.assertEquals("-€1000.00",money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void  notNullExceptionMoneyTest(){
        MoneyUtil.format(-1000.0,null);

    }
}
