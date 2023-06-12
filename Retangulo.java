public class Retangulo {
    private Ponto vertice;
    private int largura;
    private int altura;

    public Retangulo(Ponto vertice, int largura, int altura) {
        this.vertice = vertice;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto getVertice() {
        return vertice;
    }

    public void setVertice(Ponto vertice) {
        this.vertice = vertice;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        int centroX = vertice.getX() + largura / 2;
        int centroY = vertice.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}