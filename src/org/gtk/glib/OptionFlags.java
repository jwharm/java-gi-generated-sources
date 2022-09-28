package org.gtk.glib;

/**
 * Flags which modify individual options.
 */
public class OptionFlags {

    /**
     * No flags. Since: 2.42.
     */
    public static final OptionFlags NONE = new OptionFlags(0);
    
    /**
     * The option doesn't appear in {@code --help} output.
     */
    public static final OptionFlags HIDDEN = new OptionFlags(1);
    
    /**
     * The option appears in the main section of the
     *     {@code --help} output, even if it is defined in a group.
     */
    public static final OptionFlags IN_MAIN = new OptionFlags(2);
    
    /**
     * For options of the {@link OptionArg#NONE} kind, this
     *     flag indicates that the sense of the option is reversed.
     */
    public static final OptionFlags REVERSE = new OptionFlags(4);
    
    /**
     * For options of the {@link OptionArg#CALLBACK} kind,
     *     this flag indicates that the callback does not take any argument
     *     (like a {@link OptionArg#NONE} option). Since 2.8
     */
    public static final OptionFlags NO_ARG = new OptionFlags(8);
    
    /**
     * For options of the {@link OptionArg#CALLBACK}
     *     kind, this flag indicates that the argument should be passed to the
     *     callback in the GLib filename encoding rather than UTF-8. Since 2.8
     */
    public static final OptionFlags FILENAME = new OptionFlags(16);
    
    /**
     * For options of the {@link OptionArg#CALLBACK}
     *     kind, this flag indicates that the argument supply is optional.
     *     If no argument is given then data of {@code GOptionParseFunc} will be
     *     set to NULL. Since 2.8
     */
    public static final OptionFlags OPTIONAL_ARG = new OptionFlags(32);
    
    /**
     * This flag turns off the automatic conflict
     *     resolution which prefixes long option names with {@code groupname-} if
     *     there is a conflict. This option should only be used in situations
     *     where aliasing is necessary to model some legacy commandline interface.
     *     It is not safe to use this option, unless all option groups are under
     *     your direct control. Since 2.8.
     */
    public static final OptionFlags NOALIAS = new OptionFlags(64);
    
    private int value;
    
    public OptionFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OptionFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public OptionFlags combined(OptionFlags mask) {
        return new OptionFlags(this.getValue() | mask.getValue());
    }
    
    public static OptionFlags combined(OptionFlags mask, OptionFlags... masks) {
        int value = mask.getValue();
        for (OptionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new OptionFlags(value);
    }
    
}
