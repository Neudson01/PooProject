package exercices;
import java.math.BigInteger;
import java.util.Scanner;

public class testeCalculadora {
	
	public static void main(String[] args) {
		BigInteger valorInicial= BigInteger.ZERO, val2, result= BigInteger.ZERO;
		int sair=0;
		while (sair==0){
			calculadora calc=new calculadora(valorInicial);
			result=opcoes(calc, valorInicial);
			sair=1;
		}
		System.out.println("o Resultado é: "+ result);
	}
	private static BigInteger soma(calculadora calc, BigInteger num){
		BigInteger somar=null, val1= BigInteger.ZERO, val2, val3;
		int sair=0, compare;
		compare=val1.compareTo(num);
		while(sair==0){
			if(compare==0){
				System.out.println("informe um valor ");
				val2=validaNum();
				System.out.println("informe um segundo valor valor ");
				val3=validaNum();
				somar=calc.soma(val2,val3);
				System.out.println("Deseja somar mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					soma(calc, somar);
				}
				else 
					break;
			}
			else{
				System.out.println("Digite um número \n ");
				val2=validaNum();
				somar=calc.soma(num,val2);
				System.out.println("Deseja somar mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					mult(calc, somar);	
					}	
				}
			}
		System.out.println("O valor atual é" + somar);
		return somar;
	}
	
	private static BigInteger subtr(calculadora calc, BigInteger num){
		BigInteger sub=null, val1=BigInteger.ZERO, val2, val3;
		int sair=0, compare;
		compare=val1.compareTo(num);
		while(sair==0){
			if(compare==0){
				System.out.println("informe um valor ");
				val2=validaNum();
				System.out.println("informe um segundo valor valor ");
				val3=validaNum();
				sub=calc.subtrai(val2,val3);
				System.out.println("Deseja subtrair mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					subtr(calc, sub);
				}
				else 
					break;
			}
			else{
				System.out.println("Digite um número \n ");
				val2=validaNum();
				sub=calc.subtrai(num,val2);
				System.out.println("Deseja subtrair mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					mult(calc, sub);	
					}	
				}
			}
			System.out.println("O valor atual é" + sub);
			return sub;
	}
	
	private static BigInteger mult(calculadora calc, BigInteger num){
		BigInteger multipli=null, val1= BigInteger.ZERO, val2, val3;
		int sair=0, compare;
		compare=val1.compareTo(num);
			while(sair==0){
				if(compare==0){
					System.out.println("informe um valor ");
					val2=validaNum();
					System.out.println("informe um segundo valor valor ");
					val3=validaNum();
					multipli=calc.multiplica(val2,val3);
					System.out.println("Deseja multiplicar mais uma vez? 0 para sim e 1 para não \n ");
					sair=recebeOpcao();
					if(sair==0){
						mult(calc, multipli);
					}
					else 
						break;
				}
				else{
					System.out.println("Digite um número \n ");
					val2=validaNum();
					multipli=calc.multiplica(num,val2);
					System.out.println("Deseja multiplicar mais uma vez? 0 para sim e 1 para não \n ");
					sair=recebeOpcao();
					if(sair==0){
						mult(calc, multipli);	
						}	
					}
				}
				System.out.println("O valor atual é" + multipli);
				return multipli;
				
	}
	
	private static BigInteger divi(calculadora calc, BigInteger num){
		BigInteger dividi=null, val1= BigInteger.ZERO, val2, val3;
		int sair=0, compare, val4;
		compare=val1.compareTo(num);
		while(sair==0){
			if(compare==0){
				System.out.println("informe um valor ");
				val2=validaNum();
				System.out.println("informe um segundo valor ");
				val3=validaNum();
				dividi=calc.dividir(val2,val3);
				System.out.println("Deseja dividir mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					divi(calc, dividi);
				}
				else 
					break;
			}
			else{
				System.out.println("Digite um número \n ");
				val2=validaNum();
				val4=val2.intValue();
				if(val4==0){
					divi(calc, dividi);
				}
				dividi=calc.dividir(num,val2);
				System.out.println("Deseja dividir mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					divi(calc, dividi);	
					}	
				}
			}
			System.out.println("O valor atual é :" + dividi);
			return dividi;
	}
	
	private static BigInteger poten(calculadora calc, BigInteger num){
		BigInteger potencia=null, val1=BigInteger.ZERO, val2, val3;
		int sair=0, val4=1, compare;
		compare=val1.compareTo(num);
		while (sair==0){
			if(compare==0){
				System.out.println("informe um valor ");
				val2=validaNum();
				System.out.println("informe um segundo valor valor ");
				val3=validaNum();
				val4=val2.intValue();
				potencia=calc.potenciacao(val2,val4);
				System.out.println("Deseja realizar a potenciação mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					poten(calc, potencia);
				}
				else 
					break;
			}
			else{
				System.out.println("Digite um número \n ");
				val2=validaNum();
				val4=val2.intValue();
				potencia=calc.potenciacao(num,val4);
				System.out.println("Deseja realizar a potenciação mais uma vez? 0 para sim e 1 para não \n ");
				sair=recebeOpcao();
				if(sair==0){
					poten(calc, potencia);	
					}	
				}
			}
		System.out.println("O valor atual é :" + potencia);
		return potencia;	
	}


	private static BigInteger validaNum(){
		Scanner ler = new Scanner(System.in);
		if (!ler.hasNextBigInteger()){
			ler.next();
			System.out.println("Você deve digitar um valor que seja um numero: ");
			return validaNum();
		}
		BigInteger val=ler.nextBigInteger();
		return val;
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
	private static int recebeOp(){
		Scanner ler = new Scanner(System.in);
		
		while (!ler.hasNextInt()){
			ler.next();
			System.out.println("Você deve digitar um número ");
		}
		int op=ler.nextInt();
		return op;
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
	
	private static void exibeOpcoes(){
		System.out.println("\n 1 Realiza peração de soma .\n 2 Realiza operação de subtração \n 3 Realiza operação de multiplicação \n 4 Realiza operação de divisão \n 5 Realiza operação de potenciação \n 6- Finaliza o programa");
	}
	private static BigInteger opcoes(calculadora calculator,BigInteger firstValue){
		BigInteger value=firstValue, valueF=null;
		calculadora calc=calculator;
		int opcao;
		String sair="NÃO";
		while (sair.equals("NÃO")){
			exibeOpcoes();
			opcao=recebeOp();
			switch (opcao){
				case 1:
					value=soma(calc, value);
					valueF=value;
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						opcoes(calc, value);
					}
					break;
				case 2:
					value=subtr(calc,value);
					valueF=value;
					System.out.println("\n Deseja sair do programa? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						opcoes(calc,value);
					}
					break;
				case 3:
					value=mult(calc, value);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						opcoes(calc,value);
					}
					break;
				case 4:
					value=divi(calc, value);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						opcoes(calc,value);
					}
					break;
				case 5:
					value=poten(calc,value);
					System.out.println("\n Deseja sair? Digite Sim ou não");
					sair=outFunc();
					if (sair.equals("NÃO")){
						opcoes(calc,value);
					}
					break;
				case 6:
					break;
			}
			break;
		}
		return value;
	}
			

}
