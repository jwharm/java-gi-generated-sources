package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about an annotation.
 * @version 2.26
 */
public class DBusAnnotationInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusAnnotationInfo";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("key"),
        Interop.valueLayout.ADDRESS.withName("value"),
        Interop.valueLayout.ADDRESS.withName("annotations")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DBusAnnotationInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusAnnotationInfo newInstance = new DBusAnnotationInfo(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int ref_count$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param ref_count The new value of the field {@code ref_count}
     */
    public void ref_count$set(int ref_count) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ref_count);
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public java.lang.String key$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void key$set(java.lang.String key) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(key));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public java.lang.String value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(java.lang.String value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(value));
    }
    
    @ApiStatus.Internal
    public DBusAnnotationInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public @NotNull org.gtk.gio.DBusAnnotationInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_annotation_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusAnnotationInfo(Refcounted.get(RESULT, true));
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
    public static @Nullable java.lang.String lookup(org.gtk.gio.DBusAnnotationInfo[] annotations, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_annotation_info_lookup.invokeExact(
                    (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, false)),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_annotation_info_ref = Interop.downcallHandle(
            "g_dbus_annotation_info_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_annotation_info_unref = Interop.downcallHandle(
            "g_dbus_annotation_info_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_annotation_info_lookup = Interop.downcallHandle(
            "g_dbus_annotation_info_lookup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
