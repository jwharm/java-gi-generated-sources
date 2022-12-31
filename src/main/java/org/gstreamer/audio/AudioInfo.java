package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information describing audio properties. This information can be filled
 * in from GstCaps with gst_audio_info_from_caps().
 * <p>
 * Use the provided macros to access the info in this structure.
 */
public class AudioInfo extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("finfo"),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.C_INT.withName("layout"),
            Interop.valueLayout.C_INT.withName("rate"),
            Interop.valueLayout.C_INT.withName("channels"),
            Interop.valueLayout.C_INT.withName("bpf"),
            MemoryLayout.paddingLayout(1824),
            MemoryLayout.sequenceLayout(64, Interop.valueLayout.C_INT).withName("position"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioInfo}
     * @return A new, uninitialized @{link AudioInfo}
     */
    public static AudioInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioInfo newInstance = new AudioInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code finfo}
     * @return The value of the field {@code finfo}
     */
    public org.gstreamer.audio.AudioFormatInfo getFinfo() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code finfo}
     * @param finfo The new value of the field {@code finfo}
     */
    public void setFinfo(org.gstreamer.audio.AudioFormatInfo finfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finfo == null ? MemoryAddress.NULL : finfo.handle()));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.audio.AudioFlags getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.audio.AudioFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.audio.AudioFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Get the value of the field {@code layout}
     * @return The value of the field {@code layout}
     */
    public org.gstreamer.audio.AudioLayout getLayout() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioLayout.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code layout}
     * @param layout The new value of the field {@code layout}
     */
    public void setLayout(org.gstreamer.audio.AudioLayout layout) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (layout == null ? MemoryAddress.NULL : layout.getValue()));
    }
    
    /**
     * Get the value of the field {@code rate}
     * @return The value of the field {@code rate}
     */
    public int getRate() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code rate}
     * @param rate The new value of the field {@code rate}
     */
    public void setRate(int rate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), rate);
    }
    
    /**
     * Get the value of the field {@code channels}
     * @return The value of the field {@code channels}
     */
    public int getChannels() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code channels}
     * @param channels The new value of the field {@code channels}
     */
    public void setChannels(int channels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), channels);
    }
    
    /**
     * Get the value of the field {@code bpf}
     * @return The value of the field {@code bpf}
     */
    public int getBpf() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bpf"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bpf}
     * @param bpf The new value of the field {@code bpf}
     */
    public void setBpf(int bpf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bpf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bpf);
    }
    
    /**
     * Get the value of the field {@code position}
     * @return The value of the field {@code position}
     */
    public org.gstreamer.audio.AudioChannelPosition[] getPosition() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerEnumeration<org.gstreamer.audio.AudioChannelPosition>(RESULT, org.gstreamer.audio.AudioChannelPosition::of).toArray((int) 64, org.gstreamer.audio.AudioChannelPosition.class);
    }
    
    /**
     * Change the value of the field {@code position}
     * @param position The new value of the field {@code position}
     */
    public void setPosition(org.gstreamer.audio.AudioChannelPosition[] position) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (position == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(position), false)));
    }
    
    /**
     * Create a AudioInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioInfo(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new {@link AudioInfo} that is also initialized with
     * gst_audio_info_init().
     */
    public AudioInfo() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_new_from_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parse {@code caps} to generate a {@link AudioInfo}.
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return A {@link AudioInfo}, or {@code null} if {@code caps} couldn't be parsed
     */
    public static AudioInfo newFromCaps(org.gstreamer.gst.Caps caps) {
        var RESULT = constructNewFromCaps(caps);
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Converts among various {@link org.gstreamer.gst.Format} types.  This function handles
     * GST_FORMAT_BYTES, GST_FORMAT_TIME, and GST_FORMAT_DEFAULT.  For
     * raw audio, GST_FORMAT_DEFAULT corresponds to audio frames.  This
     * function can be used to handle pad queries of the type GST_QUERY_CONVERT.
     * @param srcFmt {@link org.gstreamer.gst.Format} of the {@code src_val}
     * @param srcVal value to convert
     * @param destFmt {@link org.gstreamer.gst.Format} of the {@code dest_val}
     * @param destVal pointer to destination value
     * @return TRUE if the conversion was successful.
     */
    public boolean convert(org.gstreamer.gst.Format srcFmt, long srcVal, org.gstreamer.gst.Format destFmt, Out<Long> destVal) {
        MemorySegment destValPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_info_convert.invokeExact(
                    handle(),
                    srcFmt.getValue(),
                    srcVal,
                    destFmt.getValue(),
                    (Addressable) destValPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        destVal.set(destValPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Copy a GstAudioInfo structure.
     * @return a new {@link AudioInfo}. free with gst_audio_info_free.
     */
    public org.gstreamer.audio.AudioInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Free a GstAudioInfo structure previously allocated with gst_audio_info_new()
     * or gst_audio_info_copy().
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_info_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares two {@link AudioInfo} and returns whether they are equal or not
     * @param other a {@link AudioInfo}
     * @return {@code true} if {@code info} and {@code other} are equal, else {@code false}.
     */
    public boolean isEqual(org.gstreamer.audio.AudioInfo other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the default info for the audio info of {@code format} and {@code rate} and {@code channels}.
     * <p>
     * Note: This initializes {@code info} first, no values are preserved.
     * @param format the format
     * @param rate the samplerate
     * @param channels the number of channels
     * @param position the channel positions
     */
    public void setFormat(org.gstreamer.audio.AudioFormat format, int rate, int channels, @Nullable org.gstreamer.audio.AudioChannelPosition[] position) {
        try {
            DowncallHandles.gst_audio_info_set_format.invokeExact(
                    handle(),
                    format.getValue(),
                    rate,
                    channels,
                    (Addressable) (position == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(position), false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert the values of {@code info} into a {@link org.gstreamer.gst.Caps}.
     * @return the new {@link org.gstreamer.gst.Caps} containing the
     *          info of {@code info}.
     */
    public org.gstreamer.gst.Caps toCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_to_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Parse {@code caps} and update {@code info}.
     * @param info a {@link AudioInfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return TRUE if {@code caps} could be parsed
     */
    public static boolean fromCaps(org.gstreamer.audio.AudioInfo info, org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_info_from_caps.invokeExact(
                    info.handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Initialize {@code info} with default values.
     * @param info a {@link AudioInfo}
     */
    public static void init(org.gstreamer.audio.AudioInfo info) {
        try {
            DowncallHandles.gst_audio_info_init.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_info_new = Interop.downcallHandle(
            "gst_audio_info_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_new_from_caps = Interop.downcallHandle(
            "gst_audio_info_new_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_convert = Interop.downcallHandle(
            "gst_audio_info_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_copy = Interop.downcallHandle(
            "gst_audio_info_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_free = Interop.downcallHandle(
            "gst_audio_info_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_is_equal = Interop.downcallHandle(
            "gst_audio_info_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_set_format = Interop.downcallHandle(
            "gst_audio_info_set_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_to_caps = Interop.downcallHandle(
            "gst_audio_info_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_from_caps = Interop.downcallHandle(
            "gst_audio_info_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_info_init = Interop.downcallHandle(
            "gst_audio_info_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AudioInfo.Builder} object constructs a {@link AudioInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioInfo struct;
        
        private Builder() {
            struct = AudioInfo.allocate();
        }
        
         /**
         * Finish building the {@link AudioInfo} struct.
         * @return A new instance of {@code AudioInfo} with the fields 
         *         that were set in the Builder object.
         */
        public AudioInfo build() {
            return struct;
        }
        
        /**
         * the format info of the audio
         * @param finfo The value for the {@code finfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFinfo(org.gstreamer.audio.AudioFormatInfo finfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finfo == null ? MemoryAddress.NULL : finfo.handle()));
            return this;
        }
        
        /**
         * additional audio flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.audio.AudioFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * audio layout
         * @param layout The value for the {@code layout} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayout(org.gstreamer.audio.AudioLayout layout) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (layout == null ? MemoryAddress.NULL : layout.getValue()));
            return this;
        }
        
        /**
         * the audio sample rate
         * @param rate The value for the {@code rate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRate(int rate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), rate);
            return this;
        }
        
        /**
         * the number of channels
         * @param channels The value for the {@code channels} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChannels(int channels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), channels);
            return this;
        }
        
        /**
         * the number of bytes for one frame, this is the size of one
         *         sample * {@code channels}
         * @param bpf The value for the {@code bpf} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBpf(int bpf) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bpf"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bpf);
            return this;
        }
        
        /**
         * the positions for each channel
         * @param position The value for the {@code position} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(org.gstreamer.audio.AudioChannelPosition[] position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (position == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(position), false)));
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
