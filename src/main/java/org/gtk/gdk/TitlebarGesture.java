package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TitlebarGesture extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public static final TitlebarGesture DOUBLE_CLICK = new TitlebarGesture(1);
    
    public static final TitlebarGesture RIGHT_CLICK = new TitlebarGesture(2);
    
    public static final TitlebarGesture MIDDLE_CLICK = new TitlebarGesture(3);
    
    public TitlebarGesture(int value) {
        super(value);
    }
}
