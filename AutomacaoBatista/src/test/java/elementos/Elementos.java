package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By autoWeb = By.xpath("//*[@id=\"index-banner\"]/div/div[3]/a");
	private By formulario = By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a");
	private By criarUsuario = By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a");	
	private By Nome = By.id("user_name");
	private By UltimoNome = By.id("user_lastname");
	private By Email = By.id("user_email");
	private By Endereco = By.id("user_address");
	private By Universidade = By.id("user_university");
	private By Profissao = By.id("user_profile");
	private By Genero = By.id("user_gender");
	private By Idade = By.id("user_age");
	private By Criar = By.name("commit");
    private By validarText = By.id("notice");

	private By listaUsuario = By.xpath("//a[@href='/users/new']");
	private By pag4 = By.xpath("/html/body/div[3]/div/nav/span[7]/a");
	private By user4 = By.xpath("/html/body/div[3]/div/table/tbody/tr[4]/td[9]/a");
	
	
	public By getListaUsuario() {
		return listaUsuario;
	}
	public By getPag4() {
		return pag4;
	}
	public By getUser4() {
		return user4;
	}
	
	
	public By getValidarText() {
		return validarText;
	}
	public By getNome() {
		return Nome;
	}
	public By getUltimoNome() {
		return UltimoNome;
	}
	public By getEmail() {
		return Email;
	}
	public By getEndereco() {
		return Endereco;
	}
	public By getUniversidade() {
		return Universidade;
	}
	public By getProfissao() {
		return Profissao;
	}
	public By getGenero() {
		return Genero;
	}
	public By getIdade() {
		return Idade;
	}
	public By getCriar() {
		return Criar;
	}
	
	public By getAutoWeb() {
		return autoWeb;
	}
	public By getFormulario() {
		return formulario;
	}
	public By getCriarUsuario() {
		return criarUsuario;
	}
}
