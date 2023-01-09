package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public enum AssistantPageType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The page has regular contents. Both the
     *  Back and forward buttons will be shown.
     */
    CONTENT(0),
    
    /**
     * The page contains an introduction to the
     *  assistant task. Only the Forward button will be shown if there is a
     *   next page.
     */
    INTRO(1),
    
    /**
     * The page lets the user confirm or deny the
     *  changes. The Back and Apply buttons will be shown.
     */
    CONFIRM(2),
    
    /**
     * The page informs the user of the changes
     *  done. Only the Close button will be shown.
     */
    SUMMARY(3),
    
    /**
     * Used for tasks that take a long time to
     *  complete, blocks the assistant until the page is marked as complete.
     *   Only the back button will be shown.
     */
    PROGRESS(4),
    
    /**
     * Used for when other page types are not
     *  appropriate. No buttons will be shown, and the application must
     *  add its own buttons through gtk_assistant_add_action_widget().
     */
    CUSTOM(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAssistantPageType";
    
    private final int value;
    
    /**
     * Create a new AssistantPageType for the provided value
     * @param numeric value the enum value
     */
    AssistantPageType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new AssistantPageType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AssistantPageType of(int value) {
        return switch (value) {
            case 0 -> CONTENT;
            case 1 -> INTRO;
            case 2 -> CONFIRM;
            case 3 -> SUMMARY;
            case 4 -> PROGRESS;
            case 5 -> CUSTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
