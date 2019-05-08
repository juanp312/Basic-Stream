import java.util.Optional;

public class OptionalApp {

    public void probar(String valor){
        //System.out.println(valor.contains("Hello"));           NullPointerException

        // Evitar un NullPointerException
        try{
            Optional op = Optional.empty();
                    op.get();  //Retorna el tipo del valor
        }catch (Exception e){
            System.out.println("No hay Elementos");
        }
    }

    //Identificar la variable que no está inicializada o es Null
    public void orElse(String valor){
    Optional<String> op = Optional.ofNullable(valor);
    String x = op.orElse("Default");
        System.out.println(x);
    }
    // Si el valor es Null puedo mandar una exception
    public void orElseThrow(String valor){
    Optional<String> op  = Optional.ofNullable(valor);
    op.orElseThrow(NumberFormatException::new);
    }

    //verificar si el valor fue inicializado o no
    public void isPresent(String valor) {
    Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }

}
