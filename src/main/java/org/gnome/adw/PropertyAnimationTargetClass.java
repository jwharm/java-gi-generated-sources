package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PropertyAnimationTargetClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPropertyAnimationTargetClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PropertyAnimationTargetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PropertyAnimationTargetClass newInstance = new PropertyAnimationTargetClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public PropertyAnimationTargetClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
