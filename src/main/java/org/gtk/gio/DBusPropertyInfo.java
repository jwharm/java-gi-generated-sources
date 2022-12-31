package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about a D-Bus property on a D-Bus interface.
 * @version 2.26
 */
public class DBusPropertyInfo extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusPropertyInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("signature"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("annotations")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusPropertyInfo}
     * @return A new, uninitialized @{link DBusPropertyInfo}
     */
    public static DBusPropertyInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusPropertyInfo newInstance = new DBusPropertyInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int getRefCount() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param refCount The new value of the field {@code ref_count}
     */
    public void setRefCount(int refCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
    }
    
    /**
     * Get the value of the field {@code signature}
     * @return The value of the field {@code signature}
     */
    public java.lang.String getSignature() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signature"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code signature}
     * @param signature The new value of the field {@code signature}
     */
    public void setSignature(java.lang.String signature) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signature"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signature == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(signature, null)));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gtk.gio.DBusPropertyInfoFlags getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.DBusPropertyInfoFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gtk.gio.DBusPropertyInfoFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Get the value of the field {@code annotations}
     * @return The value of the field {@code annotations}
     */
    public PointerProxy<org.gtk.gio.DBusAnnotationInfo> getAnnotations() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gtk.gio.DBusAnnotationInfo>(RESULT, org.gtk.gio.DBusAnnotationInfo.fromAddress);
    }
    
    /**
     * Change the value of the field {@code annotations}
     * @param annotations The new value of the field {@code annotations}
     */
    public void setAnnotations(org.gtk.gio.DBusAnnotationInfo[] annotations) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, org.gtk.gio.DBusAnnotationInfo.getMemoryLayout(), false)));
    }
    
    /**
     * Create a DBusPropertyInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusPropertyInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusPropertyInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusPropertyInfo(input, ownership);
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public org.gtk.gio.DBusPropertyInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_property_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusPropertyInfo.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_property_info_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_property_info_ref = Interop.downcallHandle(
            "g_dbus_property_info_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_property_info_unref = Interop.downcallHandle(
            "g_dbus_property_info_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link DBusPropertyInfo.Builder} object constructs a {@link DBusPropertyInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusPropertyInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusPropertyInfo struct;
        
        private Builder() {
            struct = DBusPropertyInfo.allocate();
        }
        
         /**
         * Finish building the {@link DBusPropertyInfo} struct.
         * @return A new instance of {@code DBusPropertyInfo} with the fields 
         *         that were set in the Builder object.
         */
        public DBusPropertyInfo build() {
            return struct;
        }
        
        /**
         * The reference count or -1 if statically allocated.
         * @param refCount The value for the {@code refCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefCount(int refCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
            return this;
        }
        
        /**
         * The name of the D-Bus property, e.g. "SupportedFilesystems".
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
            return this;
        }
        
        /**
         * The D-Bus signature of the property (a single complete type).
         * @param signature The value for the {@code signature} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignature(java.lang.String signature) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signature"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signature == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(signature, null)));
            return this;
        }
        
        /**
         * Access control flags for the property.
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gio.DBusPropertyInfoFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusAnnotationInfo} structures or {@code null} if there are no annotations.
         * @param annotations The value for the {@code annotations} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAnnotations(org.gtk.gio.DBusAnnotationInfo[] annotations) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, org.gtk.gio.DBusAnnotationInfo.getMemoryLayout(), false)));
            return this;
        }
    }
}
