package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HeaderBarClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwHeaderBarClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class")
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
    
    public static HeaderBarClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HeaderBarClass newInstance = new HeaderBarClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a HeaderBarClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public HeaderBarClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}