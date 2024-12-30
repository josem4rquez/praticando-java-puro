package one.digitalinnovation.gof.singleton;

/*  É chamada de "Singleton Apressado" pois ela 
retorna a instancia diretamente 
*/
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
