package program;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double sp = 67836.43;
		Double rj = 36678.66;
		Double mg = 29229.88;
		Double es = 27165.48;
		Double outros = 19849.53;
		
		Double total = sp + rj + mg + es + outros;
		
		System.out.printf("Faturamento total: R$%.2f\n",total);
		System.out.printf("Representação de SP no faturamento do mês: %.2f%%\n", percentualDeUmValor(sp, total));
		System.out.printf("Representação de RJ no faturamento do mês: %.2f%%\n", percentualDeUmValor(rj, total));
		System.out.printf("Representação de MG no faturamento do mês: %.2f%%\n", percentualDeUmValor(mg, total));
		System.out.printf("Representação de ES no faturamento do mês: %.2f%%\n", percentualDeUmValor(es, total));
		System.out.printf("Representação de Outros no faturamento do mês: %.2f%%\n", percentualDeUmValor(outros, total));
	}
	
	static Double percentualDeUmValor(Double valor, Double total) {
		return (valor/total)*100;
	}

}
