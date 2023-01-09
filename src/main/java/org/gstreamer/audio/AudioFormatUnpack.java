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
/**
 * Functional interface declaration of the {@code AudioFormatUnpack} callback.
 */
@FunctionalInterface
public interface AudioFormatUnpack {

    /**
     * Unpacks {@code length} samples from the given data of format {@code info}.
     * The samples will be unpacked into {@code dest} which each channel
     * interleaved. {@code dest} should at least be big enough to hold {@code length} *
     * channels * size(unpack_format) bytes.
     */
    void run(org.gstreamer.audio.AudioFormatInfo info, org.gstreamer.audio.AudioPackFlags flags, PointerByte dest, PointerByte data, int length);
    
    @ApiStatus.Internal default void upcall(MemoryAddress info, int flags, MemoryAddress dest, MemoryAddress data, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(info, null), new org.gstreamer.audio.AudioPackFlags(flags), new PointerByte(dest), new PointerByte(data), length);
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AudioFormatUnpack.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
