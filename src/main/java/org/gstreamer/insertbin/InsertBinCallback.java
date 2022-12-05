package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the prototype of callbacks to be called when the operation completes.
 * It could be called at any time, including as a re-entrant call while the
 * operation is requested.
 */
@FunctionalInterface
public interface InsertBinCallback {
        void onInsertBinCallback(@NotNull org.gstreamer.insertbin.InsertBin insertbin, @NotNull org.gstreamer.gst.Element element, boolean success);
}
