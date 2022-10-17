package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_timeout_add(),
 * g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
 * <p>
 * When calling g_source_set_callback(), you may need to cast a function of a
 * different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
 * incompatible function types.
 */
@FunctionalInterface
public interface SourceFunc {
        boolean onSourceFunc();
}
