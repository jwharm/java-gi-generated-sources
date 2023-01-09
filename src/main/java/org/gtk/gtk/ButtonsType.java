package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prebuilt sets of buttons for {@code GtkDialog}.
 * <p>
 * If none of these choices are appropriate, simply use
 * {@link ButtonsType#NONE} and call {@link Dialog#addButtons}.
 * <p>
 * <blockquote>
 *  Please note that {@link ButtonsType#OK}, {@link ButtonsType#YES_NO}
 *  and {@link ButtonsType#OK_CANCEL} are discouraged by the
 *  <a href="http://library.gnome.org/devel/hig-book/stable/">GNOME Human Interface Guidelines</a>.
 * </blockquote>
 */
public enum ButtonsType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no buttons at all
     */
    NONE(0),
    
    /**
     * an OK button
     */
    OK(1),
    
    /**
     * a Close button
     */
    CLOSE(2),
    
    /**
     * a Cancel button
     */
    CANCEL(3),
    
    /**
     * Yes and No buttons
     */
    YES_NO(4),
    
    /**
     * OK and Cancel buttons
     */
    OK_CANCEL(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkButtonsType";
    
    private final int value;
    
    /**
     * Create a new ButtonsType for the provided value
     * @param numeric value the enum value
     */
    ButtonsType(int value) {
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
     * Create a new ButtonsType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ButtonsType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> OK;
            case 2 -> CLOSE;
            case 3 -> CANCEL;
            case 4 -> YES_NO;
            case 5 -> OK_CANCEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
