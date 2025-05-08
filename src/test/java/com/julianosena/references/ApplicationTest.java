package com.julianosena.references;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    @Test
    void testGetGreeting() {
        Application app = new Application();
        assertEquals("Hello from References!", app.getGreeting());
    }
}