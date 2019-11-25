package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import screens.CalculadoraScreen;

public class FuncoesMatematicasSteps {

    private CalculadoraScreen calculadoraScreen = new CalculadoraScreen();

    //soma
    @Dado("^que um usuário entrou com o primeiro numero de valor \"([^\"]*)\" para realizar a soma$")
    public void que_um_usuário_entrou_com_o_primeiro_numero_de_valor_para_realizar_a_soma(String number1) {
        String primeiroValor;
        primeiroValor = calculadoraScreen.btnNumber1()+calculadoraScreen.btnNumber0();
        Assert.assertEquals(primeiroValor, number1);

    }

    @Dado("^que o usuário clicou no botão de soma$")
    public void que_o_usuário_clicou_no_botão_de_soma() {
        calculadoraScreen.btnSoma();

    }

    @Dado("^que um usuário entrou com o segundo numero de valor \"([^\"]*)\" para realizar a soma$")
    public void que_um_usuário_entrou_com_o_segundo_numero_de_valor_para_realizar_a_soma(String number2) {

        Assert.assertEquals(number2, calculadoraScreen.btnNumber5());
    }

    @Então("^o resultado da soma deve ser \"([^\"]*)\"$")
    public void o_resultado_da_soma_deve_ser(String result) {

        Assert.assertEquals(result, calculadoraScreen.result());

    }

    @Quando("^o usuário clicar no botão igual da calculadora$")
    public void o_usuário_clicar_no_botão_igual_da_calculadora() {

        calculadoraScreen.btnIgual();

    }

    //subtracao
    @Dado("^que um usuário entrou com o primeiro numero de valor \"([^\"]*)\" para realizar a subtração$")
    public void que_um_usuário_entrou_com_o_primeiro_numero_de_valor_para_realizar_a_subtração(String number1) throws Throwable {

    }

    @Dado("^que o usuário clicou no botão de subtração$")
    public void que_o_usuário_clicou_no_botão_de_subtração() throws Throwable {

    }

    @Dado("^que um usuário entrou com o segundo numero de valor \"([^\"]*)\" para realizar a subtração$")
    public void que_um_usuário_entrou_com_o_segundo_numero_de_valor_para_realizar_a_subtração(String arg1) throws Throwable {

    }

    @Então("^o resultado da subtração deve ser \"([^\"]*)\"$")
    public void o_resultado_da_subtração_deve_ser(String arg1) throws Throwable {

    }

    //multiplicacao
    @Dado("^que um usuário entrou com o primeiro numero de valor \"([^\"]*)\" para realizar a multiplicação$")
    public void que_um_usuário_entrou_com_o_primeiro_numero_de_valor_para_realizar_a_multiplicação(String arg1) throws Throwable {

    }

    @Dado("^que o usuário clicou no botão de multiplicação$")
    public void que_o_usuário_clicou_no_botão_de_multiplicação() throws Throwable {

    }

    @Dado("^que um usuário entrou com o segundo numero de valor \"([^\"]*)\" para realizar a multiplicação$")
    public void que_um_usuário_entrou_com_o_segundo_numero_de_valor_para_realizar_a_multiplicação(String arg1) throws Throwable {

    }

    @Então("^o resultado da multiplicação deve ser \"([^\"]*)\"$")
    public void o_resultado_da_multiplicação_deve_ser(String arg1) throws Throwable {

    }

    //divisao
    @Dado("^que um usuário entrou com o numero \"([^\"]*)\" para realizar a divisão$")
    public void que_um_usuário_entrou_com_o_numero_para_realizar_a_divisão(String arg1) throws Throwable {

    }

    @Dado("^que o usuário clicou no botão de divisão$")
    public void que_o_usuário_clicou_no_botão_de_divisão() throws Throwable {

    }

    @Dado("^que um usuário entrou com o segundo numero de valor \"([^\"]*)\" para realizar a divisão$")
    public void que_um_usuário_entrou_com_o_segundo_numero_de_valor_para_realizar_a_divisão(String arg1) throws Throwable {

    }

    @Então("^o resultado da divisão deve ser \"([^\"]*)\"$")
    public void o_resultado_da_divisão_deve_ser(String arg1) throws Throwable {

    }

}
