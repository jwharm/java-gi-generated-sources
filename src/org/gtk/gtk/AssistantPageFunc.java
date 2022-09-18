package org.gtk.gtk;

/**
 * Type of callback used to calculate the next page in a <code>GtkAssistant</code>.
 * 
 * It&<code>#8217</code> s called both for computing the next page when the user presses the
 * &<code>#8220</code> forward&<code>#8221</code>  button and for handling the behavior of the &<code>#8220</code> last&<code>#8221</code>  button.
 * 
 * See {@link org.gtk.gtk.Assistant<code>#setForwardPageFunc</code> .
 */
@FunctionalInterface
public interface AssistantPageFunc {
        int onAssistantPageFunc(int currentPage);
}
