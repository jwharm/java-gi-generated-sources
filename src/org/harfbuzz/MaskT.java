package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for bitmasks.
 */
public class MaskT {

    private final int value;
    
    public MaskT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
