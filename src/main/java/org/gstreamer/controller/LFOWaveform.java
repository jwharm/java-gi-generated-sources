package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The various waveform modes available.
 */
public enum LFOWaveform implements io.github.jwharm.javagi.Enumeration {
    /**
     * sine waveform
     */
    SINE(0),
    /**
     * square waveform
     */
    SQUARE(1),
    /**
     * saw waveform
     */
    SAW(2),
    /**
     * reverse saw waveform
     */
    REVERSE_SAW(3),
    /**
     * triangle waveform
     */
    TRIANGLE(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstLFOWaveform";
    
    private final int value;
    LFOWaveform(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static LFOWaveform of(int value) {
        return switch (value) {
            case 0 -> SINE;
            case 1 -> SQUARE;
            case 2 -> SAW;
            case 3 -> REVERSE_SAW;
            case 4 -> TRIANGLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
