package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual function table for {@link Application}.
 * @version 2.28
 */
public class ApplicationClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("startup"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("command_line"),
        Interop.valueLayout.ADDRESS.withName("local_command_line"),
        Interop.valueLayout.ADDRESS.withName("before_emit"),
        Interop.valueLayout.ADDRESS.withName("after_emit"),
        Interop.valueLayout.ADDRESS.withName("add_platform_data"),
        Interop.valueLayout.ADDRESS.withName("quit_mainloop"),
        Interop.valueLayout.ADDRESS.withName("run_mainloop"),
        Interop.valueLayout.ADDRESS.withName("shutdown"),
        Interop.valueLayout.ADDRESS.withName("dbus_register"),
        Interop.valueLayout.ADDRESS.withName("dbus_unregister"),
        Interop.valueLayout.ADDRESS.withName("handle_local_options"),
        Interop.valueLayout.ADDRESS.withName("name_lost"),
        MemoryLayout.paddingLayout(320),
        MemoryLayout.sequenceLayout(7, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ApplicationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationClass newInstance = new ApplicationClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public ApplicationClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
