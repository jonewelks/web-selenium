package steps;

import automationWeb.base.BaseTest;
import automationWeb.core.DriverFactory;
import org.junit.Before;
import page.CampoTreinamentoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepDefinitions extends BaseTest {
	
	private CampoTreinamentoPage page;

	@Given("que esteja na tela inicial")
	public void que_acessei_url() {
		DriverFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinamentoPage();
	}

	@When("Informo o nome")
	public void nome() {
		page.setNome("Carlos");
	}

	@And("Informo o Sobrenome")
	public void sobreNome() {
		page.setSobrenome("Eduardo");
	}

	@And("Informo o nome Sexo")
	public void sexo() {
		page.setSexoMasculino();
	}

	@And("Seleciono a opção de comer pizza")
	public void setPizza() {
		page.setComidaPizza();
	}

	@And("Informo minha escolaridade")
	public void setEscolaridade() {
		page.setEscolaridade("Mestrado");
	}

	@And("Informo Meu esporte Favorito")
	public void setEsports() {
		page.setEsporte("Futebol");
	}

	@Then("Concluo Cadastro")
	public void concluiCadastro() {
		page.cadastrar();
	}

	@Before
	@And("Valido as informações setadas")
	public void validateInfos() {
		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Carlos", page.obterNomeCadastro());
		Assert.assertEquals("Eduardo", page.obterSobrenomeCadastro());
		Assert.assertEquals("Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Pizza", page.obterComidaCadastro());
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
		Assert.assertEquals("Futebol", page.obterEsportesCadastro());
		DriverFactory.killDriver();


	}


//	@Test
//	public void deveRealizarCadastroComSucesso(){
//
//		page.setNome("Carlos");
//		page.setSobrenome("Eduardo");
//		page.setSexoMasculino();
//		page.setComidaPizza();
//		page.setEscolaridade("Mestrado");
//		page.setEsporte("Natacao");
//		page.cadastrar();
//
//		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
//		Assert.assertEquals("Wagner", page.obterNomeCadastro());
//		Assert.assertEquals("Costa", page.obterSobrenomeCadastro());
//		Assert.assertEquals("Masculino", page.obterSexoCadastro());
//		Assert.assertEquals("Pizza", page.obterComidaCadastro());
//		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
//		Assert.assertEquals("Natacao", page.obterEsportesCadastro());
//	}
}
