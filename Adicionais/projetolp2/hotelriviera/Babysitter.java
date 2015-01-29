package projetolp2.hotelriviera;

public class Babysitter implements Adicional {
	private double precoServico;
	private final static double SERVICO_HORA_NORMAL = 25;
	private final static double SERVICO_HORA_DOBRADA = SERVICO_HORA_NORMAL * 2;
	
	public Babysitter (boolean horaDobrada) {
		if (horaDobrada) precoServico = SERVICO_HORA_DOBRADA;
		else precoServico = SERVICO_HORA_NORMAL;
	}

	public double getPrecoServico() {
		return precoServico;
	}

	@Override
	public double getValorServico() {
		return getPrecoServico();
	}

	@Override
	public double getCobranca() {
		return getPrecoServico();
	}
	
	@Override
	public String toString() {
		return " - Babysitter - \nValor por hora: " + getCobranca();
	}
}
