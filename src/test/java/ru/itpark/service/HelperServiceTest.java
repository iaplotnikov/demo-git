package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperServiceTest {

    @Test
    void initials() {
        {
            HelperService service = new HelperService();
            String actual = service.initials("Vasyliy Petrov");
            String expected = "VP";
            assertEquals(expected, actual);
        }
        {
            HelperService service = new HelperService();
            String actual = service.initials("Vasyliy");
            String expected = "V";
            assertEquals(expected, actual);
        }



    }
}