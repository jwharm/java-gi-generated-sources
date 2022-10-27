package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a location in a file or other source of data parsed
 * by the CSS engine.
 * <p>
 * The {@code bytes} and {@code line_bytes} offsets are meant to be used to
 * programmatically match data. The {@code lines} and {@code line_chars} offsets
 * can be used for printing the location in a file.
 * <p>
 * Note that the {@code lines} parameter starts from 0 and is increased
 * whenever a CSS line break is encountered. (CSS defines the C character
 * sequences "\\r\\n", "\\r", "\\n" and "\\f" as newlines.)
 * If your document uses different rules for line breaking, you might want
 * run into problems here.
 */
public class CssLocation extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bytes"),
        ValueLayout.JAVA_LONG.withName("chars"),
        ValueLayout.JAVA_LONG.withName("lines"),
        ValueLayout.JAVA_LONG.withName("line_bytes"),
        ValueLayout.JAVA_LONG.withName("line_chars")
    ).withName("GtkCssLocation");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public CssLocation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
