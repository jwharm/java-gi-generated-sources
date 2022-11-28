package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when the {@link CollectData} will be freed.
 * It is passed the pointer to the structure and should free any custom
 * memory and resources allocated for it.
 */
@FunctionalInterface
public interface CollectDataDestroyNotify {
        void onCollectDataDestroyNotify(@NotNull org.gstreamer.base.CollectData data);
}
