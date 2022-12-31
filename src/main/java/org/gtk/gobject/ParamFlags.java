package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Through the {@link ParamFlags} flag values, certain aspects of parameters
 * can be configured.
 * <p>
 * See also: {@code G_PARAM_STATIC_STRINGS}
 */
public class ParamFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GParamFlags";
    
    /**
     * the parameter is readable
     */
    public static final ParamFlags READABLE = new ParamFlags(1);
    
    /**
     * the parameter is writable
     */
    public static final ParamFlags WRITABLE = new ParamFlags(2);
    
    /**
     * alias for {@link ParamFlags#READABLE} | {@link ParamFlags#WRITABLE}
     */
    public static final ParamFlags READWRITE = new ParamFlags(3);
    
    /**
     * the parameter will be set upon object construction
     */
    public static final ParamFlags CONSTRUCT = new ParamFlags(4);
    
    /**
     * the parameter can only be set upon object construction
     */
    public static final ParamFlags CONSTRUCT_ONLY = new ParamFlags(8);
    
    /**
     * upon parameter conversion (see g_param_value_convert())
     *  strict validation is not required
     */
    public static final ParamFlags LAX_VALIDATION = new ParamFlags(16);
    
    /**
     * the string used as name when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final ParamFlags STATIC_NAME = new ParamFlags(32);
    
    /**
     * internal
     */
    public static final ParamFlags PRIVATE = new ParamFlags(32);
    
    /**
     * the string used as nick when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final ParamFlags STATIC_NICK = new ParamFlags(64);
    
    /**
     * the string used as blurb when constructing the
     *  parameter is guaranteed to remain valid and
     *  unmodified for the lifetime of the parameter.
     *  Since 2.8
     */
    public static final ParamFlags STATIC_BLURB = new ParamFlags(128);
    
    /**
     * calls to g_object_set_property() for this
     *   property will not automatically result in a "notify" signal being
     *   emitted: the implementation must call g_object_notify() themselves
     *   in case the property actually changes.  Since: 2.42.
     */
    public static final ParamFlags EXPLICIT_NOTIFY = new ParamFlags(1073741824);
    
    /**
     * the parameter is deprecated and will be removed
     *  in a future version. A warning will be generated if it is used
     *  while running with G_ENABLE_DIAGNOSTIC=1.
     *  Since 2.26
     */
    public static final ParamFlags DEPRECATED = new ParamFlags(-2147483648);
    
    public ParamFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ParamFlags or(ParamFlags... masks) {
        int value = this.getValue();
        for (ParamFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ParamFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ParamFlags combined(ParamFlags mask, ParamFlags... masks) {
        int value = mask.getValue();
        for (ParamFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ParamFlags(value);
    }
}
