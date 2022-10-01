package org.gtk.gtk;

/**
 * Determines the page role inside a {@code GtkAssistant}.
 * <p>
 * The role is used to handle buttons sensitivity and visibility.
 * <p>
 * Note that an assistant needs to end its page flow with a page of type
 * {@link AssistantPageType#CONFIRM}, {@link AssistantPageType#SUMMARY} or
 * {@link AssistantPageType#PROGRESS} to be correct.
 * <p>
 * The Cancel button will only be shown if the page isn’t “committed”.
 * See gtk_assistant_commit() for details.
 */
public class AssistantPageType extends io.github.jwharm.javagi.Enumeration {

    /**
     * The page has regular contents. Both the
     *  Back and forward buttons will be shown.
     */
    public static final AssistantPageType CONTENT = new AssistantPageType(0);
    
    /**
     * The page contains an introduction to the
     *  assistant task. Only the Forward button will be shown if there is a
     *   next page.
     */
    public static final AssistantPageType INTRO = new AssistantPageType(1);
    
    /**
     * The page lets the user confirm or deny the
     *  changes. The Back and Apply buttons will be shown.
     */
    public static final AssistantPageType CONFIRM = new AssistantPageType(2);
    
    /**
     * The page informs the user of the changes
     *  done. Only the Close button will be shown.
     */
    public static final AssistantPageType SUMMARY = new AssistantPageType(3);
    
    /**
     * Used for tasks that take a long time to
     *  complete, blocks the assistant until the page is marked as complete.
     *   Only the back button will be shown.
     */
    public static final AssistantPageType PROGRESS = new AssistantPageType(4);
    
    /**
     * Used for when other page types are not
     *  appropriate. No buttons will be shown, and the application must
     *  add its own buttons through gtk_assistant_add_action_widget().
     */
    public static final AssistantPageType CUSTOM = new AssistantPageType(5);
    
    public AssistantPageType(int value) {
        super(value);
    }
    
}
