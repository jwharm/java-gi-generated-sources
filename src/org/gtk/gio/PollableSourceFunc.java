package org.gtk.gio;

@FunctionalInterface
public interface PollableSourceFunc {

    /**
     * This is the function type of the callback used for the #GSource
     * returned by g_pollable_input_stream_create_source() and
     * g_pollable_output_stream_create_source().
     */
    public boolean onPollableSourceFunc(org.gtk.gobject.Object pollableStream, jdk.incubator.foreign.MemoryAddress userData);
}
