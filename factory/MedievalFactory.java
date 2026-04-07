class MedievalFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Cavaleiro();
    }
    
    @Override
    public Arma criarArma() {
        return new Espada();
    }
}