import java.util.Date;

public class Cartao {

    private String nomeBandeiraCartao;
    private Date dataValidade;
    private int codigoSeguranca;
    private String nomeImpresso;
    private int numeroCartao;
    private String tipoCartao;
    private boolean ativo;
    private double limite;

    public Cartao(String nomeBandeiraCartao, Date dataValidade, int codigoSeguranca, String nomeImpresso, int numeroCartao, String tipoCartao, boolean ativo, double limite) {
        this.nomeBandeiraCartao = nomeBandeiraCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
        this.nomeImpresso = nomeImpresso;
        this.numeroCartao = numeroCartao;
        this.tipoCartao = tipoCartao;
        this.ativo = ativo;
        this.limite = limite;
    }

    public String getNomeBandeiraCartao() {
        return nomeBandeiraCartao;
    }

    public void setNomeBandeiraCartao(String nomeBandeiraCartao) {
        this.nomeBandeiraCartao = nomeBandeiraCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        if (dataValidade.after(new Date())) {
            this.dataValidade = dataValidade;
        } else {
            System.out.println("Data de validade inválida");
        }
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        if (codigoSeguranca > 0) {
            this.codigoSeguranca = codigoSeguranca;
        } else {
            System.out.println("Código de segurança inválido");
        }
    }

    public String getNomeImpresso() {
        return nomeImpresso;
    }

    public void setNomeImpresso(String nomeImpresso) {
        this.nomeImpresso = nomeImpresso;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        if (numeroCartao > 0) {
            this.numeroCartao = numeroCartao;
        } else {
            System.out.println("Número de cartão inválido");
        }
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        if (tipoCartao.equals("Crédito") || tipoCartao.equals("Débito")) {
            this.tipoCartao = tipoCartao;
        } else {
            System.out.println("Tipo de cartão inválido");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        if (isAtivo()) {
            this.ativo = ativo;
        } else {
            System.out.println("Cartão inativo");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite > 0) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido");
        }
    }

    public boolean verificarValidade() {
        Date hoje = new Date();
        if (dataValidade.after(hoje)) {
            return true;
        } else {
            return false;
        }
    }

    public double verificarDebito() {
        double debito = 0;

        return debito;
    }

    public boolean ativarCartao() {
        if (isAtivo()) {
            return false;
        } else {
            this.ativo = true;
            return true;
        }
    }

    public boolean bloquearCartao() {
        if (!ativo) {
            return false;
        } else {
            this.ativo = false;
            return true;
        }
    }

    public boolean pagarFatura(double valor) {
        if (this.limite >= valor) {
            limite -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartao{" + "nomeBandeiraCartao=" + nomeBandeiraCartao + ", dataValidade=" + dataValidade + ", codigoSeguranca=" + codigoSeguranca + ", nomeImpresso=" + nomeImpresso + ", numeroCartao=" + numeroCartao + ", tipoCartao=" + tipoCartao + ", ativo=" + ativo + ", limite=" + limite + '}';
    }
}