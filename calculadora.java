package exercices;
import java.math.BigInteger;


public class calculadora {
	private BigInteger valor= BigInteger.ZERO;
	
	
	public calculadora (BigInteger val){
		this.valor = val;
	}
	public BigInteger soma(BigInteger sum1, BigInteger sum2 ){
		valor = sum1.add(sum2);
		return valor;
	}
	public BigInteger subtrai(BigInteger sub1, BigInteger sub2){
		valor = sub1.subtract(sub2);
		return valor;
	}
	
	public BigInteger multiplica(BigInteger mult1, BigInteger mult2){
		valor = mult1.multiply(mult2);
		return valor;
	}
	
	public BigInteger dividir(BigInteger div1, BigInteger div2){
		valor = div1.divide(div2);
		return valor;
	}	
	public BigInteger potenciacao(BigInteger base ,int poten){
		this.valor = base.pow(poten);
		return valor;
	}
	public String toString() {
	      return "valor " + valor;
	   }
}




