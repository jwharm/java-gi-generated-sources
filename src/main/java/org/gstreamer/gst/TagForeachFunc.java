package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_tag_list_foreach(). The function may
 * not modify the tag list.
 */
@FunctionalInterface
public interface TagForeachFunc {
        void onTagForeachFunc(@NotNull org.gstreamer.gst.TagList list, @NotNull java.lang.String tag);
}
