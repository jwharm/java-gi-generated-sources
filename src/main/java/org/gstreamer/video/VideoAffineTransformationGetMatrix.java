package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoAffineTransformationGetMatrix {
        boolean onVideoAffineTransformationGetMatrix(@NotNull org.gstreamer.video.VideoAffineTransformationMeta meta, PointerFloat matrix);
}
