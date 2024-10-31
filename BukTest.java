public class BukTest {
    public static void main(String[] args) {
        String input = "prueba de codigo";
        if(validationStringMetho(input)){
            System.out.println(resultMethod(input).toString().trim());
        }else{
            System.out.println("Error input");
        }
    }

    private static boolean validationStringMetho(String x) {
        boolean response =false;
        if(!x.isEmpty()
                && (x.length() > 0)){
            response = true;
        }
        return response;
    }

    private static StringBuilder resultMethod(String input) {
        StringBuilder result = new StringBuilder();
        String[] processedInput = input.split(" ");
        for (String text : processedInput) {
            String initInput = text.substring(0, 1).toLowerCase();
            String endInput = text.substring(1).toUpperCase();
            result.append(initInput).append(endInput).append(" ");
        }
        return result;
    }
}