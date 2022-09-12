package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for tag identifiers. Tags are four
 * byte integers, each byte representing a character.
 * 
 * Tags are used to identify tables, design-variation axes,
 * scripts, languages, font features, and baselines with
 * human-readable names.
 */
public class TagT {

    private final int value;
    
    public TagT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
