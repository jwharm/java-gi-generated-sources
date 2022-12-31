package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Marker interface for allocators with physical address backed memory
 * @version 1.14
 */
public class PhysMemoryAllocatorInterface extends Struct {
    
    static {
        GstAllocators.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPhysMemoryAllocatorInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
            Interop.valueLayout.ADDRESS.withName("get_phys_addr")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PhysMemoryAllocatorInterface}
     * @return A new, uninitialized @{link PhysMemoryAllocatorInterface}
     */
    public static PhysMemoryAllocatorInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysMemoryAllocatorInterface newInstance = new PhysMemoryAllocatorInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface GetPhysAddrCallback {
        long run(org.gstreamer.allocators.PhysMemoryAllocator allocator, org.gstreamer.gst.Memory mem);

        @ApiStatus.Internal default long upcall(MemoryAddress allocator, MemoryAddress mem) {
            var RESULT = run((org.gstreamer.allocators.PhysMemoryAllocator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(allocator)), org.gstreamer.allocators.PhysMemoryAllocator.fromAddress).marshal(allocator, Ownership.NONE), org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPhysAddrCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_phys_addr}
     * @param getPhysAddr The new value of the field {@code get_phys_addr}
     */
    public void setGetPhysAddr(GetPhysAddrCallback getPhysAddr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_phys_addr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPhysAddr == null ? MemoryAddress.NULL : getPhysAddr.toCallback()));
    }
    
    /**
     * Create a PhysMemoryAllocatorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PhysMemoryAllocatorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysMemoryAllocatorInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PhysMemoryAllocatorInterface(input, ownership);
    
    /**
     * A {@link PhysMemoryAllocatorInterface.Builder} object constructs a {@link PhysMemoryAllocatorInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PhysMemoryAllocatorInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PhysMemoryAllocatorInterface struct;
        
        private Builder() {
            struct = PhysMemoryAllocatorInterface.allocate();
        }
        
         /**
         * Finish building the {@link PhysMemoryAllocatorInterface} struct.
         * @return A new instance of {@code PhysMemoryAllocatorInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PhysMemoryAllocatorInterface build() {
            return struct;
        }
        
        public Builder setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Builder setGetPhysAddr(GetPhysAddrCallback getPhysAddr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_phys_addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPhysAddr == null ? MemoryAddress.NULL : getPhysAddr.toCallback()));
            return this;
        }
    }
}
