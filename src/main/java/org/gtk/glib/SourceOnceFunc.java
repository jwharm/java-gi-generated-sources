package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A source function that is only called once before being removed from the main
 * context automatically.
 * <p>
 * See: g_idle_add_once(), g_timeout_add_once()
 * @version 2.74
 */
@FunctionalInterface
public interface SourceOnceFunc {
        void onSourceOnceFunc();
}
