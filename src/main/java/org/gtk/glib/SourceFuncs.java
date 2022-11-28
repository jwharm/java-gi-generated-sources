package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceFuncs} struct contains a table of
 * functions used to handle event sources in a generic manner.
 * <p>
 * For idle sources, the prepare and check functions always return {@code true}
 * to indicate that the source is always ready to be processed. The prepare
 * function also returns a timeout value of 0 to ensure that the poll() call
 * doesn't block (since that would be time wasted which could have been spent
 * running the idle function).
 * <p>
 * For timeout sources, the prepare and check functions both return {@code true}
 * if the timeout interval has expired. The prepare function also returns
 * a timeout value to ensure that the poll() call doesn't block too long
 * and miss the next timeout.
 * <p>
 * For file descriptor sources, the prepare function typically returns {@code false},
 * since it must wait until poll() has been called before it knows whether
 * any events need to be processed. It sets the returned timeout to -1 to
 * indicate that it doesn't mind how long the poll() call blocks. In the
 * check function, it tests the results of the poll() call to see if the
 * required condition has been met, and returns {@code true} if so.
 */
public class SourceFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceFuncs";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("prepare"),
        Interop.valueLayout.ADDRESS.withName("check"),
        Interop.valueLayout.ADDRESS.withName("dispatch"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("closure_callback"),
        Interop.valueLayout.ADDRESS.withName("closure_marshal")
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
     * Allocate a new {@link SourceFuncs}
     * @return A new, uninitialized @{link SourceFuncs}
     */
    public static SourceFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceFuncs newInstance = new SourceFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SourceFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SourceFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SourceFuncs struct;
        
         /**
         * A {@link SourceFuncs.Build} object constructs a {@link SourceFuncs} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SourceFuncs.allocate();
        }
        
         /**
         * Finish building the {@link SourceFuncs} struct.
         * @return A new instance of {@code SourceFuncs} with the fields 
         *         that were set in the Build object.
         */
        public SourceFuncs construct() {
            return struct;
        }
        
        public Build setPrepare(java.lang.foreign.MemoryAddress prepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare));
            return this;
        }
        
        public Build setCheck(java.lang.foreign.MemoryAddress check) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (check == null ? MemoryAddress.NULL : check));
            return this;
        }
        
        public Build setDispatch(java.lang.foreign.MemoryAddress dispatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch));
            return this;
        }
        
        public Build setFinalize(java.lang.foreign.MemoryAddress finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize));
            return this;
        }
        
        public Build setClosureCallback(java.lang.foreign.MemoryAddress closureCallback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closure_callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closureCallback == null ? MemoryAddress.NULL : closureCallback));
            return this;
        }
        
        public Build setClosureMarshal(java.lang.foreign.MemoryAddress closureMarshal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closure_marshal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closureMarshal == null ? MemoryAddress.NULL : closureMarshal));
            return this;
        }
    }
}
