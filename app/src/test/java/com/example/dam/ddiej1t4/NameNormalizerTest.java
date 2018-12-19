package com.example.dam.ddiej1t4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameNormalizerTest {

    NameNormalizer  normalizer;

    @Before
    public void setUp() throws Exception{
        normalizer = new NameNormalizer();
    }

    @Test
    public void firstLetterUppercase(){

        String name = "pablo rodriguez";
        String result = normalizer.firstLetterUppercase(name);
        Assert.assertEquals("Pablo Rodriguez", result);
    }

    /*
        - Mockito: objetos mock -> Objetos falsos para poder hacer pruebas con BDs, simulan lo que nos devolvería la red/BD.
        - Vídeo: Roboelectric Test unitarios y con JUnit -> se ejecuta en la maquina virtual, sin emulador
                 Ventaja: podemos testear el entorno gráfico.
     */
}
