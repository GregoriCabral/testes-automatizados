package hook;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.After;
import org.junit.Before;

public class Hook {

    @BeforeAll
    public static void setUpBeforeClass(){
        // Simulação de condiguração global antes da execução de todos os testes
        System.out.println("Configuração global antes de todos os teste.");
        inicializarAmbiente();
    }

    @AfterAll
    public static void tearDownAfterClass() {
        //Simulação de limpeza global após a execução de todos os testes
        System.out.println("Limpeza global após todos os testes.");
        limparAmbiente();
    }

    @Before
    public void setUp() {
        //Simulação de configuração antes da execução de cada cenário
        System.out.println("Iniciando um novo cenário de teste...");
        prepararDadosParateste();
    }

    @After
    public void tearDown(){
        System.out.println("Finalizando o cenário de teste...");
        limparDadosDepoisDoteste();
    }


    private static void inicializarAmbiente() {
        //Simulação de inicialização do ambiente
        System.out.println("Ambiente inicializado.");
    }

    private static void limparAmbiente() {
        //Simulação de impeza do ambiente
        System.out.println("Ambiente limpo.");
    }

    private void prepararDadosParateste () {
        //Simulação de preparação de dados para o teste
        System.out.println("Dados preparados para o cenário de teste.");
    }

    private void limparDadosDepoisDoteste() {
        //Simulação de limpeza de dados após o teste
        System.out.println("Dados limpos após o cenário de teste.");
    }
}
