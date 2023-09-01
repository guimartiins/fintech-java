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
        if (ativo) {
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

}