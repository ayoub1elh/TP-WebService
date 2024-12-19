import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        Compte cp = stub.getCompte(1);
        System.out.println("----------------- Compte -----------------");
        System.out.println("Code: "+cp.getCode());
        System.out.println("Solde: "+cp.getSolde());
        System.out.println("Convert: "+ 3600 +" to: "+stub.convert(3600));
        System.out.println("----------------- ****** -----------------");

    }
}
