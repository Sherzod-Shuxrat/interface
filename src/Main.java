
public class Main {
    public static void main(String[] args) {
      BaseConverter fconverter = new SelToFarangeyt();
      BaseConverter kconverter = new SelToKelvin();
        System.out.println(fconverter.convert(0));
        System.out.println(kconverter.convert(0));

    }
}