package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports.html",
                "json:target/json-reports/Pcucumber.json",
                "junit:target/xml-report/Pcucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepdefination",
        tags = "@Paralel1" ,

        dryRun = false
        //Eger paralel calistirma yapilacaksa https://maven.apache.org/download.cgi adresinde
        //alt tarafta bulunan Binary zip archive	apache-maven-3.8.4-bin.zip
        //dosyasini indirip zip ten cikarip program files icinde intellij programina konulur
        //ve bin dosyasina girip adresi alinir , sonra o adres baslat kisminda envairement
        //variables a gelinip üstteki patha yapistirilip kaydedelir. ve intellij kapatilip
        //acilir ve terminale mvn clean verify yazilip belirlenen paralel testler baslatilir
        //Ayni anda kac farkli paralel test yapacaksak pom daki dosyadaki <threadCount>?</threadCount>
        //soru isareti yerine o sayiyi yazmaliyiz
        //Hangi runner hangi testleri yapacak onada karar verip ona gore runner classlar olusturup
        //Terminalde mvn clean verify yazip calistirabiliriz
)
public class ParalelTestRunner1 {
}
