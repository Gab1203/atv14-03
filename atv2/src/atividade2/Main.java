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

import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GestaoFuncionarios gestao = new GestaoFuncionarios();
		
		int code = 0;
		
		do {
			
			
			System.out.println("\t\tCadastro de funcionários!!!\n\n0 - Finalizar programa\n1 - Cadastrar funcionário\n2 - Calcular salários\n3 - Listar funcionários\nDigite a opção desejada:");
			code = scanner.nextInt();
			
			switch(code) {
			
			case 0:
				System.out.println("Você terminou seu programa!!!");
				
				break;
				
			case 1:
				
				gestao.adicionarFuncionarios();
				
				break;
				
				
			case 2:
				
				gestao.calcularSalarios();
				
				break;
				
			case 3:
				
				gestao.listarFuncionarios();
				
				break;
				
			default:
				
				System.out.println("Código inválido, digite novamente!!!");
				
				break;
			
			
			}
			
		}while(code != 0);
		
	}

}