package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface GLFilterRenderFunc {
        boolean onGLFilterRenderFunc(@NotNull org.gstreamer.gl.GLFilter filter, @NotNull org.gstreamer.gl.GLMemory inTex);
}
