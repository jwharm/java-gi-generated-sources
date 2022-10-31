package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsDatabase}. Derived classes should implement the various
 * virtual methods. _async and _finish methods have a default
 * implementation that runs the corresponding sync method in a thread.
 * @version 2.30
 */
public class TlsDatabaseClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabaseClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("verify_chain"),
        Interop.valueLayout.ADDRESS.withName("verify_chain_async"),
        Interop.valueLayout.ADDRESS.withName("verify_chain_finish"),
        Interop.valueLayout.ADDRESS.withName("create_certificate_handle"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_finish"),
        MemoryLayout.paddingLayout(128),
        MemoryLayout.sequenceLayout(16, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TlsDatabaseClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsDatabaseClass newInstance = new TlsDatabaseClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public TlsDatabaseClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
