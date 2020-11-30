import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculo.class)

public class Imctest {

    Calculo calculo;

    private double peso;
    private double altura;

    @Before
    public void prepareTests(){
        this.calculo = new Calculo();
        peso = 100.0;
        altura = 2.1;
    }

    @Test
    public void testeimcMenor18() throws Exception {
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
    public void testeimcMenor24() throws Exception {
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
    public void testeimcMenor30() throws Exception {
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
    public void testeimcMaior30() throws Exception {
        //arrange
        Calculo calculo = new Calculo();
        double atual = 0;
        double esperado = 31.46;

        //act
        atual = Calculo.calculaimc(92.0, 1.71);

        //assert
        Assert.assertEquals(esperado, atual, 0.1);

    }
    @Test(expected = Exception.class)
    public void testeAlturaNegativa() throws Exception {
        //arrange
        Calculo calculo = new Calculo();
        //act
        this.calculo.calculaimc(100, -1.70);
    }

    @Test(expected = Exception.class)
    public void testePesoNegativo() throws Exception {
        //arrange
        Calculo calculo = new Calculo();

        //act
        this.calculo.calculaimc(-100, 1.70);
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

    @Test(expected = Exception.class)
    public void testeSexoDif() throws Exception {
        //arrange
        Calculo calculo = new Calculo();
        //act
        this.calculo.validaSexo('g');
    }

    @Test(expected = Exception.class)
    public void testeOpcao() throws Exception {
        //arrange
        Calculo calculo = new Calculo();
        //act
        this.calculo.validaOpcao('3');
    }

    @Test
    public void testimcMenor24() throws Exception {
        Calculo classRegister =  Mockito.mock(Calculo.class);
        Mockito.verify(classRegister, Mockito.times(1)).calculaimc(peso,altura);
    }
}
