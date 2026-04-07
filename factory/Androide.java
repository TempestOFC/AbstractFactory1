class Androide implements Personagem {
    private Arma arma;
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    @Override
    public void atacar() {
        System.out.print("Androide ataca disparando seu ");
        arma.usar();
    }
    
    @Override
    public void defender() {
        System.out.println("Androide ativa escudo de energia para se defender!");
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Androide | Tema: Futurista");
    }
}