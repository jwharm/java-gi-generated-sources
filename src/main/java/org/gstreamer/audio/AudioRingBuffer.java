package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object is the base class for audio ringbuffers used by the base
 * audio source and sink classes.
 * <p>
 * The ringbuffer abstracts a circular buffer of data. One reader and
 * one writer can operate on the data from different threads in a lockfree
 * manner. The base class is sufficiently flexible to be used as an
 * abstraction for DMA based ringbuffers as well as a pure software
 * implementations.
 */
public class AudioRingBuffer extends org.gstreamer.gst.Object {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBuffer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        org.gtk.glib.Cond.getMemoryLayout().withName("cond"),
        Interop.valueLayout.C_INT.withName("open"),
        Interop.valueLayout.C_INT.withName("acquired"),
        Interop.valueLayout.ADDRESS.withName("memory"),
        Interop.valueLayout.C_LONG.withName("size"),
        Interop.valueLayout.ADDRESS.withName("timestamps"),
        org.gstreamer.audio.AudioRingBufferSpec.getMemoryLayout().withName("spec"),
        Interop.valueLayout.C_INT.withName("samples_per_seg"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("empty_seg"),
        Interop.valueLayout.C_INT.withName("state"),
        Interop.valueLayout.C_INT.withName("segdone"),
        Interop.valueLayout.C_INT.withName("segbase"),
        Interop.valueLayout.C_INT.withName("waiting"),
        Interop.valueLayout.ADDRESS.withName("callback"),
        Interop.valueLayout.ADDRESS.withName("cb_data"),
        Interop.valueLayout.C_INT.withName("need_reorder"),
        MemoryLayout.paddingLayout(1184),
        MemoryLayout.sequenceLayout(64, Interop.valueLayout.C_INT).withName("channel_reorder_map"),
        Interop.valueLayout.C_INT.withName("flushing"),
        Interop.valueLayout.C_INT.withName("may_start"),
        Interop.valueLayout.C_INT.withName("active"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("cb_data_notify"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a AudioRingBuffer proxy instance for the provided memory address.
     * <p>
     * Because AudioRingBuffer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioRingBuffer(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioRingBuffer if its GType is a (or inherits from) "GstAudioRingBuffer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioRingBuffer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioRingBuffer", a ClassCastException will be thrown.
     */
    public static AudioRingBuffer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioRingBuffer.getType())) {
            return new AudioRingBuffer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioRingBuffer");
        }
    }
    
    /**
     * Allocate the resources for the ringbuffer. This function fills
     * in the data pointer of the ring buffer with a valid {@link org.gstreamer.gst.Buffer}
     * to which samples can be written.
     * @param spec the specs of the buffer
     * @return TRUE if the device could be acquired, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean acquire(@NotNull org.gstreamer.audio.AudioRingBufferSpec spec) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_acquire.invokeExact(
                    handle(),
                    spec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Activate {@code buf} to start or stop pulling data.
     * <p>
     * MT safe.
     * @param active the new mode
     * @return TRUE if the device could be activated in the requested mode,
     * FALSE on error.
     */
    public boolean activate(boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_activate.invokeExact(
                    handle(),
                    active ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Subclasses should call this function to notify the fact that
     * {@code advance} segments are now processed by the device.
     * <p>
     * MT safe.
     * @param advance the number of segments written
     */
    public void advance(int advance) {
        try {
            DowncallHandles.gst_audio_ring_buffer_advance.invokeExact(
                    handle(),
                    advance);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clear the given segment of the buffer with silence samples.
     * This function is used by subclasses.
     * <p>
     * MT safe.
     * @param segment the segment to clear
     */
    public void clear(int segment) {
        try {
            DowncallHandles.gst_audio_ring_buffer_clear.invokeExact(
                    handle(),
                    segment);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clear all samples from the ringbuffer.
     * <p>
     * MT safe.
     */
    public void clearAll() {
        try {
            DowncallHandles.gst_audio_ring_buffer_clear_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Close the audio device associated with the ring buffer. The ring buffer
     * should already have been released via gst_audio_ring_buffer_release().
     * @return TRUE if the device could be closed, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean closeDevice() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_close_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Commit {@code in_samples} samples pointed to by {@code data} to the ringbuffer {@code buf}.
     * <p>
     * {@code in_samples} and {@code out_samples} define the rate conversion to perform on the
     * samples in {@code data}. For negative rates, {@code out_samples} must be negative and
     * {@code in_samples} positive.
     * <p>
     * When {@code out_samples} is positive, the first sample will be written at position {@code sample}
     * in the ringbuffer. When {@code out_samples} is negative, the last sample will be written to
     * {@code sample} in reverse order.
     * <p>
     * {@code out_samples} does not need to be a multiple of the segment size of the ringbuffer
     * although it is recommended for optimal performance.
     * <p>
     * {@code accum} will hold a temporary accumulator used in rate conversion and should be
     * set to 0 when this function is first called. In case the commit operation is
     * interrupted, one can resume the processing by passing the previously returned
     * {@code accum} value back to this function.
     * <p>
     * MT safe.
     * @param sample the sample position of the data
     * @param data the data to commit
     * @param inSamples the number of samples in the data to commit
     * @param outSamples the number of samples to write to the ringbuffer
     * @param accum accumulator for rate conversion.
     * @return The number of samples written to the ringbuffer or -1 on error. The
     * number of samples written can be less than {@code out_samples} when {@code buf} was interrupted
     * with a flush or stop.
     */
    public int commit(PointerLong sample, @NotNull byte[] data, int inSamples, int outSamples, Out<Integer> accum) {
        java.util.Objects.requireNonNull(sample, "Parameter 'sample' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(accum, "Parameter 'accum' must not be null");
        MemorySegment accumPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_commit.invokeExact(
                    handle(),
                    sample.handle(),
                    Interop.allocateNativeArray(data, false),
                    inSamples,
                    outSamples,
                    (Addressable) accumPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        accum.set(accumPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
    
    /**
     * Convert {@code src_val} in {@code src_fmt} to the equivalent value in {@code dest_fmt}. The result
     * will be put in {@code dest_val}.
     * @param srcFmt the source format
     * @param srcVal the source value
     * @param destFmt the destination format
     * @param destVal a location to store the converted value
     * @return TRUE if the conversion succeeded.
     */
    public boolean convert(@NotNull org.gstreamer.gst.Format srcFmt, long srcVal, @NotNull org.gstreamer.gst.Format destFmt, Out<Long> destVal) {
        java.util.Objects.requireNonNull(srcFmt, "Parameter 'srcFmt' must not be null");
        java.util.Objects.requireNonNull(destFmt, "Parameter 'destFmt' must not be null");
        java.util.Objects.requireNonNull(destVal, "Parameter 'destVal' must not be null");
        MemorySegment destValPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_convert.invokeExact(
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
     * Get the number of samples queued in the audio device. This is
     * usually less than the segment size but can be bigger when the
     * implementation uses another internal buffer between the audio
     * device.
     * <p>
     * For playback ringbuffers this is the amount of samples transferred from the
     * ringbuffer to the device but still not played.
     * <p>
     * For capture ringbuffers this is the amount of samples in the device that are
     * not yet transferred to the ringbuffer.
     * @return The number of samples queued in the audio device.
     * <p>
     * MT safe.
     */
    public int delay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_delay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks the status of the device associated with the ring buffer.
     * @return TRUE if the device was open, FALSE if it was closed.
     * <p>
     * MT safe.
     */
    public boolean deviceIsOpen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_device_is_open.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if the ringbuffer is acquired and ready to use.
     * @return TRUE if the ringbuffer is acquired, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean isAcquired() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_is_acquired.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if {@code buf} is activated.
     * <p>
     * MT safe.
     * @return TRUE if the device is active.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if {@code buf} is flushing.
     * <p>
     * MT safe.
     * @return TRUE if the device is flushing.
     */
    public boolean isFlushing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_is_flushing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tell the ringbuffer that it is allowed to start playback when
     * the ringbuffer is filled with samples.
     * <p>
     * MT safe.
     * @param allowed the new value
     */
    public void mayStart(boolean allowed) {
        try {
            DowncallHandles.gst_audio_ring_buffer_may_start.invokeExact(
                    handle(),
                    allowed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Open the audio device associated with the ring buffer. Does not perform any
     * setup on the device. You must open the device before acquiring the ring
     * buffer.
     * @return TRUE if the device could be opened, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean openDevice() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_open_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Pause processing samples from the ringbuffer.
     * @return TRUE if the device could be paused, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean pause() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_pause.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns a pointer to memory where the data from segment {@code segment}
     * can be found. This function is mostly used by subclasses.
     * @param segment the segment to read
     * @param readptr the pointer to the memory where samples can be read
     * @param len the number of bytes to read
     * @return FALSE if the buffer is not started.
     * <p>
     * MT safe.
     */
    public boolean prepareRead(Out<Integer> segment, @NotNull Out<byte[]> readptr, Out<Integer> len) {
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
        MemorySegment segmentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(readptr, "Parameter 'readptr' must not be null");
        MemorySegment readptrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(len, "Parameter 'len' must not be null");
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_prepare_read.invokeExact(
                    handle(),
                    (Addressable) segmentPOINTER.address(),
                    (Addressable) readptrPOINTER.address(),
                    (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        segment.set(segmentPOINTER.get(Interop.valueLayout.C_INT, 0));
        len.set(lenPOINTER.get(Interop.valueLayout.C_INT, 0));
        readptr.set(MemorySegment.ofAddress(readptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Read {@code len} samples from the ringbuffer into the memory pointed
     * to by {@code data}.
     * The first sample should be read from position {@code sample} in
     * the ringbuffer.
     * <p>
     * {@code len} should not be a multiple of the segment size of the ringbuffer
     * although it is recommended.
     * <p>
     * {@code timestamp} will return the timestamp associated with the data returned.
     * @param sample the sample position of the data
     * @param data where the data should be read
     * @param len the number of samples in data to read
     * @param timestamp where the timestamp is returned
     * @return The number of samples read from the ringbuffer or -1 on
     * error.
     * <p>
     * MT safe.
     */
    public int read(long sample, @NotNull byte[] data, int len, @NotNull Out<org.gstreamer.gst.ClockTime> timestamp) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        MemorySegment timestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_read.invokeExact(
                    handle(),
                    sample,
                    Interop.allocateNativeArray(data, false),
                    len,
                    (Addressable) timestampPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        timestamp.set(new org.gstreamer.gst.ClockTime(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        return RESULT;
    }
    
    /**
     * Free the resources of the ringbuffer.
     * @return TRUE if the device could be released, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean release() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the number of samples that were processed by the ringbuffer
     * since it was last started. This does not include the number of samples not
     * yet processed (see gst_audio_ring_buffer_delay()).
     * @return The number of samples processed by the ringbuffer.
     * <p>
     * MT safe.
     */
    public long samplesDone() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_ring_buffer_samples_done.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the given callback function on the buffer. This function
     * will be called every time a segment has been written to a device.
     * <p>
     * MT safe.
     * @param cb the callback to set
     */
    public void setCallback(@Nullable org.gstreamer.audio.AudioRingBufferCallback cb) {
        try {
            DowncallHandles.gst_audio_ring_buffer_set_callback.invokeExact(
                    handle(),
                    (Addressable) (cb == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstAudio.Callbacks.class, "cbAudioRingBufferCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (cb == null ? MemoryAddress.NULL : Interop.registerCallback(cb)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given callback function on the buffer. This function
     * will be called every time a segment has been written to a device.
     * <p>
     * MT safe.
     * @param cb the callback to set
     */
    public void setCallbackFull(@Nullable org.gstreamer.audio.AudioRingBufferCallback cb) {
        try {
            DowncallHandles.gst_audio_ring_buffer_set_callback_full.invokeExact(
                    handle(),
                    (Addressable) (cb == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstAudio.Callbacks.class, "cbAudioRingBufferCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (cb == null ? MemoryAddress.NULL : Interop.registerCallback(cb)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tell the ringbuffer about the device's channel positions. This must
     * be called in when the ringbuffer is acquired.
     * @param position the device channel positions
     */
    public void setChannelPositions(@NotNull org.gstreamer.audio.AudioChannelPosition[] position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.gst_audio_ring_buffer_set_channel_positions.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(Enumeration.getValues(position), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the ringbuffer to flushing mode or normal mode.
     * <p>
     * MT safe.
     * @param flushing the new mode
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_audio_ring_buffer_set_flushing.invokeExact(
                    handle(),
                    flushing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make sure that the next sample written to the device is
     * accounted for as being the {@code sample} sample written to the
     * device. This value will be used in reporting the current
     * sample position of the ringbuffer.
     * <p>
     * This function will also clear the buffer with silence.
     * <p>
     * MT safe.
     * @param sample the sample number to set
     */
    public void setSample(long sample) {
        try {
            DowncallHandles.gst_audio_ring_buffer_set_sample.invokeExact(
                    handle(),
                    sample);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setTimestamp(int readseg, @NotNull org.gstreamer.gst.ClockTime timestamp) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        try {
            DowncallHandles.gst_audio_ring_buffer_set_timestamp.invokeExact(
                    handle(),
                    readseg,
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Start processing samples from the ringbuffer.
     * @return TRUE if the device could be started, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean start() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Stop processing samples from the ringbuffer.
     * @return TRUE if the device could be stopped, FALSE on error.
     * <p>
     * MT safe.
     */
    public boolean stop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_ring_buffer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Print debug info about the buffer sized in {@code spec} to the debug log.
     * @param spec the spec to debug
     */
    public static void debugSpecBuff(@NotNull org.gstreamer.audio.AudioRingBufferSpec spec) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        try {
            DowncallHandles.gst_audio_ring_buffer_debug_spec_buff.invokeExact(
                    spec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Print debug info about the parsed caps in {@code spec} to the debug log.
     * @param spec the spec to debug
     */
    public static void debugSpecCaps(@NotNull org.gstreamer.audio.AudioRingBufferSpec spec) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        try {
            DowncallHandles.gst_audio_ring_buffer_debug_spec_caps.invokeExact(
                    spec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parse {@code caps} into {@code spec}.
     * @param spec a spec
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return TRUE if the caps could be parsed.
     */
    public static boolean parseCaps(@NotNull org.gstreamer.audio.AudioRingBufferSpec spec, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(spec, "Parameter 'spec' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_ring_buffer_parse_caps.invokeExact(
                    spec.handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link AudioRingBuffer.Build} object constructs a {@link AudioRingBuffer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioRingBuffer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioRingBuffer} using {@link AudioRingBuffer#castFrom}.
         * @return A new instance of {@code AudioRingBuffer} with the properties 
         *         that were set in the Build object.
         */
        public AudioRingBuffer construct() {
            return AudioRingBuffer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioRingBuffer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_ring_buffer_acquire = Interop.downcallHandle(
            "gst_audio_ring_buffer_acquire",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_activate = Interop.downcallHandle(
            "gst_audio_ring_buffer_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_advance = Interop.downcallHandle(
            "gst_audio_ring_buffer_advance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_clear = Interop.downcallHandle(
            "gst_audio_ring_buffer_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_clear_all = Interop.downcallHandle(
            "gst_audio_ring_buffer_clear_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_close_device = Interop.downcallHandle(
            "gst_audio_ring_buffer_close_device",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_commit = Interop.downcallHandle(
            "gst_audio_ring_buffer_commit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_convert = Interop.downcallHandle(
            "gst_audio_ring_buffer_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_delay = Interop.downcallHandle(
            "gst_audio_ring_buffer_delay",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_device_is_open = Interop.downcallHandle(
            "gst_audio_ring_buffer_device_is_open",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_is_acquired = Interop.downcallHandle(
            "gst_audio_ring_buffer_is_acquired",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_is_active = Interop.downcallHandle(
            "gst_audio_ring_buffer_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_is_flushing = Interop.downcallHandle(
            "gst_audio_ring_buffer_is_flushing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_may_start = Interop.downcallHandle(
            "gst_audio_ring_buffer_may_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_open_device = Interop.downcallHandle(
            "gst_audio_ring_buffer_open_device",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_pause = Interop.downcallHandle(
            "gst_audio_ring_buffer_pause",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_prepare_read = Interop.downcallHandle(
            "gst_audio_ring_buffer_prepare_read",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_read = Interop.downcallHandle(
            "gst_audio_ring_buffer_read",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_release = Interop.downcallHandle(
            "gst_audio_ring_buffer_release",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_samples_done = Interop.downcallHandle(
            "gst_audio_ring_buffer_samples_done",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_callback = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_callback_full = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_callback_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_channel_positions = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_channel_positions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_flushing = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_sample = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_sample",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_set_timestamp = Interop.downcallHandle(
            "gst_audio_ring_buffer_set_timestamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_start = Interop.downcallHandle(
            "gst_audio_ring_buffer_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_stop = Interop.downcallHandle(
            "gst_audio_ring_buffer_stop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_get_type = Interop.downcallHandle(
            "gst_audio_ring_buffer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_debug_spec_buff = Interop.downcallHandle(
            "gst_audio_ring_buffer_debug_spec_buff",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_debug_spec_caps = Interop.downcallHandle(
            "gst_audio_ring_buffer_debug_spec_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_ring_buffer_parse_caps = Interop.downcallHandle(
            "gst_audio_ring_buffer_parse_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
