package org.gtk.gobject;

/**
 * Through the #GParamFlags flag values, certain aspects of parameters
 * can be configured.
 * 
 * See also: 
 *         
 *       
 *     
 *     
 *       Through the #GParamFlags flag values, certain aspects of parameters
 * can be configured.
 * 
 * See also: %G_PARAM_STATIC_STRINGS
 */
public class ParamFlags {

    /**
     * the parameter is readable
     */
    public static final int READABLE = 1;
    
    /**
     * the parameter is writable
     */
    public static final int WRITABLE = 2;
    
    /**
     * alias for {@link org.gtk.gobject.ParamFlags#READABLE} | | %G_PARAM_WRITABLE
     */
    public static final int READWRITE = 3;
    
    /**
     * the parameter will be set upon object construction
     */
    public static final int CONSTRUCT = 4;
    
    /**
     * the parameter can only be set upon object construction
     */
    public static final int CONSTRUCT_ONLY = 8;
    
    /**
     * upon parameter conversion (see g_param_value_convert())
     *  strict validation is not required
     */
    public static final int LAX_VALIDATION = 16;
    
    /**
     * the string used as name when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final int STATIC_NAME = 32;
    
    /**
     * internal
     */
    public static final int PRIVATE = 32;
    
    /**
     * the string used as nick when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final int STATIC_NICK = 64;
    
    /**
     * the string used as blurb when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final int STATIC_BLURB = 128;
    
    /**
     * calls to g_object_set_property() for this
     *   property will not automatically result in a &#34;notify&#34; signal being
     *   emitted: the implementation must call g_object_notify() themselves
     *   in case the property actually changes.  Since: 2.42.
     */
    public static final int EXPLICIT_NOTIFY = 1073741824;
    
    /**
     * the parameter is deprecated and will be removed
     *  in a future version. A warning will be generated if it is used
     *  while running with G_ENABLE_DIAGNOSTIC=1.
     *  Since 2.26
     */
    public static final int DEPRECATED = 0;
    
}
