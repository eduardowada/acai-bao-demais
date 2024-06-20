package ecommerce.model;

public abstract class Acai extends Produto {
    private int porcentagemAcai;
    private String tamanho;
    
    public Acai(int id, String nome, double preco, int porcentagemAcai, String tamanho) {
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", porcentagemAcai=" + porcentagemAcai + ", tamanho=" + tamanho;
    }
}
