package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available optional virtual methods or not, as
 * needed. At minimum, {@code load_from_buffer} (or {@code load_from_custom}), {@code get_supported_output_modes},
 * and {@code decode} need to be overridden.
 * <p>
 * All functions are called with a locked decoder mutex.
 * <p>
 * <blockquote>
 *  If GST_ELEMENT_ERROR, GST_ELEMENT_WARNING, or GST_ELEMENT_INFO are called from
 *  inside one of these functions, it is strongly recommended to unlock the decoder mutex
 *  before and re-lock it after these macros to prevent potential deadlocks in case the
 *  application does something with the element when it receives an ERROR/WARNING/INFO
 *  message. Same goes for gst_element_post_message() calls and non-serialized events.
 * </blockquote><p>
 * By default, this class works by reading media data from the sinkpad, and then commencing
 * playback. Some decoders cannot be given data from a memory block, so the usual way of
 * reading all upstream data and passing it to {@code load_from_buffer} doesn't work then. In this case,
 * set the value of loads_from_sinkpad to FALSE. This changes the way this class operates;
 * it does not require a sinkpad to exist anymore, and will call {@code load_from_custom} instead.
 * One example of a decoder where this makes sense is UADE (Unix Amiga Delitracker Emulator).
 * For some formats (such as TFMX), it needs to do the file loading by itself.
 * Since most decoders can read input data from a memory block, the default value of
 * loads_from_sinkpad is TRUE.
 */
public class NonstreamAudioDecoderClass extends Struct {
    
    static {
        GstBadAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNonstreamAudioDecoderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("element_class"),
        Interop.valueLayout.C_INT.withName("loads_from_sinkpad"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("seek"),
        Interop.valueLayout.ADDRESS.withName("tell"),
        Interop.valueLayout.ADDRESS.withName("load_from_buffer"),
        Interop.valueLayout.ADDRESS.withName("load_from_custom"),
        Interop.valueLayout.ADDRESS.withName("get_main_tags"),
        Interop.valueLayout.ADDRESS.withName("set_current_subsong"),
        Interop.valueLayout.ADDRESS.withName("get_current_subsong"),
        Interop.valueLayout.ADDRESS.withName("get_num_subsongs"),
        Interop.valueLayout.ADDRESS.withName("get_subsong_duration"),
        Interop.valueLayout.ADDRESS.withName("get_subsong_tags"),
        Interop.valueLayout.ADDRESS.withName("set_subsong_mode"),
        Interop.valueLayout.ADDRESS.withName("set_num_loops"),
        Interop.valueLayout.ADDRESS.withName("get_num_loops"),
        Interop.valueLayout.ADDRESS.withName("get_supported_output_modes"),
        Interop.valueLayout.ADDRESS.withName("set_output_mode"),
        Interop.valueLayout.ADDRESS.withName("decode"),
        Interop.valueLayout.ADDRESS.withName("negotiate"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("propose_allocation"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link NonstreamAudioDecoderClass}
     * @return A new, uninitialized @{link NonstreamAudioDecoderClass}
     */
    public static NonstreamAudioDecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NonstreamAudioDecoderClass newInstance = new NonstreamAudioDecoderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code element_class}
     * @return The value of the field {@code element_class}
     */
    public org.gstreamer.gst.ElementClass elementClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("element_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code loads_from_sinkpad}
     * @return The value of the field {@code loads_from_sinkpad}
     */
    public boolean loadsFromSinkpad$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code loads_from_sinkpad}
     * @param loadsFromSinkpad The new value of the field {@code loads_from_sinkpad}
     */
    public void loadsFromSinkpad$set(boolean loadsFromSinkpad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), loadsFromSinkpad ? 1 : 0);
    }
    
    /**
     * Create a NonstreamAudioDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NonstreamAudioDecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private NonstreamAudioDecoderClass struct;
        
         /**
         * A {@link NonstreamAudioDecoderClass.Build} object constructs a {@link NonstreamAudioDecoderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = NonstreamAudioDecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link NonstreamAudioDecoderClass} struct.
         * @return A new instance of {@code NonstreamAudioDecoderClass} with the fields 
         *         that were set in the Build object.
         */
        public NonstreamAudioDecoderClass construct() {
            return struct;
        }
        
