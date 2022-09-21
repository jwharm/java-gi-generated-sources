package org.gtk.gtk;

/**
 * Flags affecting how a search is done.
 * <p>
 * If neither {@link TextSearchFlags#VISIBLE_ONLY} nor {@link TextSearchFlags#TEXT_ONLY} are
 * enabled, the match must be exact; the special 0xFFFC character will match
 * embedded paintables or child widgets.
 */
public class TextSearchFlags {

    /**
     * Search only visible data. A search match may
     * have invisible text interspersed.
     */
    public static final int VISIBLE_ONLY = 1;
    
    /**
     * Search only text. A match may have paintables or
     * child widgets mixed inside the matched range.
     */
    public static final int TEXT_ONLY = 2;
    
    /**
     * The text will be matched regardless of
     * what case it is in.
     */
    public static final int CASE_INSENSITIVE = 4;
    
}
