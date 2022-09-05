package org.gtk.glib;

@FunctionalInterface
public interface SourceDisposeFunc {

    /**
     * Dispose function for @source. See g_source_set_dispose_function() for
     * details.
     */
    public void onSourceDisposeFunc(Source source);
}
