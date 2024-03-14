/*Nesta atividade, você irá implementar um sistema de gestão de funcionários
utilizando conceitos de programação orientada a objetos (POO). O sistema deve
permitir o cadastro de diferentes tipos de funcionários, como gerentes e operários,
e calcular os salários totais de cada funcionário. A atividade envolverá o uso de
polimorfismo para calcular os salários e herança para representar os diferentes
tipos de funcionários. Além disso, será necessário armazenar os funcionários em
um vetor dinâmico.
Tarefas:
1. Definir uma classe abstrata Funcionario com os seguintes atributos e
métodos:
• Atributos: nome (String), id (int) e salarioBase (double).
• Método abstrato calcularSalario() para calcular o salário total do
funcionário.

2. Criar duas subclasses de Funcionario: Gerente e Operario, com as seguintes
características:
• Gerente deve ter um atributo adicional bonusAnual (double).
• Operario deve ter atributos adicionais horasTrabalhadas (int) e
valorHora (double).

3. Implementar o método calcularSalario() em cada subclasse para calcular o
salário total de acordo com as especificações de cada tipo de funcionário:
• Para Gerente, o salário total é a soma do salário base e do bônus
anual.
• Para Operario, o salário total é a soma do salário base mais o
pagamento pelas horas trabalhadas.

4. Criar uma classe GestaoFuncionarios para gerenciar os funcionários. Esta
classe deve conter um vetor dinâmico de Funcionario e os seguintes
métodos:
• adicionarFuncionario(Funcionario func): para adicionar um novo
funcionário ao vetor.
• calcularSalarios(): para calcular e exibir o salário total de todos os
funcionários.
• listarFuncionarios(): para exibir os detalhes de todos os funcionários
cadastrados.

Observações:
• Utilize o conceito de herança para reutilizar código comum entre as classes.
• Utilize o polimorfismo para chamar o método calcularSalario() de cada
funcionário, independentemente do tipo.
• Utilize um vetor dinâmico para armazenar os funcionários, permitindo a
adição flexível de novos funcionários.*/

package atividade2;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionarios {

	ArrayList<Operario> proletarios = new ArrayList<>();
	ArrayList<Gerente> gerentes = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public void adicionarFuncionarios() {
		
		System.out.println("1 - Operáio\n2 - Gerente\nDigite o cargo do funcionário:");
		int cargoNumero = scan.nextInt();
		
		switch(cargoNumero){
		
		
		case 1:
			

			System.out.println("Digite o nome do operário:");
			String OpNome = scan.next();
			System.out.println("Digite o id do operário:");
			int OpId = scan.nextInt();
			System.out.println("Digite o salário base do operário:");
			double OpSalarioBase = scan.nextDouble();
			System.out.println("Digite as horas trabalhadas do operário:");
			int opHorasTrabalhadas = scan.nextInt();
			System.out.println("Digite o valor hora do operário:");
			double opValorHora = scan.nextDouble();
			
			proletarios.add(new Operario(OpNome, OpId, OpSalarioBase, opHorasTrabalhadas, opValorHora));
			break;
			
		case 2:
			
			
			System.out.println("Digite o nome do gerente:");
			String GerNome = scan.next();
			System.out.println("Digite o id do gerente:");
			int GerId = scan.nextInt();
			System.out.println("Digite o salário base do gerente:");
			double GerSalarioBase = scan.nextDouble();
			System.out.println("Digite o valor do bônus do gerente:");
			double GerBonus = scan.nextDouble();
			
			gerentes.add(new Gerente(GerNome, GerId, GerSalarioBase, GerBonus));
			
			break;
			
			default:
				System.out.println("Cargo inválido!!!");
				
				break;
		
		}
		
		
	}
	
	public void calcularSalarios() {
		
	
	System.out.println("Salários dos operários:");
	
	for(int i = 0; i < proletarios.size(); i++){
		
		
System.out.printf("Salário de %s: R$ %.2f\n",proletarios.get(i).getNome(), proletarios.get(i).CalcularSalario());	
		
	}
	
	System.out.println("\nSalários dos gerentes:");
	
	
	for(int i = 0; i < gerentes.size(); i++){
			
		
		
		System.out.printf("Salário de %s: R$ %.2f\n",gerentes.get(i).getNome(), gerentes.get(i).CalcularSalario());	

		
			
		}
	}
	
	
	public void listarFuncionarios() {
		
		System.out.println("Operários:");
		
		for(int i = 0; i < proletarios.size(); i++){
			
			
			System.out.printf("Nome: %s, ID: %d, salário base: R$ %.2f, horas trabalhadas: %d, valor hora: R$ %.2f\n", proletarios.get(i).getNome(), proletarios.get(i).getId(), proletarios.get(i).getSalarioBase(), proletarios.get(i).getHorasTrabalhadas(), proletarios.get(i).getValorHora());
				}
				
				
		System.out.println("Gerentes:");		
				
				for(int i = 0; i < gerentes.size(); i++){
						
					
					
					System.out.printf("Nome: %s, ID: %d, salário base: R$ %.2f, bonus: R$ %.2f\n", gerentes.get(i).getNome(), gerentes.get(i).getId(), gerentes.get(i).getSalarioBase(), gerentes.get(i).getBonus());	

					
						
					}
	}
	
	
}
