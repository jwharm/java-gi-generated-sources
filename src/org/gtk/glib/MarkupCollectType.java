package org.gtk.glib;

/**
 * A mixed enumerated type and flags field. You must specify one type
 * (string, strdup, boolean, tristate).  Additionally, you may  optionally
 * bitwise OR the type with the flag %G_MARKUP_COLLECT_OPTIONAL.
 * 
 * It is likely that this enum will be extended in the future to
 * support other types.
 */
public class MarkupCollectType {

    /**
     * used to terminate the list of attributes
     *     to collect
     */
    public static final int INVALID = 0;
    
    /**
     * collect the string pointer directly from
     *     the attribute_values[] array. Expects a parameter of type (const
     *     char **). If %G_MARKUP_COLLECT_OPTIONAL is specified and the
     *     attribute isn't present then the pointer will be set to %NULL
     */
    public static final int STRING = 1;
    
    /**
     * as with %G_MARKUP_COLLECT_STRING, but
     *     expects a parameter of type (char **) and g_strdup()s the
     *     returned pointer. The pointer must be freed with g_free()
     */
    public static final int STRDUP = 2;
    
    /**
     * expects a parameter of type (gboolean *)
     *     and parses the attribute value as a boolean. Sets %FALSE if the
     *     attribute isn't present. Valid boolean values consist of
     *     (case-insensitive) "false", "f", "no", "n", "0" and "true", "t",
     *     "yes", "y", "1"
     */
    public static final int BOOLEAN = 3;
    
    /**
     * as with %G_MARKUP_COLLECT_BOOLEAN, but
     *     in the case of a missing attribute a value is set that compares
     *     equal to neither %FALSE nor %TRUE G_MARKUP_COLLECT_OPTIONAL is
     *     implied
     */
    public static final int TRISTATE = 4;
    
    /**
     * can be bitwise ORed with the other fields.
     *     If present, allows the attribute not to appear. A default value
     *     is set depending on what value type is used
     */
    public static final int OPTIONAL = 65536;
    
}
