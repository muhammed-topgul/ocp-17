package c01.understanding_data_types;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 22:51
 */
public class CreatingWrapperClasses {
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf(true));
        System.out.println(Byte.valueOf((byte) 1));
        System.out.println(Short.valueOf((short) 1));
        System.out.println(Integer.valueOf(1));
        System.out.println(Long.valueOf(1));
        System.out.println(Float.valueOf(1.0F));
        System.out.println(Double.valueOf(1.0));
        System.out.println(Character.valueOf('c'));


        Integer i = 46652;
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
        System.out.println(i.longValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
    }
}
