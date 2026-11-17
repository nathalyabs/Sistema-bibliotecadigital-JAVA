abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();
}

// Interfaces
interface Baixavel {
    void baixar();
}

interface Visualizavel {
    void visualizar();
}

// Ebook: é um item e pode ser baixado
class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private int paginas;

    public Ebook(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public String descricao() {
        return "Ebook: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook \"" + titulo + "\"...");
    }
}

// VideoDigital: é um item, pode ser baixado e visualizado
class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private int duracaoMinutos;

    public VideoDigital(String titulo, String autor, int duracaoMinutos) {
        super(titulo, autor);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String descricao() {
        return "Vídeo: " + titulo + " | Autor: " + autor + " | Duração: " + duracaoMinutos + " min";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo \"" + titulo + "\"...");
    }

    @Override
    public void visualizar() {
        System.out.println("Reproduzindo o vídeo \"" + titulo + "\"...");
    }
}