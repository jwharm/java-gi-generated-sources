package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Dispose function for {@code source}. See g_source_set_dispose_function() for
 * details.
 * @version 2.64
 */
@FunctionalInterface
public interface SourceDisposeFunc {
        void onSourceDisposeFunc(@NotNull org.gtk.glib.Source source);
}
