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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("enumerate"),
            Interop.valueLayout.ADDRESS.withName("introspect"),
            Interop.valueLayout.ADDRESS.withName("dispatch"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusSubtreeVTable}
     * @return A new, uninitialized @{link DBusSubtreeVTable}
     */
    public static DBusSubtreeVTable allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusSubtreeVTable newInstance = new DBusSubtreeVTable(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code enumerate}
     * @return The value of the field {@code enumerate}
     */
    public org.gtk.gio.DBusSubtreeEnumerateFunc getEnumerate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code enumerate}
     * @param enumerate The new value of the field {@code enumerate}
     */
    public void setEnumerate(org.gtk.gio.DBusSubtreeEnumerateFunc enumerate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerate == null ? MemoryAddress.NULL : (Addressable) enumerate.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code introspect}
     * @return The value of the field {@code introspect}
     */
    public org.gtk.gio.DBusSubtreeIntrospectFunc getIntrospect() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("introspect"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code introspect}
     * @param introspect The new value of the field {@code introspect}
     */
    public void setIntrospect(org.gtk.gio.DBusSubtreeIntrospectFunc introspect) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("introspect"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (introspect == null ? MemoryAddress.NULL : (Addressable) introspect.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code dispatch}
     * @return The value of the field {@code dispatch}
     */
    public org.gtk.gio.DBusSubtreeDispatchFunc getDispatch() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code dispatch}
     * @param dispatch The new value of the field {@code dispatch}
     */
    public void setDispatch(org.gtk.gio.DBusSubtreeDispatchFunc dispatch) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatch == null ? MemoryAddress.NULL : (Addressable) dispatch.toCallback()));
        }
    }
    
    /**
     * Create a DBusSubtreeVTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusSubtreeVTable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusSubtreeVTable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusSubtreeVTable(input);
    
    /**
     * A {@link DBusSubtreeVTable.Builder} object constructs a {@link DBusSubtreeVTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusSubtreeVTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusSubtreeVTable struct;
        
        private Builder() {
            struct = DBusSubtreeVTable.allocate();
        }
        
        /**
         * Finish building the {@link DBusSubtreeVTable} struct.
         * @return A new instance of {@code DBusSubtreeVTable} with the fields 
         *         that were set in the Builder object.
         */
        public DBusSubtreeVTable build() {
            return struct;
        }
        
        /**
         * Function for enumerating child nodes.
         * @param enumerate The value for the {@code enumerate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnumerate(org.gtk.gio.DBusSubtreeEnumerateFunc enumerate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerate == null ? MemoryAddress.NULL : (Addressable) enumerate.toCallback()));
                return this;
            }
        }
        
        /**
         * Function for introspecting a child node.
         * @param introspect The value for the {@code introspect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIntrospect(org.gtk.gio.DBusSubtreeIntrospectFunc introspect) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("introspect"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (introspect == null ? MemoryAddress.NULL : (Addressable) introspect.toCallback()));
                return this;
            }
        }
        
        /**
         * Function for dispatching a remote call on a child node.
         * @param dispatch The value for the {@code dispatch} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDispatch(org.gtk.gio.DBusSubtreeDispatchFunc dispatch) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatch == null ? MemoryAddress.NULL : (Addressable) dispatch.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
