package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Return values from {@code GLogWriterFuncs} to indicate whether the given log entry
 * was successfully handled by the writer, or whether there was an error in
 * handling it (and hence a fallback writer should be used).
 * <p>
 * If a {@link LogWriterFunc} ignores a log entry, it should return
 * {@link LogWriterOutput#HANDLED}.
 * @version 2.50
 */
public class LogWriterOutput extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Log writer has handled the log entry.
     */
    public static final LogWriterOutput HANDLED = new LogWriterOutput(1);
    
    /**
     * Log writer could not handle the log entry.
     */
    public static final LogWriterOutput UNHANDLED = new LogWriterOutput(0);
    
    public LogWriterOutput(int value) {
        super(value);
    }
}
