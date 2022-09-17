package org.gtk.gtk;

/**
 * Determines the page role inside a <code>GtkAssistant</code>.
 * 
 * The role is used to handle buttons sensitivity and visibility.
 * 
 * Note that an assistant needs to end its page flow with a page of type
 * <code>GTK_ASSISTANT_PAGE_CONFIRM,</code> {@link org.gtk.gtk.AssistantPageType#SUMMARY} or
 * {@link org.gtk.gtk.AssistantPageType#PROGRESS} to be correct.
 * 
 * The Cancel button will only be shown if the page isn&#8217;t &#8220;committed&#8221;.
 * See gtk_assistant_commit() for details.
 */
public enum AssistantPageType {

    /**
     * The page has regular contents. Both the
     *  Back and forward buttons will be shown.
     */
    CONTENT,
    
    /**
     * The page contains an introduction to the
     *  assistant task. Only the Forward button will be shown if there is a
     *   next page.
     */
    INTRO,
    
    /**
     * The page lets the user confirm or deny the
     *  changes. The Back and Apply buttons will be shown.
     */
    CONFIRM,
    
    /**
     * The page informs the user of the changes
     *  done. Only the Close button will be shown.
     */
    SUMMARY,
    
    /**
     * Used for tasks that take a long time to
     *  complete, blocks the assistant until the page is marked as complete.
     *   Only the back button will be shown.
     */
    PROGRESS,
    
    /**
     * Used for when other page types are not
     *  appropriate. No buttons will be shown, and the application must
     *  add its own buttons through gtk_assistant_add_action_widget().
     */
    CUSTOM;
    
    public static AssistantPageType fromValue(int value) {
        return switch(value) {
            case 0 -> CONTENT;
            case 1 -> INTRO;
            case 2 -> CONFIRM;
            case 3 -> SUMMARY;
            case 4 -> PROGRESS;
            case 5 -> CUSTOM;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CONTENT -> 0;
            case INTRO -> 1;
            case CONFIRM -> 2;
            case SUMMARY -> 3;
            case PROGRESS -> 4;
            case CUSTOM -> 5;
        };
    }

}
