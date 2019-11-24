package screens;

import helper.ElementsHelper;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.remote.RemoteWebElement;

public class CalculadoraScreen extends BasePage{

    @AndroidFindBy(id = "card_container")
    @iOSXCUITFindBy(accessibility = "bannerCell")
    public RemoteWebElement bannerPrincipal;

    @AndroidFindBy(id = "img_item")
    @iOSXCUITFindBy(accessibility = "news_card_view")
    public RemoteWebElement bannerHabilitar;

    @AndroidFindBy(id = "btn_enable_now")
    @iOSXCUITFindBy(accessibility = "COMEÇAR HABILITAÇÃO")
    public RemoteWebElement btnVamosLa;

    @AndroidFindBy(id = "btn_request_sms")
    @iOSXCUITFindBy(accessibility = "btn_request_sms")
    public RemoteWebElement btnSolicitarSms;

    @AndroidFindBy(id = "txt_confirm_sms_token")
    @iOSXCUITFindBy(accessibility = "txt_confirm_sms_token")
    public RemoteWebElement edtConfirmeSms;

    @AndroidFindBy(id = "doDepositButton")
    @iOSXCUITFindBy(accessibility = "doDepositButton")
    public RemoteWebElement btnSolicitarDeposito;

    @AndroidFindBy(id = "typeDepositButton")
    @iOSXCUITFindBy(accessibility = "typeDepositButton")
    public RemoteWebElement btnInformarDeposito;

    @AndroidFindBy(id = "valueEdit")
    @iOSXCUITFindBy(accessibility = "valueEdit")
    public RemoteWebElement edtValorDeposito;

    @AndroidFindBy(id = "confirmDepositNowButton")
    @iOSXCUITFindBy(accessibility = "confirmDepositNowButton")
    public RemoteWebElement btnConfirmarDeposito;

    @AndroidFindBy(id = "btn_agree_sms_information")
    @iOSXCUITFindBy(accessibility = "btn_agree_sms_information")
    public RemoteWebElement btnEntendi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transferências']")
    @iOSXCUITFindBy(xpath = "//*[@text='Transferências']")
    public RemoteWebElement btnTransferencias;

    @iOSXCUITFindBy(accessibility = "ENTENDI")
    public RemoteWebElement btnUnderstoodIos;

    public CalculadoraScreen enterPrincipalBannerAppToken() {
        ElementsHelper.waitForElementToLoad(bannerPrincipal, 5).click();
        return this;
    }

    public CalculadoraScreen enterBannerAppToken() {
        ElementsHelper.waitForElementToLoad(bannerHabilitar, 15).click();
        return this;
    }

    public CalculadoraScreen enterWelcome() {
        ElementsHelper.waitForElementToLoad(btnVamosLa, 15).click();
        return this;
    }

}



