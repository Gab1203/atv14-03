package atividade2;

public class Gerente extends Funcionario{

	private double bonus;
	
	
	public Gerente(String nome, int id, double salarioBase, double bonus) {
		super(nome, id, salarioBase);
		
	this.setNome(nome);
	this.setId(id);
	this.setSalarioBase(salarioBase);
	this.bonus = bonus;
		
	}

	
	
	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	@Override
	public double CalcularSalario() {
		
		return this.getSalarioBase() + this.getBonus();
	}
	
	
	
	
	
	

}