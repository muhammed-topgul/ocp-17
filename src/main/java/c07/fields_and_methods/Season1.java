package c07.fields_and_methods;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 16:09
 */
public enum Season1 implements Weather {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },

    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },

    SPRING, FALL;

    public String getHours() {
        return "9am-5pm";
    }

    @Override
    public int getAverageTemperature() {
        return 0;
    }

//    public abstract String getHours();

    public static void main(String[] args) {
        System.out.println(Season1.WINTER.getHours());
    }
}