package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Audio CD source base class.
 */
public class AudioCdSrcClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioCdSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.PushSrcClass.getMemoryLayout().withName("pushsrc_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("read_sector"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioCdSrcClass}
     * @return A new, uninitialized @{link AudioCdSrcClass}
     */
    public static AudioCdSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioCdSrcClass newInstance = new AudioCdSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pushsrc_class}
     * @return The value of the field {@code pushsrc_class}
     */
    public org.gstreamer.base.PushSrcClass getPushsrcClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pushsrc_class"));
        return org.gstreamer.base.PushSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pushsrc_class}
     * @param pushsrcClass The new value of the field {@code pushsrc_class}
     */
    public void setPushsrcClass(org.gstreamer.base.PushSrcClass pushsrcClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pushsrc_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushsrcClass == null ? MemoryAddress.NULL : pushsrcClass.handle()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.audio.AudioCdSrc src, java.lang.String device);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress device) {
            var RESULT = run((org.gstreamer.audio.AudioCdSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioCdSrc.fromAddress).marshal(src, Ownership.NONE), Marshal.addressToString.marshal(device, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        void run(org.gstreamer.audio.AudioCdSrc src);

        @ApiStatus.Internal default void upcall(MemoryAddress src) {
            run((org.gstreamer.audio.AudioCdSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioCdSrc.fromAddress).marshal(src, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReadSectorCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.audio.AudioCdSrc src, int sector);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress src, int sector) {
            var RESULT = run((org.gstreamer.audio.AudioCdSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioCdSrc.fromAddress).marshal(src, Ownership.NONE), sector);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadSectorCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read_sector}
     * @param readSector The new value of the field {@code read_sector}
     */
    public void setReadSector(ReadSectorCallback readSector) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read_sector"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readSector == null ? MemoryAddress.NULL : readSector.toCallback()));
    }
    
    /**
     * Create a AudioCdSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioCdSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioCdSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioCdSrcClass(input, ownership);
    
    /**
     * A {@link AudioCdSrcClass.Builder} object constructs a {@link AudioCdSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioCdSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioCdSrcClass struct;
        
        private Builder() {
            struct = AudioCdSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioCdSrcClass} struct.
         * @return A new instance of {@code AudioCdSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioCdSrcClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param pushsrcClass The value for the {@code pushsrcClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPushsrcClass(org.gstreamer.base.PushSrcClass pushsrcClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pushsrc_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushsrcClass == null ? MemoryAddress.NULL : pushsrcClass.handle()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setReadSector(ReadSectorCallback readSector) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_sector"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readSector == null ? MemoryAddress.NULL : readSector.toCallback()));
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
