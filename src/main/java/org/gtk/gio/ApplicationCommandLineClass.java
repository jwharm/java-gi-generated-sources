package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ApplicationCommandLineClass}-struct
 * contains private data only.
 * @version 2.28
 */
public class ApplicationCommandLineClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLineClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("print_literal"),
        Interop.valueLayout.ADDRESS.withName("printerr_literal"),
        Interop.valueLayout.ADDRESS.withName("get_stdin"),
        MemoryLayout.paddingLayout(448),
        MemoryLayout.sequenceLayout(11, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ApplicationCommandLineClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationCommandLineClass newInstance = new ApplicationCommandLineClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public ApplicationCommandLineClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
