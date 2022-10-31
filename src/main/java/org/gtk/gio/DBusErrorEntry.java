package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct used in g_dbus_error_register_error_domain().
 * @version 2.26
 */
public class DBusErrorEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusErrorEntry";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("error_code"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("dbus_error_name")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DBusErrorEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusErrorEntry newInstance = new DBusErrorEntry(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code error_code}
     * @return The value of the field {@code error_code}
     */
    public int error_code$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code error_code}
     * @param error_code The new value of the field {@code error_code}
     */
    public void error_code$set(int error_code) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), error_code);
    }
    
    /**
     * Get the value of the field {@code dbus_error_name}
     * @return The value of the field {@code dbus_error_name}
     */
    public java.lang.String dbus_error_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code dbus_error_name}
     * @param dbus_error_name The new value of the field {@code dbus_error_name}
     */
    public void dbus_error_name$set(java.lang.String dbus_error_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(dbus_error_name));
    }
    
    @ApiStatus.Internal
    public DBusErrorEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
