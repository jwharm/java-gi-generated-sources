package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Packs {@code length} samples from {@code src} to the data array in format {@code info}.
 * The samples from source have each channel interleaved
 * and will be packed into {@code data}.
 */
@FunctionalInterface
public interface AudioFormatPack {
    void run(org.gstreamer.audio.AudioFormatInfo info, org.gstreamer.audio.AudioPackFlags flags, PointerByte src, PointerByte data, int length);

    @ApiStatus.Internal default void upcall(MemoryAddress info, int flags, MemoryAddress src, MemoryAddress data, int length) {
        run(org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(info, Ownership.NONE), new org.gstreamer.audio.AudioPackFlags(flags), new PointerByte(src), new PointerByte(data), length);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioFormatPack.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
