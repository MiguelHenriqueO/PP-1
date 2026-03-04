public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv() {

    }

    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
    }


    //setter do volume
    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }else{
            System.out.println("Volume inválido");
        }
    }
    public int getVolume(){
        return this.volume;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }


}
