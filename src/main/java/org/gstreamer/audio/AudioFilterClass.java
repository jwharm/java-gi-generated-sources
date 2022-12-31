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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("basetransformclass"),
            Interop.valueLayout.ADDRESS.withName("setup"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
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
    public org.gstreamer.base.BaseTransformClass getBasetransformclass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basetransformclass"));
        return org.gstreamer.base.BaseTransformClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code basetransformclass}
     * @param basetransformclass The new value of the field {@code basetransformclass}
     */
    public void setBasetransformclass(org.gstreamer.base.BaseTransformClass basetransformclass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("basetransformclass"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basetransformclass == null ? MemoryAddress.NULL : basetransformclass.handle()));
    }
    
    @FunctionalInterface
    public interface SetupCallback {
        boolean run(org.gstreamer.audio.AudioFilter filter, org.gstreamer.audio.AudioInfo info);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress info) {
            var RESULT = run((org.gstreamer.audio.AudioFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.audio.AudioFilter.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.audio.AudioInfo.fromAddress.marshal(info, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code setup}
     * @param setup The new value of the field {@code setup}
     */
    public void setSetup(SetupCallback setup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
    }
    
    /**
     * Create a AudioFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioFilterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioFilterClass(input, ownership);
    
    /**
     * Convenience function to add pad templates to this element class, with
     * {@code allowed_caps} as the caps that can be handled.
     * <p>
     * This function is usually used from within a GObject class_init function.
     * @param allowedCaps what formats the filter can handle, as {@link org.gstreamer.gst.Caps}
     */
    public void addPadTemplates(org.gstreamer.gst.Caps allowedCaps) {
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
     * A {@link AudioFilterClass.Builder} object constructs a {@link AudioFilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioFilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioFilterClass struct;
        
        private Builder() {
            struct = AudioFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioFilterClass} struct.
         * @return A new instance of {@code AudioFilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioFilterClass build() {
            return struct;
        }
        
        /**
         * parent class
         * @param basetransformclass The value for the {@code basetransformclass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBasetransformclass(org.gstreamer.base.BaseTransformClass basetransformclass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basetransformclass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (basetransformclass == null ? MemoryAddress.NULL : basetransformclass.handle()));
            return this;
        }
        
        public Builder setSetup(SetupCallback setup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup.toCallback()));
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
