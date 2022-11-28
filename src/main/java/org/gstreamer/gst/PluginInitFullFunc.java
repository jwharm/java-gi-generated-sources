package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A plugin should provide a pointer to a function of either {@link PluginInitFunc}
 * or this type in the plugin_desc struct.
 * The function will be called by the loader at startup. One would then
 * register each {@link PluginFeature}. This version allows
 * user data to be passed to init function (useful for bindings).
 */
@FunctionalInterface
public interface PluginInitFullFunc {
        boolean onPluginInitFullFunc(@NotNull org.gstreamer.gst.Plugin plugin);
}
