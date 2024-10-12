package ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa1, Pessoa pesssoa2) {
		// TODO Auto-generated method stub
		return Double.compare(pessoa1.getHeight(), pesssoa2.getHeight());
	}

}
