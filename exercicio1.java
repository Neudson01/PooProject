package exercices;
import java.util.*;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] valores = new double[100];
		String [] nomes= new String [100];
		int [] idades= new int[100];
		String [] sexo= new String [100];
		int sair=0;
		int i=0;
		String exOpcoes;
		int op;
		int continuar=0;
		while ((sair==0) && (i <=100)){
			
			System.out.println("Qual a idade do cliente: ");
			idades[i]=recebeIdade();
			System.out.println("Qual o valor da consulta: ");
			valores[i]= recebeValorConsulta();
			System.out.println("Qual o sexo do cliente: ");
			sexo[i]=recebeSexo();
			System.out.println("Qual o nome do cliente: ");
			nomes[i]=recebeNome();
			System.out.println("Deseja adcionar mais um cliente? Se sim digite 0 se não digite 1. ");
			sair=recebeOpcao();
			i++;
			}
		
		
		opcoes(i,nomes,idades,valores,sexo);
	}
	private static int recebeIdade (){
		Scanner ler = new Scanner(System.in);
		if (!ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar um valor que seja um numero: ");
			return recebeIdade();
		}
		int valor=ler.nextInt();
		return valor;
	}
	private static double recebeValorConsulta(){
		Scanner ler = new Scanner(System.in);
	      if (!ler.hasNextDouble()) {
	         ler.next();
	         System.out.println("Voce deve digitar um valor numérico");
	         return recebeValorConsulta();
	      }
	      double valor = ler.nextDouble();
	      return valor;
	      //ler.nextLine();
	}
	
	private static String recebeSexo(){
		Scanner ler = new Scanner(System.in);
		if (ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar uma palavra! ");
			return recebeSexo();
		}
		
		String sexo=ler.nextLine();
			sexo= sexo.toUpperCase();
		while ((!sexo.equals("FEMININO"))&&(!sexo.equals("MASCULINO"))){
			System.out.println("Você deve digitar feminino ou masculino! ");
			return recebeSexo();
		}
			return sexo;
	}
	private static String recebeNome(){
		Scanner ler = new Scanner(System.in);
		if (ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar uma palavra: ");
			return recebeNome();
		}
		String nome=ler.nextLine();
		return nome;
	}

	private static int recebeOpcao (){
		Scanner ler = new Scanner(System.in);
		if (!ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar um valor que seja um numero: ");
			return recebeOpcao();
		}
		int valor=ler.nextInt();
		 if (valor != 1 && valor != 0) {
	         System.out.println(" Voce deve digitar ou 0 ou 1.");
	         return recebeOpcao();
	      }
		return valor;
	}
	private static void exibeOpcoes(){
		System.out.println("\n1 – Imprimir na tela os dados armazenados.\n 2 – Imprimir a média do valor das consultas realizadas.\n 3 – Imprimir os dados das pessoas do sexo masculino.\n 4 – Imprimir o maior valor de consulta realizado por uma pessoa do sexo feminino.\n 5- Finalizar programa!\n");
	}
	private static int recebeOp(){
		Scanner ler = new Scanner(System.in);
		
		while (!ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar um número ");
		}
		int op=ler.nextInt();
		return op;
		
	}
	private static void imprimiDados(String[] nomes, int[]idades, double[] pcons, String[] sexo){
		String dados;
		int i=0;
		while (nomes[i]!=null){
			System.out.printf("A nome do cliente é: %s \n A idade do cliente é: %d \n O valor da sua consulta foi: %.2f R$ \n E seu sexo é: %s \n", nomes[i], idades[i], pcons[i], sexo[i]);
		i++;
		}
	}
	
	private static void imprimiMedia(int i, double[]pcons){
		double tarray=i;
		double total=0;
		double media=0;
		for (int j=0; j<tarray;j++){
		//while (pcons[i]!=0.00){
			total=pcons[j];
			total+=total;
		}
		media= total/tarray;
		System.out.printf("O valor médio das consultas foi de: %.2f R$",media);
	}
	
	private static void imprimiDataM (String[] nomes, int[]idades, double[] pcons, String[] sexo){
		int i=0;
		while (nomes[i]!= null){
			if (sexo[i].equals("MASCULINO")){
				System.out.printf("A nome do cliente é: %s \n A idade do cliente é: %d \n O valor da sua consulta foi: %.2f R$", nomes[i], idades[i], pcons[i]);
			}
			i++;
		}
		
	}
	
	private static void imprimiMaiorF (String[] sexo, double[] pcons){
		int i=0;
		double maior=0;
		while (sexo[i]!= null){
			if (sexo[i].equals("FEMININO")){
				if(pcons[i]>maior){
					maior=pcons[i];
				}
			}
			i++;
		}
		System.out.printf("O maior valor de uma consulta do sexo feminino foi: %.2f R$", maior);
	}
	
	private static String outFunc(){
		Scanner ler = new Scanner(System.in);
		if (ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar uma palavra! ");
			return outFunc();
		}
		
		String out=ler.nextLine();
			out=out.toUpperCase();
		while ((!out.equals("SIM"))&&(!out.equals("NÃO"))){
			System.out.println("Você deve digitar sim ou não! ");
			return outFunc();
		}
			return out;
	}
	
	private static void opcoes(int i,String[] nomes, int[]idades, double[] pcons, String[] sexo){
		int opcao;
		String sair="NÃO";
		System.out.println("teste");
		while (sair.equals("NÃO")){
			exibeOpcoes();
			opcao=recebeOp();
			switch (opcao){
				case 1:
					imprimiDados(nomes,idades,pcons,sexo);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						exibeOpcoes();
						opcoes(i,nomes,idades,pcons,sexo);
					}
					break;
				case 2:
					imprimiMedia(i,pcons);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						exibeOpcoes();
						opcoes(i, nomes,idades,pcons,sexo);
					}
					break;
				case 3:
					imprimiDataM(nomes,idades,pcons,sexo);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						exibeOpcoes();
						opcoes(i,nomes,idades,pcons,sexo);
					}
					break;
				case 4:
					imprimiMaiorF(sexo,pcons);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						exibeOpcoes();
						opcoes(i,nomes,idades,pcons,sexo);
					}
					break;
				default: 
					System.out.println("\n digite uma opção válida");
					opcao=recebeOp();
					break;
			
			}
			sair="SIM";
			System.out.println("Programa finalizado");
		}
		
	}	
}	
	