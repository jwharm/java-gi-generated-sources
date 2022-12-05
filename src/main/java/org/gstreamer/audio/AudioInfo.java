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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public org.gstreamer.audio.AudioFormatInfo finfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.audio.AudioFormatInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code finfo}
     * @param finfo The new value of the field {@code finfo}
     */
    public void finfo$set(org.gstreamer.audio.AudioFormatInfo finfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), finfo.handle());
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.audio.AudioFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.audio.AudioFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.audio.AudioFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code layout}
     * @return The value of the field {@code layout}
     */
    public org.gstreamer.audio.AudioLayout layout$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioLayout.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code layout}
     * @param layout The new value of the field {@code layout}
     */
    public void layout$set(org.gstreamer.audio.AudioLayout layout) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), layout.getValue());
    }
    
    /**
     * Get the value of the field {@code rate}
     * @return The value of the field {@code rate}
     */
    public int rate$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code rate}
     * @param rate The new value of the field {@code rate}
     */
    public void rate$set(int rate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), rate);
    }
    
    /**
     * Get the value of the field {@code channels}
     * @return The value of the field {@code channels}
     */
    public int channels$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code channels}
     * @param channels The new value of the field {@code channels}
     */
    public void channels$set(int channels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), channels);
    }
    
    /**
     * Get the value of the field {@code bpf}
     * @return The value of the field {@code bpf}
     */
    public int bpf$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bpf"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bpf}
     * @param bpf The new value of the field {@code bpf}
     */
    public void bpf$set(int bpf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bpf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bpf);
    }
    
    /**
     * Create a AudioInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    
    private static Addressable constructNewFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        Addressable RESULT;
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
    public static AudioInfo newFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        return new AudioInfo(constructNewFromCaps(caps), Ownership.FULL);
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
    public boolean convert(@NotNull org.gstreamer.gst.Format srcFmt, long srcVal, @NotNull org.gstreamer.gst.Format destFmt, Out<Long> destVal) {
        java.util.Objects.requireNonNull(srcFmt, "Parameter 'srcFmt' must not be null");
        java.util.Objects.requireNonNull(destFmt, "Parameter 'destFmt' must not be null");
        java.util.Objects.requireNonNull(destVal, "Parameter 'destVal' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Copy a GstAudioInfo structure.
     * @return a new {@link AudioInfo}. free with gst_audio_info_free.
     */
    public @NotNull org.gstreamer.audio.AudioInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.audio.AudioInfo(RESULT, Ownership.FULL);
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
    public boolean isEqual(@NotNull org.gstreamer.audio.AudioInfo other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void setFormat(@NotNull org.gstreamer.audio.AudioFormat format, int rate, int channels, @Nullable org.gstreamer.audio.AudioChannelPosition[] position) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
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
    public @NotNull org.gstreamer.gst.Caps toCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_info_to_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Parse {@code caps} and update {@code info}.
     * @param info a {@link AudioInfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return TRUE if {@code caps} could be parsed
     */
    public static boolean fromCaps(@NotNull org.gstreamer.audio.AudioInfo info, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_info_from_caps.invokeExact(
                    info.handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize {@code info} with default values.
     * @param info a {@link AudioInfo}
     */
    public static void init(@NotNull org.gstreamer.audio.AudioInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioInfo struct;
        
         /**
         * A {@link AudioInfo.Build} object constructs a {@link AudioInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioInfo.allocate();
        }
        
         /**
         * Finish building the {@link AudioInfo} struct.
         * @return A new instance of {@code AudioInfo} with the fields 
         *         that were set in the Build object.
         */
        public AudioInfo construct() {
            return struct;
        }
        
        /**
         * the format info of the audio
         * @param finfo The value for the {@code finfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFinfo(org.gstreamer.audio.AudioFormatInfo finfo) {
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
        public Build setFlags(org.gstreamer.audio.AudioFlags flags) {
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
        public Build setLayout(org.gstreamer.audio.AudioLayout layout) {
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
        public Build setRate(int rate) {
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
        public Build setChannels(int channels) {
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
        public Build setBpf(int bpf) {
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
        public Build setPosition(org.gstreamer.audio.AudioChannelPosition[] position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (position == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(position), false)));
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
