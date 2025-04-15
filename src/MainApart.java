import java.util.ArrayList;

public class MainApart {
	public static void main(String[] args) {
		Apartamento ap1 = new Apartamento(0, 0, 0, null, null);
		ArrayList<Moradores> morador = new ArrayList<Moradores>();
		Moradores m = new Moradores(null, null, null, null, 0, 0, 0, 0);
		
		ap1.setNumero(100);
		ap1.setAndar(12);
		ap1.setMetragem(50);
		ap1.setSituacao("Alugado");
		
		m.setNome("Gabriel");
		m.setSexo("F");
		m.setData("02/01/20");
		m.setCpf(11111);
		m.setApartamento(100);
		m.setBloco("B");
		m.setCelular(5555);
		m.setCode(123);
		morador.add(m);
		
		m = new Moradores(null, null, null, null, 0, 0, 0, 0);
		m.setNome("Ga");
		m.setSexo("M");
		m.setData("0000");
		m.setCpf(2222);
		m.setApartamento(200);
		m.setBloco("C");
		m.setCelular(1111);
		m.setCode(1234);
		morador.add(m);
		
		m = new Moradores(null, null, null, null, 0, 0, 0, 0);
		m.setNome("Ba");
		m.setSexo("F");
		m.setData("5555");
		m.setCpf(3333);
		m.setApartamento(300);
		m.setBloco("D");
		m.setCelular(3333);
		m.setCode(4321);
		morador.add(m);
		ap1.setMora(morador);
		System.out.println(ap1.toString());
	}
}
