package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.Status;
import io.cucumber.java.pt.Entao;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;
import santos.higor.webdriveracoes.WebDriverAcoes;

import static santos.higor.relatorio.Extent.getCurrentTest;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;

public class CarrinhoAmazonStepDef {

    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Entao("validar que produto foi adicionado ao carrinho com sucesso")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso() {
        Assert.assertEquals("Adicionado ao carrinho", pagAmazonPerfilProdutoPO.validarProdutoAdicionadoAoCarrinhoComSucesso());
        CapturaDeTela.capturarTela(WebDriverAcoes.getDriver(), getScenario(), "Produto adicionado ao carrinho");
        getCurrentTest().log(Status.PASS,"Produto adicionado ao carrinho");

    }
}