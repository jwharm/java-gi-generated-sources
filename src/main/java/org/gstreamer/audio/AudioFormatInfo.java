package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information for an audio format.
 */
public class AudioFormatInfo extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFormatInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("format"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("endianness"),
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("depth"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.C_BYTE).withName("silence"),
        Interop.valueLayout.C_INT.withName("unpack_format"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("unpack_func"),
        Interop.valueLayout.ADDRESS.withName("pack_func"),
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
     * Allocate a new {@link AudioFormatInfo}
     * @return A new, uninitialized @{link AudioFormatInfo}
     */
    public static AudioFormatInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioFormatInfo newInstance = new AudioFormatInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.audio.AudioFormat format$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void format$set(org.gstreamer.audio.AudioFormat format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), format.getValue());
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.audio.AudioFormatFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.audio.AudioFormatFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.audio.AudioFormatFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code endianness}
     * @return The value of the field {@code endianness}
     */
    public int endianness$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("endianness"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code endianness}
     * @param endianness The new value of the field {@code endianness}
     */
    public void endianness$set(int endianness) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("endianness"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), endianness);
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code depth}
     * @return The value of the field {@code depth}
     */
    public int depth$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code depth}
     * @param depth The new value of the field {@code depth}
     */
    public void depth$set(int depth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), depth);
    }
    
    /**
     * Get the value of the field {@code unpack_format}
     * @return The value of the field {@code unpack_format}
     */
    public org.gstreamer.audio.AudioFormat unpackFormat$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code unpack_format}
     * @param unpackFormat The new value of the field {@code unpack_format}
     */
    public void unpackFormat$set(org.gstreamer.audio.AudioFormat unpackFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), unpackFormat.getValue());
    }
    
    /**
     * Get the value of the field {@code unpack_func}
     * @return The value of the field {@code unpack_func}
     */
    public org.gstreamer.audio.AudioFormatUnpack unpackFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code pack_func}
     * @return The value of the field {@code pack_func}
     */
    public org.gstreamer.audio.AudioFormatPack packFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a AudioFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioFormatInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Fill {@code length} bytes in {@code dest} with silence samples for {@code info}.
     * @param dest a destination
     *   to fill
     * @param length the length to fill
     */
    public void fillSilence(@NotNull byte[] dest, long length) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        try {
            DowncallHandles.gst_audio_format_info_fill_silence.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(dest, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_format_info_fill_silence = Interop.downcallHandle(
            "gst_audio_format_info_fill_silence",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioFormatInfo struct;
        
         /**
         * A {@link AudioFormatInfo.Build} object constructs a {@link AudioFormatInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioFormatInfo.allocate();
        }
        
         /**
         * Finish building the {@link AudioFormatInfo} struct.
         * @return A new instance of {@code AudioFormatInfo} with the fields 
         *         that were set in the Build object.
         */
        public AudioFormatInfo construct() {
            return struct;
        }
        
        /**
         * {@link AudioFormat}
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFormat(org.gstreamer.audio.AudioFormat format) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
            return this;
        }
        
        /**
         * string representation of the format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * user readable description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * {@link AudioFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.audio.AudioFormatFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the endianness
         * @param endianness The value for the {@code endianness} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEndianness(int endianness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("endianness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), endianness);
            return this;
        }
        
        /**
         * amount of bits used for one sample
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidth(int width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
            return this;
        }
        
        /**
         * amount of valid bits in {@code width}
         * @param depth The value for the {@code depth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDepth(int depth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), depth);
            return this;
        }
        
        /**
         * {@code width}/8 bytes with 1 silent sample
         * @param silence The value for the {@code silence} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSilence(byte[] silence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("silence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (silence == null ? MemoryAddress.NULL : Interop.allocateNativeArray(silence, false)));
            return this;
        }
        
        /**
         * the format of the unpacked samples
         * @param unpackFormat The value for the {@code unpackFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnpackFormat(org.gstreamer.audio.AudioFormat unpackFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFormat == null ? MemoryAddress.NULL : unpackFormat.getValue()));
            return this;
        }
        
        /**
         * function to unpack samples
         * @param unpackFunc The value for the {@code unpackFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnpackFunc(java.lang.foreign.MemoryAddress unpackFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : unpackFunc));
            return this;
        }
        
        /**
         * function to pack samples
         * @param packFunc The value for the {@code packFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPackFunc(java.lang.foreign.MemoryAddress packFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packFunc == null ? MemoryAddress.NULL : packFunc));
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
