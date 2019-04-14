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
    public void mostraDetalhesCompras(){

        for (int i=0; i<ingressos.size(); i++) {
            ingressos.get(i).calculaTotalIngresso();
        }

        System.out.println("Sua compra total é de: R$ ");
        System.out.println("Você comprou esses ingressos:");
        System.out.println("Ingressos VIP: ");
        System.out.println("Ingressos Camarote: ");
        System.out.println("Ingressos Kids: ");
    }
}


