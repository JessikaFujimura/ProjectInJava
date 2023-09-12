package CurrencyConverter;
import java.math.BigDecimal;

public class Currency {

    private String name;
    private BigDecimal unitValue;


    public Currency(){

    }

    public Currency(String name, BigDecimal value) {
        this.name = name;
        this.unitValue = value;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getUnitValue() {
        return unitValue;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUnitValue(BigDecimal value) {
        this.unitValue = value;
    }
    
}
