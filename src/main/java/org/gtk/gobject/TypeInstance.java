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
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeInstance";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("g_class")
        ).withName(C_TYPE_NAME);
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
    protected TypeInstance(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeInstance> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeInstance(input, ownership);
    
    public @Nullable java.lang.foreign.MemoryAddress getPrivate(org.gtk.glib.Type privateType) {
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
     * A {@link TypeInstance.Builder} object constructs a {@link TypeInstance} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeInstance.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeInstance struct;
        
        private Builder() {
            struct = TypeInstance.allocate();
        }
        
         /**
         * Finish building the {@link TypeInstance} struct.
         * @return A new instance of {@code TypeInstance} with the fields 
         *         that were set in the Builder object.
         */
        public TypeInstance build() {
            return struct;
        }
        
        public Builder setGClass(org.gtk.gobject.TypeClass gClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gClass == null ? MemoryAddress.NULL : gClass.handle()));
            return this;
        }
    }
}
