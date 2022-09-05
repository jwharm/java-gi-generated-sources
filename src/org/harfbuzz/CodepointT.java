package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding Unicode codepoints. Also
 * used to hold glyph IDs.
 */
public class CodepointT {

    private final int value;
    
    public CodepointT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}