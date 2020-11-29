import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculo.class)

public class Imctest {

    private double peso;
    private double altura;

    @Before
    public void prepareTests(){
        peso = 100.0;
        altura = 2.1;
    }

    @Test
    public void testeimcmenor24() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 22.6;

        //act
        atual = Calculo.calculaimc(100.0, 2.1);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }

    @Test
    public void testeimcmenor18() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 8.31;

        //act
        atual = Calculo.calculaimc(30.0, 1.90);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }

    @Test
    public void testeimcmenor30() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 29.0;

        //act
        atual = Calculo.calculaimc(85.0, 1.71);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }

    @Test
    public void testeimcmaior30() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 31.46;

        //act
        atual = Calculo.calculaimc(92.0, 1.71);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }

    @Test
    public void testecalculopesoidealh() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 87.4;

        //act
        atual = Calculo.calculapesoideal('h', 2.0);

        //assert
        Assert.assertEquals(esperado, atual, 0);

    }

    @Test
    public void testecalculopesoidealf() {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 61.4;

        //act
        atual = Calculo.calculapesoideal('m', 1.71);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }

    @Test
    public void testeescolharealizada() {
        //arrange
        Calculo calculo = new Calculo();
        int atual;
        int esperado = 0;

        //act
        atual = Calculo.getEscolha();

        //assert
        Assert.assertEquals(esperado, atual);

    }

    @Test
    public void testimcmenor24mock() throws Exception {

        //arrange
        Calculo calculo =  new Calculo();

        double atual = 0;
        double esperado = 22.6;

        //act
        Calculo.calculaimc(peso, altura);

        atual = Calculo.getResultado();

        //assert
        Assert.assertEquals(atual, esperado, 0.1);

    }

}
