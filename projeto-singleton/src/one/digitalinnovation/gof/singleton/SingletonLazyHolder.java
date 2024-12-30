package one.digitalinnovation.gof.singleton;

/*  É chamada de "Singleton Lazy Holder" pois ela 
retorna a instancia passando pelo holder

Referencia:
@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>

*/
public class SingletonLazyHolder {

    private static class InstanceHolder {

    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
