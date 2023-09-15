package CurrencyConverter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner sc = new Scanner(System.in);
        String currencySource = sc.nextLine();
        String valueSource = sc.nextLine();
        String currencyTarget = sc.nextLine();
        String valueTarget = converter.getFactorConversion(currencySource,currencyTarget);
        Currency source = new Currency(currencySource, new BigDecimal(valueSource));
        Currency target = new Currency(currencyTarget, new BigDecimal(valueTarget));
        System.out.println("quantidade: " + target.getName() + " " + converter.converter(source.getUnitValue(), target.getUnitValue()) );
    }
    
}