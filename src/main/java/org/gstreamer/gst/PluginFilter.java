package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that can be used with e.g. gst_registry_plugin_filter()
 * to get a list of plugins that match certain criteria.
 */
@FunctionalInterface
public interface PluginFilter {
        boolean onPluginFilter(@NotNull org.gstreamer.gst.Plugin plugin);
}
