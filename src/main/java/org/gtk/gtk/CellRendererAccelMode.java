package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The available modes for {@code Gtk.CellRendererAccel:accel-mode}.
 */
public class CellRendererAccelMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * GTK accelerators mode
     */
    public static final CellRendererAccelMode GTK = new CellRendererAccelMode(0);
    
    /**
     * Other accelerator mode
     */
    public static final CellRendererAccelMode OTHER = new CellRendererAccelMode(1);
    
    public CellRendererAccelMode(int value) {
        super(value);
    }
}
