import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        Currency source = new Currency("BRL", new BigDecimal("5"));
        Currency target = new Currency("USD", new BigDecimal("4.9365993"));
        System.out.println("quantidade: " + target.getName() + " " + converter(source.getUnitValue(), target.getUnitValue()) );
    }

    private static String converter(BigDecimal source, BigDecimal target){
       BigDecimal factor =  source.divide(target, 4, RoundingMode.HALF_EVEN);
       return factor.toPlainString();
    }
}