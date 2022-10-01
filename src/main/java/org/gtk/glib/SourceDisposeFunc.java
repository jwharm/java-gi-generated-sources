package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Dispose function for {@code source}. See g_source_set_dispose_function() for
 * details.
 */
@FunctionalInterface
public interface SourceDisposeFunc {
        void onSourceDisposeFunc(Source source);
}
