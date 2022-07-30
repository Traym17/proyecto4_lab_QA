import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Filtros {
    private WebDriver driver = null;
    private static Adaptador adaptador = null;
    private String rutaEvidencia = "";

    public Filtros() {
        adaptador = new Adaptador();
    }

    public void abrirUrl(String url) throws IOException {
        adaptador.abrir(url);
    }

    public void dropSanjose()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'San José']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Tarrazú']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'San Marcos']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("2000000000");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("5000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }

    public void dropAlajueja()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'Alajuela']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Atenas']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'Atenas']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("2000000000");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("3000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }

    public void dropCartago()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'Cartago']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Cartago']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'Carmen']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("5000000000");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("8000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }

    public void dropGuanacaste()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'Guanacaste']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Nicoya']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'Nicoya']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("3000000000");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("6000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }

    public void dropPuntareanas()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'Puntarenas']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Quepos']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'Quepos']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("0");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("9000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }
    public void dropLimon()throws IOException {
        adaptador.findId(("ProvinceId")).click();
        adaptador.findXpath(("//option[. = 'Limón']")).click();
        adaptador.findId(("CantonId")).click();
        adaptador.findId(("CantonId"));
        adaptador.findXpath(("//option[. = 'Talamanca']")).click();
        adaptador.findSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findId(("DistrictId")).click();
        adaptador.findXpath(("//option[. = 'Bratsi']")).click();
        adaptador.findId(("PropertyTypeId")).click();
        adaptador.findId(("PropertyTypeId"));
        adaptador.findId(("MinPrice")).click();
        adaptador.findId(("MinPrice")).sendKeys("6000000000");
        adaptador.findId(("MaxPrice")).click();
        adaptador.findId(("MaxPrice")).sendKeys("9000000000");
        adaptador.findSelector((".btn-filter")).click();
        adaptador.findSelector((".property-item-title > strong")).click();
    }
    public void cerrarDriver() {
        adaptador.cerrar();
    }
}
