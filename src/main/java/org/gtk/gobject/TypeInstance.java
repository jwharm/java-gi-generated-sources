package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all type instances.
 */
public class TypeInstance extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeInstance";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("g_class")
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
     * Allocate a new {@link TypeInstance}
     * @return A new, uninitialized @{link TypeInstance}
     */
    public static TypeInstance allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeInstance newInstance = new TypeInstance(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TypeInstance proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypeInstance(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getPrivate(@NotNull org.gtk.glib.Type privateType) {
        java.util.Objects.requireNonNull(privateType, "Parameter 'privateType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_instance_get_private.invokeExact(
                    handle(),
                    privateType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_instance_get_private = Interop.downcallHandle(
            "g_type_instance_get_private",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TypeInstance struct;
        
         /**
         * A {@link TypeInstance.Build} object constructs a {@link TypeInstance} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TypeInstance.allocate();
        }
        
         /**
         * Finish building the {@link TypeInstance} struct.
         * @return A new instance of {@code TypeInstance} with the fields 
         *         that were set in the Build object.
         */
        public TypeInstance construct() {
            return struct;
        }
        
        public Build setGClass(org.gtk.gobject.TypeClass gClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gClass == null ? MemoryAddress.NULL : gClass.handle()));
            return this;
        }
    }
}
