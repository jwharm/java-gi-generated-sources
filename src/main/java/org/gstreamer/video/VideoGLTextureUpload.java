package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoGLTextureUpload {
        boolean onVideoGLTextureUpload(@NotNull org.gstreamer.video.VideoGLTextureUploadMeta meta, PointerInteger textureId);
}
