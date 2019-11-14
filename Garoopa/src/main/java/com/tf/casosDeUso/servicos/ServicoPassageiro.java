@Service
public class ServicosPassageiro {
    private RepositorioCidades cidades;
    private RepositorioBairros bairros;
    
    @Autowired
    public ServicosPassageiro(RepositorioCidades cidades,
                              RepositorioBairros bairros){
        this.cidades = cidades;
        this.bairros = bairros;
    }

    public Viagem criarViagem(String cpf,
                              String bairroOrigem,
                              String bairroDestino,
                              String formaPagamento,
                              String catVeiculo){
        return new Viagem(cpf, bairroOrigem, bairroDestino, formaPagamento, catVeiculo);

    }

    // Ajusta pontuação do motorista em função de uma avaliação
    public boolean pontuarMotorista(String cpfMotorista,int avaliacao) {


        for (int i = 0; i<vetor.size(); i++) {

            if (vetor.get(i).cpf == cpfMotorista) {

                vetor.get(i).somaAval = vetor.get(i).somaAval+avaliacao;
                vetor.get(i).qntAval++;
                return true;

            }

        }
        return false;
    }
}
