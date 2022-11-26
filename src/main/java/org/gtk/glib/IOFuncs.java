package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A table of functions used to handle different types of {@link IOChannel}
 * in a generic way.
 */
public class IOFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOFuncs";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("io_read"),
        Interop.valueLayout.ADDRESS.withName("io_write"),
        Interop.valueLayout.ADDRESS.withName("io_seek"),
        Interop.valueLayout.ADDRESS.withName("io_close"),
        Interop.valueLayout.ADDRESS.withName("io_create_watch"),
        Interop.valueLayout.ADDRESS.withName("io_free"),
        Interop.valueLayout.ADDRESS.withName("io_set_flags"),
        Interop.valueLayout.ADDRESS.withName("io_get_flags")
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
     * Allocate a new {@link IOFuncs}
     * @return A new, uninitialized @{link IOFuncs}
     */
    public static IOFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOFuncs newInstance = new IOFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IOFuncs struct;
        
         /**
         * A {@link IOFuncs.Build} object constructs a {@link IOFuncs} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IOFuncs.allocate();
        }
        
         /**
         * Finish building the {@link IOFuncs} struct.
         * @return A new instance of {@code IOFuncs} with the fields 
         *         that were set in the Build object.
         */
        public IOFuncs construct() {
            return struct;
        }
        
        public Build setIoRead(java.lang.foreign.MemoryAddress io_read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_read == null ? MemoryAddress.NULL : io_read));
            return this;
        }
        
        public Build setIoWrite(java.lang.foreign.MemoryAddress io_write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_write == null ? MemoryAddress.NULL : io_write));
            return this;
        }
        
        public Build setIoSeek(java.lang.foreign.MemoryAddress io_seek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_seek == null ? MemoryAddress.NULL : io_seek));
            return this;
        }
        
        public Build setIoClose(java.lang.foreign.MemoryAddress io_close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_close == null ? MemoryAddress.NULL : io_close));
            return this;
        }
        
        public Build setIoCreateWatch(java.lang.foreign.MemoryAddress io_create_watch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_create_watch == null ? MemoryAddress.NULL : io_create_watch));
            return this;
        }
        
        public Build setIoFree(java.lang.foreign.MemoryAddress io_free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_free == null ? MemoryAddress.NULL : io_free));
            return this;
        }
        
        public Build setIoSetFlags(java.lang.foreign.MemoryAddress io_set_flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_set_flags == null ? MemoryAddress.NULL : io_set_flags));
            return this;
        }
        
        public Build setIoGetFlags(java.lang.foreign.MemoryAddress io_get_flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (io_get_flags == null ? MemoryAddress.NULL : io_get_flags));
            return this;
        }
    }
}
