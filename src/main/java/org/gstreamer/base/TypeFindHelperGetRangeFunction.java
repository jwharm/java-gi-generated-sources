package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called by gst_type_find_helper_get_range() when
 * typefinding functions request to peek at the data of a stream at certain
 * offsets. If this function returns GST_FLOW_OK, the result buffer will be
 * stored in {@code buffer}. The  contents of {@code buffer} is invalid for any other
 * return value.
 * <p>
 * This function is supposed to behave exactly like a {@link org.gstreamer.gst.PadGetRangeFunction}.
 */
@FunctionalInterface
public interface TypeFindHelperGetRangeFunction {
        org.gstreamer.gst.FlowReturn onTypeFindHelperGetRangeFunction(@NotNull org.gstreamer.gst.Object obj, @Nullable org.gstreamer.gst.Object parent, long offset, int length, @NotNull Out<PointerProxy<org.gstreamer.gst.Buffer>> buffer);
}
