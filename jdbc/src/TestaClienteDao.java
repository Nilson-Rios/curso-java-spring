import jdbc.Cliente;
import jdbc.ClienteDao;

public class TestaClienteDao {
	public static void main(String[] args) {

		//testaObter();
		
		//testarAlterar();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(2);

		ClienteDao dao = new ClienteDao();
		dao.remover(cliente);
		
	}

	private static void testarAlterar() {
		Cliente cliente = new Cliente();
		cliente.setNome("1");
		cliente.setLogin("2");
		cliente.setSenha("3");
		cliente.setEndereco("4");
		cliente.setCidade("5");
		cliente.setBairro("6");
		cliente.setEstado("7");
		cliente.setCep("74110-150");
		cliente.setCodigo(1);
		
		ClienteDao dao = new ClienteDao();
		dao.alterar(cliente);
	}

	private static void testaObter() {
		Cliente c = new Cliente();
		c.setLogin("nils");
		c.setSenha("senha");

		ClienteDao dao = new ClienteDao();
		Cliente clienteRetorno = dao.obter(c); // pega o retorno de c e joga para a variavel clienteRetorno

		// System.out.println(dao.obter(c)); //opção 1 de print
		System.out.println(clienteRetorno);
	}

	private static void testaInserir() {
		Cliente cliente = new Cliente();
		cliente.setNome("Jose");
		cliente.setLogin("js");
		cliente.setCep("74110-150");
		cliente.setCidade("Goiânia");
		cliente.setSenha("senha");
		cliente.setEstado("Goiás");
		cliente.setBairro("Setor Bueno");
		cliente.setEndereco("rua t-44");
		cliente.setCodigo(1);

		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
	}

}
