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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysMemoryAllocatorInterface newInstance = new PhysMemoryAllocatorInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GetPhysAddrCallback} callback.
     */
    @FunctionalInterface
    public interface GetPhysAddrCallback {
    
        long run(org.gstreamer.allocators.PhysMemoryAllocator allocator, org.gstreamer.gst.Memory mem);
        
        @ApiStatus.Internal default long upcall(MemoryAddress allocator, MemoryAddress mem) {
            var RESULT = run((org.gstreamer.allocators.PhysMemoryAllocator) Interop.register(allocator, org.gstreamer.allocators.PhysMemoryAllocator.fromAddress).marshal(allocator, null), org.gstreamer.gst.Memory.fromAddress.marshal(mem, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPhysAddrCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_phys_addr}
     * @param getPhysAddr The new value of the field {@code get_phys_addr}
     */
    public void setGetPhysAddr(GetPhysAddrCallback getPhysAddr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_phys_addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPhysAddr == null ? MemoryAddress.NULL : getPhysAddr.toCallback()));
        }
    }
    
    /**
     * Create a PhysMemoryAllocatorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysMemoryAllocatorInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysMemoryAllocatorInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysMemoryAllocatorInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
                return this;
            }
        }
        
        public Builder setGetPhysAddr(GetPhysAddrCallback getPhysAddr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_phys_addr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPhysAddr == null ? MemoryAddress.NULL : getPhysAddr.toCallback()));
                return this;
            }
        }
    }
}
