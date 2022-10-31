package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * {@link SymbolicPaintable#snapshotSymbolic}.
 * <p>
 * More values may be added over time.
 * @version 4.6
 */
public class SymbolicColor extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkSymbolicColor";
    
    /**
     * The default foreground color
     */
    public static final SymbolicColor FOREGROUND = new SymbolicColor(0);
    
    /**
     * Indication color for errors
     */
    public static final SymbolicColor ERROR = new SymbolicColor(1);
    
    /**
     * Indication color for warnings
     */
    public static final SymbolicColor WARNING = new SymbolicColor(2);
    
    /**
     * Indication color for success
     */
    public static final SymbolicColor SUCCESS = new SymbolicColor(3);
    
    public SymbolicColor(int value) {
        super(value);
    }
}
