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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("error_code"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("dbus_error_name")
        ).withName(C_TYPE_NAME);
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
    public int getErrorCode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code error_code}
     * @param errorCode The new value of the field {@code error_code}
     */
    public void setErrorCode(int errorCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), errorCode);
    }
    
    /**
     * Get the value of the field {@code dbus_error_name}
     * @return The value of the field {@code dbus_error_name}
     */
    public java.lang.String getDbusErrorName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code dbus_error_name}
     * @param dbusErrorName The new value of the field {@code dbus_error_name}
     */
    public void setDbusErrorName(java.lang.String dbusErrorName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusErrorName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(dbusErrorName, null)));
    }
    
    /**
     * Create a DBusErrorEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusErrorEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusErrorEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusErrorEntry(input, ownership);
    
    /**
     * A {@link DBusErrorEntry.Builder} object constructs a {@link DBusErrorEntry} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusErrorEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusErrorEntry struct;
        
        private Builder() {
            struct = DBusErrorEntry.allocate();
        }
        
         /**
         * Finish building the {@link DBusErrorEntry} struct.
         * @return A new instance of {@code DBusErrorEntry} with the fields 
         *         that were set in the Builder object.
         */
        public DBusErrorEntry build() {
            return struct;
        }
        
        /**
         * An error code.
         * @param errorCode The value for the {@code errorCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setErrorCode(int errorCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), errorCode);
            return this;
        }
        
        /**
         * The D-Bus error name to associate with {@code error_code}.
         * @param dbusErrorName The value for the {@code dbusErrorName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDbusErrorName(java.lang.String dbusErrorName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dbusErrorName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(dbusErrorName, null)));
            return this;
        }
    }
}
