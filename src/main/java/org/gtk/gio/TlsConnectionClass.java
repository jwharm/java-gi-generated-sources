package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the {@link TlsConnection} type.
 * @version 2.28
 */
public class TlsConnectionClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsConnectionClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.IOStreamClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("accept_certificate"),
        Interop.valueLayout.ADDRESS.withName("handshake"),
        Interop.valueLayout.ADDRESS.withName("handshake_async"),
        Interop.valueLayout.ADDRESS.withName("handshake_finish"),
        Interop.valueLayout.ADDRESS.withName("get_binding_data"),
        Interop.valueLayout.ADDRESS.withName("get_negotiated_protocol"),
        MemoryLayout.paddingLayout(320),
        MemoryLayout.sequenceLayout(6, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TlsConnectionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsConnectionClass newInstance = new TlsConnectionClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.IOStreamClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gio.IOStreamClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public TlsConnectionClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
