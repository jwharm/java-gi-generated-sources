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
@FunctionalInterface
public interface VideoFormatPack {
        void onVideoFormatPack(@NotNull org.gstreamer.video.VideoFormatInfo info, @NotNull org.gstreamer.video.VideoPackFlags flags, @Nullable java.lang.foreign.MemoryAddress src, int sstride, @Nullable java.lang.foreign.MemoryAddress data, PointerInteger stride, @NotNull org.gstreamer.video.VideoChromaSite chromaSite, int y, int width);
}
