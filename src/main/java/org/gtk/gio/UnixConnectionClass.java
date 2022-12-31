package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class UnixConnectionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixConnectionClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketConnectionClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link UnixConnectionClass}
     * @return A new, uninitialized @{link UnixConnectionClass}
     */
    public static UnixConnectionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnixConnectionClass newInstance = new UnixConnectionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.SocketConnectionClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.SocketConnectionClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.SocketConnectionClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Create a UnixConnectionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected UnixConnectionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixConnectionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new UnixConnectionClass(input, ownership);
    
    /**
     * A {@link UnixConnectionClass.Builder} object constructs a {@link UnixConnectionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link UnixConnectionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final UnixConnectionClass struct;
        
        private Builder() {
            struct = UnixConnectionClass.allocate();
        }
        
         /**
         * Finish building the {@link UnixConnectionClass} struct.
         * @return A new instance of {@code UnixConnectionClass} with the fields 
         *         that were set in the Builder object.
         */
        public UnixConnectionClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gio.SocketConnectionClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
    }
}
