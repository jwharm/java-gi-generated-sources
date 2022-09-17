package org.gtk.glib;

/**
 * A mixed enumerated type and flags field. You must specify one type
 * (string, strdup, boolean, tristate).  Additionally, you may  optionally
 * bitwise OR the type with the flag <code>G_MARKUP_COLLECT_OPTIONAL.
 * 
 * It</code> is likely that this enum will be extended in the future to
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
     *     char **). If {@link org.gtk.glib.MarkupCollectType#OPTIONAL} is specified and the
     *     attribute isn&#39;t present then the pointer will be set to is specified and the
     *     attribute isn&#39;t present then the pointer will be set to %NULL
     */
    public static final int STRING = 1;
    
    /**
     * as with <code>G_MARKUP_COLLECT_STRING,</code> but
     *     expects a parameter of type (char **) and g_strdup()s the
     *     returned pointer. The pointer must be freed with g_free()
     */
    public static final int STRDUP = 2;
    
    /**
     * expects a parameter of type (gboolean *)
     *     and parses the attribute value as a boolean. Sets <code>false</code> if the
     *     attribute isn&#39;t present. Valid boolean values consist of
     *     (case-insensitive) &#34;false&#34;, &#34;f&#34;, &#34;no&#34;, &#34;n&#34;, &#34;0&#34; and &#34;true&#34;, &#34;t&#34;,
     *     &#34;yes&#34;, &#34;y&#34;, &#34;1&#34;
     */
    public static final int BOOLEAN = 3;
    
    /**
     * as with <code>G_MARKUP_COLLECT_BOOLEAN,</code> but
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
