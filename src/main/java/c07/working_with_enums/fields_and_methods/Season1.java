package c07.working_with_enums.fields_and_methods;

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

    // public abstract String getHours();

    public String getHours() {
        return "9am-5pm";
    }

    @Override
    public int getAverageTemperature() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(Season1.WINTER.getHours());
    }
}