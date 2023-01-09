package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * CD track abstraction to communicate TOC entries to the base class.
 * <p>
 * This structure is only for use by sub-classed in connection with
 * gst_audio_cd_src_add_track().
 * <p>
 * Applications will be informed of the available tracks via a TOC message
 * on the pipeline's {@link org.gstreamer.gst.Bus} instead.
 */
public class AudioCdSrcTrack extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioCdSrcTrack";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("is_audio"),
            Interop.valueLayout.C_INT.withName("num"),
            Interop.valueLayout.C_INT.withName("start"),
            Interop.valueLayout.C_INT.withName("end"),
            Interop.valueLayout.ADDRESS.withName("tags"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("_gst_reserved1"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioCdSrcTrack}
     * @return A new, uninitialized @{link AudioCdSrcTrack}
     */
    public static AudioCdSrcTrack allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioCdSrcTrack newInstance = new AudioCdSrcTrack(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_audio}
     * @return The value of the field {@code is_audio}
     */
    public boolean getIsAudio() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code is_audio}
     * @param isAudio The new value of the field {@code is_audio}
     */
    public void setIsAudio(boolean isAudio) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isAudio, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code num}
     * @return The value of the field {@code num}
     */
    public int getNum() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code num}
     * @param num The new value of the field {@code num}
     */
    public void setNum(int num) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), num);
        }
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public int getStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(int start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), start);
        }
    }
    
    /**
     * Get the value of the field {@code end}
     * @return The value of the field {@code end}
     */
    public int getEnd() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void setEnd(int end) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), end);
        }
    }
    
    /**
     * Get the value of the field {@code tags}
     * @return The value of the field {@code tags}
     */
    public org.gstreamer.gst.TagList getTags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code tags}
     * @param tags The new value of the field {@code tags}
     */
    public void setTags(org.gstreamer.gst.TagList tags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
        }
    }
    
    /**
     * Create a AudioCdSrcTrack proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioCdSrcTrack(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioCdSrcTrack> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioCdSrcTrack(input);
    
    /**
     * A {@link AudioCdSrcTrack.Builder} object constructs a {@link AudioCdSrcTrack} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioCdSrcTrack.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioCdSrcTrack struct;
        
        private Builder() {
            struct = AudioCdSrcTrack.allocate();
        }
        
        /**
         * Finish building the {@link AudioCdSrcTrack} struct.
         * @return A new instance of {@code AudioCdSrcTrack} with the fields 
         *         that were set in the Builder object.
         */
        public AudioCdSrcTrack build() {
            return struct;
        }
        
        /**
         * Whether this is an audio track
         * @param isAudio The value for the {@code isAudio} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsAudio(boolean isAudio) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isAudio, null).intValue());
                return this;
            }
        }
        
        /**
         * Track number in TOC (usually starts from 1, but not always)
         * @param num The value for the {@code num} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNum(int num) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), num);
                return this;
            }
        }
        
        /**
         * The first sector of this track (LBA)
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(int start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), start);
                return this;
            }
        }
        
        /**
         * The last sector of this track (LBA)
         * @param end The value for the {@code end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnd(int end) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), end);
                return this;
            }
        }
        
        /**
         * Track-specific tags (e.g. from cd-text information), or NULL
         * @param tags The value for the {@code tags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTags(org.gstreamer.gst.TagList tags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
                return this;
            }
        }
        
        public Builder setGstReserved1(int[] GstReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved1 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved1, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setGstReserved2(java.lang.foreign.MemoryAddress[] GstReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved2 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved2, false, SCOPE)));
                return this;
            }
        }
    }
}
