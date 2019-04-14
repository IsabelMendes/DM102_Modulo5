import java.util.Date;
import java.util.Random;

public class Ingresso {

    private long numero;
    protected float valorIngresso;
    protected Date dataHoraCompra;
    protected float taxaCartao;

    public float getTaxaCartao() {
        return taxaCartao;
    }

    public void setTaxaCartao(float taxaCartao) {
        this.taxaCartao = taxaCartao;
    }

    public Ingresso() {
        numero = numberGenerator();
        dataHoraCompra = new Date();


    }

    private long numberGenerator(){
        Random numberGenerator = new Random();
        return Math.abs(numberGenerator.nextLong());
    }

    public void calculaTotalIngresso(){

    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Date getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(Date dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void mostraInfos(){
        System.out.println("O número do lote é "+numero);
        System.out.println("E a data da compra é "+dataHoraCompra);
        System.out.println("O valor do ingresso é: " +valorIngresso);


    }
}


