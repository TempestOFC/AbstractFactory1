class Cavaleiro implements Personagem {
    private Arma arma;
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    @Override
    public void atacar() {
        System.out.print("Cavaleiro ataca brandindo sua ");
        arma.usar();
    }
    
    @Override
    public void defender() {
        System.out.println("Cavaleiro levanta o escudo para se defender!");
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Cavaleiro | Tema: Medieval");
    }
}