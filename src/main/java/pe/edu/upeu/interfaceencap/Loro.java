package pe.edu.upeu.interfaceencap;

public class Loro implements Animal {
    @Override
    public void emitirsonido() {
        System.out.println("hola manito aprende ps!");
    }

    @Override
    public void dormir() {
        System.out.println("zzz...zzz..zz");
    }
    public void cantar(){
        System.out.println("lalalalalal");
    }
}
