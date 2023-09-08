package c07.nested_classes.anonymous_class;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 11:09
 */
public class ZooGiftShop {
    public int admission(int basePrice) {
        // basePrice = 2; // DO NOT COMPILE
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                System.out.println("I am calculating now!");
                return 12 * basePrice;
            }
        };
        return saleTodayOnly.dollarsOff();
    }
}

interface SaleTodayOnly {
    public abstract int dollarsOff();
}
