class FuturistaFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Androide();
    }
    
    @Override
    public Arma criarArma() {
        return new Laser();
    }
}