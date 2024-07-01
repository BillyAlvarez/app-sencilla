package com.devops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World! desde nuestra app-sencilla :D" );

        List<String> palabras = Arrays.asList("Java", "Maven", "Lambda", "Stream");
        List<String> palabrasEnMayusculas = palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        palabrasEnMayusculas.forEach(System.out::println);

    }
}
