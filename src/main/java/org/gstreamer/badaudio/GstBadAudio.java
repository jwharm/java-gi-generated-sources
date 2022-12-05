package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstBadAudio namespace.
 */
public final class GstBadAudio {
    
    static {
        System.loadLibrary("gstbadaudio-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * The name of the template for the sink pad.
     */
    public static final java.lang.String NONSTREAM_AUDIO_DECODER_SINK_NAME = "sink";
    
    /**
     * The name of the template for the source pad.
     */
    public static final java.lang.String NONSTREAM_AUDIO_DECODER_SRC_NAME = "src";
}
