package org.gtk.glib;

/**
 * The range of possible top-level types of {@link Variant} instances.
 */
public class VariantClass extends io.github.jwharm.javagi.Enumeration {

    /**
     * The {@link Variant} is a boolean.
     */
    public static final VariantClass BOOLEAN = new VariantClass(98);
    
    /**
     * The {@link Variant} is a byte.
     */
    public static final VariantClass BYTE = new VariantClass(121);
    
    /**
     * The {@link Variant} is a signed 16 bit integer.
     */
    public static final VariantClass INT16 = new VariantClass(110);
    
    /**
     * The {@link Variant} is an unsigned 16 bit integer.
     */
    public static final VariantClass UINT16 = new VariantClass(113);
    
    /**
     * The {@link Variant} is a signed 32 bit integer.
     */
    public static final VariantClass INT32 = new VariantClass(105);
    
    /**
     * The {@link Variant} is an unsigned 32 bit integer.
     */
    public static final VariantClass UINT32 = new VariantClass(117);
    
    /**
     * The {@link Variant} is a signed 64 bit integer.
     */
    public static final VariantClass INT64 = new VariantClass(120);
    
    /**
     * The {@link Variant} is an unsigned 64 bit integer.
     */
    public static final VariantClass UINT64 = new VariantClass(116);
    
    /**
     * The {@link Variant} is a file handle index.
     */
    public static final VariantClass HANDLE = new VariantClass(104);
    
    /**
     * The {@link Variant} is a double precision floating
     *                          point value.
     */
    public static final VariantClass DOUBLE = new VariantClass(100);
    
    /**
     * The {@link Variant} is a normal string.
     */
    public static final VariantClass STRING = new VariantClass(115);
    
    /**
     * The {@link Variant} is a D-Bus object path
     *                               string.
     */
    public static final VariantClass OBJECT_PATH = new VariantClass(111);
    
    /**
     * The {@link Variant} is a D-Bus signature string.
     */
    public static final VariantClass SIGNATURE = new VariantClass(103);
    
    /**
     * The {@link Variant} is a variant.
     */
    public static final VariantClass VARIANT = new VariantClass(118);
    
    /**
     * The {@link Variant} is a maybe-typed value.
     */
    public static final VariantClass MAYBE = new VariantClass(109);
    
    /**
     * The {@link Variant} is an array.
     */
    public static final VariantClass ARRAY = new VariantClass(97);
    
    /**
     * The {@link Variant} is a tuple.
     */
    public static final VariantClass TUPLE = new VariantClass(40);
    
    /**
     * The {@link Variant} is a dictionary entry.
     */
    public static final VariantClass DICT_ENTRY = new VariantClass(123);
    
    public VariantClass(int value) {
        super(value);
    }
    
}
