package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import triangulo.Triangulo;

public class TrianguloTest {


    private Triangulo triangulo;

    @BeforeEach
    void setTriangulo(){
        triangulo = new Triangulo();
    }

    @Test
    void testVerificaSeEquilatero(){
        // GIVEN
        int A = 3;
        int B = 3;
        int C = 3;

        //WHEN
        String equilatero = triangulo.verificaTriangulo(A,B,C);
        String esperado = "O triangulo eh equilatero";

        //THEN
        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeIsoceles(){
        // GIVEN
        int A = 2;
        int B = 3;
        int C = 2;

        //WHEN
        String equilatero = triangulo.verificaTriangulo(A,B,C);
        String esperado = "O triangulo eh isosceles";

        //THEN
        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeNaoETriangulo(){
        // GIVEN
        int A = 1;
        int B = 2;
        int C = 3;

        //WHEN
        String equilatero = triangulo.verificaTriangulo(A,B,C);

        //THEN
        String esperado = "Nao eh um triangulo";

        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeNaoEEscaleno(){
        // GIVEN
        int A = 7;
        int B = 11;
        int C = 9;

        //WHEN
        String equilatero = triangulo.verificaTriangulo(A,B,C);

        String esperado = "O triangulo eh escaleno";

        //THEN
        assertEquals(esperado,equilatero);
    }
}