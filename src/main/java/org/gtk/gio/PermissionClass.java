package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PermissionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPermissionClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("acquire"),
        Interop.valueLayout.ADDRESS.withName("acquire_async"),
        Interop.valueLayout.ADDRESS.withName("acquire_finish"),
        Interop.valueLayout.ADDRESS.withName("release"),
        Interop.valueLayout.ADDRESS.withName("release_async"),
        Interop.valueLayout.ADDRESS.withName("release_finish"),
        MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("reserved")
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
     * Allocate a new {@link PermissionClass}
     * @return A new, uninitialized @{link PermissionClass}
     */
    public static PermissionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PermissionClass newInstance = new PermissionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PermissionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PermissionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PermissionClass struct;
        
         /**
         * A {@link PermissionClass.Build} object constructs a {@link PermissionClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PermissionClass.allocate();
        }
        
         /**
         * Finish building the {@link PermissionClass} struct.
         * @return A new instance of {@code PermissionClass} with the fields 
         *         that were set in the Build object.
         */
        public PermissionClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setAcquire(java.lang.foreign.MemoryAddress acquire) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire));
            return this;
        }
        
        public Build setAcquireAsync(java.lang.foreign.MemoryAddress acquireAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireAsync == null ? MemoryAddress.NULL : acquireAsync));
            return this;
        }
        
        public Build setAcquireFinish(java.lang.foreign.MemoryAddress acquireFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireFinish == null ? MemoryAddress.NULL : acquireFinish));
            return this;
        }
        
        public Build setRelease(java.lang.foreign.MemoryAddress release) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release));
            return this;
        }
        
        public Build setReleaseAsync(java.lang.foreign.MemoryAddress releaseAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseAsync == null ? MemoryAddress.NULL : releaseAsync));
            return this;
        }
        
        public Build setReleaseFinish(java.lang.foreign.MemoryAddress releaseFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseFinish == null ? MemoryAddress.NULL : releaseFinish));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reserved, false)));
            return this;
        }
    }
}
