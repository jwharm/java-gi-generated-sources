package org.gtk.glib;

/**
 * Dispose function for @source. See g_source_set_dispose_function() for
 * details.
 */
@FunctionalInterface
public interface SourceDisposeFunc {
        void onSourceDisposeFunc(Source source);
}
