public class TestaSmartTv {
    public static void main(String[] args){
        SmartTv s1 = new SmartTv();
        s1.setVolume(-40);
        s1.setVolume(130);
        s1.setVolume(50);

        System.out.println("Volume de s1: " + s1.getVolume());

        SmartTv s2 = new SmartTv("Samsung","Qled de 45 polegadas",0);

    }

}
