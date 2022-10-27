package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Any of the fields in {@link MarkupParser} can be {@code null}, in which case they
 * will be ignored. Except for the {@code error} function, any of these callbacks
 * can set an error; in particular the {@link MarkupError#UNKNOWN_ELEMENT},
 * {@link MarkupError#UNKNOWN_ATTRIBUTE}, and {@link MarkupError#INVALID_CONTENT}
 * errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 */
public class MarkupParser extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("start_element"),
        Interop.valueLayout.ADDRESS.withName("end_element"),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.ADDRESS.withName("passthrough"),
        Interop.valueLayout.ADDRESS.withName("error")
    ).withName("GMarkupParser");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MarkupParser(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
