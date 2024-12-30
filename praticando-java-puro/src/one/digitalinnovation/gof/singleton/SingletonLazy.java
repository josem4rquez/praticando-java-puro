package one.digitalinnovation.gof.singleton;

/* É chamado de "Singleton Preguiçoso" pois
 * precisa passar por uma verificação antes de retornar a 
 * instância
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
