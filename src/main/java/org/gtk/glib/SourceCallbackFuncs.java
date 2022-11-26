package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceCallbackFuncs} struct contains
 * functions for managing callback objects.
 */
public class SourceCallbackFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceCallbackFuncs";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("ref"),
        Interop.valueLayout.ADDRESS.withName("unref"),
        Interop.valueLayout.ADDRESS.withName("get")
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
     * Allocate a new {@link SourceCallbackFuncs}
     * @return A new, uninitialized @{link SourceCallbackFuncs}
     */
    public static SourceCallbackFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceCallbackFuncs newInstance = new SourceCallbackFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SourceCallbackFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SourceCallbackFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SourceCallbackFuncs struct;
        
         /**
         * A {@link SourceCallbackFuncs.Build} object constructs a {@link SourceCallbackFuncs} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SourceCallbackFuncs.allocate();
        }
        
         /**
         * Finish building the {@link SourceCallbackFuncs} struct.
         * @return A new instance of {@code SourceCallbackFuncs} with the fields 
         *         that were set in the Build object.
         */
        public SourceCallbackFuncs construct() {
            return struct;
        }
        
        public Build setRef(java.lang.foreign.MemoryAddress ref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref == null ? MemoryAddress.NULL : ref));
            return this;
        }
        
        public Build setUnref(java.lang.foreign.MemoryAddress unref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unref == null ? MemoryAddress.NULL : unref));
            return this;
        }
        
        public Build setGet(java.lang.foreign.MemoryAddress get) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get == null ? MemoryAddress.NULL : get));
            return this;
        }
    }
}
