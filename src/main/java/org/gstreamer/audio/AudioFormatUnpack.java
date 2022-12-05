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
        void onAudioFormatUnpack(@NotNull org.gstreamer.audio.AudioFormatInfo info, @NotNull org.gstreamer.audio.AudioPackFlags flags, @NotNull PointerByte dest, @NotNull PointerByte data, int length);
}
