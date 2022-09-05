package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding color values. Colors are eight bits per
 * channel RGB plus alpha transparency.
 */
public class ColorT {

    private final int value;
    
    public ColorT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
