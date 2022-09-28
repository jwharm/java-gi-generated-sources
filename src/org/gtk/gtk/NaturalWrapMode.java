package org.gtk.gtk;

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 * <p>
 * See for example the {@code Gtk.Label:natural-wrap-mode} property.
 */
public class NaturalWrapMode {

    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with {@link org.pango.WrapMode#CHAR}.
     */
    public static final NaturalWrapMode INHERIT = new NaturalWrapMode(0);
    
    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3's behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    public static final NaturalWrapMode NONE = new NaturalWrapMode(1);
    
    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using {@link org.pango.WrapMode#WORD_CHAR} as the
     *   wrap mode.
     */
    public static final NaturalWrapMode WORD = new NaturalWrapMode(2);
    
    private int value;
    
    public NaturalWrapMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NaturalWrapMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
