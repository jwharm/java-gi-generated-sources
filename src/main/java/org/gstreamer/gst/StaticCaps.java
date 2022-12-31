package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data structure to initialize {@link Caps} from a string description usually
 * used in conjunction with GST_STATIC_CAPS() and gst_static_caps_get() to
 * instantiate a {@link Caps}.
 */
public class StaticCaps extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStaticCaps";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("caps"),
            Interop.valueLayout.ADDRESS.withName("string"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link StaticCaps}
     * @return A new, uninitialized @{link StaticCaps}
     */
    public static StaticCaps allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StaticCaps newInstance = new StaticCaps(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code caps}
     * @return The value of the field {@code caps}
     */
    public org.gstreamer.gst.Caps getCaps() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code caps}
     * @param caps The new value of the field {@code caps}
     */
    public void setCaps(org.gstreamer.gst.Caps caps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
    }
    
    /**
     * Get the value of the field {@code string}
     * @return The value of the field {@code string}
     */
    public java.lang.String getString() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("string"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code string}
     * @param string The new value of the field {@code string}
     */
    public void setString(java.lang.String string) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, null)));
    }
    
    /**
     * Create a StaticCaps proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected StaticCaps(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StaticCaps> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StaticCaps(input, ownership);
    
    /**
     * Cleans up the cached caps contained in {@code static_caps}.
     */
    public void cleanup() {
        try {
            DowncallHandles.gst_static_caps_cleanup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link StaticCaps} to a {@link Caps}.
     * @return a pointer to the {@link Caps}. Since the
     *     core holds an additional ref to the returned caps, use
     *     gst_caps_make_writable() on the returned caps to modify it.
     */
    public @Nullable org.gstreamer.gst.Caps get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_static_caps_get.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_static_caps_cleanup = Interop.downcallHandle(
            "gst_static_caps_cleanup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_static_caps_get = Interop.downcallHandle(
            "gst_static_caps_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link StaticCaps.Builder} object constructs a {@link StaticCaps} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link StaticCaps.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final StaticCaps struct;
        
        private Builder() {
            struct = StaticCaps.allocate();
        }
        
         /**
         * Finish building the {@link StaticCaps} struct.
         * @return A new instance of {@code StaticCaps} with the fields 
         *         that were set in the Builder object.
         */
        public StaticCaps build() {
            return struct;
        }
        
        /**
         * the cached {@link Caps}
         * @param caps The value for the {@code caps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
            return this;
        }
        
        /**
         * a string describing a caps
         * @param string The value for the {@code string} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setString(java.lang.String string) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, null)));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
