package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoGlyph` represents a single glyph in the output form of a string.
 */
public class Glyph {

    private final int value;
    
    public Glyph(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}