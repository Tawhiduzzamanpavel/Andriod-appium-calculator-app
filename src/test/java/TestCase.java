import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestCase extends BasePage{
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id="com.google.android.calculator:id/digit_7")
    MobileElement btn7;
    @FindBy(id="com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn8;
    @FindBy(id="com.google.android.calculator:id/op_sub")
    MobileElement btnMinus;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    MobileElement btn1;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    MobileElement btnDivide;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnMultiply;


    public TestCase() throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() throws InterruptedException, MalformedURLException {
        btn5.click();
        btnPlus.click();
        btn7.click();
        return btnPreview.getText();
        //Assert.assertEquals(btnPreview.getText(),"12");
    }
    public String doSubtraction() throws InterruptedException, MalformedURLException {
        btn7.click();
        btnMinus.click();
        btn1.click();
        return btnPreview.getText();
        //Assert.assertEquals(btnPreview.getText(),"12");
    }
    public String doMultiplication() throws InterruptedException, MalformedURLException {
        btn7.click();
        btnMultiply.click();
        btn5.click();
        return btnPreview.getText();
        //Assert.assertEquals(btnPreview.getText(),"35");
    }
    public String doDivision() throws InterruptedException, MalformedURLException {
        btn5.click();
        btnDivide.click();
        btn1.click();
        return btnPreview.getText();
        //Assert.assertEquals(btnPreview.getText(),"5");
    }
}
