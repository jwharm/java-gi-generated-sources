package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextTagPrivate extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextTagPrivate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TextTagPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextTagPrivate newInstance = new TextTagPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TextTagPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextTagPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
