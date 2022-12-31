package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Unpacks {@code length} samples from the given data of format {@code info}.
 * The samples will be unpacked into {@code dest} which each channel
 * interleaved. {@code dest} should at least be big enough to hold {@code length} *
 * channels * size(unpack_format) bytes.
 */
@FunctionalInterface
public interface AudioFormatUnpack {
    void run(org.gstreamer.audio.AudioFormatInfo info, org.gstreamer.audio.AudioPackFlags flags, PointerByte dest, PointerByte data, int length);

    @ApiStatus.Internal default void upcall(MemoryAddress info, int flags, MemoryAddress dest, MemoryAddress data, int length) {
        run(org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(info, Ownership.NONE), new org.gstreamer.audio.AudioPackFlags(flags), new PointerByte(dest), new PointerByte(data), length);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioFormatUnpack.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
