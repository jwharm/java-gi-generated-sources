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
        void onAudioRingBufferCallback(@NotNull org.gstreamer.audio.AudioRingBuffer rbuf, @NotNull PointerByte data, int len);
}
