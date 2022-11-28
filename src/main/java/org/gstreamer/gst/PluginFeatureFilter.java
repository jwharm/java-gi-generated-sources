package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that can be used with e.g. gst_registry_feature_filter()
 * to get a list of pluginfeature that match certain criteria.
 */
@FunctionalInterface
public interface PluginFeatureFilter {
        boolean onPluginFeatureFilter(@NotNull org.gstreamer.gst.PluginFeature feature);
}
