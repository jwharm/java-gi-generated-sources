package org.gtk.gtk;

@FunctionalInterface
public interface AssistantPageFunc {

    /**
     * Type of callback used to calculate the next page in a `GtkAssistant`.
     * 
     * It’s called both for computing the next page when the user presses the
     * “forward” button and for handling the behavior of the “last” button.
     * 
     * See [method@Gtk.Assistant.set_forward_page_func].
     */
    public int onAssistantPageFunc(int currentPage, jdk.incubator.foreign.MemoryAddress data);
}
