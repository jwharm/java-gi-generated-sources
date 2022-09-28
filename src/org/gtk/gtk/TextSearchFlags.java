package org.gtk.gtk;

/**
 * Flags affecting how a search is done.
 * <p>
 * If neither {@link TextSearchFlags#VISIBLE_ONLY} nor {@link TextSearchFlags#TEXT_ONLY} are
 * enabled, the match must be exact; the special 0xFFFC character will match
 * embedded paintables or child widgets.
 */
public class TextSearchFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Search only visible data. A search match may
     * have invisible text interspersed.
     */
    public static final TextSearchFlags VISIBLE_ONLY = new TextSearchFlags(1);
    
    /**
     * Search only text. A match may have paintables or
     * child widgets mixed inside the matched range.
     */
    public static final TextSearchFlags TEXT_ONLY = new TextSearchFlags(2);
    
    /**
     * The text will be matched regardless of
     * what case it is in.
     */
    public static final TextSearchFlags CASE_INSENSITIVE = new TextSearchFlags(4);
    
    public TextSearchFlags(int value) {
        super(value);
    }
    
}
