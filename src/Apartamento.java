import java.util.ArrayList;

public class Apartamento {
	private int numero;
	private int andar;
	private double metragem;
	private String situacao;
	private ArrayList<Moradores> mora;
	
	Apartamento(int numero, int andar, double metragem, String situacao, ArrayList<Moradores> mora){
		this.numero = numero;
		this.andar = andar;
		this.metragem = metragem;
		this.situacao = situacao;
		this.mora = mora;
	}
	public ArrayList<Moradores> getMora() {
		return mora;
	}
	public void setMora(ArrayList<Moradores> mora) {
		this.mora = mora;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public double getMetragem() {
		return metragem;
	}
	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Numero: " + numero + " Andar: " + andar + " Metragem: " + metragem + " Situacao: " + situacao + "\n" +
				mora;
	}
}
