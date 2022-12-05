package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to be called when the GstEGLImage is destroyed. It should free
 * the associated {@code EGLImage} if necessary
 */
@FunctionalInterface
public interface EGLImageDestroyNotify {
        void onEGLImageDestroyNotify(@NotNull org.gstreamer.gl.egl.EGLImage image);
}
