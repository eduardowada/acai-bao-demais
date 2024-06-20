package ecommerce.model;

public abstract class Acai extends Produto {
    private int porcentagemAcai;
    private int tamanho;
    
    public Acai(int id, String nome, double preco, int porcentagemAcai, int tamanho) {
        super(id, nome, preco);
        this.porcentagemAcai = porcentagemAcai;
        this.tamanho = tamanho;
    }
    
    public int getPorcentagemAcai() {
        return porcentagemAcai;
    }

    public void setPorcentagemAcai(int porcentagemAcai) {
        this.porcentagemAcai = porcentagemAcai;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", porcentagemAcai = " + porcentagemAcai + ", tamanho = " + tamanho;
    }
}
