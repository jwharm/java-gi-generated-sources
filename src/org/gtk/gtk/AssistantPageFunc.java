package org.gtk.gtk;

/**
 * Type of callback used to calculate the next page in a {@code GtkAssistant}.
 * <p>
 * It’s called both for computing the next page when the user presses the
 * “forward” button and for handling the behavior of the “last” button.
 * <p>
 * See {@link Assistant#setForwardPageFunc}.
 */
@FunctionalInterface
public interface AssistantPageFunc {
        int onAssistantPageFunc(int currentPage);
}
