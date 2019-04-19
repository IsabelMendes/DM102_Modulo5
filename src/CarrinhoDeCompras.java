import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private String loginCliente;
    private List<Ingresso> ingressos = new ArrayList<>();

    public String getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void addIngresso(Ingresso ingresso){
        ingressos.add(ingresso);

    }


    public void mostraDetalhesCompras() {
        float totalCompra = 0;
        boolean temVipKids = false;

        for (int i = 0; i < ingressos.size(); i++) {
            Ingresso ingresso = ingressos.get(i);
            totalCompra += ingresso.calculaValorTotalIngresso();

            if (ingresso instanceof Kids) {
                temVipKids = true;
            }
            ingresso.mostraInfos();
        }
        if (temVipKids){
            totalCompra = totalCompra/2;
        }

        System.out.println("Sua compra total é de: R$ " + totalCompra);
    }
}


