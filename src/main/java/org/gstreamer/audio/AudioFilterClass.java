package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * In addition to the {@code setup} virtual function, you should also override the
 * GstBaseTransform::transform and/or GstBaseTransform::transform_ip virtual
 * function.
 */
public class AudioFilterClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFilterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("basetransformclass"),
        Interop.valueLayout.ADDRESS.withName("setup"),
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
     * Allocate a new {@link AudioFilterClass}
     * @return A new, uninitialized @{link AudioFilterClass}
     */
    public static AudioFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioFilterClass newInstance = new AudioFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code basetransformclass}
     * @return The value of the field {@code basetransformclass}
     */
    public org.gstreamer.base.BaseTransformClass basetransformclass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basetransformclass"));
        return new org.gstreamer.base.BaseTransformClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Convenience function to add pad templates to this element class, with
     * {@code allowed_caps} as the caps that can be handled.
     * <p>
     * This function is usually used from within a GObject class_init function.
     * @param allowedCaps what formats the filter can handle, as {@link org.gstreamer.gst.Caps}
     */
    public void addPadTemplates(@NotNull org.gstreamer.gst.Caps allowedCaps) {
        java.util.Objects.requireNonNull(allowedCaps, "Parameter 'allowedCaps' must not be null");
        try {
            DowncallHandles.gst_audio_filter_class_add_pad_templates.invokeExact(
                    handle(),
                    allowedCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_filter_class_add_pad_templates = Interop.downcallHandle(
            "gst_audio_filter_class_add_pad_templates",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioFilterClass struct;
        
         /**
         * A {@link AudioFilterClass.Build} object constructs a {@link AudioFilterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioFilterClass} struct.
         * @return A new instance of {@code AudioFilterClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioFilterClass construct() {
            return struct;
        }
        
        /**
         * parent class
         * @param basetransformclass The value for the {@code basetransformclass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBasetransformclass(org.gstreamer.base.BaseTransformClass basetransformclass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basetransformclass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basetransformclass == null ? MemoryAddress.NULL : basetransformclass.handle()));
            return this;
        }
        
        public Build setSetup(java.lang.foreign.MemoryAddress setup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup));
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
