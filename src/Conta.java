abstract class Conta {
    // CLASSE ABSTRATA
    // Classe na qual DECLARAMOS OS METODOS
    private double saldo; 

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo; 
    }
    public void imprimeExtrato();
    //METODO ABSTRATO
    // coloco um ; e nao abro parenteses {} neste metodo porque eu nao vou implementa-lo
    
}
