package net.minecraftforge.renamer.gradle.demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import mezz.jei.api.JeiPlugin;
import net.minecraftforge.srgutils.Mappings;

public class TestClass {
    public static void main(String[] args) throws IOException {
        System.out.println(TestClass.class.getName());
        Mappings.load(new ByteArrayInputStream("foo bar".getBytes(StandardCharsets.UTF_8)));
        System.out.println(JeiPlugin.class.getName());
    }

    private static void func_1234_() {
    }
}
