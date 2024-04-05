public class Main {
    public static void main(String[] args) {
        double celsius = 30.4;
        double farenheit = (celsius * 1.8) + 32;
        int conversion = (int) (farenheit);
        String mensajeConversion = """
                La temperatura de %f° celsius es igual a:
                %f° farenheit.
                La temperatura farenheit entera es %d°.
                """.formatted(celsius, farenheit, conversion);
        System.out.println(mensajeConversion);
        System.out.println((farenheit - 32) / 1.8);

    }
}