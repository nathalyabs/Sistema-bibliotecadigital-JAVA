public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Dom Casmurro", "Machado de Assis", 256);
        Ebook ebook2 = new Ebook("Clean Code", "Robert C. Martin", 464);
        VideoDigital video1 = new VideoDigital("Introdução ao Java", "Curso Dev", 45);
        VideoDigital video2 = new VideoDigital("POO na Prática", "Prof. Silva", 60);

        ItemBibliotecaDigital[] itens = {ebook1, ebook2, video1, video2};

        System.out.println("DESCRIÇÕES");
        for (ItemBibliotecaDigital item : itens) {
            System.out.println(item.descricao());
        }

        System.out.println("\nDOWNLOADS");
        for (ItemBibliotecaDigital item : itens) {
            if (item instanceof Baixavel) {
                ((Baixavel) item).baixar();
            }
        }

        System.out.println("\nVISUALIZAÇÕES");
        for (ItemBibliotecaDigital item : itens) {
            if (item instanceof Visualizavel) {
                ((Visualizavel) item).visualizar();
            }
        }
    }
}
