class Animal {    

    public void emitirSom() {
    System.out.println("Som genérico de animal..."); 
    }
    public void brincar() {
        System.out.println("O animal quer brincar..."); 
    }
    public void comer() {
            System.out.println("O animal está pedindo ração..."); 
    }
    public void beber() {
        System.out.println("O animal está pedindo água..."); 
    }

    public void caracteristicas(String nome, int idade, String raca) {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Raça: "+raca);
    }
}
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
    System.out.println("Au au!");
    }
    @Override
    public void brincar() {
    System.out.println("Au au!");
    }
    @Override
    public void comer() {
    System.out.println("Au au!");
    }
    @Override
    public void beber() {
    System.out.println("Au au!");
    }

}
class Gato extends Animal {
    @Override
    public void emitirSom() {
    System.out.println("Miau!");
    }
    @Override
    public void brincar() {
    System.out.println("Miau!");
    }
    @Override
    public void comer() {
    System.out.println("Miau!");
    }
    @Override
    public void beber() {
    System.out.println("Miau!");
    }

}

public class Main {
    public static void main(String[] args) {
    Animal meuCachorro = new Cachorro();
    Animal meuGato = new Gato();
    meuCachorro.emitirSom();
    meuGato.emitirSom();
    meuCachorro.beber();
    meuGato.beber();
    meuCachorro.comer();
    meuGato.comer();
    meuCachorro.brincar();
    meuGato.brincar();

    meuCachorro.caracteristicas("gohan",2,"pinscher");
    meuGato.caracteristicas("sasuke",3, "emo");

    }
}