package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is set with gst_audio_ring_buffer_set_callback() and is
 * called to fill the memory at {@code data} with {@code len} bytes of samples.
 */
@FunctionalInterface
public interface AudioRingBufferCallback {
    void run(org.gstreamer.audio.AudioRingBuffer rbuf, byte[] data, int len);

    @ApiStatus.Internal default void upcall(MemoryAddress rbuf, MemoryAddress data, int len, MemoryAddress userData) {
        run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(rbuf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(rbuf, Ownership.NONE), MemorySegment.ofAddress(data, len, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), len);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioRingBufferCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
