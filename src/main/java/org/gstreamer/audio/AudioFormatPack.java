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
        void onAudioFormatPack(@NotNull org.gstreamer.audio.AudioFormatInfo info, @NotNull org.gstreamer.audio.AudioPackFlags flags, @NotNull PointerByte src, @NotNull PointerByte data, int length);
}
