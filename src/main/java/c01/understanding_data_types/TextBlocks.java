package c01.understanding_data_types;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 22:59
 */
public class TextBlocks {
    public static void main(String[] args) {
        String textBlock = """
                  "Java Study Guide"
                    by Scott & Jeanne""";
        System.out.println(textBlock);

        // String block = """doe"""; // DOES NOT COMPILE

        String block = """
                doe \n
                deer
                """;
        System.out.println(block);

        block = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*" + block + "*");
    }
}
