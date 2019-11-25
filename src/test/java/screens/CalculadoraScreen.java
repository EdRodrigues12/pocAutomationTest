package screens;

import helper.ElementsHelper;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.remote.RemoteWebElement;

public class CalculadoraScreen extends BasePage{

    @AndroidFindBy(id = "digit_1")
    public RemoteWebElement btnNumber1Calculadora;

    @AndroidFindBy(id = "digit_5")
    public RemoteWebElement btnNumber5Calculadora;

    @AndroidFindBy(id = "digit_0")
    public RemoteWebElement btnNumber0Calculadora;

    @AndroidFindBy(id = "digit_2")
    public RemoteWebElement btnNumber2Calculadora;

    @AndroidFindBy(id = "digit_4")
    public RemoteWebElement btnNumber4Calculadora;

    @AndroidFindBy(id = "digit_9")
    public RemoteWebElement btnNumber9Calculadora;

    @AndroidFindBy(id = "op_add")
    public RemoteWebElement btnSomaCalculadora;

    @AndroidFindBy(id = "op_div")
    public RemoteWebElement btnDivisaoCalculadora;

    @AndroidFindBy(id = "op_sub")
    public RemoteWebElement btnSubtracaoCalculadora;

    @AndroidFindBy(id = "op_mul")
    public RemoteWebElement btnMultiplicacaoCalculadora;

    @AndroidFindBy(id = "eq")
    public RemoteWebElement btnIgualCalculadora;

    @AndroidFindBy(id = "result")
    public RemoteWebElement edtResultCalculo;

    public String btnNumber1() {
        ElementsHelper.waitForElementToLoad(btnNumber1Calculadora, 2).click();
        return btnNumber1Calculadora.getText();
    }


    public String btnNumber0() {
        ElementsHelper.waitForElementToLoad(btnNumber0Calculadora, 2).click();
        return btnNumber0Calculadora.getText();
    }

    public String btnNumber5() {
        ElementsHelper.waitForElementToLoad(btnNumber5Calculadora, 2).click();
        return btnNumber5Calculadora.getText();
    }

    public CalculadoraScreen btnSoma() {
        ElementsHelper.waitForElementToLoad(btnSomaCalculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnIgual() {
        ElementsHelper.waitForElementToLoad(btnIgualCalculadora, 2).click();
        return this;
    }

    public String result() {
        ElementsHelper.waitForElementToLoad(edtResultCalculo, 2);

        return edtResultCalculo.getText();
    }


    public CalculadoraScreen btnNumber2() {
        ElementsHelper.waitForElementToLoad(btnNumber2Calculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnNumber4() {
        ElementsHelper.waitForElementToLoad(btnNumber4Calculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnNumber9() {
        ElementsHelper.waitForElementToLoad(btnNumber9Calculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnDivisao() {
        ElementsHelper.waitForElementToLoad(btnDivisaoCalculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnSubtracao() {
        ElementsHelper.waitForElementToLoad(btnSubtracaoCalculadora, 2).click();
        return this;
    }

    public CalculadoraScreen btnMultiplicacao() {
        ElementsHelper.waitForElementToLoad(btnMultiplicacaoCalculadora, 2).click();
        return this;
    }


}



