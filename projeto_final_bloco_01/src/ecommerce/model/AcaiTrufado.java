package ecommerce.model;

public class AcaiTrufado extends Acai {
    private int porcentagemTrufa;

    public AcaiTrufado(int id, String nome, double preco, int tamanho) {
        super(id, nome, preco, 75, tamanho);
        this.porcentagemTrufa = 25;
    }

    public int getPorcentagemTrufa() {
        return porcentagemTrufa;
    }

    public void setPorcentagemTrufa(int porcentagemTrufa) {
        this.porcentagemTrufa = porcentagemTrufa;
    }

    @Override
    public String toString() {
        return super.toString() + ", porcentagemTrufa = " + porcentagemTrufa;
    }
}
