package com.example.futuro;

import java.io.PrintStream;

public class futuro
{
    private static String veredicto(String valor1, String valor2)
    {
        String msg;

        if (valor1.equals(valor2))
        {
            msg = "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }

        else if (Integer.parseInt(valor1) < Integer.parseInt(valor2))
        {
            msg = "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }

        else
        {
            msg = "Ideal. Trabajas los contenidos en casa.";
        }

        return msg;
    }

    public static void main(String[] args)
    {
        System.out.printf("Estudiante %s:\n- Módulos registrados: %s\n- Horas: %s", args[0], args[1], veredicto(args[2], "1"));
    }
}
