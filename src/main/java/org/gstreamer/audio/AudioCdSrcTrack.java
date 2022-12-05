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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("is_audio"),
        Interop.valueLayout.C_INT.withName("num"),
        Interop.valueLayout.C_INT.withName("start"),
        Interop.valueLayout.C_INT.withName("end"),
        Interop.valueLayout.ADDRESS.withName("tags"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("_gst_reserved1"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved2")
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
     * Allocate a new {@link AudioCdSrcTrack}
     * @return A new, uninitialized @{link AudioCdSrcTrack}
     */
    public static AudioCdSrcTrack allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioCdSrcTrack newInstance = new AudioCdSrcTrack(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_audio}
     * @return The value of the field {@code is_audio}
     */
    public boolean isAudio$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code is_audio}
     * @param isAudio The new value of the field {@code is_audio}
     */
    public void isAudio$set(boolean isAudio) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), isAudio ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code num}
     * @return The value of the field {@code num}
     */
    public int num$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code num}
     * @param num The new value of the field {@code num}
     */
    public void num$set(int num) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), num);
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public int start$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void start$set(int start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
    }
    
    /**
     * Get the value of the field {@code end}
     * @return The value of the field {@code end}
     */
    public int end$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void end$set(int end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
    }
    
    /**
     * Get the value of the field {@code tags}
     * @return The value of the field {@code tags}
     */
    public org.gstreamer.gst.TagList tags$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.TagList(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code tags}
     * @param tags The new value of the field {@code tags}
     */
    public void tags$set(org.gstreamer.gst.TagList tags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tags.handle());
    }
    
    /**
     * Create a AudioCdSrcTrack proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioCdSrcTrack(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioCdSrcTrack struct;
        
         /**
         * A {@link AudioCdSrcTrack.Build} object constructs a {@link AudioCdSrcTrack} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioCdSrcTrack.allocate();
        }
        
         /**
         * Finish building the {@link AudioCdSrcTrack} struct.
         * @return A new instance of {@code AudioCdSrcTrack} with the fields 
         *         that were set in the Build object.
         */
        public AudioCdSrcTrack construct() {
            return struct;
        }
        
        /**
         * Whether this is an audio track
         * @param isAudio The value for the {@code isAudio} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsAudio(boolean isAudio) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_audio"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), isAudio ? 1 : 0);
            return this;
        }
        
        /**
         * Track number in TOC (usually starts from 1, but not always)
         * @param num The value for the {@code num} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNum(int num) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), num);
            return this;
        }
        
        /**
         * The first sector of this track (LBA)
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStart(int start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
            return this;
        }
        
        /**
         * The last sector of this track (LBA)
         * @param end The value for the {@code end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnd(int end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
            return this;
        }
        
        /**
         * Track-specific tags (e.g. from cd-text information), or NULL
         * @param tags The value for the {@code tags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTags(org.gstreamer.gst.TagList tags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
            return this;
        }
        
        public Build setGstReserved1(int[] GstReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved1 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved1, false)));
            return this;
        }
        
        public Build setGstReserved2(java.lang.foreign.MemoryAddress[] GstReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved2 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved2, false)));
            return this;
        }
    }
}
