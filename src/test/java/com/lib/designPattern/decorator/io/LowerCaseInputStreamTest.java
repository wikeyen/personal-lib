package com.lib.designPattern.decorator.io;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowerCaseInputStreamTest {
    @Test
    void should_convert_input_to_lower_case() {
        int c;
        StringBuilder sb = new StringBuilder();
        String uri = this.getClass().getResource("/").getPath() + "/data/input.txt";

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(uri)))) {
            while ((c = in.read()) >= 0) {
                sb.append((char) c);
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("i know the decorator pattern therefore i rule!", sb.toString());
    }
}