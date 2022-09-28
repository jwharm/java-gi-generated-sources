package org.gtk.glib;

/**
 * Flags that affect the behaviour of the parser.
 */
public class MarkupParseFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * flag you should not use
     */
    public static final MarkupParseFlags DO_NOT_USE_THIS_UNSUPPORTED_FLAG = new MarkupParseFlags(1);
    
    /**
     * When this flag is set, CDATA marked
     *     sections are not passed literally to the {@code passthrough} function of
     *     the parser. Instead, the content of the section (without the
     *     {@code <![CDATA[} and {@code ]]>}) is
     *     passed to the {@code text} function. This flag was added in GLib 2.12
     */
    public static final MarkupParseFlags TREAT_CDATA_AS_TEXT = new MarkupParseFlags(2);
    
    /**
     * Normally errors caught by GMarkup
     *     itself have line/column information prefixed to them to let the
     *     caller know the location of the error. When this flag is set the
     *     location information is also prefixed to errors generated by the
     *     {@link MarkupParser} implementation functions
     */
    public static final MarkupParseFlags PREFIX_ERROR_POSITION = new MarkupParseFlags(4);
    
    /**
     * Ignore (don't report) qualified
     *     attributes and tags, along with their contents.  A qualified
     *     attribute or tag is one that contains ':' in its name (ie: is in
     *     another namespace).  Since: 2.40.
     */
    public static final MarkupParseFlags IGNORE_QUALIFIED = new MarkupParseFlags(8);
    
    public MarkupParseFlags(int value) {
        super(value);
    }
    
}
