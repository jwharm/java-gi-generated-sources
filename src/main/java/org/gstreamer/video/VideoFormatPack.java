package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Packs {@code width} pixels from {@code src} to the given planes and strides in the
 * format {@code info}. The pixels from source have each component interleaved
 * and will be packed into the planes in {@code data}.
 * <p>
 * This function operates on pack_lines lines, meaning that {@code src} should
 * contain at least pack_lines lines with a stride of {@code sstride} and {@code y}
 * should be a multiple of pack_lines.
 * <p>
 * Subsampled formats will use the horizontally and vertically cosited
 * component from the source. Subsampling should be performed before
 * packing.
 * <p>
 * Because this function does not have a x coordinate, it is not possible to
 * pack pixels starting from an unaligned position. For tiled images this
 * means that packing should start from a tile coordinate. For subsampled
 * formats this means that a complete pixel needs to be packed.
 */
/**
 * Functional interface declaration of the {@code VideoFormatPack} callback.
 */
@FunctionalInterface
public interface VideoFormatPack {

    /**
     * Packs {@code width} pixels from {@code src} to the given planes and strides in the
     * format {@code info}. The pixels from source have each component interleaved
     * and will be packed into the planes in {@code data}.
     * <p>
     * This function operates on pack_lines lines, meaning that {@code src} should
     * contain at least pack_lines lines with a stride of {@code sstride} and {@code y}
     * should be a multiple of pack_lines.
     * <p>
     * Subsampled formats will use the horizontally and vertically cosited
     * component from the source. Subsampling should be performed before
     * packing.
     * <p>
     * Because this function does not have a x coordinate, it is not possible to
     * pack pixels starting from an unaligned position. For tiled images this
     * means that packing should start from a tile coordinate. For subsampled
     * formats this means that a complete pixel needs to be packed.
     */
    void run(org.gstreamer.video.VideoFormatInfo info, org.gstreamer.video.VideoPackFlags flags, @Nullable java.lang.foreign.MemoryAddress src, int sstride, @Nullable java.lang.foreign.MemoryAddress data, PointerInteger stride, org.gstreamer.video.VideoChromaSite chromaSite, int y, int width);
    
    @ApiStatus.Internal default void upcall(MemoryAddress info, int flags, MemoryAddress src, int sstride, MemoryAddress data, MemoryAddress stride, int chromaSite, int y, int width) {
        run(org.gstreamer.video.VideoFormatInfo.fromAddress.marshal(info, null), new org.gstreamer.video.VideoPackFlags(flags), src, sstride, data, new PointerInteger(stride), new org.gstreamer.video.VideoChromaSite(chromaSite), y, width);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VideoFormatPack.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
