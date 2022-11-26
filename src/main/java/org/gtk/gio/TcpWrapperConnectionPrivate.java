package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TcpWrapperConnectionPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTcpWrapperConnectionPrivate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TcpWrapperConnectionPrivate}
     * @return A new, uninitialized @{link TcpWrapperConnectionPrivate}
     */
    public static TcpWrapperConnectionPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TcpWrapperConnectionPrivate newInstance = new TcpWrapperConnectionPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TcpWrapperConnectionPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TcpWrapperConnectionPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TcpWrapperConnectionPrivate struct;
        
         /**
         * A {@link TcpWrapperConnectionPrivate.Build} object constructs a {@link TcpWrapperConnectionPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TcpWrapperConnectionPrivate.allocate();
        }
        
         /**
         * Finish building the {@link TcpWrapperConnectionPrivate} struct.
         * @return A new instance of {@code TcpWrapperConnectionPrivate} with the fields 
         *         that were set in the Build object.
         */
        public TcpWrapperConnectionPrivate construct() {
            return struct;
        }
    }
}
