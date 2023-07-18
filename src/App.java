public class App {

// Os metodos estao DECLARADOS na classe Conta (Classe Abstrata),
// mas estao DEFINIDOS/Implementados na classe POUPANCA 
    public static void main(String[] args) throws Exception {
        Conta cp = new Poupanca(); // instancia 
        cp.setSaldo(505.000); // chama os metodos
        cp.imprimeExtrato();// chama os metodos
    }
}
