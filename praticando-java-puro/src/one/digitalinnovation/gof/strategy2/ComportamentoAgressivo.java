package one.digitalinnovation.gof.strategy2;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
    
}
