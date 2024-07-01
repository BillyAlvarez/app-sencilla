package com.devops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppTest {
    @Test
    public void testPalabrasEnMayusculas() {
        List<String> palabras = Arrays.asList("Java", "Maven", "Lambda", "Stream");
        List<String> palabrasEnMayusculas = palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        assertTrue(palabrasEnMayusculas.contains("JAVA"));
        assertTrue(palabrasEnMayusculas.contains("MAVEN"));
    }
}
