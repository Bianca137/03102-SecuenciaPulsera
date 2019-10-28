/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Calendar cal = Calendar.getInstance();
        final double DINERO_INICIAL = 1.0;
        final double PRECIO_ARTICULO = 0.70;

        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        System.out.println("Nombre de la niña.........: " + "Marta");
        System.out.printf(Locale.ENGLISH, "Dinero incial.............: %.2f €%n", DINERO_INICIAL);

        System.out.println("");

        System.out.println("Artículo a comprar........: " + "Pulsera hippy");
        System.out.printf(Locale.ENGLISH, "Precio artículo...........: %.2f €%n", PRECIO_ARTICULO);

        System.out.println("");

        double dineroRestante = DINERO_INICIAL - PRECIO_ARTICULO;

        System.out.printf(Locale.ENGLISH, "Dinero restante............: %.2f €%n", dineroRestante);

    }

}
