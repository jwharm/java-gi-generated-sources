package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Meta containing Audio Level Indication: https://tools.ietf.org/html/rfc6464
 * @version 1.20
 */
public class AudioLevelMeta extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioLevelMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.C_BYTE.withName("level"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("voice_activity")
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
     * Allocate a new {@link AudioLevelMeta}
     * @return A new, uninitialized @{link AudioLevelMeta}
     */
    public static AudioLevelMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioLevelMeta newInstance = new AudioLevelMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta meta$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return new org.gstreamer.gst.Meta(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public byte level$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code level}
     * @param level The new value of the field {@code level}
     */
    public void level$set(byte level) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
    }
    
    /**
     * Get the value of the field {@code voice_activity}
     * @return The value of the field {@code voice_activity}
     */
    public boolean voiceActivity$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("voice_activity"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code voice_activity}
     * @param voiceActivity The new value of the field {@code voice_activity}
     */
    public void voiceActivity$set(boolean voiceActivity) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("voice_activity"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), voiceActivity ? 1 : 0);
    }
    
    /**
     * Create a AudioLevelMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioLevelMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Return the {@link org.gstreamer.gst.MetaInfo} associated with {@link AudioLevelMeta}.
     * @return a {@link org.gstreamer.gst.MetaInfo}
     */
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_level_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_level_meta_get_info = Interop.downcallHandle(
            "gst_audio_level_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioLevelMeta struct;
        
         /**
         * A {@link AudioLevelMeta.Build} object constructs a {@link AudioLevelMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioLevelMeta.allocate();
        }
        
         /**
         * Finish building the {@link AudioLevelMeta} struct.
         * @return A new instance of {@code AudioLevelMeta} with the fields 
         *         that were set in the Build object.
         */
        public AudioLevelMeta construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * the -dBov from 0-127 (127 is silence).
         * @param level The value for the {@code level} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLevel(byte level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
            return this;
        }
        
        /**
         * whether the buffer contains voice activity
         * @param voiceActivity The value for the {@code voiceActivity} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVoiceActivity(boolean voiceActivity) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("voice_activity"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), voiceActivity ? 1 : 0);
            return this;
        }
    }
}
