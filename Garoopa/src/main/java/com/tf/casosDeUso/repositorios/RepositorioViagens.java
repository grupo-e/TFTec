public interface RepositorioViagens {

    void cadastrarViagem(Viagem umaViagem);
    Stream<Viagem> getViagem(Motorista motorista);

}