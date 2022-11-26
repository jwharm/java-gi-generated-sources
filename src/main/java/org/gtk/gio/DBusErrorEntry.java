package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct used in g_dbus_error_register_error_domain().
 * @version 2.26
 */
public class DBusErrorEntry extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusErrorEntry";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("error_code"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("dbus_error_name")
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
    
    /**
     * Allocate a new {@link DBusErrorEntry}
     * @return A new, uninitialized @{link DBusErrorEntry}
     */
    public static DBusErrorEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusErrorEntry newInstance = new DBusErrorEntry(segment.address(), Ownership.NONE);
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
    
    /**
     * Create a DBusErrorEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusErrorEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusErrorEntry struct;
        
         /**
         * A {@link DBusErrorEntry.Build} object constructs a {@link DBusErrorEntry} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusErrorEntry.allocate();
        }
        
         /**
         * Finish building the {@link DBusErrorEntry} struct.
         * @return A new instance of {@code DBusErrorEntry} with the fields 
         *         that were set in the Build object.
         */
        public DBusErrorEntry construct() {
            return struct;
        }
        
        /**
         * An error code.
         * @param error_code The value for the {@code error_code} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setErrorCode(int error_code) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), error_code);
            return this;
        }
        
        /**
         * The D-Bus error name to associate with {@code error_code}.
         * @param dbus_error_name The value for the {@code dbus_error_name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDbusErrorName(java.lang.String dbus_error_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbus_error_name == null ? MemoryAddress.NULL : Interop.allocateNativeString(dbus_error_name)));
            return this;
        }
    }
}
