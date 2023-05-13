package lab2_flavio_cristian_samuel;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2_flavio_cristian_samuel {
    public static void main(String[] args) {
        int  x1, x2,tot = 0, x1i, x2i, opc = 0, opc1, i;
        Scanner leer = new Scanner(System.in);
        Random rr = new Random();
        // menu iterativo con 3 opciones
        do {
            System.out.println("1. miselania de juegos");
            System.out.println("2. operaciones matematica");
            System.out.println("3. salir");
            System.out.println("ingrese una opcion");
            opc = leer.nextInt();
            while (opc < 1 || opc > 3) {
                System.out.println("ingrese una opcion valida");
                opc = leer.nextInt();
            }
            switch (opc){
                case 1:
                    System.out.println("1. dados");
                    System.out.println("2. punto y fama");
                    System.out.println("3. triqui");
                    System.out.println("4. regresar");
                    System.out.println("ingrese una opcion");
                    opc1 = leer.nextInt();
                    while (opc1 < 1 || opc1 > 4) {
                        System.out.println("ingrese una opcion valida");
                        opc1 = leer.nextInt();
                    }
                    switch (opc1){
                        case 1:
                            int dado1, dado2, dado3, dado4, puntaje1 = 0, puntaje2 = 0, turno = 0, total1 = 0, total2 = 0, randomNumber = 0;
                            i = 0;
                            Random ranNum = new Random();
                            System.out.println("Juego de dados: ");
                            do {
                                do {
                                    dado1 = ranNum.nextInt(6)+1;
                                    dado2 = ranNum.nextInt(6)+1;
                                    total1 = dado1 + dado2;
                                    System.out.println("turno jugador 1 " + "los dados son: " + dado1 + " " + dado2);
                                    if (dado1 == dado2) {
                                        System.out.println("es doble continua jugador 1");
                                        puntaje1 = puntaje1 + 1;
                                    }
                                } while (dado2 == dado1);
                    
                                do {
                                    dado3 = ranNum.nextInt(6);
                                    dado4 = ranNum.nextInt(6);
                                    total2 = dado3 + dado4;
                                    System.out.println("turno jugador 2 " + "los dados son: " + dado3 + " " + dado4);
                                    if (dado3 == dado4) {
                                        System.out.println("es doble continua jugador 2");
                                        puntaje2 = puntaje2 + 1;
                                    }
                                } while (dado3 == dado4);
                                if (total1 > total2) {
                                    puntaje1 = puntaje1 + 3;
                                }
                                if (total1 < total2) {
                                    puntaje2 = puntaje2 + 3;
                                }
                                if (total1 == total2) {
                                    i = i - 1;
                                    System.out.println("debido a misma suma no se agregan puntos");
                                }
                                System.out.println("puntaje jugador 1 ES " + puntaje1);
                                System.out.println("puntaje jugador 2 ES " + puntaje2);
                            
                                i = i + 1;
                    
                                if(i==22){
                                System.out.println("desea seguir jugando: ");
                                System.out.println("1 si " + " 2 no");
                                turno = leer.nextInt();
                                while (turno < 1 | turno > 2) {
                                    System.out.println("desea seguir jugando: (ingrese un numero valido)");
                                    turno = leer.nextInt();
                                }}
                                if (turno == 2) {
                                    i = 22;
                                }
                            } while (i <= 21 & puntaje1 - puntaje2 < 15 & puntaje2 - puntaje1 < 15);
                            System.out.println("puntaje final jugador 1 ES " + puntaje1);
                            System.out.println("puntaje final jugador 2 ES " + puntaje2);
                            if (puntaje1 > puntaje2) {
                                System.out.println("GANA JUGADOR 1");
                            }
                            if (puntaje2 > puntaje1) {
                                System.out.println("GANA JUGADOR 2");
                            }
                            if (puntaje1 == puntaje2) {
                                System.out.println("EMPATE");
                            }
                            break;
                        case 2:
                            int num, c1, c2, c3, c4, p1, p2, p3, p4, intento, fam = 0, punt = 0;
                            num = (rr.nextInt(10000 - 1000 + 1) + 1000);
                            i = 1;
                            c1 = num / 1000;
                            c2 = (num / 100) % 10;
                            c3 = (num / 10) % 10;
                            c4 = num % 10;
                            while (c1 == c2 | c1 == c3 | c1 == c4 | c2 == c3 | c2 == c4 | c3 == c4) {
                                num = (rr.nextInt(10000 - 1000 + 1) + 1000);
                                c1 = num / 1000;
                                c2 = (num / 100) % 10;
                                c3 = (num / 10) % 10;
                                c4 = num % 10;
                            }
                            System.out.println("Ingrese su intento numero " + i);
                            intento = leer.nextInt();
                            while (intento > 9999 | intento < 1000){
                                System.out.println("el numero debe estar en un intervalo entre 1000 y 9999, es decir, 4 cifras.");
                                System.out.println("ingrese de nuevo su intento numero " + i);
                                intento = leer.nextInt();
                            }
                            p1 = intento / 1000;
                            p2 = (intento / 100) % 10;
                            p3 = (intento / 10) % 10;
                            p4 = intento % 10;
                            while (p1 == p2 | p1 == p3 | p1 == p4 | p2 == p3 | p2 == p4 | p3 == p4) {
                                System.out.println("El numero no puede tener digitos iguales");
                                System.out.println("ingrese de nuevo su intento numero " + i);
                                intento = leer.nextInt();
                                p1 = intento / 1000;
                                p2 = (intento / 100) % 10;
                                p3 = (intento / 10) % 10;
                                p4 = intento % 10;
                            }
                            while (intento != num) {
                                if (c1 == p1) {
                                    fam = fam + 1;
                                }
                                if (c2 == p2) {
                                    fam = fam + 1;
                                }
                                if (c3 == p3) {
                                    fam = fam + 1;
                                }
                                if (c4 == p4) {
                                    fam = fam + 1;
                                }
                                if (c1 == p2 & c1 != p1) {
                                    punt = punt + 1;
                                }
                                if (c1 == p3 & c1 != p1) {
                                    punt = punt + 1;
                                }
                                if (c1 == p4 & c1 != p1) {
                                    punt = punt + 1;
                                }
                                if (c2 == p1  & c2 != p2) {
                                    punt = punt + 1;
                                }
                                if (c2 == p3  & c2 != p2) {
                                    punt = punt + 1;
                                }
                                if (c2 == p4  & c2 != p2) {
                                    punt = punt + 1;
                                }
                                if (c3 == p1  & c3 != p3) {
                                    punt = punt + 1;
                                }
                                if (c3 == p2  & c3 != p3) {
                                    punt = punt + 1;
                                }
                                if (c3 == p4  & c3 != p3) {
                                    punt = punt + 1;
                                }
                                if (c4 == p1  & c4 != p4) {
                                    punt = punt + 1;
                                }
                                if (c4 == p2  & c4 != p4) {
                                    punt = punt + 1;
                                }
                                if (c4 == p3  & c4 != p4) {
                                    punt = punt + 1;
                                }
                                i = i + 1;
                                System.out.println("En este intento, usted consiguio " + fam + " fama(s) y " + punt + " punto(s)");
                                fam= 0;
                                punt = 0;
                                System.out.println("Ingrese su intento numero " + i);
                                intento = leer.nextInt();
                                while (intento > 9999 | intento < 1000){
                                System.out.println("el numero debe estar en un intervalo entre 1000 y 9999, es decir, 4 cifras.");
                                System.out.println("ingrese de nuevo su intento numero " + i);
                                intento = leer.nextInt();
                                }
                                p1 = intento / 1000;
                                p2 = (intento / 100) % 10;
                                p3 = (intento / 10) % 10;
                                p4 = intento % 10;
                                while (p1 == p2 | p1 == p3 | p1 == p4 | p2 == p3 | p2 == p4 | p3 == p4) {
                                    System.out.println("El numero no puede tener digitos iguales");
                                    System.out.println("ingrese de nuevo su intento numero " + i);
                                    intento = leer.nextInt();
                                    p1 = intento / 1000;
                                    p2 = (intento / 100) % 10;
                                    p3 = (intento / 10) % 10;
                                    p4 = intento % 10;
                                }
                    
                            }
                            System.out.println("Lo consiguio!!, el numero que buscaba es " + num);
                            System.out.println("su numero de intentos fue " +i);   
                            break;
                        case 3:
                            System.out.println("triqui");
                            int c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, gan = 0; 
                            int b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0, b9 = 0, pos = 0, player = 1, b1 = 0, b2 = 0;
                            boolean g = false;
                            c1 = 0;
                            c2 = 0;
                            c3 = 0;
                            c4 = 0;
                            System.out.println("_____________");
                            System.out.println("| 1 | 2 | 3 |");
                            System.out.println("| 4 | 5 | 6 |");
                            System.out.println("| 7 | 8 | 9 |");
                            System.out.println("_____________");
                            while (g == false) {
                                System.out.println("jugador "+player);
                                System.out.println("ingrese una posición");
                                pos = leer.nextInt();
                                while (pos < 1 || pos > 9) { // validacion de posicion
                                    System.out.println("opción no válida");
                                    pos = leer.nextInt();
                                }
                                while (pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5 || pos == 6 || pos == 7 || pos == 8 || pos == 9) {
                                    if (pos == 1) {
                                        if (b1 == 0) {
                                            b1 = 1;
                                            if (player == 1){
                                                c1 = 1;
                                            } else {
                                                c1 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 2) {
                                        if (b2 == 0) {
                                            b2 = 1;
                                            if (player == 1){
                                                c2 = 1;
                                            } else {
                                                c2 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 3) {
                                        if (b3 == 0) {
                                            b3 = 1;
                                            if (player == 1){
                                                c3 = 1;
                                            } else {
                                                c3 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 4) {
                                        if (b4 == 0) {
                                            b4 = 1;
                                            if (player == 1){
                                                c4 = 1;
                                            } else {
                                                c4 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 5) {
                                        if (b5 == 0) {
                                            b5 = 1;
                                            if (player == 1){
                                                c5 = 1;
                                            } else {
                                                c5 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 6) {
                                        if (b6 == 0) {
                                            b6 = 1;
                                            if (player == 1){
                                                c6 = 1;
                                            } else {
                                                c6 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 7) {
                                        if (b7 == 0) {
                                            b7 = 1;
                                            if (player == 1){
                                                c7 = 1;
                                            } else {
                                                c7 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 8) {
                                        if (b8 == 0) {
                                            b8 = 1;
                                            if (player == 1){
                                                c8 = 1;
                                            } else {
                                                c8 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }
                                    if (pos == 9) {
                                        if (b9 == 0) {
                                            b9 = 1;
                                            if (player == 1){
                                                c9 = 1;
                                            } else {
                                                c9 = 2;
                                            }
                                            pos = 0;
                                        } else {
                                            System.out.println("posición ocupada");
                                            pos = leer.nextInt();
                                        }
                                    }   
                                }
                                System.out.println("_____________");
                                System.out.println("| " + c1 + " | " + c2 + " | " + c3 + " |");
                                System.out.println("| " + c4 + " | " + c5 + " | " + c6 + " |");
                                System.out.println("| " + c7 + " | " + c8 + " | " + c9 + " |");
                                System.out.println("_____________");     
                                if (player == 1) {
                                    player = 2;
                                } else {
                                    player = 1;
                                }
                                if (c1 == 1 && c2 == 1 && c3 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c4 == 1 && c5 == 1 && c6 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c7 == 1 && c8 == 1 && c9 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c1 == 1 && c4 == 1 && c7 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c2 == 1 && c5 == 1 && c8 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c3 == 1 && c6 == 1 && c9 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c1 == 1 && c5 == 1 && c9 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c3 == 1 && c5 == 1 && c7 == 1) {
                                    gan = 1;
                                    g = true;
                                }
                                if (c1 == 2 && c2 == 2 && c3 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c4 == 2 && c5 == 2 && c6 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c7 == 2 && c8 == 2 && c9 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c1 == 2 && c4 == 2 && c7 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c2 == 2 && c5 == 2 && c8 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c3 == 2 && c6 == 2 && c9 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c1 == 2 && c5 == 2 && c9 == 2) {
                                    gan = 2;
                                    g = true;
                                }
                                if (c3 == 2 && c5 == 2 && c7 == 2) {
                                    gan = 2;
                                    g = true;
                                } 
                                // determina el empate
                                if (b1 == 1 && b2 == 1 && b3 == 1 && b4 == 1 && b5 == 1 && b6 == 1 && b7 == 1 && b8 == 1 && b9 == 1 && gan == 0) {
                                    gan = 3;
                                    g = true;
                                }                      
                            }       
                            // se verifica si hay un ganador
                            if (g == true) {
                                switch (gan) {
                                    case 1:
                                        System.out.println("ganó jugador 1");
                                        break;
                                    case 2:
                                        System.out.println("ganó jugador 2");
                                        break;
                                    default:
                                        System.out.println("empate");
                                        break;
                                }
                            }       
                            break;
                        case 4:
                            opc = 0;
                    }
                    break;
                case 2:
                    System.out.println("1. multiplicacion rusa");
                    System.out.println("2. eliminar un digito");
                    System.out.println("3. funciones trigonometricas");
                    System.out.println("4. volver al menu principal");
                    System.out.println("ingrese una opcion");
                    opc1 = leer.nextInt();
                    while (opc1 < 1 || opc1 > 4) {
                        System.out.println("ingrese una opción valida");
                        opc1 = leer.nextInt();
                    }
                    switch (opc1) {
                        case 1:
                            System.out.println("Ingrese el multiplicador");
                            x1 = leer.nextInt();
                            x1i = x1;
                            while (x1 < 1) {
                                System.out.println("debe ser un numero mayor a 0");
                                System.out.println("Ingrese de nuevo el multiplicador");
                                x1 = leer.nextInt();
                                x1i = x1;
                            }
                            System.out.println("Ingrese el multiplicando");
                            x2 = leer.nextInt();
                            x2i = x2;
                            while (x2 < 1) {
                                System.out.println("debe ser un numero mayor a 0");
                                System.out.println("Ingrese de nuevo el multiplicando");
                                x2 = leer.nextInt();
                                x2i = x2;
                            }
                            while (x1+1 != 1) {
                                if (x1 % 2 == 1) {
                                    System.out.println("el numero "+x1+" junto a "+x2 + " cumple la regla de la multiplicacion rusa");
                                    tot = tot + x2;
                                }
                                x1 = x1 / 2;
                                x2 = x2 * 2;
                            }
                            System.out.println("La suma de los numeros que cumplen la multiplicacion rusa es " + tot + ", es decir, lo mismo que " + x1i + " x " + x2i + " = " + tot);
                            break;
                        case 2:
                            int num1, d, p, es = 0, pru, R, x;
                            System.out.println("digite el numero");
                            num1 = leer.nextInt();
                            while (num1 < 1000){
                                System.out.println("digite un numero valido");
                                num1 = leer.nextInt();
                            }
                            System.out.println("digite la cifra a eliminar");
                            d = leer.nextInt();
                            pru = num1;
                            // valida que la cifra a eliminar este en el numero
                            while (pru > 0 && es == 0){
                                p = pru % 10;
                                if (p == d){ es = 1; }
                                if (pru < 10 && pru != d){
                                    System.out.println("la cifra no esta en el numero");
                                    d = leer.nextInt();
                                    pru = num1;
                                }
                                pru = pru / 10;
                            }
                            x = num1;
                            p = 1;
                            R = 0;
                            while (x != 0){
                                es = x % 10;
                                if (es != d){
                                    R = R + es * p;
                                    p = p * 10;
                                }
                                x = x / 10;
                            }
                            System.out.println(R);
                            break;
                        case 3:
                            int k, j, i1, j1, k1;
                            long lim, sig, lim1, sig1;
                            double vx , seno, fac, pot, co, vx1, fac1, pot1, ta, cta;
                            System.out.println("1. seno");
                            System.out.println("2. coseno");
                            System.out.println("3. tangente");
                            System.out.println("4. cotangente");
                            System.out.println("5. secante");
                            System.out.println("6. cosecante");
                            System.out.println("digite una opcion");
                            k = leer.nextInt();
                            while (k < 1 || k > 6) {
                                System.out.println("ingrese una opción valida");
                                k = leer.nextInt();
                            }
                            switch (k) {
                                case 1:
                                    System.out.println("seno");
                                    System.out.println("Ingrese el valor de x");
                                    vx = leer.nextDouble();
                                    System.out.println("Ingrese el valor del limite");
                                    lim = leer.nextLong();
                                    seno = 0;
                                    for (i = 0; i <= lim; i++){
                                        sig = 1;
                                        for (k = 1; k <= i; k++) {
                                            sig = sig * -1;
                                        }
                                        fac = 1;
                                        pot =1;
                                        for (j = 1; j <= 2 * i + 1; j++) {
                                            fac = fac * j;
                                            pot = pot * vx;
                                        }
                                        seno =seno + sig * pot / fac;
                                    }
                                    System.out.println("El valor de seno de " + vx + " es " + seno);
                                    break;
                                case 2:
                                    System.out.println("coseno");
                                    System.out.println("digita x");
                                    vx1 = leer.nextDouble();
                                    System.out.println("digita limite");
                                    lim1 = leer.nextLong();
                                    co = 0;
                                    for (i1 = 0; i1 <= lim1; i1++){
                                        sig1 = 1;
                                        for (k1 = 1; k1 <= i1; k1++) {
                                            sig1 = sig1 * -1;
                                        }
                                        fac1 = 1;
                                        pot1 =1;
                                        for (j1 = 1; j1 <= 2 * i1; j1++) {
                                            fac1 = fac1 * j1;
                                            pot1 = pot1 * vx1;
                                        }
                                        co = co + sig1 * pot1 / fac1;
                                    }
                                    System.out.println("El valor de coseno de " + vx1 + " es " + co);
                                    break;
                                case 3:
                                    System.out.println("tangente");
                                    System.out.println("digita x");
                                    vx = leer.nextDouble();
                                    System.out.println("digita limite");
                                    lim = leer.nextLong();
                                    seno = 0;
                                    ta = 0;
                                    for (i = 0; i <= lim; i++){
                                        sig = 1;
                                        for (k = 1; k <= i; k++) {
                                            sig = sig * -1;
                                        }
                                        fac = 1;
                                        pot =1;
                                        for (j = 1; j <= 2 * i + 1; j++) {
                                            fac = fac * j;
                                            pot = pot * vx;
                                        }
                                        seno =seno + sig * pot / fac;
                                    }
                                    co = 0;
                                    for (i1 = 0; i1 <= lim; i1++){
                                        sig1 = 1;
                                        for (k1 = 1; k1 <= i1; k1++) {
                                            sig1 = sig1 * -1;
                                        }
                                        fac1 = 1;
                                        pot1 =1;
                                        for (j1 = 1; j1 <= 2 * i1; j1++) {
                                            fac1 = fac1 * j1;
                                            pot1 = pot1 * vx;
                                        }
                                        co = co + sig1 * pot1 / fac1;
                                    }
                                    ta = seno / co;
                                    System.out.println("El valor de tangente de " + vx + " es " + ta);
                                    break;
                                case 4:
                                    System.out.println("cotangente");
                                    System.out.println("digita x");
                                    vx = leer.nextDouble();
                                    System.out.println("digita limite");
                                    lim = leer.nextLong();
                                    seno = 0;
                                    cta = 0;
                                    for (i = 0; i <= lim; i++){
                                        sig = 1;
                                        for (k = 1; k <= i; k++) {
                                            sig = sig * -1;
                                        }
                                        fac = 1;
                                        pot =1;
                                        for (j = 1; j <= 2 * i + 1; j++) {
                                            fac = fac * j;
                                            pot = pot * vx;
                                        }
                                        seno =seno + sig * pot / fac;
                                    }
                                    co = 0;
                                    for (i1 = 0; i1 <= lim; i1++){
                                        sig1 = 1;
                                        for (k1 = 1; k1 <= i1; k1++) {
                                            sig1 = sig1 * -1;
                                        }
                                        fac1 = 1;
                                        pot1 =1;
                                        for (j1 = 1; j1 <= 2 * i1; j1++) {
                                            fac1 = fac1 * j1;
                                            pot1 = pot1 * vx;
                                        }
                                        co = co + sig1 * pot1 / fac1;
                                    }
                                    cta = co / seno;
                                    System.out.println("El valor de cotangente de " + vx + " es " + cta);
                                    break;
                                case 5:
                                    System.out.println("secante");
                                    System.out.println("digita x");
                                    vx = leer.nextDouble();
                                    System.out.println("digita limite");
                                    lim = leer.nextLong();
                                    seno = 0;
                                    co = 0;
                                    for (i = 0; i <= lim; i++){
                                        sig = 1;
                                        for (k = 1; k <= i; k++) {
                                            sig = sig * -1;
                                        }
                                        fac = 1;
                                        pot =1;
                                        for (j = 1; j <= 2 * i + 1; j++) {
                                            fac = fac * j;
                                            pot = pot * vx;
                                        }
                                        seno =seno + sig * pot / fac;
                                    }
                                    co = 1 / seno;
                                    
                                    System.out.println("El valor de secante de " + vx + " es " + co);
                                    break;
                                case 6:
                                    System.out.println("cosecante");
                                    System.out.println("digita x");
                                    vx = leer.nextDouble();
                                    System.out.println("digita limite");
                                    lim = leer.nextLong();
                                    seno = 0;
                                    co = 0;
                                    for (i = 0; i <= lim; i++){
                                        sig = 1;
                                        for (k = 1; k <= i; k++) {
                                            sig = sig * -1;
                                        }
                                        fac = 1;
                                        pot =1;
                                        for (j = 1; j <= 2 * i; j++) {
                                            fac = fac * j;
                                            pot = pot * vx;
                                        }
                                        seno =seno + sig * pot / fac;
                                    }
                                    co = 1 / seno;
                                    System.out.println("El valor de cosecante de " + vx + " es " + co);
                                    break;
                                }
                            break;   
                        case 4:
                            opc = 0;
                    }
            }
        } while (opc < 3);
        System.out.println("Gracias por usar el programa");
    }
}