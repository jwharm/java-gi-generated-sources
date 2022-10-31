package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 * @version 2.26
 */
public class DBusSubtreeVTable extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusSubtreeVTable";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("enumerate"),
        Interop.valueLayout.ADDRESS.withName("introspect"),
        Interop.valueLayout.ADDRESS.withName("dispatch"),
        MemoryLayout.paddingLayout(320),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DBusSubtreeVTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusSubtreeVTable newInstance = new DBusSubtreeVTable(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code enumerate}
     * @return The value of the field {@code enumerate}
     */
    public org.gtk.gio.DBusSubtreeEnumerateFunc enumerate$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code introspect}
     * @return The value of the field {@code introspect}
     */
    public org.gtk.gio.DBusSubtreeIntrospectFunc introspect$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("introspect"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code dispatch}
     * @return The value of the field {@code dispatch}
     */
    public org.gtk.gio.DBusSubtreeDispatchFunc dispatch$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    @ApiStatus.Internal
    public DBusSubtreeVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
