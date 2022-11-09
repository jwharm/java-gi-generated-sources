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
    
    private static final java.lang.String C_TYPE_NAME = "GMarkupParser";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("start_element"),
        Interop.valueLayout.ADDRESS.withName("end_element"),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.ADDRESS.withName("passthrough"),
        Interop.valueLayout.ADDRESS.withName("error")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MarkupParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MarkupParser newInstance = new MarkupParser(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MarkupParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MarkupParser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
