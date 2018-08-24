package formatar;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatarMoedas {

	public static void main(String[] args) {
		/*---Valo que queremos formatar---------------*/
		Double valor = 31059.56;
		
		/*---Moedas com localidades existentes--------*/
		String eua, china, japao, franca, canada, canadaFr, taiwan, inglaterra;
		
		eua = NumberFormat.getCurrencyInstance(Locale.US).format(valor);
		china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(valor);
		japao = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(valor);
		franca = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(valor);
		canada = NumberFormat.getCurrencyInstance(Locale.CANADA).format(valor);
		canadaFr = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(valor);
		taiwan = NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(valor);
		inglaterra = NumberFormat.getCurrencyInstance(Locale.UK).format(valor);
		
		System.out.println("Estados Unidos: " + eua);
		System.out.println("China: " + china);
		System.out.println("Japão: " + japao);
		System.out.println("França: " + franca);
		System.out.println("Canadá: " + canada);
		System.out.println("Canadá Francesa: " + canadaFr);
		System.out.println("Taiwan: " + taiwan);
		System.out.println("Inglaterra: " + inglaterra);
		
		/*---Moedas com localidades contruídas------- */
		String brasil, india, paraguai, argentina, arabiaSaudita, congo;
		
		Locale localBrasil = new Locale("pt", "BR");
		brasil = NumberFormat.getCurrencyInstance(localBrasil).format(valor);
		
		Locale localIndia = new Locale("en", "IN");
		india = NumberFormat.getCurrencyInstance(localIndia).format(valor);
		
		Locale localParaguai = new Locale("es", "PY");
		paraguai = NumberFormat.getCurrencyInstance(localParaguai).format(valor);
		
		Locale localArgentina = new Locale("es", "AR");
		argentina = NumberFormat.getCurrencyInstance(localArgentina).format(valor);
		
		Locale localArabiaSaudita = new Locale("sar", "AR");
		arabiaSaudita = NumberFormat.getCurrencyInstance(localArabiaSaudita).format(valor);
		
		Locale localCongo = new Locale("fr", "CG");
		congo = NumberFormat.getCurrencyInstance(localCongo).format(valor);

		System.out.println("Brasil: " + brasil);
		System.out.println("India: " + india);
		System.out.println("Paraguai: " + paraguai);
		System.out.println("Argentina: " + argentina);
		System.out.println("Arabia Saudita:" + arabiaSaudita);
		System.out.println("Congo: " + congo);

	}

}
