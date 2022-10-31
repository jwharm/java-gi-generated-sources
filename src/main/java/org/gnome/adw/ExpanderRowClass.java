package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExpanderRowClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwExpanderRowClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.PreferencesRowClass.getMemoryLayout().withName("parent_class"),
        MemoryLayout.paddingLayout(192),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ExpanderRowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExpanderRowClass newInstance = new ExpanderRowClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gnome.adw.PreferencesRowClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gnome.adw.PreferencesRowClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ExpanderRowClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
