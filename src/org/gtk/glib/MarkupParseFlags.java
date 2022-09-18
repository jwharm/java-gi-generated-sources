package org.gtk.glib;

/**
 * Flags that affect the behaviour of the parser.
 */
public class MarkupParseFlags {

    /**
     * flag you should not use
     */
    public static final int DO_NOT_USE_THIS_UNSUPPORTED_FLAG = 1;
    
    /**
     * When this flag is set, CDATA marked
     *     sections are not passed literally to the @passthrough function of
     *     the parser. Instead, the content of the section (without the
     *     <code>&<code>#60</code> !{@link [CDATA[</code> and <code>]}]&<code>#62</code> </code>) is
     *     passed to the @text function. This flag was added in GLib 2.12
     */
    public static final int TREAT_CDATA_AS_TEXT = 2;
    
    /**
     * Normally errors caught by GMarkup
     *     itself have line/column information prefixed to them to let the
     *     caller know the location of the error. When this flag is set the
     *     location information is also prefixed to errors generated by the
     *     {@link org.gtk.glib.MarkupParser} implementation functions
     */
    public static final int PREFIX_ERROR_POSITION = 4;
    
    /**
     * Ignore (don&<code>#39</code> t report) qualified
     *     attributes and tags, along with their contents.  A qualified
     *     attribute or tag is one that contains &<code>#39</code> :&<code>#39</code>  in its name (ie: is in
     *     another namespace).  Since: 2.40.
     */
    public static final int IGNORE_QUALIFIED = 8;
    
}
