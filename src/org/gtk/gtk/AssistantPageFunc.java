package org.gtk.gtk;

/**
 * Type of callback used to calculate the next page in a `GtkAssistant`.
 * 
 * It’s called both for computing the next page when the user presses the
 * “forward” button and for handling the behavior of the “last” button.
 * 
 * See [method@Gtk.Assistant.set_forward_page_func].
 */
@FunctionalInterface
public interface AssistantPageFunc {
        int onAssistantPageFunc(int currentPage);
}
