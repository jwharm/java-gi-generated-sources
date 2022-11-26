package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 * @version 2.26
 */
public class DBusSubtreeVTable extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusSubtreeVTable";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("enumerate"),
        Interop.valueLayout.ADDRESS.withName("introspect"),
        Interop.valueLayout.ADDRESS.withName("dispatch"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link DBusSubtreeVTable}
     * @return A new, uninitialized @{link DBusSubtreeVTable}
     */
    public static DBusSubtreeVTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusSubtreeVTable newInstance = new DBusSubtreeVTable(segment.address(), Ownership.NONE);
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
    
    /**
     * Create a DBusSubtreeVTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusSubtreeVTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusSubtreeVTable struct;
        
         /**
         * A {@link DBusSubtreeVTable.Build} object constructs a {@link DBusSubtreeVTable} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusSubtreeVTable.allocate();
        }
        
         /**
         * Finish building the {@link DBusSubtreeVTable} struct.
         * @return A new instance of {@code DBusSubtreeVTable} with the fields 
         *         that were set in the Build object.
         */
        public DBusSubtreeVTable construct() {
            return struct;
        }
        
        /**
         * Function for enumerating child nodes.
         * @param enumerate The value for the {@code enumerate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnumerate(java.lang.foreign.MemoryAddress enumerate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate == null ? MemoryAddress.NULL : enumerate));
            return this;
        }
        
        /**
         * Function for introspecting a child node.
         * @param introspect The value for the {@code introspect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIntrospect(java.lang.foreign.MemoryAddress introspect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("introspect"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (introspect == null ? MemoryAddress.NULL : introspect));
            return this;
        }
        
        /**
         * Function for dispatching a remote call on a child node.
         * @param dispatch The value for the {@code dispatch} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDispatch(java.lang.foreign.MemoryAddress dispatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
