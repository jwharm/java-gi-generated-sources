package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TypeValueTable} provides the functions required by the {@link Value}
 * implementation, to serve as a container for values of a type.
 */
public class TypeValueTable extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeValueTable";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("value_init"),
        Interop.valueLayout.ADDRESS.withName("value_free"),
        Interop.valueLayout.ADDRESS.withName("value_copy"),
        Interop.valueLayout.ADDRESS.withName("value_peek_pointer"),
        Interop.valueLayout.ADDRESS.withName("collect_format"),
        Interop.valueLayout.ADDRESS.withName("collect_value"),
        Interop.valueLayout.ADDRESS.withName("lcopy_format"),
        Interop.valueLayout.ADDRESS.withName("lcopy_value")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TypeValueTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeValueTable newInstance = new TypeValueTable(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code collect_format}
     * @return The value of the field {@code collect_format}
     */
    public java.lang.String collect_format$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code collect_format}
     * @param collect_format The new value of the field {@code collect_format}
     */
    public void collect_format$set(java.lang.String collect_format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(collect_format));
    }
    
    /**
     * Get the value of the field {@code lcopy_format}
     * @return The value of the field {@code lcopy_format}
     */
    public java.lang.String lcopy_format$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code lcopy_format}
     * @param lcopy_format The new value of the field {@code lcopy_format}
     */
    public void lcopy_format$set(java.lang.String lcopy_format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(lcopy_format));
    }
    
    @ApiStatus.Internal
    public TypeValueTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     * @param type a {@link Type}
     * @return location of the {@link TypeValueTable} associated with {@code type} or
     *     {@code null} if there is no {@link TypeValueTable} associated with {@code type}
     */
    public static @NotNull org.gtk.gobject.TypeValueTable peek(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_value_table_peek.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeValueTable(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
            "g_type_value_table_peek",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
