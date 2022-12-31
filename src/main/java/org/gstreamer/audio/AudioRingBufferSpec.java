package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The structure containing the format specification of the ringbuffer.
 */
public class AudioRingBufferSpec extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBufferSpec";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("caps"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("info"),
            Interop.valueLayout.C_LONG.withName("latency_time"),
            Interop.valueLayout.C_LONG.withName("buffer_time"),
            Interop.valueLayout.C_INT.withName("segsize"),
            Interop.valueLayout.C_INT.withName("segtotal"),
            Interop.valueLayout.C_INT.withName("seglatency"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioRingBufferSpec}
     * @return A new, uninitialized @{link AudioRingBufferSpec}
     */
    public static AudioRingBufferSpec allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioRingBufferSpec newInstance = new AudioRingBufferSpec(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code caps}
     * @return The value of the field {@code caps}
     */
    public org.gstreamer.gst.Caps getCaps() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code caps}
     * @param caps The new value of the field {@code caps}
     */
    public void setCaps(org.gstreamer.gst.Caps caps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.audio.AudioRingBufferFormatType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioRingBufferFormatType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.audio.AudioRingBufferFormatType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.audio.AudioInfo getInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void setInfo(org.gstreamer.audio.AudioInfo info) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
    }
    
    /**
     * Get the value of the field {@code latency_time}
     * @return The value of the field {@code latency_time}
     */
    public long getLatencyTime() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("latency_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code latency_time}
     * @param latencyTime The new value of the field {@code latency_time}
     */
    public void setLatencyTime(long latencyTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("latency_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), latencyTime);
    }
    
    /**
     * Get the value of the field {@code buffer_time}
     * @return The value of the field {@code buffer_time}
     */
    public long getBufferTime() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code buffer_time}
     * @param bufferTime The new value of the field {@code buffer_time}
     */
    public void setBufferTime(long bufferTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bufferTime);
    }
    
    /**
     * Get the value of the field {@code segsize}
     * @return The value of the field {@code segsize}
     */
    public int getSegsize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segsize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segsize}
     * @param segsize The new value of the field {@code segsize}
     */
    public void setSegsize(int segsize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segsize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segsize);
    }
    
    /**
     * Get the value of the field {@code segtotal}
     * @return The value of the field {@code segtotal}
     */
    public int getSegtotal() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segtotal"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segtotal}
     * @param segtotal The new value of the field {@code segtotal}
     */
    public void setSegtotal(int segtotal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segtotal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segtotal);
    }
    
    /**
     * Get the value of the field {@code seglatency}
     * @return The value of the field {@code seglatency}
     */
    public int getSeglatency() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seglatency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seglatency}
     * @param seglatency The new value of the field {@code seglatency}
     */
    public void setSeglatency(int seglatency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seglatency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seglatency);
    }
    
    /**
     * Create a AudioRingBufferSpec proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioRingBufferSpec(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioRingBufferSpec> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioRingBufferSpec(input, ownership);
    
    /**
     * A {@link AudioRingBufferSpec.Builder} object constructs a {@link AudioRingBufferSpec} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioRingBufferSpec.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioRingBufferSpec struct;
        
        private Builder() {
            struct = AudioRingBufferSpec.allocate();
        }
        
         /**
         * Finish building the {@link AudioRingBufferSpec} struct.
         * @return A new instance of {@code AudioRingBufferSpec} with the fields 
         *         that were set in the Builder object.
         */
        public AudioRingBufferSpec build() {
            return struct;
        }
        
        /**
         * The caps that generated the Spec.
         * @param caps The value for the {@code caps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
            return this;
        }
        
        /**
         * the sample type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.audio.AudioRingBufferFormatType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the {@link AudioInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfo(org.gstreamer.audio.AudioInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * the latency in microseconds
         * @param latencyTime The value for the {@code latencyTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLatencyTime(long latencyTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("latency_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), latencyTime);
            return this;
        }
        
        /**
         * the total buffer size in microseconds
         * @param bufferTime The value for the {@code bufferTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBufferTime(long bufferTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bufferTime);
            return this;
        }
        
        /**
         * the size of one segment in bytes
         * @param segsize The value for the {@code segsize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegsize(int segsize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segsize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segsize);
            return this;
        }
        
        /**
         * the total number of segments
         * @param segtotal The value for the {@code segtotal} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegtotal(int segtotal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segtotal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segtotal);
            return this;
        }
        
        /**
         * number of segments queued in the lower level device,
         *  defaults to segtotal
         * @param seglatency The value for the {@code seglatency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeglatency(int seglatency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seglatency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seglatency);
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
