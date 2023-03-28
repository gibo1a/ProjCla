public class Tree extends Plant{
    private String folha;
    Tree(String folha,String especie, int identifier, double height, int age){
        super(especie,identifier,height,age);
        this.folha = folha;
    }

    Tree(String folha,String especie, int identifier, double height, int age,String sponsor){
        super(especie,identifier,height,age,sponsor);
        this.folha = folha;
    }

    String getFolha(){
        return folha;
    }

}
