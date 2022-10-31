package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ResolverClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GResolverClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("reload"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_service"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_records"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ResolverClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ResolverClass newInstance = new ResolverClass(Refcounted.get(segment.address()));
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
    public ResolverClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
