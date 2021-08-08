package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AllegroTestingAppNew {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.allegro.pl");

        //akceptacja ciasteczek:
        WebElement inputField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(8) > div > div > div > div > div._15pc6._d9spf.mpof_z0.m7er_k4.mp7g_oz.mse2_56.mp4t_0.m3h2_0.mryx_0.munh_0.m911_5r.mefy_5r.mnyp_5r.mdwl_5r.mh36_0.mg9e_16.msts_9u.mjb5_zl.meqh_bv.mj7a_8.mj7a_16_m > div._854c2_OPWNL._9f0v0._jkrtd.mj7a_0.mh36_16.mvrt_16.mg9e_16.mpof_ki.m389_6m.munh_56.m3h2_56.myre_zn.myre_8v_s.m7f5_5x_s._854c2_21ZR4 > button.m7er_0k.m7er_56_s.m3h2_16_m._854c2_2sUz3.m3h2_16_s._854c2_167Bx.mgn2_14.mp0t_0a.m9qz_yo.mp7g_oh.mse2_40.mqu1_40.mtsp_ib.mli8_k4.mp4t_0.m3h2_0.mryx_0.munh_0.m911_5r.mefy_5r.mnyp_5r.mdwl_5r.msbw_2.mldj_2.mtag_2.mm2b_2.mqvr_2.msa3_z4.mqen_m6.meqh_en.m0qj_5r.mh36_16.mvrt_16.mg9e_0.mj7a_0.m9tr_pf.m2ha_2.m8qd_qh.mjt1_n2.bqyr8.mgmw_9u.msts_enp.mrmn_qo.mrhf_u8.m31c_kb.m0ux_fp.b1bc7"));
        inputField.click();

        //przełączenie kategorii produktów na "Elektronika":
        WebElement categoryCombo = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(4) > header > div > div > div:nth-child(1) > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.m911_co.mnyp_co.mdwl_co.mx7m_1.mefy_5r.mlkp_ag.msts_9u._d25db_1Qn1q > div > select"));

        Select categorySelect = new Select(categoryCombo);
        //categorySelect.selectByIndex(3);
        categorySelect.selectByValue("/kategoria/elektronika");

        //wyszukiwanie "Mavic mini":
        WebElement searchField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(4) > header > div > div > div:nth-child(1) > div > form > input"));
        searchField.sendKeys("Mavic mini");

        //kliknięcie szukaj:
        WebElement searchButton = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(4) > header > div > div > div:nth-child(1) > div > form > button"));
        searchButton.submit();

        //wait:
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article")));
        List<WebElement> results = driver.findElements(By.cssSelector("div[data-box-name='items-v3'] > div >div > section > article"));

        //wyświetlenie informacji o produkcie:
        System.out.println(results.get(3).getText());
    }
}



