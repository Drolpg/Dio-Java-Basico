public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void trocarCanal(int canalNovo){
        canal = canalNovo;
        System.out.println("Canal atual: " + canalNovo);
        
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}
