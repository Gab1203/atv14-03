package atividade2;

public class Operario extends Funcionario{
private int horasTrabalhadas;
private double valorHora;
	
	public Operario(String nome, int id, double salarioBase, int horasTrabalhadas, double valorHora) {
	super(nome, id, salarioBase);
	
	this.setNome(nome);
	this.setId(id);
	this.setSalarioBase(salarioBase);
	this.horasTrabalhadas = horasTrabalhadas;	
	this.valorHora = valorHora;
		
	}
	


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}



	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	@Override
	public double CalcularSalario() {
		
		double totalSalario = this.getSalarioBase() + (Double.valueOf(this.getHorasTrabalhadas()) * this.getValorHora());
		
		return totalSalario;	
	}
	

}