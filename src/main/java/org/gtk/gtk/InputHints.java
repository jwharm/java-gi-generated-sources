package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes hints that might be taken into account by input methods
 * or applications.
 * <p>
 * Note that input methods may already tailor their behaviour according
 * to the {@code InputPurpose} of the entry.
 * <p>
 * Some common sense is expected when using these flags - mixing
 * {@link InputHints#LOWERCASE} with any of the uppercase hints makes no sense.
 * <p>
 * This enumeration may be extended in the future; input methods should
 * ignore unknown values.
 */
public class InputHints extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkInputHints";
    
    /**
     * No special behaviour suggested
     */
    public static final InputHints NONE = new InputHints(0);
    
    /**
     * Suggest checking for typos
     */
    public static final InputHints SPELLCHECK = new InputHints(1);
    
    /**
     * Suggest not checking for typos
     */
    public static final InputHints NO_SPELLCHECK = new InputHints(2);
    
    /**
     * Suggest word completion
     */
    public static final InputHints WORD_COMPLETION = new InputHints(4);
    
    /**
     * Suggest to convert all text to lowercase
     */
    public static final InputHints LOWERCASE = new InputHints(8);
    
    /**
     * Suggest to capitalize all text
     */
    public static final InputHints UPPERCASE_CHARS = new InputHints(16);
    
    /**
     * Suggest to capitalize the first
     *   character of each word
     */
    public static final InputHints UPPERCASE_WORDS = new InputHints(32);
    
    /**
     * Suggest to capitalize the
     *   first word of each sentence
     */
    public static final InputHints UPPERCASE_SENTENCES = new InputHints(64);
    
    /**
     * Suggest to not show an onscreen keyboard
     *   (e.g for a calculator that already has all the keys).
     */
    public static final InputHints INHIBIT_OSK = new InputHints(128);
    
    /**
     * The text is vertical
     */
    public static final InputHints VERTICAL_WRITING = new InputHints(256);
    
    /**
     * Suggest offering Emoji support
     */
    public static final InputHints EMOJI = new InputHints(512);
    
    /**
     * Suggest not offering Emoji support
     */
    public static final InputHints NO_EMOJI = new InputHints(1024);
    
    /**
     * Request that the input method should not
     *    update personalized data (like typing history)
     */
    public static final InputHints PRIVATE = new InputHints(2048);
    
    /**
     * Create a new InputHints with the provided value
     */
    public InputHints(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public InputHints or(InputHints... masks) {
        int value = this.getValue();
        for (InputHints arg : masks) {
            value |= arg.getValue();
        }
        return new InputHints(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static InputHints combined(InputHints mask, InputHints... masks) {
        int value = mask.getValue();
        for (InputHints arg : masks) {
            value |= arg.getValue();
        }
        return new InputHints(value);
    }
}
