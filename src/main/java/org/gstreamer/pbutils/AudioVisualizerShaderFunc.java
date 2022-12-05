package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface AudioVisualizerShaderFunc {
        void onAudioVisualizerShaderFunc(@NotNull org.gstreamer.pbutils.AudioVisualizer scope, @NotNull org.gstreamer.video.VideoFrame s, @NotNull org.gstreamer.video.VideoFrame d);
}
