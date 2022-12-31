package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about an annotation.
 * @version 2.26
 */
public class DBusAnnotationInfo extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusAnnotationInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("key"),
            Interop.valueLayout.ADDRESS.withName("value"),
            Interop.valueLayout.ADDRESS.withName("annotations")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusAnnotationInfo}
     * @return A new, uninitialized @{link DBusAnnotationInfo}
     */
    public static DBusAnnotationInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusAnnotationInfo newInstance = new DBusAnnotationInfo(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public java.lang.String getKey() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void setKey(java.lang.String key) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public java.lang.String getValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(java.lang.String value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
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
     * Create a DBusAnnotationInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusAnnotationInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusAnnotationInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusAnnotationInfo(input, ownership);
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public org.gtk.gio.DBusAnnotationInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_annotation_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusAnnotationInfo.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_annotation_info_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the value of an annotation.
     * <p>
     * The cost of this function is O(n) in number of annotations.
     * @param annotations A {@code null}-terminated array of annotations or {@code null}.
     * @param name The name of the annotation to look up.
     * @return The value or {@code null} if not found. Do not free, it is owned by {@code annotations}.
     */
    public static @Nullable java.lang.String lookup(@Nullable org.gtk.gio.DBusAnnotationInfo[] annotations, java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_annotation_info_lookup.invokeExact(
                    (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, org.gtk.gio.DBusAnnotationInfo.getMemoryLayout(), false)),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_annotation_info_ref = Interop.downcallHandle(
            "g_dbus_annotation_info_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_annotation_info_unref = Interop.downcallHandle(
            "g_dbus_annotation_info_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_annotation_info_lookup = Interop.downcallHandle(
            "g_dbus_annotation_info_lookup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link DBusAnnotationInfo.Builder} object constructs a {@link DBusAnnotationInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusAnnotationInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusAnnotationInfo struct;
        
        private Builder() {
            struct = DBusAnnotationInfo.allocate();
        }
        
         /**
         * Finish building the {@link DBusAnnotationInfo} struct.
         * @return A new instance of {@code DBusAnnotationInfo} with the fields 
         *         that were set in the Builder object.
         */
        public DBusAnnotationInfo build() {
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
         * The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKey(java.lang.String key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
            return this;
        }
        
        /**
         * The value of the annotation.
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(java.lang.String value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
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
