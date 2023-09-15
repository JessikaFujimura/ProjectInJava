package CurrencyConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class Converter {
    private static HashMap<String,HashMap<String,String>> base = new HashMap<String, HashMap<String,String>>(5);

    static{
        HashMap<String,String> real = new HashMap<>(3);
        real.put("USD", "4.8750999");
        real.put("CAD", "3.6079995");
        real.put("EUR", "5.1972999");
        base.put("BRL", real);
        HashMap<String,String> euro = new HashMap<>(3);
        euro.put("USD", "0.9383504");
        euro.put("CAD", "0.6944571");
        euro.put("BRL", "0.1925002");
        base.put("EUR", euro);
    }

    public String converter(BigDecimal source, BigDecimal target){
       BigDecimal factor =  source.divide(target, 4 , RoundingMode.HALF_EVEN);
       return factor.toPlainString();
    }

    public String getFactorConversion(String baseFactor,String relativeFactor){
        HashMap<String,String> hashBase = base.get(baseFactor);
        return hashBase.get(relativeFactor);
    } 
    
}
