package org.gtk.gtk;

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
public class InputHints {

    /**
     * No special behaviour suggested
     */
    public static final int NONE = 0;
    
    /**
     * Suggest checking for typos
     */
    public static final int SPELLCHECK = 1;
    
    /**
     * Suggest not checking for typos
     */
    public static final int NO_SPELLCHECK = 2;
    
    /**
     * Suggest word completion
     */
    public static final int WORD_COMPLETION = 4;
    
    /**
     * Suggest to convert all text to lowercase
     */
    public static final int LOWERCASE = 8;
    
    /**
     * Suggest to capitalize all text
     */
    public static final int UPPERCASE_CHARS = 16;
    
    /**
     * Suggest to capitalize the first
     *   character of each word
     */
    public static final int UPPERCASE_WORDS = 32;
    
    /**
     * Suggest to capitalize the
     *   first word of each sentence
     */
    public static final int UPPERCASE_SENTENCES = 64;
    
    /**
     * Suggest to not show an onscreen keyboard
     *   (e.g for a calculator that already has all the keys).
     */
    public static final int INHIBIT_OSK = 128;
    
    /**
     * The text is vertical
     */
    public static final int VERTICAL_WRITING = 256;
    
    /**
     * Suggest offering Emoji support
     */
    public static final int EMOJI = 512;
    
    /**
     * Suggest not offering Emoji support
     */
    public static final int NO_EMOJI = 1024;
    
    /**
     * Request that the input method should not
     *    update personalized data (like typing history)
     */
    public static final int PRIVATE = 2048;
    
}
