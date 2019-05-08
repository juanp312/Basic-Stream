import java.util.ArrayList;
import java.util.List;

public class StreamMethods {

    private List<String> list;
    private List<String> numeros;

    public StreamMethods() {
        this.list = new ArrayList<>();
        this.numeros = new ArrayList<>();

        list.add("Jose");
        list.add("Juan");
        list.add("Jesse");
        list.add("Zac");
        list.add("4");
        list.add("Amy");
        list.add("Amanda");
        list.add("bill");

        numeros.add("20");
        numeros.add("30");
        numeros.add("40");

        }


        // Metodos Basicos Stream

        public void filtrar(){
        list.stream().filter(x -> x.startsWith("j")).forEach(System.out::println);
        }

        public void ordenar(){
        list.stream().sorted().forEach(System.out::println);

        // Ordenar descendetemente
        list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
        }

        public void transformar(){

        // UpperCase
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //Conviertiendo String a Integer
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
        }

        public void limitar(){
        list.stream().limit(3).forEach(System.out::print);
        }

        public void contar(){
        long x = list.stream().count();
            System.out.println(x);
        }


}
