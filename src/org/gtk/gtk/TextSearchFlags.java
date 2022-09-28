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
    
    private int value;
    
    public TextSearchFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextSearchFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TextSearchFlags combined(TextSearchFlags mask) {
        return new TextSearchFlags(this.getValue() | mask.getValue());
    }
    
    public static TextSearchFlags combined(TextSearchFlags mask, TextSearchFlags... masks) {
        int value = mask.getValue();
        for (TextSearchFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TextSearchFlags(value);
    }
    
}
