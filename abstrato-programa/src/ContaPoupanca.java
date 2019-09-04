import java.text.SimpleDateFormat;

import java.util.Date;

public class ContaPoupanca extends  Conta{
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato de Conta ###");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Data: " +sdf.format(date));
	}
}
