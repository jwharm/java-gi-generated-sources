package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Parameters to control the allocation of memory
 */
public class AllocationParams extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocationParams";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("align"),
        Interop.valueLayout.C_LONG.withName("prefix"),
        Interop.valueLayout.C_LONG.withName("padding"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AllocationParams}
     * @return A new, uninitialized @{link AllocationParams}
     */
    public static AllocationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AllocationParams newInstance = new AllocationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.gst.MemoryFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MemoryFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.gst.MemoryFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code align}
     * @return The value of the field {@code align}
     */
    public long align$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("align"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code align}
     * @param align The new value of the field {@code align}
     */
    public void align$set(long align) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("align"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), align);
    }
    
    /**
     * Get the value of the field {@code prefix}
     * @return The value of the field {@code prefix}
     */
    public long prefix$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code prefix}
     * @param prefix The new value of the field {@code prefix}
     */
    public void prefix$set(long prefix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), prefix);
    }
    
    /**
     * Get the value of the field {@code padding}
     * @return The value of the field {@code padding}
     */
    public long padding$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code padding}
     * @param padding The new value of the field {@code padding}
     */
    public void padding$set(long padding) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), padding);
    }
    
    /**
     * Create a AllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_allocation_params_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link AllocationParams} on the heap.  This function is for
     * use in GStreamer language bindings.  In your own code, you can just
     * declare a {@link AllocationParams} on the stack or in a struct, and
     * call gst_allocation_params_init() to initialize it.
     * <p>
     * You do not need to call gst_allocation_params_init() on the instance
     * returned by this function.
     */
    public AllocationParams() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Create a copy of {@code params}.
     * @return a new {@link AllocationParams}.
     */
    public @Nullable org.gstreamer.gst.AllocationParams copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_allocation_params_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.AllocationParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Free {@code params}
     */
    public void free() {
        try {
            DowncallHandles.gst_allocation_params_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Initialize {@code params} to its default values
     */
    public void init() {
        try {
            DowncallHandles.gst_allocation_params_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_allocation_params_new = Interop.downcallHandle(
            "gst_allocation_params_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocation_params_copy = Interop.downcallHandle(
            "gst_allocation_params_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocation_params_free = Interop.downcallHandle(
            "gst_allocation_params_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocation_params_init = Interop.downcallHandle(
            "gst_allocation_params_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AllocationParams struct;
        
         /**
         * A {@link AllocationParams.Build} object constructs a {@link AllocationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link AllocationParams} struct.
         * @return A new instance of {@code AllocationParams} with the fields 
         *         that were set in the Build object.
         */
        public AllocationParams construct() {
            return struct;
        }
        
        /**
         * flags to control allocation
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.gst.MemoryFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the desired alignment of the memory
         * @param align The value for the {@code align} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlign(long align) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("align"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), align);
            return this;
        }
        
        /**
         * the desired prefix
         * @param prefix The value for the {@code prefix} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrefix(long prefix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), prefix);
            return this;
        }
        
        /**
         * the desired padding
         * @param padding The value for the {@code padding} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPadding(long padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), padding);
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
