package santos.higor.stepdefinitions.amazon;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverAcoes;

import static santos.higor.enums.Parametros.URL_AMAZON;
import static santos.higor.hook.Hook.scenario;
import static santos.higor.properties.DefinitionsProperties.getParametro;

public class PaginaInicialAmazonStepDef {

    private final PagAmazonHomePagePO pagAmazonHomePagePO = new PagAmazonHomePagePO();

    @Dado("que seja acessado o site da amazon")
    public void que_seja_acessado_o_site_da_amazon() {
        WebDriverAcoes.getDriver().get(getParametro(URL_AMAZON));
        CapturaDeTela.capturarTela("Pagina Inicial", WebDriverAcoes.getDriver(), scenario);
    }

    @E("seja preenchida a barra de pesquisa com o nome do {string} que desejo procurar")
    public void seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String pesquisa) {
        pagAmazonHomePagePO.preencherBarraDePesquisa(pesquisa);
        CapturaDeTela.capturarTela("Preencher barra de pesquisa", WebDriverAcoes.getDriver(), scenario);
    }

    @Quando("o botao de pesquisar e pressionado")
    public void o_botao_de_pesquisar_e_pressionado() {
        pagAmazonHomePagePO.clicarEmPesquisar();
    }
}