package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called for each pad when using gst_element_foreach_sink_pad(),
 * gst_element_foreach_src_pad(), or gst_element_foreach_pad().
 * @version 1.14
 */
@FunctionalInterface
public interface ElementForeachPadFunc {
        boolean onElementForeachPadFunc(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Pad pad);
}
