package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoResampler} is a structure which holds the information
 * required to perform various kinds of resampling filtering.
 * @version 1.6
 */
public class VideoResampler extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoResampler";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("in_size"),
        Interop.valueLayout.C_INT.withName("out_size"),
        Interop.valueLayout.C_INT.withName("max_taps"),
        Interop.valueLayout.C_INT.withName("n_phases"),
        Interop.valueLayout.ADDRESS.withName("offset"),
        Interop.valueLayout.ADDRESS.withName("phase"),
        Interop.valueLayout.ADDRESS.withName("n_taps"),
        Interop.valueLayout.ADDRESS.withName("taps"),
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
     * Allocate a new {@link VideoResampler}
     * @return A new, uninitialized @{link VideoResampler}
     */
    public static VideoResampler allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoResampler newInstance = new VideoResampler(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code in_size}
     * @return The value of the field {@code in_size}
     */
    public int inSize$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code in_size}
     * @param inSize The new value of the field {@code in_size}
     */
    public void inSize$set(int inSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), inSize);
    }
    
    /**
     * Get the value of the field {@code out_size}
     * @return The value of the field {@code out_size}
     */
    public int outSize$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code out_size}
     * @param outSize The new value of the field {@code out_size}
     */
    public void outSize$set(int outSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), outSize);
    }
    
    /**
     * Get the value of the field {@code max_taps}
     * @return The value of the field {@code max_taps}
     */
    public int maxTaps$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_taps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_taps}
     * @param maxTaps The new value of the field {@code max_taps}
     */
    public void maxTaps$set(int maxTaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_taps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxTaps);
    }
    
    /**
     * Get the value of the field {@code n_phases}
     * @return The value of the field {@code n_phases}
     */
    public int nPhases$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_phases"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_phases}
     * @param nPhases The new value of the field {@code n_phases}
     */
    public void nPhases$set(int nPhases) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_phases"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPhases);
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public PointerInteger offset$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void offset$set(PointerInteger offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset.handle());
    }
    
    /**
     * Get the value of the field {@code phase}
     * @return The value of the field {@code phase}
     */
    public PointerInteger phase$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("phase"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code phase}
     * @param phase The new value of the field {@code phase}
     */
    public void phase$set(PointerInteger phase) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("phase"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), phase.handle());
    }
    
    /**
     * Get the value of the field {@code n_taps}
     * @return The value of the field {@code n_taps}
     */
    public PointerInteger nTaps$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_taps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code n_taps}
     * @param nTaps The new value of the field {@code n_taps}
     */
    public void nTaps$set(PointerInteger nTaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_taps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nTaps.handle());
    }
    
    /**
     * Get the value of the field {@code taps}
     * @return The value of the field {@code taps}
     */
    public PointerDouble taps$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("taps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerDouble(RESULT);
    }
    
    /**
     * Change the value of the field {@code taps}
     * @param taps The new value of the field {@code taps}
     */
    public void taps$set(PointerDouble taps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("taps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), taps.handle());
    }
    
    /**
     * Create a VideoResampler proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoResampler(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Clear a previously initialized {@link VideoResampler} {@code resampler}.
     */
    public void clear() {
        try {
            DowncallHandles.gst_video_resampler_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean init(@NotNull org.gstreamer.video.VideoResamplerMethod method, @NotNull org.gstreamer.video.VideoResamplerFlags flags, int nPhases, int nTaps, double shift, int inSize, int outSize, @NotNull org.gstreamer.gst.Structure options) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(options, "Parameter 'options' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_resampler_init.invokeExact(
                    handle(),
                    method.getValue(),
                    flags.getValue(),
                    nPhases,
                    nTaps,
                    shift,
                    inSize,
                    outSize,
                    options.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_resampler_clear = Interop.downcallHandle(
            "gst_video_resampler_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_resampler_init = Interop.downcallHandle(
            "gst_video_resampler_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoResampler struct;
        
         /**
         * A {@link VideoResampler.Build} object constructs a {@link VideoResampler} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoResampler.allocate();
        }
        
         /**
         * Finish building the {@link VideoResampler} struct.
         * @return A new instance of {@code VideoResampler} with the fields 
         *         that were set in the Build object.
         */
        public VideoResampler construct() {
            return struct;
        }
        
        /**
         * the input size
         * @param inSize The value for the {@code inSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInSize(int inSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("in_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), inSize);
            return this;
        }
        
        /**
         * the output size
         * @param outSize The value for the {@code outSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOutSize(int outSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), outSize);
            return this;
        }
        
        /**
         * the maximum number of taps
         * @param maxTaps The value for the {@code maxTaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxTaps(int maxTaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_taps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxTaps);
            return this;
        }
        
        /**
         * the number of phases
         * @param nPhases The value for the {@code nPhases} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNPhases(int nPhases) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_phases"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPhases);
            return this;
        }
        
        /**
         * array with the source offset for each output element
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffset(PointerInteger offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (offset == null ? MemoryAddress.NULL : offset.handle()));
            return this;
        }
        
        /**
         * array with the phase to use for each output element
         * @param phase The value for the {@code phase} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPhase(PointerInteger phase) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("phase"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (phase == null ? MemoryAddress.NULL : phase.handle()));
            return this;
        }
        
        /**
         * array with new number of taps for each phase
         * @param nTaps The value for the {@code nTaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNTaps(PointerInteger nTaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_taps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nTaps == null ? MemoryAddress.NULL : nTaps.handle()));
            return this;
        }
        
        /**
         * the taps for all phases
         * @param taps The value for the {@code taps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTaps(PointerDouble taps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("taps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (taps == null ? MemoryAddress.NULL : taps.handle()));
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
