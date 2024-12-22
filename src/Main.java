public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException has occurred. Please check the code.");
            e.printStackTrace();
            e.toString();
        }
    }
}