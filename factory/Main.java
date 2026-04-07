public class Main {
    public static void configurarTema(TemaFactory factory) {
        Personagem personagem = factory.criarPersonagem();
        Arma arma = factory.criarArma();
        
        if (personagem instanceof Cavaleiro) {
            ((Cavaleiro) personagem).setArma(arma);
        } else if (personagem instanceof Androide) {
            ((Androide) personagem).setArma(arma);
        }
        
        personagem.exibirInfo();
        arma.exibirInfo();
        personagem.atacar();
        arma.guardar();
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Tema Medieval ===");
        configurarTema(new MedievalFactory());
        
        System.out.println("=== Tema Futurista ===");
        configurarTema(new FuturistaFactory());
    }
}