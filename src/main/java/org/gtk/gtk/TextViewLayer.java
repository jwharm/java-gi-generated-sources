package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to reference the layers of {@code GtkTextView} for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public class TextViewLayer extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The layer rendered below the text (but above the background).
     */
    public static final TextViewLayer BELOW_TEXT = new TextViewLayer(0);
    
    /**
     * The layer rendered above the text.
     */
    public static final TextViewLayer ABOVE_TEXT = new TextViewLayer(1);
    
    public TextViewLayer(int value) {
        super(value);
    }
}
