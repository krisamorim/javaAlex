import java.math.BigDecimal;

public class aula002 {

	public static void main(String[] args) {
		//tipos primitivos
		byte tipoByte = 0;
		short tipoShort = 0;
		int tipoInt = 0;
		long tipoLong = 58859;
		
		
		boolean tipoBoolean = true;
		String tipoTexto = "texto";
		
		//big decimal pe um classe por isso as variáveis desse tipo são criadas diferentes
		BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        //essa pe a forma como somamos numeros em bigDecimal
        BigDecimal bigResult = big1.add(big2);
        System.out.println(bigResult.toString());
	}

}
