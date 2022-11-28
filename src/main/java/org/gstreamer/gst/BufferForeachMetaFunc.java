package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called from gst_buffer_foreach_meta(). The {@code meta}
 * field will point to a the reference of the meta.
 * <p>
 * {@code buffer} should not be modified from this callback.
 * <p>
 * When this function returns {@code true}, the next meta will be
 * returned. When {@code false} is returned, gst_buffer_foreach_meta() will return.
 * <p>
 * When {@code meta} is set to {@code null}, the item will be removed from the buffer.
 */
@FunctionalInterface
public interface BufferForeachMetaFunc {
        boolean onBufferForeachMetaFunc(@NotNull org.gstreamer.gst.Buffer buffer, @Nullable Out<PointerProxy<org.gstreamer.gst.Meta>> meta);
}
