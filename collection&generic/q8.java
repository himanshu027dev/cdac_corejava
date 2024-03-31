interface game{
    void play();
}
class Football implements game {
    public void play() {
        System.out.println("Playing football");
    }
}
class Chess implements game {
    public void play() {
        System.out.println("Playing chess");
    }
}
class Criket implements game {
    public void play() {
        System.out.println("Playing criket");
    }
}

class genericgames<T extends  game> {
    private T  data;

    public genericgames(T data) {
        this.data = data;
    }

    public void genericplay() {
        data.play();
    }

    
    
}

public class q8 {
    public static void main(String[] args) {
        
        Football f = new Football();
        Chess  ch =new Chess();
        Criket ck =  new Criket();

        genericgames<Football> g1 =new genericgames<>(f);
        genericgames<Chess>   g2=new genericgames<>(ch);
        genericgames<Criket>  g3=new genericgames<>(ck);
         g1.genericplay();
         g2.genericplay();
         g3.genericplay();
    }
}
