package steps;

import java.util.concurrent.TimeUnit;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Test {

        Metodos metodos = new Metodos();
        Elementos el = new Elementos();
	
		@Given("que eu esteja no site {string}")
		public void queEuEstejaNoSite(String site) {
		    metodos.abrirNavegador(site);
		    metodos.clicar(el.getAutoWeb());
		    metodos.clicar(el.getFormulario());
		    metodos.clicar(el.getCriarUsuario());
		}

		@When("preencher o formulario")
		public void preencherOFormulario() {
		   
			metodos.escrever("Leandro", el.getNome());
			metodos.escrever("Rodrigues", el.getUltimoNome());
			metodos.escrever("diti883@uorak.com", el.getEmail());
			metodos.escrever("João de Oliveira", el.getEndereco());
			metodos.escrever("Anhanguera", el.getUniversidade());
			metodos.escrever("Analista de testes", el.getProfissao());
			metodos.escrever("Masculino", el.getGenero());
			metodos.escrever("22", el.getIdade());
			metodos.clicar(el.getCriar());
			
		}
		
		@Then("valido a funcionalidade")
		public void validoAFuncionalidade() {
		    metodos.validarTexto("Usuário Criado com sucesso", el.getValidarText());
		    metodos.fecharNavegador();
		}

		
		
			@Given("que eu esteja {string}")
			public void queEuEsteja(String site) throws InterruptedException {
				metodos.abrirNavegador(site);
				metodos.clicar(el.getAutoWeb());
				metodos.clicar(el.getFormulario());
				
			}

			@When("acessar lista de usuarios")
			public void acessarListaDeUsuarios() throws InterruptedException {
			
				TimeUnit.SECONDS.sleep(3000);
				metodos.clicar(el.getListaUsuario());
				metodos.clicar(el.getPag4());
				metodos.clicar(el.getUser4());
			 
		    }

			@Then("acesso e valido a lista")
			public void acessoEValidoALista() {
			   
			}



		}




