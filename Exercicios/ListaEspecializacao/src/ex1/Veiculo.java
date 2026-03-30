package ex1;

public class Veiculo {
    public String marca, modelo;
    public float velocidade;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public float getVelocidade() {
        return this.velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void mover(){
        System.out.println("Veículo se movendo...");
    }

    public void abastecer(){
        System.out.println("Veículo reabastecendo...");
    }
}
