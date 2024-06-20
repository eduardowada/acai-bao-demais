package ecommerce.model;

public class AcaiBranco extends Acai {
    private int porcentagemAcaiBranco;

    public AcaiBranco(int id, String nome, double preco, String tamanho) {
        super(id, nome, preco, 50, tamanho);
        this.porcentagemAcaiBranco = 50;
    }

    public int getPorcentagemAcaiBranco() {
        return porcentagemAcaiBranco;
    }

    public void setPorcentagemAcaiBranco(int porcentagemAcaiBranco) {
        this.porcentagemAcaiBranco = porcentagemAcaiBranco;
    }

    @Override
    public String toString() {
        return super.toString() + ", porcentagemAcaiBranco=" + porcentagemAcaiBranco;
    }
}
