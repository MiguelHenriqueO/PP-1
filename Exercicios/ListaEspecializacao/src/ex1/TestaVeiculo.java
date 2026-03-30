package ex1;

public class TestaVeiculo {
    void main(String[] args) {
        Aviao av1 = new Aviao("yamaha","m32a",320.5f,300.0f);

        CarroEletrico cE1 = new CarroEletrico("tesla","tesla 2",200.0f, 200);

        Veiculo v = new Aviao("panam","h320m",200.5f,150.0f);

        v.mover();

        v = new CarroEletrico("byd","a",100.0f, 150);
        v.mover();
    }
}
