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
/**
 * Functional interface declaration of the {@code AudioFormatPack} callback.
 */
@FunctionalInterface
public interface AudioFormatPack {

    /**
     * Packs {@code length} samples from {@code src} to the data array in format {@code info}.
     * The samples from source have each channel interleaved
     * and will be packed into {@code data}.
     */
    void run(org.gstreamer.audio.AudioFormatInfo info, org.gstreamer.audio.AudioPackFlags flags, PointerByte src, PointerByte data, int length);
    
    @ApiStatus.Internal default void upcall(MemoryAddress info, int flags, MemoryAddress src, MemoryAddress data, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(info, null), new org.gstreamer.audio.AudioPackFlags(flags), new PointerByte(src), new PointerByte(data), length);
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AudioFormatPack.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
