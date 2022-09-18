package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This section introduces the GVariant type system. It is based, in
 * large part, on the D-Bus type system, with two major changes and
 * some minor lifting of restrictions. The
 * {@link [D-Bus specification]}(http://dbus.freedesktop.org/doc/dbus-specification.html),
 * therefore, provides a significant amount of
 * information that is useful when working with GVariant.
 * <p>
 * The first major change with respect to the D-Bus type system is the
 * introduction of maybe (or &<code>#34</code> nullable&<code>#34</code> ) types.  Any type in GVariant can be
 * converted to a maybe type, in which case, &<code>#34</code> nothing&<code>#34</code>  (or &<code>#34</code> null&<code>#34</code> ) becomes a
 * valid value.  Maybe types have been added by introducing the
 * character &<code>#34</code> m&<code>#34</code>  to type strings.
 * <p>
 * The second major change is that the GVariant type system supports the
 * concept of &<code>#34</code> indefinite types&<code>#34</code>  -- types that are less specific than
 * the normal types found in D-Bus.  For example, it is possible to speak
 * of &<code>#34</code> an array of any type&<code>#34</code>  in GVariant, where the D-Bus type system
 * would require you to speak of &<code>#34</code> an array of integers&<code>#34</code>  or &<code>#34</code> an array of
 * strings&<code>#34</code> .  Indefinite types have been added by introducing the
 * characters &<code>#34</code> *&<code>#34</code> , &<code>#34</code> ?&<code>#34</code>  and &<code>#34</code> r&<code>#34</code>  to type strings.
 * <p>
 * Finally, all arbitrary restrictions relating to the complexity of
 * types are lifted along with the restriction that dictionary entries
 * may only appear nested inside of arrays.
 * <p>
 * Just as in D-Bus, GVariant types are described with strings (&<code>#34</code> type
 * strings&<code>#34</code> ).  Subject to the differences mentioned above, these strings
 * are of the same form as those found in D-Bus.  Note, however: D-Bus
 * always works in terms of messages and therefore individual type
 * strings appear nowhere in its interface.  Instead, &<code>#34</code> signatures&<code>#34</code> 
 * are a concatenation of the strings of the type of each argument in a
 * message.  GVariant deals with single values directly so GVariant type
 * strings always describe the type of exactly one value.  This means
 * that a D-Bus signature string is generally not a valid GVariant type
 * string -- except in the case that it is the signature of a message
 * containing exactly one argument.
 * <p>
 * An indefinite type is similar in spirit to what may be called an
 * abstract type in other type systems.  No value can exist that has an
 * indefinite type as its type, but values can exist that have types
 * that are subtypes of indefinite types.  That is to say,
 * g_variant_get_type() will never return an indefinite type, but
 * calling g_variant_is_of_type() with an indefinite type may return
 * <code>true</code>   For example, you cannot have a value that represents &<code>#34</code> an
 * array of no particular type&<code>#34</code> , but you can have an &<code>#34</code> array of integers&<code>#34</code> 
 * which certainly matches the type of &<code>#34</code> an array of no particular type&<code>#34</code> ,
 * since &<code>#34</code> array of integers&<code>#34</code>  is a subtype of &<code>#34</code> array of no particular
 * type&<code>#34</code> .
 * <p>
 * This is similar to how instances of abstract classes may not
 * directly exist in other type systems, but instances of their
 * non-abstract subtypes may.  For example, in GTK, no object that has
 * the type of <code>#GtkBin</code> can exist (since <code>#GtkBin</code> is an abstract class),
 * but a {@link org.gtk.gtk.Window} can certainly be instantiated, and you would say
 * that the {@link org.gtk.gtk.Window} is a <code>#GtkBin</code> (since {@link org.gtk.gtk.Window} is a subclass of
 * <code>#GtkBin</code> .
 * <p>
 * <h2>GVariant Type Strings</h2>
 * <p>
 * A GVariant type string can be any of the following:
 * <p>
 * <li>any basic type string (listed below)
 * <p>
 * <li>&<code>#34</code> v&<code>#34</code> , &<code>#34</code> r&<code>#34</code>  or &<code>#34</code> *&<code>#34</code> 
 * <p>
 * <li>one of the characters &<code>#39</code> a&<code>#39</code>  or &<code>#39</code> m&<code>#39</code> , followed by another type string
 * <p>
 * <li>the character &<code>#39</code> (&<code>#39</code> , followed by a concatenation of zero or more other
 *   type strings, followed by the character &<code>#39</code> )&<code>#39</code> 
 * <p>
 * <li>the character &<code>#39</code> {&<code>#39</code> , followed by a basic type string (see below),
 *   followed by another type string, followed by the character &<code>#39</code> }&<code>#39</code> 
 * <p>
 * A basic type string describes a basic type (as per
 * g_variant_type_is_basic()) and is always a single character in length.
 * The valid basic type strings are &<code>#34</code> b&<code>#34</code> , &<code>#34</code> y&<code>#34</code> , &<code>#34</code> n&<code>#34</code> , &<code>#34</code> q&<code>#34</code> , &<code>#34</code> i&<code>#34</code> , &<code>#34</code> u&<code>#34</code> , &<code>#34</code> x&<code>#34</code> , &<code>#34</code> t&<code>#34</code> ,
 * &<code>#34</code> h&<code>#34</code> , &<code>#34</code> d&<code>#34</code> , &<code>#34</code> s&<code>#34</code> , &<code>#34</code> o&<code>#34</code> , &<code>#34</code> g&<code>#34</code>  and &<code>#34</code> ?&<code>#34</code> .
 * <p>
 * The above definition is recursive to arbitrary depth. &<code>#34</code> aaaaai&<code>#34</code>  and
 * &<code>#34</code> (ui(nq((y)))s)&<code>#34</code>  are both valid type strings, as is
 * &<code>#34</code> a(aa(ui)(qna{ya(yd)}))&<code>#34</code> . In order to not hit memory limits, {@link org.gtk.glib.Variant} imposes a limit on recursion depth of 65 nested containers. This is the
 * limit in the D-Bus specification (64) plus one to allow a {@link org.gtk.gio.DBusMessage} to
 * be nested in a top-level tuple.
 * <p>
 * The meaning of each of the characters is as follows:
 * <li><code>b</code>: the type string of <code>G_VARIANT_TYPE_BOOLEAN</code>  a boolean value.
 * <li><code>y</code>: the type string of <code>G_VARIANT_TYPE_BYTE</code>  a byte.
 * <li><code>n</code>: the type string of <code>G_VARIANT_TYPE_INT16</code>  a signed 16 bit integer.
 * <li><code>q</code>: the type string of <code>G_VARIANT_TYPE_UINT16</code>  an unsigned 16 bit integer.
 * <li><code>i</code>: the type string of <code>G_VARIANT_TYPE_INT32</code>  a signed 32 bit integer.
 * <li><code>u</code>: the type string of <code>G_VARIANT_TYPE_UINT32</code>  an unsigned 32 bit integer.
 * <li><code>x</code>: the type string of <code>G_VARIANT_TYPE_INT64</code>  a signed 64 bit integer.
 * <li><code>t</code>: the type string of <code>G_VARIANT_TYPE_UINT64</code>  an unsigned 64 bit integer.
 * <li><code>h</code>: the type string of <code>G_VARIANT_TYPE_HANDLE</code>  a signed 32 bit value
 *   that, by convention, is used as an index into an array of file
 *   descriptors that are sent alongside a D-Bus message.
 * <li><code>d</code>: the type string of <code>G_VARIANT_TYPE_DOUBLE</code>  a double precision
 *   floating point value.
 * <li><code>s</code>: the type string of <code>G_VARIANT_TYPE_STRING</code>  a string.
 * <li><code>o</code>: the type string of <code>G_VARIANT_TYPE_OBJECT_PATH</code>  a string in the form
 *   of a D-Bus object path.
 * <li><code>g</code>: the type string of <code>G_VARIANT_TYPE_SIGNATURE</code>  a string in the form of
 *   a D-Bus type signature.
 * <li><code>?</code>: the type string of <code>G_VARIANT_TYPE_BASIC</code>  an indefinite type that
 *   is a supertype of any of the basic types.
 * <li><code>v</code>: the type string of <code>G_VARIANT_TYPE_VARIANT</code>  a container type that
 *   contain any other type of value.
 * <li><code>a</code>: used as a prefix on another type string to mean an array of that
 *   type; the type string &<code>#34</code> ai&<code>#34</code> , for example, is the type of an array of
 *   signed 32-bit integers.
 * <li><code>m</code>: used as a prefix on another type string to mean a &<code>#34</code> maybe&<code>#34</code> , or
 *   &<code>#34</code> nullable&<code>#34</code> , version of that type; the type string &<code>#34</code> ms&<code>#34</code> , for example,
 *   is the type of a value that maybe contains a string, or maybe contains
 *   nothing.
 * <li><code>()</code>: used to enclose zero or more other concatenated type strings to
 *   create a tuple type; the type string &<code>#34</code> (is)&<code>#34</code> , for example, is the type of
 *   a pair of an integer and a string.
 * <li><code>r</code>: the type string of <code>G_VARIANT_TYPE_TUPLE</code>  an indefinite type that is
 *   a supertype of any tuple type, regardless of the number of items.
 * <li><code>{}</code>: used to enclose a basic type string concatenated with another type
 *   string to create a dictionary entry type, which usually appears inside of
 *   an array to form a dictionary; the type string &<code>#34</code> a{sd}&<code>#34</code> , for example, is
 *   the type of a dictionary that maps strings to double precision floating
 *   point values.
 * <p>
 *   The first type (the basic type) is the key type and the second type is
 *   the value type. The reason that the first type is restricted to being a
 *   basic type is so that it can easily be hashed.
 * <li><code>*</code>: the type string of <code>G_VARIANT_TYPE_ANY</code>  the indefinite type that is
 *   a supertype of all types.  Note that, as with all type strings, this
 *   character represents exactly one type. It cannot be used inside of tuples
 *   to mean &<code>#34</code> any number of items&<code>#34</code> .
 * 
 * Any type string of a container that contains an indefinite type is,
 * itself, an indefinite type. For example, the type string &<code>#34</code> a*&<code>#34</code> 
 * (corresponding to <code>G_VARIANT_TYPE_ARRAY</code>  is an indefinite type
 * that is a supertype of every array type. &<code>#34</code> (*s)&<code>#34</code>  is a supertype
 * of all tuples that contain exactly two items where the second
 * item is a string.
 * 
 * &<code>#34</code> a{?*}&<code>#34</code>  is an indefinite type that is a supertype of all arrays
 * containing dictionary entries where the key is any basic type and
 * the value is any type at all.  This is, by definition, a dictionary,
 * so this type string corresponds to <code>G_VARIANT_TYPE_DICTIONARY</code>  Note
 * that, due to the restriction that the key of a dictionary entry must
 * be a basic type, &<code>#34</code> {**}&<code>#34</code>  is not a valid type string.
 */
public class VariantType extends io.github.jwharm.javagi.ResourceBase {

    public VariantType(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String typeString) {
        Reference RESULT = References.get(gtk_h.g_variant_type_new(Interop.allocateNativeString(typeString).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.glib.VariantType} corresponding to the type string given
     * by @type_string.  It is appropriate to call g_variant_type_free() on
     * the return value.
     * 
     * It is a programmer error to call this function with an invalid type
     * string.  Use g_variant_type_string_is_valid() if you are unsure.
     */
    public VariantType(java.lang.String typeString) {
        super(constructNew(typeString));
    }
    
    private static Reference constructNewArray(VariantType element) {
        Reference RESULT = References.get(gtk_h.g_variant_type_new_array(element.handle()), true);
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to an array of elements of the
     * type @type.
     * 
     * It is appropriate to call g_variant_type_free() on the return value.
     */
    public static VariantType newArray(VariantType element) {
        return new VariantType(constructNewArray(element));
    }
    
    private static Reference constructNewDictEntry(VariantType key, VariantType value) {
        Reference RESULT = References.get(gtk_h.g_variant_type_new_dict_entry(key.handle(), value.handle()), true);
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to a dictionary entry with a key
     * of type @key and a value of type @value.
     * 
     * It is appropriate to call g_variant_type_free() on the return value.
     */
    public static VariantType newDictEntry(VariantType key, VariantType value) {
        return new VariantType(constructNewDictEntry(key, value));
    }
    
    private static Reference constructNewMaybe(VariantType element) {
        Reference RESULT = References.get(gtk_h.g_variant_type_new_maybe(element.handle()), true);
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to a maybe instance containing
     * type @type or Nothing.
     * 
     * It is appropriate to call g_variant_type_free() on the return value.
     */
    public static VariantType newMaybe(VariantType element) {
        return new VariantType(constructNewMaybe(element));
    }
    
    private static Reference constructNewTuple(VariantType[] items, int length) {
        Reference RESULT = References.get(gtk_h.g_variant_type_new_tuple(Interop.allocateNativeArray(items).handle(), length), true);
        return RESULT;
    }
    
    /**
     * Constructs a new tuple type, from @items.
     * 
     * @length is the number of items in @items, or -1 to indicate that
     * @items is <code>null</code> terminated.
     * 
     * It is appropriate to call g_variant_type_free() on the return value.
     */
    public static VariantType newTuple(VariantType[] items, int length) {
        return new VariantType(constructNewTuple(items, length));
    }
    
    /**
     * Makes a copy of a {@link org.gtk.glib.VariantType}   It is appropriate to call
     * g_variant_type_free() on the return value.  @type may not be <code>null</code>
     */
    public VariantType copy() {
        var RESULT = gtk_h.g_variant_type_copy(handle());
        return new VariantType(References.get(RESULT, true));
    }
    
    /**
     * Returns a newly-allocated copy of the type string corresponding to
     * @type.  The returned string is nul-terminated.  It is appropriate to
     * call g_free() on the return value.
     */
    public java.lang.String dupString() {
        var RESULT = gtk_h.g_variant_type_dup_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines the element type of an array or maybe type.
     * 
     * This function may only be used with array or maybe types.
     */
    public VariantType element() {
        var RESULT = gtk_h.g_variant_type_element(handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    /**
     * Compares @type1 and @type2 for equality.
     * 
     * Only returns <code>true</code> if the types are exactly equal.  Even if one type
     * is an indefinite type and the other is a subtype of it, <code>false</code> will
     * be returned if they are not exactly equal.  If you want to check for
     * subtypes, use g_variant_type_is_subtype_of().
     * 
     * The argument types of @type1 and @type2 are only <code>#gconstpointer</code> to
     * allow use with {@link org.gtk.glib.HashTable} without function pointer casting.  For
     * both arguments, a valid {@link org.gtk.glib.VariantType} must be provided.
     */
    public boolean equal(VariantType type2) {
        var RESULT = gtk_h.g_variant_type_equal(handle(), type2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines the first item type of a tuple or dictionary entry
     * type.
     * 
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * <code>G_VARIANT_TYPE_TUPLE</code> 
     * 
     * In the case of a dictionary entry type, this returns the type of
     * the key.
     * 
     * <code>null</code> is returned in case of @type being <code>G_VARIANT_TYPE_UNIT</code> 
     * 
     * This call, together with g_variant_type_next() provides an iterator
     * interface over tuple and dictionary entry types.
     */
    public VariantType first() {
        var RESULT = gtk_h.g_variant_type_first(handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    /**
     * Frees a {@link org.gtk.glib.VariantType} that was allocated with
     * g_variant_type_copy(), g_variant_type_new() or one of the container
     * type constructor functions.
     * 
     * In the case that @type is <code>null</code>  this function does nothing.
     * 
     * Since 2.24
     */
    public void free() {
        gtk_h.g_variant_type_free(handle());
    }
    
    /**
     * Returns the length of the type string corresponding to the given
     * @type.  This function must be used to determine the valid extent of
     * the memory region returned by g_variant_type_peek_string().
     */
    public long getStringLength() {
        var RESULT = gtk_h.g_variant_type_get_string_length(handle());
        return RESULT;
    }
    
    /**
     * Hashes @type.
     * 
     * The argument type of @type is only <code>#gconstpointer</code> to allow use with
     * {@link org.gtk.glib.HashTable} without function pointer casting.  A valid
     * {@link org.gtk.glib.VariantType} must be provided.
     */
    public int hash() {
        var RESULT = gtk_h.g_variant_type_hash(handle());
        return RESULT;
    }
    
    /**
     * Determines if the given @type is an array type.  This is true if the
     * type string for @type starts with an &<code>#39</code> a&<code>#39</code> .
     * 
     * This function returns <code>true</code> for any indefinite type for which every
     * definite subtype is an array type -- <code>G_VARIANT_TYPE_ARRAY</code>  for
     * example.
     */
    public boolean isArray() {
        var RESULT = gtk_h.g_variant_type_is_array(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is a basic type.
     * 
     * Basic types are booleans, bytes, integers, doubles, strings, object
     * paths and signatures.
     * 
     * Only a basic type may be used as the key of a dictionary entry.
     * 
     * This function returns <code>false</code> for all indefinite types except
     * <code>G_VARIANT_TYPE_BASIC</code>
     */
    public boolean isBasic() {
        var RESULT = gtk_h.g_variant_type_is_basic(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is a container type.
     * 
     * Container types are any array, maybe, tuple, or dictionary
     * entry types plus the variant type.
     * 
     * This function returns <code>true</code> for any indefinite type for which every
     * definite subtype is a container -- <code>G_VARIANT_TYPE_ARRAY</code>  for
     * example.
     */
    public boolean isContainer() {
        var RESULT = gtk_h.g_variant_type_is_container(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is definite (ie: not indefinite).
     * 
     * A type is definite if its type string does not contain any indefinite
     * type characters (&<code>#39</code> *&<code>#39</code> , &<code>#39</code> ?&<code>#39</code> , or &<code>#39</code> r&<code>#39</code> ).
     * 
     * A {@link org.gtk.glib.Variant} instance may not have an indefinite type, so calling
     * this function on the result of g_variant_get_type() will always
     * result in <code>true</code> being returned.  Calling this function on an
     * indefinite type like <code>G_VARIANT_TYPE_ARRAY</code>  however, will result in
     * <code>false</code> being returned.
     */
    public boolean isDefinite() {
        var RESULT = gtk_h.g_variant_type_is_definite(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is a dictionary entry type.  This is
     * true if the type string for @type starts with a &<code>#39</code> {&<code>#39</code> .
     * 
     * This function returns <code>true</code> for any indefinite type for which every
     * definite subtype is a dictionary entry type --
     * <code>G_VARIANT_TYPE_DICT_ENTRY</code>  for example.
     */
    public boolean isDictEntry() {
        var RESULT = gtk_h.g_variant_type_is_dict_entry(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is a maybe type.  This is true if the
     * type string for @type starts with an &<code>#39</code> m&<code>#39</code> .
     * 
     * This function returns <code>true</code> for any indefinite type for which every
     * definite subtype is a maybe type -- <code>G_VARIANT_TYPE_MAYBE</code>  for
     * example.
     */
    public boolean isMaybe() {
        var RESULT = gtk_h.g_variant_type_is_maybe(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @type is a subtype of @supertype.
     * 
     * This function returns <code>true</code> if @type is a subtype of @supertype.  All
     * types are considered to be subtypes of themselves.  Aside from that,
     * only indefinite types can have subtypes.
     */
    public boolean isSubtypeOf(VariantType supertype) {
        var RESULT = gtk_h.g_variant_type_is_subtype_of(handle(), supertype.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is a tuple type.  This is true if the
     * type string for @type starts with a &<code>#39</code> (&<code>#39</code>  or if @type is
     * <code>G_VARIANT_TYPE_TUPLE</code> 
     * 
     * This function returns <code>true</code> for any indefinite type for which every
     * definite subtype is a tuple type -- <code>G_VARIANT_TYPE_TUPLE</code>  for
     * example.
     */
    public boolean isTuple() {
        var RESULT = gtk_h.g_variant_type_is_tuple(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the given @type is the variant type.
     */
    public boolean isVariant() {
        var RESULT = gtk_h.g_variant_type_is_variant(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines the key type of a dictionary entry type.
     * 
     * This function may only be used with a dictionary entry type.  Other
     * than the additional restriction, this call is equivalent to
     * g_variant_type_first().
     */
    public VariantType key() {
        var RESULT = gtk_h.g_variant_type_key(handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    /**
     * Determines the number of items contained in a tuple or
     * dictionary entry type.
     * 
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * <code>G_VARIANT_TYPE_TUPLE</code> 
     * 
     * In the case of a dictionary entry type, this function will always
     * return 2.
     */
    public long nItems() {
        var RESULT = gtk_h.g_variant_type_n_items(handle());
        return RESULT;
    }
    
    /**
     * Determines the next item type of a tuple or dictionary entry
     * type.
     * 
     * @type must be the result of a previous call to
     * g_variant_type_first() or g_variant_type_next().
     * 
     * If called on the key type of a dictionary entry then this call
     * returns the value type.  If called on the value type of a dictionary
     * entry then this call returns <code>null</code> 
     * 
     * For tuples, <code>null</code> is returned when @type is the last item in a tuple.
     */
    public VariantType next() {
        var RESULT = gtk_h.g_variant_type_next(handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    /**
     * Returns the type string corresponding to the given @type.  The
     * result is not nul-terminated; in order to determine its length you
     * must call g_variant_type_get_string_length().
     * 
     * To get a nul-terminated string, see g_variant_type_dup_string().
     */
    public java.lang.String peekString() {
        var RESULT = gtk_h.g_variant_type_peek_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines the value type of a dictionary entry type.
     * 
     * This function may only be used with a dictionary entry type.
     */
    public VariantType value() {
        var RESULT = gtk_h.g_variant_type_value(handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    public static VariantType checked(java.lang.String arg0) {
        var RESULT = gtk_h.g_variant_type_checked_(Interop.allocateNativeString(arg0).handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    public static long stringGetDepth(java.lang.String typeString) {
        var RESULT = gtk_h.g_variant_type_string_get_depth_(Interop.allocateNativeString(typeString).handle());
        return RESULT;
    }
    
    /**
     * Checks if @type_string is a valid GVariant type string.  This call is
     * equivalent to calling g_variant_type_string_scan() and confirming
     * that the following character is a nul terminator.
     */
    public static boolean stringIsValid(java.lang.String typeString) {
        var RESULT = gtk_h.g_variant_type_string_is_valid(Interop.allocateNativeString(typeString).handle());
        return (RESULT != 0);
    }
    
    /**
     * Scan for a single complete and valid GVariant type string in @string.
     * The memory pointed to by @limit (or bytes beyond it) is never
     * accessed.
     * 
     * If a valid type string is found, @endptr is updated to point to the
     * first character past the end of the string that was found and <code>true</code> is returned.
     * 
     * If there is no valid type string starting at @string, or if the type
     * string does not end before @limit then <code>false</code> is returned.
     * 
     * For the simple case of checking if a string is a valid type string,
     * see g_variant_type_string_is_valid().
     */
    public static boolean stringScan(java.lang.String string, java.lang.String limit, java.lang.String[] endptr) {
        var RESULT = gtk_h.g_variant_type_string_scan(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(limit).handle(), Interop.allocateNativeArray(endptr).handle());
        return (RESULT != 0);
    }
    
}
