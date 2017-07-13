package trading.program;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.*;
import java.util.function.Predicate;
import trading.program.*;
import java.lang.Integer;
public class Filtering
{

        public static Predicate<Trade_details> isPopular()
        {
            return v->v.getNifty_listed().equals("yes");
        }

        public List<Trade_details> filter_value(List<Trade_details> trade,Predicate<Trade_details> pre)
        {

            return trade.stream().filter(pre).collect(Collectors.toList());


        }




}