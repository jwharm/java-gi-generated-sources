package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Per-PID splice information.
 * @version 1.20
 */
public class SCTESpliceComponent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESpliceComponent";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("tag"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("splice_time_specified"),
        Interop.valueLayout.C_LONG.withName("splice_time"),
        Interop.valueLayout.C_INT.withName("utc_splice_time")
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
     * Allocate a new {@link SCTESpliceComponent}
     * @return A new, uninitialized @{link SCTESpliceComponent}
     */
    public static SCTESpliceComponent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SCTESpliceComponent newInstance = new SCTESpliceComponent(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tag}
     * @return The value of the field {@code tag}
     */
    public byte tag$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void tag$set(byte tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag);
    }
    
    /**
     * Get the value of the field {@code splice_time_specified}
     * @return The value of the field {@code splice_time_specified}
     */
    public boolean spliceTimeSpecified$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code splice_time_specified}
     * @param spliceTimeSpecified The new value of the field {@code splice_time_specified}
     */
    public void spliceTimeSpecified$set(boolean spliceTimeSpecified) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTimeSpecified ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code splice_time}
     * @return The value of the field {@code splice_time}
     */
    public long spliceTime$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code splice_time}
     * @param spliceTime The new value of the field {@code splice_time}
     */
    public void spliceTime$set(long spliceTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTime);
    }
    
    /**
     * Get the value of the field {@code utc_splice_time}
     * @return The value of the field {@code utc_splice_time}
     */
    public int utcSpliceTime$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code utc_splice_time}
     * @param utcSpliceTime The new value of the field {@code utc_splice_time}
     */
    public void utcSpliceTime$set(int utcSpliceTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), utcSpliceTime);
    }
    
    /**
     * Create a SCTESpliceComponent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SCTESpliceComponent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(byte tag) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_component_new.invokeExact(
                    tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link SCTESpliceComponent}.
     * @param tag the elementary PID stream identifier
     */
    public SCTESpliceComponent(byte tag) {
        super(constructNew(tag), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_scte_splice_component_new = Interop.downcallHandle(
            "gst_mpegts_scte_splice_component_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SCTESpliceComponent struct;
        
         /**
         * A {@link SCTESpliceComponent.Build} object constructs a {@link SCTESpliceComponent} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SCTESpliceComponent.allocate();
        }
        
         /**
         * Finish building the {@link SCTESpliceComponent} struct.
         * @return A new instance of {@code SCTESpliceComponent} with the fields 
         *         that were set in the Build object.
         */
        public SCTESpliceComponent construct() {
            return struct;
        }
        
        /**
         * the elementary PID stream containing the Splice Point
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTag(byte tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag);
            return this;
        }
        
        /**
         * Whether {@code splice_time} was specified
         * @param spliceTimeSpecified The value for the {@code spliceTimeSpecified} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSpliceTimeSpecified(boolean spliceTimeSpecified) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTimeSpecified ? 1 : 0);
            return this;
        }
        
        /**
         * the presentation time of the signaled splice event
         * @param spliceTime The value for the {@code spliceTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSpliceTime(long spliceTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTime);
            return this;
        }
        
        /**
         * The UTC time of the signaled splice event
         * @param utcSpliceTime The value for the {@code utcSpliceTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUtcSpliceTime(int utcSpliceTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), utcSpliceTime);
            return this;
        }
    }
}
