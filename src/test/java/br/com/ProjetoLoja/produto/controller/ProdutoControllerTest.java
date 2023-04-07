package br.com.ProjetoLoja.produto.controller;

import br.com.ProjetoLoja.produto.service.ProdutoService;
import br.com.ProjetoLoja.produto.service.ProdutoServiceTest;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;


@WebMvcTest
public class ProdutoControllerTest {

    @Autowired
    private  ProdutoController produtoController;

    private TestRestTemplate restTemplate;


    @MockBean
    private ProdutoService produtoService;

    @BeforeEach
    void setUp() throws Exception
    {
        RestAssuredMockMvc.standaloneSetup(this.produtoController);

    }

    @Test
    public void deveRetornarSucesso_QuandoBuscarProduto()
    {
        Mockito.when(this.produtoService.detalhar(1L));

        RestAssuredMockMvc.given()
                .accept(ContentType.JSON)
                .when()
                .get("/produto/{produtoId}", 1L)
                .then()
                .statusCode(HttpStatus.SC_OK);

    }


}
