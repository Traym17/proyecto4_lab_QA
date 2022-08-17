public class Casos {
  Filtros filtros;

    @Parameters({"navegador"})
    @BeforeClass
    public void beforeClass(String navegador) {
        filtros = new Filtros();
    }
    @Parameters({"url"})
    @BeforeMethod
    public void beforeTest(String url) throws IOException {
        filtros.abrirUrl(url);
    }
    @Test
    public void PruebaSanJose() throws IOException {
        filtros.dropSanjose();
    }
    @Test
    public void PruebaAlajuela() throws IOException {
        filtros.dropAlajueja();
    }
    @Test
    public void PruebaCartago() throws IOException {
        filtros.dropCartago();
    }
    @Test
    public void PruebaGuanacaste() throws IOException {
        filtros.dropGuanacaste();
    }
    @Test
    public void PruebaPuntarenas() throws IOException {
        filtros.dropPuntareanas();
    }
    @Test
    public void PruebaLimon() throws IOException {
        filtros.dropLimon();
    }
    @AfterMethod
    public void afterTest() {
    }
    @AfterClass
    public void afterClass() {
        filtros.cerrarDriver();
    }
}
