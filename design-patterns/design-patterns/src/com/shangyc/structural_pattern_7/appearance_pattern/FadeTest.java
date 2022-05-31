package com.shangyc.structural_pattern_7.appearance_pattern;

public class FadeTest {

    public static void main(String[] args) {
        Fade fade = new Fade(new ClassOne(),new ClassTwo(),new ClassThree());
        fade.runMehod1();
        fade.runMehod2();
    }
}
