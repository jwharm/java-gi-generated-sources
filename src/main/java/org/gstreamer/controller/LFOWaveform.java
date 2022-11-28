package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The various waveform modes available.
 */
public class LFOWaveform extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstLFOWaveform";
    
    /**
     * sine waveform
     */
    public static final LFOWaveform SINE = new LFOWaveform(0);
    
    /**
     * square waveform
     */
    public static final LFOWaveform SQUARE = new LFOWaveform(1);
    
    /**
     * saw waveform
     */
    public static final LFOWaveform SAW = new LFOWaveform(2);
    
    /**
     * reverse saw waveform
     */
    public static final LFOWaveform REVERSE_SAW = new LFOWaveform(3);
    
    /**
     * triangle waveform
     */
    public static final LFOWaveform TRIANGLE = new LFOWaveform(4);
    
    public LFOWaveform(int value) {
        super(value);
    }
}
