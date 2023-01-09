package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is set with gst_audio_ring_buffer_set_callback() and is
 * called to fill the memory at {@code data} with {@code len} bytes of samples.
 */
/**
 * Functional interface declaration of the {@code AudioRingBufferCallback} callback.
 */
@FunctionalInterface
public interface AudioRingBufferCallback {

    /**
     * This function is set with gst_audio_ring_buffer_set_callback() and is
     * called to fill the memory at {@code data} with {@code len} bytes of samples.
     */
    void run(org.gstreamer.audio.AudioRingBuffer rbuf, byte[] data, int len);
    
    @ApiStatus.Internal default void upcall(MemoryAddress rbuf, MemoryAddress data, int len, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gstreamer.audio.AudioRingBuffer) Interop.register(rbuf, org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(rbuf, null), MemorySegment.ofAddress(data, len, SCOPE).toArray(Interop.valueLayout.C_BYTE), len);
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AudioRingBufferCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
