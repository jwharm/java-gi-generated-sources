package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
    
    public static int[] getValues(CodepointT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
