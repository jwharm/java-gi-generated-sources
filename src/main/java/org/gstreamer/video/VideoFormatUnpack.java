package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Unpacks {@code width} pixels from the given planes and strides containing data of
 * format {@code info}. The pixels will be unpacked into {@code dest} with each component
 * interleaved as per {@code info}'s unpack_format, which will usually be one of
 * {@code GST_VIDEO_FORMAT_ARGB}, {@code GST_VIDEO_FORMAT_AYUV}, {@code GST_VIDEO_FORMAT_ARGB64} or
 * {@code GST_VIDEO_FORMAT_AYUV64} depending on the format to unpack.
 * {@code dest} should at least be big enough to hold {@code width} * bytes_per_pixel bytes
 * where bytes_per_pixel relates to the unpack format and will usually be
 * either 4 or 8 depending on the unpack format. bytes_per_pixel will be
 * the same as the pixel stride for plane 0 for the above formats.
 * <p>
 * For subsampled formats, the components will be duplicated in the destination
 * array. Reconstruction of the missing components can be performed in a
 * separate step after unpacking.
 */
@FunctionalInterface
public interface VideoFormatUnpack {
        void onVideoFormatUnpack(@NotNull org.gstreamer.video.VideoFormatInfo info, @NotNull org.gstreamer.video.VideoPackFlags flags, @Nullable java.lang.foreign.MemoryAddress dest, @Nullable java.lang.foreign.MemoryAddress data, PointerInteger stride, int x, int y, int width);
}
