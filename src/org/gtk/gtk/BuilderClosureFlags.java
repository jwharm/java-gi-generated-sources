package org.gtk.gtk;

/**
 * The list of flags that can be passed to gtk_builder_create_closure().
 * <p>
 * New values may be added in the future for new features, so external
 * implementations of {@code Gtk.BuilderScope} should test the flags
 * for unknown values and raise a {@link BuilderError#INVALID_ATTRIBUTE} error
 * when they encounter one.
 */
public class BuilderClosureFlags {

    /**
     * The closure should be created swapped. See
     *   g_cclosure_new_swap() for details.
     */
    public static final BuilderClosureFlags SWAPPED = new BuilderClosureFlags(1);
    
    private int value;
    
    public BuilderClosureFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BuilderClosureFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BuilderClosureFlags combined(BuilderClosureFlags mask) {
        return new BuilderClosureFlags(this.getValue() | mask.getValue());
    }
    
    public static BuilderClosureFlags combined(BuilderClosureFlags mask, BuilderClosureFlags... masks) {
        int value = mask.getValue();
        for (BuilderClosureFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BuilderClosureFlags(value);
    }
    
}
