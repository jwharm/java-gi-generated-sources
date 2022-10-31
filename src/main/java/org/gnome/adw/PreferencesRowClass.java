package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PreferencesRowClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesRowClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.ListBoxRowClass.getMemoryLayout().withName("parent_class"),
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
    
    public static PreferencesRowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PreferencesRowClass newInstance = new PreferencesRowClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.ListBoxRowClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.ListBoxRowClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public PreferencesRowClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
