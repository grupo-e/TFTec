public class Veiculos {
    private String placa;
    private String marca;
    private String cor;
    private Boolean attInf;
    private Boolean bagG;

    public Veiculos(String placa, String marca, String cor, Boolean attInf, Boolean bagG){
        this.placa=placa;
        this.marca=marca;
        this.cor=cor;
        this.attInf=attInf;
        this.bagG=bagG;
    }

    public String getPlaca(){
        return placa;
    }
    
    public String getMarca(){
        return marca;
    }    


    public String getCor(){
        return cor;
    }    


    public Boolean getAttInf(){
        return attInf;
    }    


    public Boolean getBagG(){
        return bagG;
    }    




    

}