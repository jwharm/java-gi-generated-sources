package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This section introduces the GVariant type system. It is based, in
 * large part, on the D-Bus type system, with two major changes and
 * some minor lifting of restrictions. The
 * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html">D-Bus specification</a>,
 * therefore, provides a significant amount of
 * information that is useful when working with GVariant.
 * <p>
 * The first major change with respect to the D-Bus type system is the
 * introduction of maybe (or "nullable") types.  Any type in GVariant can be
 * converted to a maybe type, in which case, "nothing" (or "null") becomes a
 * valid value.  Maybe types have been added by introducing the
 * character "m" to type strings.
 * <p>
 * The second major change is that the GVariant type system supports the
 * concept of "indefinite types" -- types that are less specific than
 * the normal types found in D-Bus.  For example, it is possible to speak
 * of "an array of any type" in GVariant, where the D-Bus type system
 * would require you to speak of "an array of integers" or "an array of
 * strings".  Indefinite types have been added by introducing the
 * characters "*", "?" and "r" to type strings.
 * <p>
 * Finally, all arbitrary restrictions relating to the complexity of
 * types are lifted along with the restriction that dictionary entries
 * may only appear nested inside of arrays.
 * <p>
 * Just as in D-Bus, GVariant types are described with strings ("type
 * strings").  Subject to the differences mentioned above, these strings
 * are of the same form as those found in D-Bus.  Note, however: D-Bus
 * always works in terms of messages and therefore individual type
 * strings appear nowhere in its interface.  Instead, "signatures"
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
 * {@code true}.  For example, you cannot have a value that represents "an
 * array of no particular type", but you can have an "array of integers"
 * which certainly matches the type of "an array of no particular type",
 * since "array of integers" is a subtype of "array of no particular
 * type".
 * <p>
 * This is similar to how instances of abstract classes may not
 * directly exist in other type systems, but instances of their
 * non-abstract subtypes may.  For example, in GTK, no object that has
 * the type of {@code GtkBin} can exist (since {@code GtkBin} is an abstract class),
 * but a {@link org.gtk.gtk.Window} can certainly be instantiated, and you would say
 * that the {@link org.gtk.gtk.Window} is a {@code GtkBin} (since {@link org.gtk.gtk.Window} is a subclass of
 * {@code GtkBin}).
 * <p>
 * <strong>GVariant Type Strings</strong><br/>
 * A GVariant type string can be any of the following:
 * <ul>
 * <li>any basic type string (listed below)
 * </ul>
 * <ul>
 * <li>"v", "r" or "*"
 * </ul>
 * <ul>
 * <li>one of the characters 'a' or 'm', followed by another type string
 * </ul>
 * <ul>
 * <li>the character '(', followed by a concatenation of zero or more other
 *   type strings, followed by the character ')'
 * </ul>
 * <ul>
 * <li>the character '{', followed by a basic type string (see below),
 *   followed by another type string, followed by the character '}'
 * </ul>
 * <p>
 * A basic type string describes a basic type (as per
 * g_variant_type_is_basic()) and is always a single character in length.
 * The valid basic type strings are "b", "y", "n", "q", "i", "u", "x", "t",
 * "h", "d", "s", "o", "g" and "?".
 * <p>
 * The above definition is recursive to arbitrary depth. "aaaaai" and
 * "(ui(nq((y)))s)" are both valid type strings, as is
 * "a(aa(ui)(qna{ya(yd)}))". In order to not hit memory limits, {@link Variant}
 * imposes a limit on recursion depth of 65 nested containers. This is the
 * limit in the D-Bus specification (64) plus one to allow a {@link org.gtk.gio.DBusMessage} to
 * be nested in a top-level tuple.
 * <p>
 * The meaning of each of the characters is as follows:
 * <ul>
 * <li>{@code b}: the type string of {@code G_VARIANT_TYPE_BOOLEAN}; a boolean value.
 * <li>{@code y}: the type string of {@code G_VARIANT_TYPE_BYTE}; a byte.
 * <li>{@code n}: the type string of {@code G_VARIANT_TYPE_INT16}; a signed 16 bit integer.
 * <li>{@code q}: the type string of {@code G_VARIANT_TYPE_UINT16}; an unsigned 16 bit integer.
 * <li>{@code i}: the type string of {@code G_VARIANT_TYPE_INT32}; a signed 32 bit integer.
 * <li>{@code u}: the type string of {@code G_VARIANT_TYPE_UINT32}; an unsigned 32 bit integer.
 * <li>{@code x}: the type string of {@code G_VARIANT_TYPE_INT64}; a signed 64 bit integer.
 * <li>{@code t}: the type string of {@code G_VARIANT_TYPE_UINT64}; an unsigned 64 bit integer.
 * <li>{@code h}: the type string of {@code G_VARIANT_TYPE_HANDLE}; a signed 32 bit value
 *   that, by convention, is used as an index into an array of file
 *   descriptors that are sent alongside a D-Bus message.
 * <li>{@code d}: the type string of {@code G_VARIANT_TYPE_DOUBLE}; a double precision
 *   floating point value.
 * <li>{@code s}: the type string of {@code G_VARIANT_TYPE_STRING}; a string.
 * <li>{@code o}: the type string of {@code G_VARIANT_TYPE_OBJECT_PATH}; a string in the form
 *   of a D-Bus object path.
 * <li>{@code g}: the type string of {@code G_VARIANT_TYPE_SIGNATURE}; a string in the form of
 *   a D-Bus type signature.
 * <li>{@code ?}: the type string of {@code G_VARIANT_TYPE_BASIC}; an indefinite type that
 *   is a supertype of any of the basic types.
 * <li>{@code v}: the type string of {@code G_VARIANT_TYPE_VARIANT}; a container type that
 *   contain any other type of value.
 * <li>{@code a}: used as a prefix on another type string to mean an array of that
 *   type; the type string "ai", for example, is the type of an array of
 *   signed 32-bit integers.
 * <li>{@code m}: used as a prefix on another type string to mean a "maybe", or
 *   "nullable", version of that type; the type string "ms", for example,
 *   is the type of a value that maybe contains a string, or maybe contains
 *   nothing.
 * <li>{@code ()}: used to enclose zero or more other concatenated type strings to
 *   create a tuple type; the type string "(is)", for example, is the type of
 *   a pair of an integer and a string.
 * <li>{@code r}: the type string of {@code G_VARIANT_TYPE_TUPLE}; an indefinite type that is
 *   a supertype of any tuple type, regardless of the number of items.
 * <li>{@code {}}: used to enclose a basic type string concatenated with another type
 *   string to create a dictionary entry type, which usually appears inside of
 *   an array to form a dictionary; the type string "a{sd}", for example, is
 *   the type of a dictionary that maps strings to double precision floating
 *   point values.
 * </ul>
 * <p>
 *   The first type (the basic type) is the key type and the second type is
 *   the value type. The reason that the first type is restricted to being a
 *   basic type is so that it can easily be hashed.
 * <ul>
 * <li>{@code *}: the type string of {@code G_VARIANT_TYPE_ANY}; the indefinite type that is
 *   a supertype of all types.  Note that, as with all type strings, this
 *   character represents exactly one type. It cannot be used inside of tuples
 *   to mean "any number of items".
 * </ul>
 * <p>
 * Any type string of a container that contains an indefinite type is,
 * itself, an indefinite type. For example, the type string "a*"
 * (corresponding to {@code G_VARIANT_TYPE_ARRAY}) is an indefinite type
 * that is a supertype of every array type. "(*s)" is a supertype
 * of all tuples that contain exactly two items where the second
 * item is a string.
 * <p>
 * "a{?*}" is an indefinite type that is a supertype of all arrays
 * containing dictionary entries where the key is any basic type and
 * the value is any type at all.  This is, by definition, a dictionary,
 * so this type string corresponds to {@code G_VARIANT_TYPE_DICTIONARY}. Note
 * that, due to the restriction that the key of a dictionary entry must
 * be a basic type, "{**}" is not a valid type string.
 */
public class VariantType extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVariantType";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static VariantType allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VariantType newInstance = new VariantType(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public VariantType(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String typeString) {
        java.util.Objects.requireNonNull(typeString, "Parameter 'typeString' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_variant_type_new.invokeExact(
                    Interop.allocateNativeString(typeString)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link VariantType} corresponding to the type string given
     * by {@code type_string}.  It is appropriate to call g_variant_type_free() on
     * the return value.
     * <p>
     * It is a programmer error to call this function with an invalid type
     * string.  Use g_variant_type_string_is_valid() if you are unsure.
     * @param typeString a valid GVariant type string
     */
    public VariantType(@NotNull java.lang.String typeString) {
        super(constructNew(typeString));
    }
    
    private static Refcounted constructNewArray(@NotNull org.gtk.glib.VariantType element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_variant_type_new_array.invokeExact(
                    element.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to an array of elements of the
     * type {@code type}.
     * <p>
     * It is appropriate to call g_variant_type_free() on the return value.
     * @param element a {@link VariantType}
     * @return a new array {@link VariantType}
     * <p>
     * Since 2.24
     */
    public static VariantType newArray(@NotNull org.gtk.glib.VariantType element) {
        return new VariantType(constructNewArray(element));
    }
    
    private static Refcounted constructNewDictEntry(@NotNull org.gtk.glib.VariantType key, @NotNull org.gtk.glib.VariantType value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_variant_type_new_dict_entry.invokeExact(
                    key.handle(),
                    value.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to a dictionary entry with a key
     * of type {@code key} and a value of type {@code value}.
     * <p>
     * It is appropriate to call g_variant_type_free() on the return value.
     * @param key a basic {@link VariantType}
     * @param value a {@link VariantType}
     * @return a new dictionary entry {@link VariantType}
     * <p>
     * Since 2.24
     */
    public static VariantType newDictEntry(@NotNull org.gtk.glib.VariantType key, @NotNull org.gtk.glib.VariantType value) {
        return new VariantType(constructNewDictEntry(key, value));
    }
    
    private static Refcounted constructNewMaybe(@NotNull org.gtk.glib.VariantType element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_variant_type_new_maybe.invokeExact(
                    element.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs the type corresponding to a maybe instance containing
     * type {@code type} or Nothing.
     * <p>
     * It is appropriate to call g_variant_type_free() on the return value.
     * @param element a {@link VariantType}
     * @return a new maybe {@link VariantType}
     * <p>
     * Since 2.24
     */
    public static VariantType newMaybe(@NotNull org.gtk.glib.VariantType element) {
        return new VariantType(constructNewMaybe(element));
    }
    
    private static Refcounted constructNewTuple(org.gtk.glib.VariantType[] items, int length) {
        java.util.Objects.requireNonNull(items, "Parameter 'items' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_variant_type_new_tuple.invokeExact(
                    Interop.allocateNativeArray(items, false),
                    length), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs a new tuple type, from {@code items}.
     * <p>
     * {@code length} is the number of items in {@code items}, or -1 to indicate that
     * {@code items} is {@code null}-terminated.
     * <p>
     * It is appropriate to call g_variant_type_free() on the return value.
     * @param items an array of {@code GVariantTypes}, one for each item
     * @param length the length of {@code items}, or -1
     * @return a new tuple {@link VariantType}
     * <p>
     * Since 2.24
     */
    public static VariantType newTuple(org.gtk.glib.VariantType[] items, int length) {
        return new VariantType(constructNewTuple(items, length));
    }
    
    /**
     * Makes a copy of a {@link VariantType}.  It is appropriate to call
     * g_variant_type_free() on the return value.  {@code type} may not be {@code null}.
     * @return a new {@link VariantType}
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns a newly-allocated copy of the type string corresponding to
     * {@code type}.  The returned string is nul-terminated.  It is appropriate to
     * call g_free() on the return value.
     * @return the corresponding type string
     * <p>
     * Since 2.24
     */
    public @NotNull java.lang.String dupString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_dup_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Determines the element type of an array or maybe type.
     * <p>
     * This function may only be used with array or maybe types.
     * @return the element type of {@code type}
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType element() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_element.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Compares {@code type1} and {@code type2} for equality.
     * <p>
     * Only returns {@code true} if the types are exactly equal.  Even if one type
     * is an indefinite type and the other is a subtype of it, {@code false} will
     * be returned if they are not exactly equal.  If you want to check for
     * subtypes, use g_variant_type_is_subtype_of().
     * <p>
     * The argument types of {@code type1} and {@code type2} are only {@code gconstpointer} to
     * allow use with {@link HashTable} without function pointer casting.  For
     * both arguments, a valid {@link VariantType} must be provided.
     * @param type2 a {@link VariantType}
     * @return {@code true} if {@code type1} and {@code type2} are exactly equal
     * <p>
     * Since 2.24
     */
    public boolean equal(@NotNull org.gtk.glib.VariantType type2) {
        java.util.Objects.requireNonNull(type2, "Parameter 'type2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_equal.invokeExact(
                    handle(),
                    type2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines the first item type of a tuple or dictionary entry
     * type.
     * <p>
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * {@code G_VARIANT_TYPE_TUPLE}.
     * <p>
     * In the case of a dictionary entry type, this returns the type of
     * the key.
     * <p>
     * {@code null} is returned in case of {@code type} being {@code G_VARIANT_TYPE_UNIT}.
     * <p>
     * This call, together with g_variant_type_next() provides an iterator
     * interface over tuple and dictionary entry types.
     * @return the first item type of {@code type}, or {@code null}
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType first() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_first.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Frees a {@link VariantType} that was allocated with
     * g_variant_type_copy(), g_variant_type_new() or one of the container
     * type constructor functions.
     * <p>
     * In the case that {@code type} is {@code null}, this function does nothing.
     * <p>
     * Since 2.24
     */
    public void free() {
        try {
            DowncallHandles.g_variant_type_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the length of the type string corresponding to the given
     * {@code type}.  This function must be used to determine the valid extent of
     * the memory region returned by g_variant_type_peek_string().
     * @return the length of the corresponding type string
     * <p>
     * Since 2.24
     */
    public long getStringLength() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_type_get_string_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Hashes {@code type}.
     * <p>
     * The argument type of {@code type} is only {@code gconstpointer} to allow use with
     * {@link HashTable} without function pointer casting.  A valid
     * {@link VariantType} must be provided.
     * @return the hash value
     * <p>
     * Since 2.24
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_hash.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines if the given {@code type} is an array type.  This is true if the
     * type string for {@code type} starts with an 'a'.
     * <p>
     * This function returns {@code true} for any indefinite type for which every
     * definite subtype is an array type -- {@code G_VARIANT_TYPE_ARRAY}, for
     * example.
     * @return {@code true} if {@code type} is an array type
     * <p>
     * Since 2.24
     */
    public boolean isArray() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_array.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is a basic type.
     * <p>
     * Basic types are booleans, bytes, integers, doubles, strings, object
     * paths and signatures.
     * <p>
     * Only a basic type may be used as the key of a dictionary entry.
     * <p>
     * This function returns {@code false} for all indefinite types except
     * {@code G_VARIANT_TYPE_BASIC}.
     * @return {@code true} if {@code type} is a basic type
     * <p>
     * Since 2.24
     */
    public boolean isBasic() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_basic.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is a container type.
     * <p>
     * Container types are any array, maybe, tuple, or dictionary
     * entry types plus the variant type.
     * <p>
     * This function returns {@code true} for any indefinite type for which every
     * definite subtype is a container -- {@code G_VARIANT_TYPE_ARRAY}, for
     * example.
     * @return {@code true} if {@code type} is a container type
     * <p>
     * Since 2.24
     */
    public boolean isContainer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_container.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is definite (ie: not indefinite).
     * <p>
     * A type is definite if its type string does not contain any indefinite
     * type characters ('*', '?', or 'r').
     * <p>
     * A {@link Variant} instance may not have an indefinite type, so calling
     * this function on the result of g_variant_get_type() will always
     * result in {@code true} being returned.  Calling this function on an
     * indefinite type like {@code G_VARIANT_TYPE_ARRAY}, however, will result in
     * {@code false} being returned.
     * @return {@code true} if {@code type} is definite
     * <p>
     * Since 2.24
     */
    public boolean isDefinite() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_definite.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is a dictionary entry type.  This is
     * true if the type string for {@code type} starts with a '{'.
     * <p>
     * This function returns {@code true} for any indefinite type for which every
     * definite subtype is a dictionary entry type --
     * {@code G_VARIANT_TYPE_DICT_ENTRY}, for example.
     * @return {@code true} if {@code type} is a dictionary entry type
     * <p>
     * Since 2.24
     */
    public boolean isDictEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_dict_entry.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is a maybe type.  This is true if the
     * type string for {@code type} starts with an 'm'.
     * <p>
     * This function returns {@code true} for any indefinite type for which every
     * definite subtype is a maybe type -- {@code G_VARIANT_TYPE_MAYBE}, for
     * example.
     * @return {@code true} if {@code type} is a maybe type
     * <p>
     * Since 2.24
     */
    public boolean isMaybe() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_maybe.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code type} is a subtype of {@code supertype}.
     * <p>
     * This function returns {@code true} if {@code type} is a subtype of {@code supertype}.  All
     * types are considered to be subtypes of themselves.  Aside from that,
     * only indefinite types can have subtypes.
     * @param supertype a {@link VariantType}
     * @return {@code true} if {@code type} is a subtype of {@code supertype}
     * <p>
     * Since 2.24
     */
    public boolean isSubtypeOf(@NotNull org.gtk.glib.VariantType supertype) {
        java.util.Objects.requireNonNull(supertype, "Parameter 'supertype' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_subtype_of.invokeExact(
                    handle(),
                    supertype.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is a tuple type.  This is true if the
     * type string for {@code type} starts with a '(' or if {@code type} is
     * {@code G_VARIANT_TYPE_TUPLE}.
     * <p>
     * This function returns {@code true} for any indefinite type for which every
     * definite subtype is a tuple type -- {@code G_VARIANT_TYPE_TUPLE}, for
     * example.
     * @return {@code true} if {@code type} is a tuple type
     * <p>
     * Since 2.24
     */
    public boolean isTuple() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_tuple.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines if the given {@code type} is the variant type.
     * @return {@code true} if {@code type} is the variant type
     * <p>
     * Since 2.24
     */
    public boolean isVariant() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_is_variant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines the key type of a dictionary entry type.
     * <p>
     * This function may only be used with a dictionary entry type.  Other
     * than the additional restriction, this call is equivalent to
     * g_variant_type_first().
     * @return the key type of the dictionary entry
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType key() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_key.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines the number of items contained in a tuple or
     * dictionary entry type.
     * <p>
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * {@code G_VARIANT_TYPE_TUPLE}.
     * <p>
     * In the case of a dictionary entry type, this function will always
     * return 2.
     * @return the number of items in {@code type}
     * <p>
     * Since 2.24
     */
    public long nItems() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_type_n_items.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines the next item type of a tuple or dictionary entry
     * type.
     * <p>
     * {@code type} must be the result of a previous call to
     * g_variant_type_first() or g_variant_type_next().
     * <p>
     * If called on the key type of a dictionary entry then this call
     * returns the value type.  If called on the value type of a dictionary
     * entry then this call returns {@code null}.
     * <p>
     * For tuples, {@code null} is returned when {@code type} is the last item in a tuple.
     * @return the next {@link VariantType} after {@code type}, or {@code null}
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType next() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the type string corresponding to the given {@code type}.  The
     * result is not nul-terminated; in order to determine its length you
     * must call g_variant_type_get_string_length().
     * <p>
     * To get a nul-terminated string, see g_variant_type_dup_string().
     * @return the corresponding type string (not nul-terminated)
     * <p>
     * Since 2.24
     */
    public @NotNull java.lang.String peekString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_peek_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Determines the value type of a dictionary entry type.
     * <p>
     * This function may only be used with a dictionary entry type.
     * @return the value type of the dictionary entry
     * <p>
     * Since 2.24
     */
    public @NotNull org.gtk.glib.VariantType value() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    public static @NotNull org.gtk.glib.VariantType checked(@NotNull java.lang.String arg0) {
        java.util.Objects.requireNonNull(arg0, "Parameter 'arg0' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_checked_.invokeExact(
                    Interop.allocateNativeString(arg0));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    public static long stringGetDepth(@NotNull java.lang.String typeString) {
        java.util.Objects.requireNonNull(typeString, "Parameter 'typeString' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_type_string_get_depth_.invokeExact(
                    Interop.allocateNativeString(typeString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code type_string} is a valid GVariant type string.  This call is
     * equivalent to calling g_variant_type_string_scan() and confirming
     * that the following character is a nul terminator.
     * @param typeString a pointer to any string
     * @return {@code true} if {@code type_string} is exactly one valid type string
     * <p>
     * Since 2.24
     */
    public static boolean stringIsValid(@NotNull java.lang.String typeString) {
        java.util.Objects.requireNonNull(typeString, "Parameter 'typeString' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_string_is_valid.invokeExact(
                    Interop.allocateNativeString(typeString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Scan for a single complete and valid GVariant type string in {@code string}.
     * The memory pointed to by {@code limit} (or bytes beyond it) is never
     * accessed.
     * <p>
     * If a valid type string is found, {@code endptr} is updated to point to the
     * first character past the end of the string that was found and {@code true}
     * is returned.
     * <p>
     * If there is no valid type string starting at {@code string}, or if the type
     * string does not end before {@code limit} then {@code false} is returned.
     * <p>
     * For the simple case of checking if a string is a valid type string,
     * see g_variant_type_string_is_valid().
     * @param string a pointer to any string
     * @param limit the end of {@code string}, or {@code null}
     * @param endptr location to store the end pointer, or {@code null}
     * @return {@code true} if a valid type string was found
     */
    public static boolean stringScan(@NotNull java.lang.String string, @Nullable java.lang.String limit, @NotNull Out<java.lang.String> endptr) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(endptr, "Parameter 'endptr' must not be null");
        MemorySegment endptrPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_string_scan.invokeExact(
                    Interop.allocateNativeString(string),
                    (Addressable) (limit == null ? MemoryAddress.NULL : Interop.allocateNativeString(limit)),
                    (Addressable) endptrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        endptr.set(Interop.getStringFrom(endptrPOINTER.get(ValueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_variant_type_new = Interop.downcallHandle(
            "g_variant_type_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_new_array = Interop.downcallHandle(
            "g_variant_type_new_array",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_new_dict_entry = Interop.downcallHandle(
            "g_variant_type_new_dict_entry",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_new_maybe = Interop.downcallHandle(
            "g_variant_type_new_maybe",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_new_tuple = Interop.downcallHandle(
            "g_variant_type_new_tuple",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_variant_type_copy = Interop.downcallHandle(
            "g_variant_type_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_dup_string = Interop.downcallHandle(
            "g_variant_type_dup_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_element = Interop.downcallHandle(
            "g_variant_type_element",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_equal = Interop.downcallHandle(
            "g_variant_type_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_first = Interop.downcallHandle(
            "g_variant_type_first",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_free = Interop.downcallHandle(
            "g_variant_type_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_get_string_length = Interop.downcallHandle(
            "g_variant_type_get_string_length",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_hash = Interop.downcallHandle(
            "g_variant_type_hash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_array = Interop.downcallHandle(
            "g_variant_type_is_array",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_basic = Interop.downcallHandle(
            "g_variant_type_is_basic",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_container = Interop.downcallHandle(
            "g_variant_type_is_container",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_definite = Interop.downcallHandle(
            "g_variant_type_is_definite",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_dict_entry = Interop.downcallHandle(
            "g_variant_type_is_dict_entry",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_maybe = Interop.downcallHandle(
            "g_variant_type_is_maybe",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_subtype_of = Interop.downcallHandle(
            "g_variant_type_is_subtype_of",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_tuple = Interop.downcallHandle(
            "g_variant_type_is_tuple",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_is_variant = Interop.downcallHandle(
            "g_variant_type_is_variant",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_key = Interop.downcallHandle(
            "g_variant_type_key",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_n_items = Interop.downcallHandle(
            "g_variant_type_n_items",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_next = Interop.downcallHandle(
            "g_variant_type_next",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_peek_string = Interop.downcallHandle(
            "g_variant_type_peek_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_value = Interop.downcallHandle(
            "g_variant_type_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_checked_ = Interop.downcallHandle(
            "g_variant_type_checked_",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_string_get_depth_ = Interop.downcallHandle(
            "g_variant_type_string_get_depth_",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_string_is_valid = Interop.downcallHandle(
            "g_variant_type_string_is_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_variant_type_string_scan = Interop.downcallHandle(
            "g_variant_type_string_scan",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
