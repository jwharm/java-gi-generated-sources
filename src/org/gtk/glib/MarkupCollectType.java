package org.gtk.glib;

/**
 * A mixed enumerated type and flags field. You must specify one type
 * (string, strdup, boolean, tristate).  Additionally, you may  optionally
 * bitwise OR the type with the flag {@link org.gtk.glib.MarkupCollectType<code>#OPTIONAL</code>  
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
     *     the attribute_values{@link []} array. Expects a parameter of type (const
     *     char **). If {@link org.gtk.glib.MarkupCollectType<code>#OPTIONAL</code>  is specified and the
     *     attribute isn&<code>#39</code> t present then the pointer will be set to is specified and the
     *     attribute isn&<code>#39</code> t present then the pointer will be set to %NULL
     */
    public static final int STRING = 1;
    
    /**
     * as with {@link org.gtk.glib.MarkupCollectType<code>#STRING</code>   but
     *     expects a parameter of type (char **) and g_strdup()s the
     *     returned pointer. The pointer must be freed with g_free()
     */
    public static final int STRDUP = 2;
    
    /**
     * expects a parameter of type (gboolean *)
     *     and parses the attribute value as a boolean. Sets <code>false</code> if the
     *     attribute isn&<code>#39</code> t present. Valid boolean values consist of
     *     (case-insensitive) &<code>#34</code> false&<code>#34</code> , &<code>#34</code> f&<code>#34</code> , &<code>#34</code> no&<code>#34</code> , &<code>#34</code> n&<code>#34</code> , &<code>#34</code> 0&<code>#34</code>  and &<code>#34</code> true&<code>#34</code> , &<code>#34</code> t&<code>#34</code> ,
     *     &<code>#34</code> yes&<code>#34</code> , &<code>#34</code> y&<code>#34</code> , &<code>#34</code> 1&<code>#34</code>
     */
    public static final int BOOLEAN = 3;
    
    /**
     * as with {@link org.gtk.glib.MarkupCollectType<code>#BOOLEAN</code>   but
     *     in the case of a missing attribute a value is set that compares
     *     equal to neither <code>false</code> nor <code>true</code> G_MARKUP_COLLECT_OPTIONAL is
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
