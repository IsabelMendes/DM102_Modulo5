import java.util.ArrayList;
import java.util.List;

public class Modulo5Exercicio {
    public static void main(String[] args) {

        //Ingresso Kids
        Ingresso kids1 = new Kids();
        kids1.taxaCartao = 5;
        kids1.valorIngresso = 100;

        //Ingresso Camarote
        Ingresso camarote = new Camarote();
        camarote.taxaCartao = 5;
        camarote.valorIngresso = 200;

        //Ingresso VIP
        Ingresso vip = new VIP();
        vip.taxaCartao = 5;
        vip.valorIngresso = 100;


        //Carrinho de Compra
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.addIngresso(kids1);
        carrinhoDeCompras.addIngresso(camarote);
        carrinhoDeCompras.addIngresso(vip);
        carrinhoDeCompras.mostraDetalhesCompras();
    }
}