        /**
         * The parent class structure
         * @param elementClass The value for the {@code elementClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setElementClass(org.gstreamer.gst.ElementClass elementClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
            return this;
        }
        
        public Build setLoadsFromSinkpad(boolean loadsFromSinkpad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), loadsFromSinkpad ? 1 : 0);
            return this;
        }
        
        public Build setSeek(java.lang.foreign.MemoryAddress seek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (seek == null ? MemoryAddress.NULL : seek));
            return this;
        }
        
        public Build setTell(java.lang.foreign.MemoryAddress tell) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tell == null ? MemoryAddress.NULL : tell));
            return this;
        }
        
        public Build setLoadFromBuffer(java.lang.foreign.MemoryAddress loadFromBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_from_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFromBuffer == null ? MemoryAddress.NULL : loadFromBuffer));
            return this;
        }
        
        public Build setLoadFromCustom(java.lang.foreign.MemoryAddress loadFromCustom) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_from_custom"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFromCustom == null ? MemoryAddress.NULL : loadFromCustom));
            return this;
        }
        
        public Build setGetMainTags(java.lang.foreign.MemoryAddress getMainTags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_main_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMainTags == null ? MemoryAddress.NULL : getMainTags));
            return this;
        }
        
        public Build setSetCurrentSubsong(java.lang.foreign.MemoryAddress setCurrentSubsong) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_current_subsong"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCurrentSubsong == null ? MemoryAddress.NULL : setCurrentSubsong));
            return this;
        }
        
        public Build setGetCurrentSubsong(java.lang.foreign.MemoryAddress getCurrentSubsong) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_subsong"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentSubsong == null ? MemoryAddress.NULL : getCurrentSubsong));
            return this;
        }
        
        public Build setGetNumSubsongs(java.lang.foreign.MemoryAddress getNumSubsongs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_num_subsongs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNumSubsongs == null ? MemoryAddress.NULL : getNumSubsongs));
            return this;
        }
        
        public Build setGetSubsongDuration(java.lang.foreign.MemoryAddress getSubsongDuration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSubsongDuration == null ? MemoryAddress.NULL : getSubsongDuration));
            return this;
        }
        
        public Build setGetSubsongTags(java.lang.foreign.MemoryAddress getSubsongTags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSubsongTags == null ? MemoryAddress.NULL : getSubsongTags));
            return this;
        }
        
        public Build setSetSubsongMode(java.lang.foreign.MemoryAddress setSubsongMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_subsong_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSubsongMode == null ? MemoryAddress.NULL : setSubsongMode));
            return this;
        }
        
        public Build setSetNumLoops(java.lang.foreign.MemoryAddress setNumLoops) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_num_loops"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setNumLoops == null ? MemoryAddress.NULL : setNumLoops));
            return this;
        }
        
        public Build setGetNumLoops(java.lang.foreign.MemoryAddress getNumLoops) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_num_loops"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNumLoops == null ? MemoryAddress.NULL : getNumLoops));
            return this;
        }
        
        public Build setGetSupportedOutputModes(java.lang.foreign.MemoryAddress getSupportedOutputModes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_output_modes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedOutputModes == null ? MemoryAddress.NULL : getSupportedOutputModes));
            return this;
        }
        
        public Build setSetOutputMode(java.lang.foreign.MemoryAddress setOutputMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_output_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setOutputMode == null ? MemoryAddress.NULL : setOutputMode));
            return this;
        }
        
        public Build setDecode(java.lang.foreign.MemoryAddress decode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decode == null ? MemoryAddress.NULL : decode));
            return this;
        }
        
        public Build setNegotiate(java.lang.foreign.MemoryAddress negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate));
            return this;
        }
        
        public Build setDecideAllocation(java.lang.foreign.MemoryAddress decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation));
            return this;
        }
        
        public Build setProposeAllocation(java.lang.foreign.MemoryAddress proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation));
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
