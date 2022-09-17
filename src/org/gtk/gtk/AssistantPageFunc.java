package org.gtk.gtk;

/**
 * Type of callback used to calculate the next page in a <code>GtkAssistant</code>.
 * 
 * It&#8217;s called both for computing the next page when the user presses the
 * &#8220;forward&#8221; button and for handling the behavior of the &#8220;last&#8221; button.
 * 
 * See {@link org.gtk.gtk.Assistant#setForwardPageFunc}.
 */
@FunctionalInterface
public interface AssistantPageFunc {
        int onAssistantPageFunc(int currentPage);
}
