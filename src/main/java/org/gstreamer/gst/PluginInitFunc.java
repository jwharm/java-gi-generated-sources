package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A plugin should provide a pointer to a function of this type in the
 * plugin_desc struct.
 * This function will be called by the loader at startup. One would then
 * register each {@link PluginFeature}.
 */
@FunctionalInterface
public interface PluginInitFunc {
        boolean onPluginInitFunc(@NotNull org.gstreamer.gst.Plugin plugin);
}
