package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SocketAddressEnumerator}.
 */
public class SocketAddressEnumeratorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddressEnumeratorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("next"),
        Interop.valueLayout.ADDRESS.withName("next_async"),
        Interop.valueLayout.ADDRESS.withName("next_finish")
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
     * Allocate a new {@link SocketAddressEnumeratorClass}
     * @return A new, uninitialized @{link SocketAddressEnumeratorClass}
     */
    public static SocketAddressEnumeratorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketAddressEnumeratorClass newInstance = new SocketAddressEnumeratorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SocketAddressEnumeratorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketAddressEnumeratorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SocketAddressEnumeratorClass struct;
        
         /**
         * A {@link SocketAddressEnumeratorClass.Build} object constructs a {@link SocketAddressEnumeratorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SocketAddressEnumeratorClass.allocate();
        }
        
         /**
         * Finish building the {@link SocketAddressEnumeratorClass} struct.
         * @return A new instance of {@code SocketAddressEnumeratorClass} with the fields 
         *         that were set in the Build object.
         */
        public SocketAddressEnumeratorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setNext(java.lang.foreign.MemoryAddress next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next));
            return this;
        }
        
        public Build setNextAsync(java.lang.foreign.MemoryAddress next_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next_async == null ? MemoryAddress.NULL : next_async));
            return this;
        }
        
        public Build setNextFinish(java.lang.foreign.MemoryAddress next_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next_finish == null ? MemoryAddress.NULL : next_finish));
            return this;
        }
    }
}
