package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DataStreamNewlineType} is used when checking for or setting the line endings for a given file.
 */
public class DataStreamNewlineType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    public static final DataStreamNewlineType LF = new DataStreamNewlineType(0);
    
    /**
     * Selects "CR" line endings.
     */
    public static final DataStreamNewlineType CR = new DataStreamNewlineType(1);
    
    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    public static final DataStreamNewlineType CR_LF = new DataStreamNewlineType(2);
    
    /**
     * Automatically try to handle any line ending type.
     */
    public static final DataStreamNewlineType ANY = new DataStreamNewlineType(3);
    
    public DataStreamNewlineType(int value) {
        super(value);
    }
}
