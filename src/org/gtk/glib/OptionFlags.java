package org.gtk.glib;

/**
 * Flags which modify individual options.
 */
public class OptionFlags {

    /**
     * No flags. Since: 2.42.
     */
    public static final int NONE = 0;
    
    /**
     * The option doesn&#39;t appear in <code>--help</code> output.
     */
    public static final int HIDDEN = 1;
    
    /**
     * The option appears in the main section of the
     *     <code>--help</code> output, even if it is defined in a group.
     */
    public static final int IN_MAIN = 2;
    
    /**
     * For options of the {@link org.gtk.glib.OptionArg#NONE} kind, this
     *     flag indicates that the sense of the option is reversed.
     */
    public static final int REVERSE = 4;
    
    /**
     * For options of the {@link org.gtk.glib.OptionArg#CALLBACK} kind,
     *     this flag indicates that the callback does not take any argument
     *     (like a {@link org.gtk.glib.OptionArg#NONE} option). Since 2.8
     */
    public static final int NO_ARG = 8;
    
    /**
     * For options of the <code>G_OPTION_ARG_CALLBACK
     * </code>    kind, this flag indicates that the argument should be passed to the
     *     callback in the GLib filename encoding rather than UTF-8. Since 2.8
     */
    public static final int FILENAME = 16;
    
    /**
     * For options of the <code>G_OPTION_ARG_CALLBACK
     * </code>    kind, this flag indicates that the argument supply is optional.
     *     If no argument is given then data of <code>GOptionParseFunc</code> will be
     *     set to NULL. Since 2.8
     */
    public static final int OPTIONAL_ARG = 32;
    
    /**
     * This flag turns off the automatic conflict
     *     resolution which prefixes long option names with <code>groupname-</code> if
     *     there is a conflict. This option should only be used in situations
     *     where aliasing is necessary to model some legacy commandline interface.
     *     It is not safe to use this option, unless all option groups are under
     *     your direct control. Since 2.8.
     */
    public static final int NOALIAS = 64;
    
}
