package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback prototype used in {@code gst_element_call_async}
 */
@FunctionalInterface
public interface ElementCallAsyncFunc {
        void onElementCallAsyncFunc(@NotNull org.gstreamer.gst.Element element);
}
