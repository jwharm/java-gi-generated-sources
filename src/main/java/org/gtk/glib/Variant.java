package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Variant} is a variant datatype; it can contain one or more values
 * along with information about the type of the values.
 * <p>
 * A {@link Variant} may contain simple types, like an integer, or a boolean value;
 * or complex types, like an array of two strings, or a dictionary of key
 * value pairs. A {@link Variant} is also immutable: once it's been created neither
 * its type nor its content can be modified further.
 * <p>
 * GVariant is useful whenever data needs to be serialized, for example when
 * sending method parameters in D-Bus, or when saving settings using GSettings.
 * <p>
 * When creating a new {@link Variant}, you pass the data you want to store in it
 * along with a string representing the type of data you wish to pass to it.
 * <p>
 * For instance, if you want to create a {@link Variant} holding an integer value you
 * can use:
 * <pre>{@code <!-- language="C" -->
 *   GVariant *v = g_variant_new ("u", 40);
 * }</pre>
 * <p>
 * The string "u" in the first argument tells {@link Variant} that the data passed to
 * the constructor (40) is going to be an unsigned integer.
 * <p>
 * More advanced examples of {@link Variant} in use can be found in documentation for
 * [GVariant format strings][gvariant-format-strings-pointers].
 * <p>
 * The range of possible values is determined by the type.
 * <p>
 * The type system used by {@link Variant} is {@link VariantType}.
 * <p>
 * {@link Variant} instances always have a type and a value (which are given
 * at construction time).  The type and value of a {@link Variant} instance
 * can never change other than by the {@link Variant} itself being
 * destroyed.  A {@link Variant} cannot contain a pointer.
 * <p>
 * {@link Variant} is reference counted using g_variant_ref() and
 * g_variant_unref().  {@link Variant} also has floating reference counts --
 * see g_variant_ref_sink().
 * <p>
 * {@link Variant} is completely threadsafe.  A {@link Variant} instance can be
 * concurrently accessed in any way from any number of threads without
 * problems.
 * <p>
 * {@link Variant} is heavily optimised for dealing with data in serialized
 * form.  It works particularly well with data located in memory-mapped
 * files.  It can perform nearly all deserialization operations in a
 * small constant time, usually touching only a single memory page.
 * Serialized {@link Variant} data can also be sent over the network.
 * <p>
 * {@link Variant} is largely compatible with D-Bus.  Almost all types of
 * {@link Variant} instances can be sent over D-Bus.  See {@link VariantType} for
 * exceptions.  (However, {@link Variant}'s serialization format is not the same
 * as the serialization format of a D-Bus message body: use {@link org.gtk.gio.DBusMessage},
 * in the gio library, for those.)
 * <p>
 * For space-efficiency, the {@link Variant} serialization format does not
 * automatically include the variant's length, type or endianness,
 * which must either be implied from context (such as knowledge that a
 * particular file format always contains a little-endian
 * {@code G_VARIANT_TYPE_VARIANT} which occupies the whole length of the file)
 * or supplied out-of-band (for instance, a length, type and/or endianness
 * indicator could be placed at the beginning of a file, network message
 * or network stream).
 * <p>
 * A {@link Variant}'s size is limited mainly by any lower level operating
 * system constraints, such as the number of bits in {@code gsize}.  For
 * example, it is reasonable to have a 2GB file mapped into memory
 * with {@link MappedFile}, and call g_variant_new_from_data() on it.
 * <p>
 * For convenience to C programmers, {@link Variant} features powerful
 * varargs-based value construction and destruction.  This feature is
 * designed to be embedded in other libraries.
 * <p>
 * There is a Python-inspired text language for describing {@link Variant}
 * values.  {@link Variant} includes a printer for this language and a parser
 * with type inferencing.
 * <p>
 * <strong>Memory Use</strong><br/>
 * {@link Variant} tries to be quite efficient with respect to memory use.
 * This section gives a rough idea of how much memory is used by the
 * current implementation.  The information here is subject to change
 * in the future.
 * <p>
 * The memory allocated by {@link Variant} can be grouped into 4 broad
 * purposes: memory for serialized data, memory for the type
 * information cache, buffer management memory and memory for the
 * {@link Variant} structure itself.
 * <p>
 * <strong>Serialized Data Memory</strong><br/>
 * This is the memory that is used for storing GVariant data in
 * serialized form.  This is what would be sent over the network or
 * what would end up on disk, not counting any indicator of the
 * endianness, or of the length or type of the top-level variant.
 * <p>
 * The amount of memory required to store a boolean is 1 byte. 16,
 * 32 and 64 bit integers and double precision floating point numbers
 * use their "natural" size.  Strings (including object path and
 * signature strings) are stored with a nul terminator, and as such
 * use the length of the string plus 1 byte.
 * <p>
 * Maybe types use no space at all to represent the null value and
 * use the same amount of space (sometimes plus one byte) as the
 * equivalent non-maybe-typed value to represent the non-null case.
 * <p>
 * Arrays use the amount of space required to store each of their
 * members, concatenated.  Additionally, if the items stored in an
 * array are not of a fixed-size (ie: strings, other arrays, etc)
 * then an additional framing offset is stored for each item.  The
 * size of this offset is either 1, 2 or 4 bytes depending on the
 * overall size of the container.  Additionally, extra padding bytes
 * are added as required for alignment of child values.
 * <p>
 * Tuples (including dictionary entries) use the amount of space
 * required to store each of their members, concatenated, plus one
 * framing offset (as per arrays) for each non-fixed-sized item in
 * the tuple, except for the last one.  Additionally, extra padding
 * bytes are added as required for alignment of child values.
 * <p>
 * Variants use the same amount of space as the item inside of the
 * variant, plus 1 byte, plus the length of the type string for the
 * item inside the variant.
 * <p>
 * As an example, consider a dictionary mapping strings to variants.
 * In the case that the dictionary is empty, 0 bytes are required for
 * the serialization.
 * <p>
 * If we add an item "width" that maps to the int32 value of 500 then
 * we will use 4 byte to store the int32 (so 6 for the variant
 * containing it) and 6 bytes for the string.  The variant must be
 * aligned to 8 after the 6 bytes of the string, so that's 2 extra
 * bytes.  6 (string) + 2 (padding) + 6 (variant) is 14 bytes used
 * for the dictionary entry.  An additional 1 byte is added to the
 * array as a framing offset making a total of 15 bytes.
 * <p>
 * If we add another entry, "title" that maps to a nullable string
 * that happens to have a value of null, then we use 0 bytes for the
 * null value (and 3 bytes for the variant to contain it along with
 * its type string) plus 6 bytes for the string.  Again, we need 2
 * padding bytes.  That makes a total of 6 + 2 + 3 = 11 bytes.
 * <p>
 * We now require extra padding between the two items in the array.
 * After the 14 bytes of the first item, that's 2 bytes required.
 * We now require 2 framing offsets for an extra two
 * bytes. 14 + 2 + 11 + 2 = 29 bytes to encode the entire two-item
 * dictionary.
 * <p>
 * <strong>Type Information Cache</strong><br/>
 * For each GVariant type that currently exists in the program a type
 * information structure is kept in the type information cache.  The
 * type information structure is required for rapid deserialization.
 * <p>
 * Continuing with the above example, if a {@link Variant} exists with the
 * type "a{sv}" then a type information struct will exist for
 * "a{sv}", "{sv}", "s", and "v".  Multiple uses of the same type
 * will share the same type information.  Additionally, all
 * single-digit types are stored in read-only static memory and do
 * not contribute to the writable memory footprint of a program using
 * {@link Variant}.
 * <p>
 * Aside from the type information structures stored in read-only
 * memory, there are two forms of type information.  One is used for
 * container types where there is a single element type: arrays and
 * maybe types.  The other is used for container types where there
 * are multiple element types: tuples and dictionary entries.
 * <p>
 * Array type info structures are 6 * sizeof (void *), plus the
 * memory required to store the type string itself.  This means that
 * on 32-bit systems, the cache entry for "a{sv}" would require 30
 * bytes of memory (plus malloc overhead).
 * <p>
 * Tuple type info structures are 6 * sizeof (void *), plus 4 *
 * sizeof (void *) for each item in the tuple, plus the memory
 * required to store the type string itself.  A 2-item tuple, for
 * example, would have a type information structure that consumed
 * writable memory in the size of 14 * sizeof (void *) (plus type
 * string)  This means that on 32-bit systems, the cache entry for
 * "{sv}" would require 61 bytes of memory (plus malloc overhead).
 * <p>
 * This means that in total, for our "a{sv}" example, 91 bytes of
 * type information would be allocated.
 * <p>
 * The type information cache, additionally, uses a {@link HashTable} to
 * store and look up the cached items and stores a pointer to this
 * hash table in static storage.  The hash table is freed when there
 * are zero items in the type cache.
 * <p>
 * Although these sizes may seem large it is important to remember
 * that a program will probably only have a very small number of
 * different types of values in it and that only one type information
 * structure is required for many different values of the same type.
 * <p>
 * <strong>Buffer Management Memory</strong><br/>
 * {@link Variant} uses an internal buffer management structure to deal
 * with the various different possible sources of serialized data
 * that it uses.  The buffer is responsible for ensuring that the
 * correct call is made when the data is no longer in use by
 * {@link Variant}.  This may involve a g_free() or a g_slice_free() or
 * even g_mapped_file_unref().
 * <p>
 * One buffer management structure is used for each chunk of
 * serialized data.  The size of the buffer management structure
 * is 4 * (void *).  On 32-bit systems, that's 16 bytes.
 * <p>
 * <strong>GVariant structure</strong><br/>
 * The size of a {@link Variant} structure is 6 * (void *).  On 32-bit
 * systems, that's 24 bytes.
 * <p>
 * {@link Variant} structures only exist if they are explicitly created
 * with API calls.  For example, if a {@link Variant} is constructed out of
 * serialized data for the example given above (with the dictionary)
 * then although there are 9 individual values that comprise the
 * entire dictionary (two keys, two values, two variants containing
 * the values, two dictionary entries, plus the dictionary itself),
 * only 1 {@link Variant} instance exists -- the one referring to the
 * dictionary.
 * <p>
 * If calls are made to start accessing the other values then
 * {@link Variant} instances will exist for those values only for as long
 * as they are in use (ie: until you call g_variant_unref()).  The
 * type information is shared.  The serialized data and the buffer
 * management structure for that serialized data is shared by the
 * child.
 * <p>
 * <strong>Summary</strong><br/>
 * To put the entire example together, for our dictionary mapping
 * strings to variants (with two entries, as given above), we are
 * using 91 bytes of memory for type information, 29 bytes of memory
 * for the serialized data, 16 bytes for buffer management and 24
 * bytes for the {@link Variant} instance, or a total of 160 bytes, plus
 * malloc overhead.  If we were to use g_variant_get_child_value() to
 * access the two dictionary entries, we would use an additional 48
 * bytes.  If we were to have other dictionaries of the same type, we
 * would use more memory for the serialized data and buffer
 * management for those dictionaries, but the type information would
 * be shared.
 * @version 2.24
 */
public class Variant extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVariant";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Variant}
     * @return A new, uninitialized @{link Variant}
     */
    public static Variant allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Variant newInstance = new Variant(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Variant proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Variant(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Variant> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Variant(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String formatString, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new.invokeExact(
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Variant} instance.
     * <p>
     * Think of this function as an analogue to g_strdup_printf().
     * <p>
     * The type of the created instance and the arguments that are expected
     * by this function are determined by {@code format_string}. See the section on
     * [GVariant format strings][gvariant-format-strings]. Please note that
     * the syntax of the format string is very likely to be extended in the
     * future.
     * <p>
     * The first character of the format string must not be '*' '?' '{@code '} or
     * 'r'; in essence, a new {@link Variant} must always be constructed by this
     * function (and not merely passed through it unmodified).
     * <p>
     * Note that the arguments must be of the correct width for their types
     * specified in {@code format_string}. This can be achieved by casting them. See
     * the [GVariant varargs documentation][gvariant-varargs].
     * <pre>{@code <!-- language="C" -->
     * MyFlags some_flags = FLAG_ONE | FLAG_TWO;
     * const gchar *some_strings[] = { "a", "b", "c", NULL };
     * GVariant *new_variant;
     * 
     * new_variant = g_variant_new ("(t^as)",
     *                              // This cast is required.
     *                              (guint64) some_flags,
     *                              some_strings);
     * }</pre>
     * @param formatString a {@link Variant} format string
     * @param varargs arguments, as per {@code format_string}
     */
    public Variant(java.lang.String formatString, java.lang.Object... varargs) {
        super(constructNew(formatString, varargs), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewArray(@Nullable org.gtk.glib.VariantType childType, @Nullable org.gtk.glib.Variant[] children, long nChildren) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_array.invokeExact(
                    (Addressable) (childType == null ? MemoryAddress.NULL : childType.handle()),
                    (Addressable) (children == null ? MemoryAddress.NULL : Interop.allocateNativeArray(children, org.gtk.glib.Variant.getMemoryLayout(), false)),
                    nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Variant} array from {@code children}.
     * <p>
     * {@code child_type} must be non-{@code null} if {@code n_children} is zero.  Otherwise, the
     * child type is determined by inspecting the first element of the
     * {@code children} array.  If {@code child_type} is non-{@code null} then it must be a
     * definite type.
     * <p>
     * The items of the array are taken from the {@code children} array.  No entry
     * in the {@code children} array may be {@code null}.
     * <p>
     * All items in the array must have the same type, which must be the
     * same as {@code child_type}, if given.
     * <p>
     * If the {@code children} are floating references (see g_variant_ref_sink()), the
     * new instance takes ownership of them as if via g_variant_ref_sink().
     * @param childType the element type of the new array
     * @param children an array of
     *            {@link Variant} pointers, the children
     * @param nChildren the length of {@code children}
     * @return a floating reference to a new {@link Variant} array
     */
    public static Variant newArray(@Nullable org.gtk.glib.VariantType childType, @Nullable org.gtk.glib.Variant[] children, long nChildren) {
        var RESULT = constructNewArray(childType, children, nChildren);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewBoolean(boolean value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_boolean.invokeExact(
                    Marshal.booleanToInteger.marshal(value, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new boolean {@link Variant} instance -- either {@code true} or {@code false}.
     * @param value a {@code gboolean} value
     * @return a floating reference to a new boolean {@link Variant} instance
     */
    public static Variant newBoolean(boolean value) {
        var RESULT = constructNewBoolean(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewByte(byte value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_byte.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new byte {@link Variant} instance.
     * @param value a {@code guint8} value
     * @return a floating reference to a new byte {@link Variant} instance
     */
    public static Variant newByte(byte value) {
        var RESULT = constructNewByte(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewBytestring(byte[] string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_bytestring.invokeExact(
                    Interop.allocateNativeArray(string, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an array-of-bytes {@link Variant} with the contents of {@code string}.
     * This function is just like g_variant_new_string() except that the
     * string need not be valid UTF-8.
     * <p>
     * The nul terminator character at the end of the string is stored in
     * the array.
     * @param string a normal
     *          nul-terminated string in no particular encoding
     * @return a floating reference to a new bytestring {@link Variant} instance
     */
    public static Variant newBytestring(byte[] string) {
        var RESULT = constructNewBytestring(string);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewBytestringArray(java.lang.String[] strv, long length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_bytestring_array.invokeExact(
                    Interop.allocateNativeArray(strv, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs an array of bytestring {@link Variant} from the given array of
     * strings.
     * <p>
     * If {@code length} is -1 then {@code strv} is {@code null}-terminated.
     * @param strv an array of strings
     * @param length the length of {@code strv}, or -1
     * @return a new floating {@link Variant} instance
     */
    public static Variant newBytestringArray(java.lang.String[] strv, long length) {
        var RESULT = constructNewBytestringArray(strv, length);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewDictEntry(org.gtk.glib.Variant key, org.gtk.glib.Variant value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_dict_entry.invokeExact(
                    key.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new dictionary entry {@link Variant}. {@code key} and {@code value} must be
     * non-{@code null}. {@code key} must be a value of a basic type (ie: not a container).
     * <p>
     * If the {@code key} or {@code value} are floating references (see g_variant_ref_sink()),
     * the new instance takes ownership of them as if via g_variant_ref_sink().
     * @param key a basic {@link Variant}, the key
     * @param value a {@link Variant}, the value
     * @return a floating reference to a new dictionary entry {@link Variant}
     */
    public static Variant newDictEntry(org.gtk.glib.Variant key, org.gtk.glib.Variant value) {
        var RESULT = constructNewDictEntry(key, value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewDouble(double value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_double.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new double {@link Variant} instance.
     * @param value a {@code gdouble} floating point value
     * @return a floating reference to a new double {@link Variant} instance
     */
    public static Variant newDouble(double value) {
        var RESULT = constructNewDouble(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFixedArray(org.gtk.glib.VariantType elementType, @Nullable java.lang.foreign.MemoryAddress elements, long nElements, long elementSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_fixed_array.invokeExact(
                    elementType.handle(),
                    (Addressable) (elements == null ? MemoryAddress.NULL : (Addressable) elements),
                    nElements,
                    elementSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs a new array {@link Variant} instance, where the elements are
     * of {@code element_type} type.
     * <p>
     * {@code elements} must be an array with fixed-sized elements.  Numeric types are
     * fixed-size as are tuples containing only other fixed-sized types.
     * <p>
     * {@code element_size} must be the size of a single element in the array.
     * For example, if calling this function for an array of 32-bit integers,
     * you might say sizeof(gint32). This value isn't used except for the purpose
     * of a double-check that the form of the serialized data matches the caller's
     * expectation.
     * <p>
     * {@code n_elements} must be the length of the {@code elements} array.
     * @param elementType the {@link VariantType} of each element
     * @param elements a pointer to the fixed array of contiguous elements
     * @param nElements the number of elements
     * @param elementSize the size of each element
     * @return a floating reference to a new array {@link Variant} instance
     */
    public static Variant newFixedArray(org.gtk.glib.VariantType elementType, @Nullable java.lang.foreign.MemoryAddress elements, long nElements, long elementSize) {
        var RESULT = constructNewFixedArray(elementType, elements, nElements, elementSize);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromBytes(org.gtk.glib.VariantType type, org.gtk.glib.Bytes bytes, boolean trusted) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_from_bytes.invokeExact(
                    type.handle(),
                    bytes.handle(),
                    Marshal.booleanToInteger.marshal(trusted, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs a new serialized-mode {@link Variant} instance.  This is the
     * inner interface for creation of new serialized values that gets
     * called from various functions in gvariant.c.
     * <p>
     * A reference is taken on {@code bytes}.
     * <p>
     * The data in {@code bytes} must be aligned appropriately for the {@code type} being loaded.
     * Otherwise this function will internally create a copy of the memory (since
     * GLib 2.60) or (in older versions) fail and exit the process.
     * @param type a {@link VariantType}
     * @param bytes a {@link Bytes}
     * @param trusted if the contents of {@code bytes} are trusted
     * @return a new {@link Variant} with a floating reference
     */
    public static Variant newFromBytes(org.gtk.glib.VariantType type, org.gtk.glib.Bytes bytes, boolean trusted) {
        var RESULT = constructNewFromBytes(type, bytes, trusted);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromData(org.gtk.glib.VariantType type, byte[] data, long size, boolean trusted, org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_from_data.invokeExact(
                    type.handle(),
                    Interop.allocateNativeArray(data, false),
                    size,
                    Marshal.booleanToInteger.marshal(trusted, null).intValue(),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Variant} instance from serialized data.
     * <p>
     * {@code type} is the type of {@link Variant} instance that will be constructed.
     * The interpretation of {@code data} depends on knowing the type.
     * <p>
     * {@code data} is not modified by this function and must remain valid with an
     * unchanging value until such a time as {@code notify} is called with
     * {@code user_data}.  If the contents of {@code data} change before that time then
     * the result is undefined.
     * <p>
     * If {@code data} is trusted to be serialized data in normal form then
     * {@code trusted} should be {@code true}.  This applies to serialized data created
     * within this process or read from a trusted location on the disk (such
     * as a file installed in /usr/lib alongside your application).  You
     * should set trusted to {@code false} if {@code data} is read from the network, a
     * file in the user's home directory, etc.
     * <p>
     * If {@code data} was not stored in this machine's native endianness, any multi-byte
     * numeric values in the returned variant will also be in non-native
     * endianness. g_variant_byteswap() can be used to recover the original values.
     * <p>
     * {@code notify} will be called with {@code user_data} when {@code data} is no longer
     * needed.  The exact time of this call is unspecified and might even be
     * before this function returns.
     * <p>
     * Note: {@code data} must be backed by memory that is aligned appropriately for the
     * {@code type} being loaded. Otherwise this function will internally create a copy of
     * the memory (since GLib 2.60) or (in older versions) fail and exit the
     * process.
     * @param type a definite {@link VariantType}
     * @param data the serialized data
     * @param size the size of {@code data}
     * @param trusted {@code true} if {@code data} is definitely in normal form
     * @param notify function to call when {@code data} is no longer needed
     * @return a new floating {@link Variant} of type {@code type}
     */
    public static Variant newFromData(org.gtk.glib.VariantType type, byte[] data, long size, boolean trusted, org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewFromData(type, data, size, trusted, notify);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewHandle(int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_handle.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new handle {@link Variant} instance.
     * <p>
     * By convention, handles are indexes into an array of file descriptors
     * that are sent alongside a D-Bus message.  If you're not interacting
     * with D-Bus, you probably don't need them.
     * @param value a {@code gint32} value
     * @return a floating reference to a new handle {@link Variant} instance
     */
    public static Variant newHandle(int value) {
        var RESULT = constructNewHandle(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewInt16(short value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_int16.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new int16 {@link Variant} instance.
     * @param value a {@code gint16} value
     * @return a floating reference to a new int16 {@link Variant} instance
     */
    public static Variant newInt16(short value) {
        var RESULT = constructNewInt16(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewInt32(int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_int32.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new int32 {@link Variant} instance.
     * @param value a {@code gint32} value
     * @return a floating reference to a new int32 {@link Variant} instance
     */
    public static Variant newInt32(int value) {
        var RESULT = constructNewInt32(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewInt64(long value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_int64.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new int64 {@link Variant} instance.
     * @param value a {@code gint64} value
     * @return a floating reference to a new int64 {@link Variant} instance
     */
    public static Variant newInt64(long value) {
        var RESULT = constructNewInt64(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewMaybe(@Nullable org.gtk.glib.VariantType childType, @Nullable org.gtk.glib.Variant child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_maybe.invokeExact(
                    (Addressable) (childType == null ? MemoryAddress.NULL : childType.handle()),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Depending on if {@code child} is {@code null}, either wraps {@code child} inside of a
     * maybe container or creates a Nothing instance for the given {@code type}.
     * <p>
     * At least one of {@code child_type} and {@code child} must be non-{@code null}.
     * If {@code child_type} is non-{@code null} then it must be a definite type.
     * If they are both non-{@code null} then {@code child_type} must be the type
     * of {@code child}.
     * <p>
     * If {@code child} is a floating reference (see g_variant_ref_sink()), the new
     * instance takes ownership of {@code child}.
     * @param childType the {@link VariantType} of the child, or {@code null}
     * @param child the child value, or {@code null}
     * @return a floating reference to a new {@link Variant} maybe instance
     */
    public static Variant newMaybe(@Nullable org.gtk.glib.VariantType childType, @Nullable org.gtk.glib.Variant child) {
        var RESULT = constructNewMaybe(childType, child);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewObjectPath(java.lang.String objectPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_object_path.invokeExact(
                    Marshal.stringToAddress.marshal(objectPath, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a D-Bus object path {@link Variant} with the contents of {@code string}.
     * {@code string} must be a valid D-Bus object path.  Use
     * g_variant_is_object_path() if you're not sure.
     * @param objectPath a normal C nul-terminated string
     * @return a floating reference to a new object path {@link Variant} instance
     */
    public static Variant newObjectPath(java.lang.String objectPath) {
        var RESULT = constructNewObjectPath(objectPath);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewObjv(java.lang.String[] strv, long length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_objv.invokeExact(
                    Interop.allocateNativeArray(strv, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs an array of object paths {@link Variant} from the given array of
     * strings.
     * <p>
     * Each string must be a valid {@link Variant} object path; see
     * g_variant_is_object_path().
     * <p>
     * If {@code length} is -1 then {@code strv} is {@code null}-terminated.
     * @param strv an array of strings
     * @param length the length of {@code strv}, or -1
     * @return a new floating {@link Variant} instance
     */
    public static Variant newObjv(java.lang.String[] strv, long length) {
        var RESULT = constructNewObjv(strv, length);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewParsed(java.lang.String format, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_parsed.invokeExact(
                    Marshal.stringToAddress.marshal(format, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses {@code format} and returns the result.
     * <p>
     * {@code format} must be a text format {@link Variant} with one extension: at any
     * point that a value may appear in the text, a '%' character followed
     * by a GVariant format string (as per g_variant_new()) may appear.  In
     * that case, the same arguments are collected from the argument list as
     * g_variant_new() would have collected.
     * <p>
     * Note that the arguments must be of the correct width for their types
     * specified in {@code format}. This can be achieved by casting them. See
     * the [GVariant varargs documentation][gvariant-varargs].
     * <p>
     * Consider this simple example:
     * <pre>{@code <!-- language="C" -->
     *  g_variant_new_parsed ("[('one', 1), ('two', %i), (%s, 3)]", 2, "three");
     * }</pre>
     * <p>
     * In the example, the variable argument parameters are collected and
     * filled in as if they were part of the original string to produce the
     * result of
     * <pre>{@code <!-- language="C" -->
     * [('one', 1), ('two', 2), ('three', 3)]
     * }</pre>
     * <p>
     * This function is intended only to be used with {@code format} as a string
     * literal.  Any parse error is fatal to the calling process.  If you
     * want to parse data from untrusted sources, use g_variant_parse().
     * <p>
     * You may not use this function to return, unmodified, a single
     * {@link Variant} pointer from the argument list.  ie: {@code format} may not solely
     * be anything along the lines of "%*", "%?", "\\{@code r}", or anything starting
     * with "%{@code "}.
     * @param format a text format {@link Variant}
     * @param varargs arguments as per {@code format}
     * @return a new floating {@link Variant} instance
     */
    public static Variant newParsed(java.lang.String format, java.lang.Object... varargs) {
        var RESULT = constructNewParsed(format, varargs);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewParsedVa(java.lang.String format, VaList app) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_parsed_va.invokeExact(
                    Marshal.stringToAddress.marshal(format, null),
                    app);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses {@code format} and returns the result.
     * <p>
     * This is the version of g_variant_new_parsed() intended to be used
     * from libraries.
     * <p>
     * The return value will be floating if it was a newly created GVariant
     * instance.  In the case that {@code format} simply specified the collection
     * of a {@link Variant} pointer (eg: {@code format} was "%*") then the collected
     * {@link Variant} pointer will be returned unmodified, without adding any
     * additional references.
     * <p>
     * Note that the arguments in {@code app} must be of the correct width for their types
     * specified in {@code format} when collected into the {@code va_list}. See
     * the [GVariant varargs documentation][gvariant-varargs].
     * <p>
     * In order to behave correctly in all cases it is necessary for the
     * calling function to g_variant_ref_sink() the return result before
     * returning control to the user that originally provided the pointer.
     * At this point, the caller will have their own full reference to the
     * result.  This can also be done by adding the result to a container,
     * or by passing it to another g_variant_new() call.
     * @param format a text format {@link Variant}
     * @param app a pointer to a {@code va_list}
     * @return a new, usually floating, {@link Variant}
     */
    public static Variant newParsedVa(java.lang.String format, VaList app) {
        var RESULT = constructNewParsedVa(format, app);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewPrintf(java.lang.String formatString, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_printf.invokeExact(
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a string-type GVariant using printf formatting.
     * <p>
     * This is similar to calling g_strdup_printf() and then
     * g_variant_new_string() but it saves a temporary variable and an
     * unnecessary copy.
     * @param formatString a printf-style format string
     * @param varargs arguments for {@code format_string}
     * @return a floating reference to a new string
     *   {@link Variant} instance
     */
    public static Variant newPrintf(java.lang.String formatString, java.lang.Object... varargs) {
        var RESULT = constructNewPrintf(formatString, varargs);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewSignature(java.lang.String signature) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_signature.invokeExact(
                    Marshal.stringToAddress.marshal(signature, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a D-Bus type signature {@link Variant} with the contents of
     * {@code string}.  {@code string} must be a valid D-Bus type signature.  Use
     * g_variant_is_signature() if you're not sure.
     * @param signature a normal C nul-terminated string
     * @return a floating reference to a new signature {@link Variant} instance
     */
    public static Variant newSignature(java.lang.String signature) {
        var RESULT = constructNewSignature(signature);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewString(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a string {@link Variant} with the contents of {@code string}.
     * <p>
     * {@code string} must be valid UTF-8, and must not be {@code null}. To encode
     * potentially-{@code null} strings, use g_variant_new() with {@code ms} as the
     * [format string][gvariant-format-strings-maybe-types].
     * @param string a normal UTF-8 nul-terminated string
     * @return a floating reference to a new string {@link Variant} instance
     */
    public static Variant newString(java.lang.String string) {
        var RESULT = constructNewString(string);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewStrv(java.lang.String[] strv, long length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_strv.invokeExact(
                    Interop.allocateNativeArray(strv, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Constructs an array of strings {@link Variant} from the given array of
     * strings.
     * <p>
     * If {@code length} is -1 then {@code strv} is {@code null}-terminated.
     * @param strv an array of strings
     * @param length the length of {@code strv}, or -1
     * @return a new floating {@link Variant} instance
     */
    public static Variant newStrv(java.lang.String[] strv, long length) {
        var RESULT = constructNewStrv(strv, length);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewTakeString(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_take_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a string {@link Variant} with the contents of {@code string}.
     * <p>
     * {@code string} must be valid UTF-8, and must not be {@code null}. To encode
     * potentially-{@code null} strings, use this with g_variant_new_maybe().
     * <p>
     * This function consumes {@code string}.  g_free() will be called on {@code string}
     * when it is no longer required.
     * <p>
     * You must not modify or access {@code string} in any other way after passing
     * it to this function.  It is even possible that {@code string} is immediately
     * freed.
     * @param string a normal UTF-8 nul-terminated string
     * @return a floating reference to a new string
     *   {@link Variant} instance
     */
    public static Variant newTakeString(java.lang.String string) {
        var RESULT = constructNewTakeString(string);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewTuple(org.gtk.glib.Variant[] children, long nChildren) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_tuple.invokeExact(
                    Interop.allocateNativeArray(children, org.gtk.glib.Variant.getMemoryLayout(), false),
                    nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new tuple {@link Variant} out of the items in {@code children}.  The
     * type is determined from the types of {@code children}.  No entry in the
     * {@code children} array may be {@code null}.
     * <p>
     * If {@code n_children} is 0 then the unit tuple is constructed.
     * <p>
     * If the {@code children} are floating references (see g_variant_ref_sink()), the
     * new instance takes ownership of them as if via g_variant_ref_sink().
     * @param children the items to make the tuple out of
     * @param nChildren the length of {@code children}
     * @return a floating reference to a new {@link Variant} tuple
     */
    public static Variant newTuple(org.gtk.glib.Variant[] children, long nChildren) {
        var RESULT = constructNewTuple(children, nChildren);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewUint16(short value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_uint16.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new uint16 {@link Variant} instance.
     * @param value a {@code guint16} value
     * @return a floating reference to a new uint16 {@link Variant} instance
     */
    public static Variant newUint16(short value) {
        var RESULT = constructNewUint16(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewUint32(int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_uint32.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new uint32 {@link Variant} instance.
     * @param value a {@code guint32} value
     * @return a floating reference to a new uint32 {@link Variant} instance
     */
    public static Variant newUint32(int value) {
        var RESULT = constructNewUint32(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewUint64(long value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_uint64.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new uint64 {@link Variant} instance.
     * @param value a {@code guint64} value
     * @return a floating reference to a new uint64 {@link Variant} instance
     */
    public static Variant newUint64(long value) {
        var RESULT = constructNewUint64(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewVa(java.lang.String formatString, @Nullable PointerString endptr, VaList app) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_va.invokeExact(
                    Marshal.stringToAddress.marshal(formatString, null),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : endptr.handle()),
                    app);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is intended to be used by libraries based on
     * {@link Variant} that want to provide g_variant_new()-like functionality
     * to their users.
     * <p>
     * The API is more general than g_variant_new() to allow a wider range
     * of possible uses.
     * <p>
     * {@code format_string} must still point to a valid format string, but it only
     * needs to be nul-terminated if {@code endptr} is {@code null}.  If {@code endptr} is
     * non-{@code null} then it is updated to point to the first character past the
     * end of the format string.
     * <p>
     * {@code app} is a pointer to a {@code va_list}.  The arguments, according to
     * {@code format_string}, are collected from this {@code va_list} and the list is left
     * pointing to the argument following the last.
     * <p>
     * Note that the arguments in {@code app} must be of the correct width for their
     * types specified in {@code format_string} when collected into the {@code va_list}.
     * See the [GVariant varargs documentation][gvariant-varargs].
     * <p>
     * These two generalisations allow mixing of multiple calls to
     * g_variant_new_va() and g_variant_get_va() within a single actual
     * varargs call by the user.
     * <p>
     * The return value will be floating if it was a newly created GVariant
     * instance (for example, if the format string was "(ii)").  In the case
     * that the format_string was '*', '?', 'r', or a format starting with
     * '{@code '} then the collected {@link Variant} pointer will be returned unmodified,
     * without adding any additional references.
     * <p>
     * In order to behave correctly in all cases it is necessary for the
     * calling function to g_variant_ref_sink() the return result before
     * returning control to the user that originally provided the pointer.
     * At this point, the caller will have their own full reference to the
     * result.  This can also be done by adding the result to a container,
     * or by passing it to another g_variant_new() call.
     * @param formatString a string that is prefixed with a format string
     * @param endptr location to store the end pointer,
     *          or {@code null}
     * @param app a pointer to a {@code va_list}
     * @return a new, usually floating, {@link Variant}
     */
    public static Variant newVa(java.lang.String formatString, @Nullable PointerString endptr, VaList app) {
        var RESULT = constructNewVa(formatString, endptr, app);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewVariant(org.gtk.glib.Variant value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_new_variant.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Boxes {@code value}.  The result is a {@link Variant} instance representing a
     * variant containing the original value.
     * <p>
     * If {@code child} is a floating reference (see g_variant_ref_sink()), the new
     * instance takes ownership of {@code child}.
     * @param value a {@link Variant} instance
     * @return a floating reference to a new variant {@link Variant} instance
     */
    public static Variant newVariant(org.gtk.glib.Variant value) {
        var RESULT = constructNewVariant(value);
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Performs a byteswapping operation on the contents of {@code value}.  The
     * result is that all multi-byte numeric data contained in {@code value} is
     * byteswapped.  That includes 16, 32, and 64bit signed and unsigned
     * integers as well as file handles and double precision floating point
     * values.
     * <p>
     * This function is an identity mapping on any value that does not
     * contain multi-byte numeric data.  That include strings, booleans,
     * bytes and containers containing only these things (recursively).
     * <p>
     * The returned value is always in normal form and is marked as trusted.
     * @return the byteswapped form of {@code value}
     */
    public org.gtk.glib.Variant byteswap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_byteswap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks if calling g_variant_get() with {@code format_string} on {@code value} would
     * be valid from a type-compatibility standpoint.  {@code format_string} is
     * assumed to be a valid format string (from a syntactic standpoint).
     * <p>
     * If {@code copy_only} is {@code true} then this function additionally checks that it
     * would be safe to call g_variant_unref() on {@code value} immediately after
     * the call to g_variant_get() without invalidating the result.  This is
     * only possible if deep copies are made (ie: there are no pointers to
     * the data inside of the soon-to-be-freed {@link Variant} instance).  If this
     * check fails then a g_critical() is printed and {@code false} is returned.
     * <p>
     * This function is meant to be used by functions that wish to provide
     * varargs accessors to {@link Variant} values of uncertain values (eg:
     * g_variant_lookup() or g_menu_model_get_item_attribute()).
     * @param formatString a valid {@link Variant} format string
     * @param copyOnly {@code true} to ensure the format string makes deep copies
     * @return {@code true} if {@code format_string} is safe to use
     */
    public boolean checkFormatString(java.lang.String formatString, boolean copyOnly) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_check_format_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(formatString, null),
                    Marshal.booleanToInteger.marshal(copyOnly, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Classifies {@code value} according to its top-level type.
     * @return the {@link VariantClass} of {@code value}
     */
    public org.gtk.glib.VariantClass classify() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_classify.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantClass.of(RESULT);
    }
    
    /**
     * Compares {@code one} and {@code two}.
     * <p>
     * The types of {@code one} and {@code two} are {@code gconstpointer} only to allow use of
     * this function with {@link Tree}, {@link PtrArray}, etc.  They must each be a
     * {@link Variant}.
     * <p>
     * Comparison is only defined for basic types (ie: booleans, numbers,
     * strings).  For booleans, {@code false} is less than {@code true}.  Numbers are
     * ordered in the usual way.  Strings are in ASCII lexographical order.
     * <p>
     * It is a programmer error to attempt to compare container values or
     * two values that have types that are not exactly equal.  For example,
     * you cannot compare a 32-bit signed integer with a 32-bit unsigned
     * integer.  Also note that this function is not particularly
     * well-behaved when it comes to comparison of doubles; in particular,
     * the handling of incomparable values (ie: NaN) is undefined.
     * <p>
     * If you only require an equality comparison, g_variant_equal() is more
     * general.
     * @param two a {@link Variant} instance of the same type
     * @return negative value if a &lt; b;
     *          zero if a = b;
     *          positive value if a &gt; b.
     */
    public int compare(org.gtk.glib.Variant two) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_compare.invokeExact(
                    handle(),
                    two.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Similar to g_variant_get_bytestring() except that instead of
     * returning a constant string, the string is duplicated.
     * <p>
     * The return value must be freed using g_free().
     * @param length a pointer to a {@code gsize}, to store
     *          the length (not including the nul terminator)
     * @return a newly allocated string
     */
    public byte[] dupBytestring(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dup_bytestring.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Gets the contents of an array of array of bytes {@link Variant}.  This call
     * makes a deep copy; the return result should be released with
     * g_strfreev().
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result is
     * stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of strings
     */
    public java.lang.String[] dupBytestringArray(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dup_bytestring_array.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the contents of an array of object paths {@link Variant}.  This call
     * makes a deep copy; the return result should be released with
     * g_strfreev().
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result
     * is stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of strings
     */
    public java.lang.String[] dupObjv(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dup_objv.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Similar to g_variant_get_string() except that instead of returning
     * a constant string, the string is duplicated.
     * <p>
     * The string will always be UTF-8 encoded.
     * <p>
     * The return value must be freed using g_free().
     * @param length a pointer to a {@code gsize}, to store the length
     * @return a newly allocated string, UTF-8 encoded
     */
    public java.lang.String dupString(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dup_string.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the contents of an array of strings {@link Variant}.  This call
     * makes a deep copy; the return result should be released with
     * g_strfreev().
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result
     * is stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of strings
     */
    public java.lang.String[] dupStrv(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dup_strv.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Checks if {@code one} and {@code two} have the same type and value.
     * <p>
     * The types of {@code one} and {@code two} are {@code gconstpointer} only to allow use of
     * this function with {@link HashTable}.  They must each be a {@link Variant}.
     * @param two a {@link Variant} instance
     * @return {@code true} if {@code one} and {@code two} are equal
     */
    public boolean equal(org.gtk.glib.Variant two) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_equal.invokeExact(
                    handle(),
                    two.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Deconstructs a {@link Variant} instance.
     * <p>
     * Think of this function as an analogue to scanf().
     * <p>
     * The arguments that are expected by this function are entirely
     * determined by {@code format_string}.  {@code format_string} also restricts the
     * permissible types of {@code value}.  It is an error to give a value with
     * an incompatible type.  See the section on
     * [GVariant format strings][gvariant-format-strings].
     * Please note that the syntax of the format string is very likely to be
     * extended in the future.
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed,
     * see the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * @param formatString a {@link Variant} format string
     * @param varargs arguments, as per {@code format_string}
     */
    public void get(java.lang.String formatString, java.lang.Object... varargs) {
        try {
            DowncallHandles.g_variant_get.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the boolean value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_BOOLEAN}.
     * @return {@code true} or {@code false}
     */
    public boolean getBoolean() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_get_boolean.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the byte value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_BYTE}.
     * @return a {@code guint8}
     */
    public byte getByte() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_variant_get_byte.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the string value of a {@link Variant} instance with an
     * array-of-bytes type.  The string has no particular encoding.
     * <p>
     * If the array does not end with a nul terminator character, the empty
     * string is returned.  For this reason, you can always trust that a
     * non-{@code null} nul-terminated string will be returned by this function.
     * <p>
     * If the array contains a nul terminator character somewhere other than
     * the last byte then the returned string is the string, up to the first
     * such nul character.
     * <p>
     * g_variant_get_fixed_array() should be used instead if the array contains
     * arbitrary data that could not be nul-terminated or could contain nul bytes.
     * <p>
     * It is an error to call this function with a {@code value} that is not an
     * array of bytes.
     * <p>
     * The return value remains valid as long as {@code value} exists.
     * @return the constant string
     */
    public PointerByte getBytestring() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_bytestring.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Gets the contents of an array of array of bytes {@link Variant}.  This call
     * makes a shallow copy; the return result should be released with
     * g_free(), but the individual strings must not be modified.
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result is
     * stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of constant strings
     */
    public java.lang.String[] getBytestringArray(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_bytestring_array.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Reads a child item out of a container {@link Variant} instance and
     * deconstructs it according to {@code format_string}.  This call is
     * essentially a combination of g_variant_get_child_value() and
     * g_variant_get().
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed,
     * see the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * @param index the index of the child to deconstruct
     * @param formatString a {@link Variant} format string
     * @param varargs arguments, as per {@code format_string}
     */
    public void getChild(long index, java.lang.String formatString, java.lang.Object... varargs) {
        try {
            DowncallHandles.g_variant_get_child.invokeExact(
                    handle(),
                    index,
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads a child item out of a container {@link Variant} instance.  This
     * includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * {@link Variant}.
     * <p>
     * It is an error if {@code index_} is greater than the number of child items
     * in the container.  See g_variant_n_children().
     * <p>
     * The returned value is never floating.  You should free it with
     * g_variant_unref() when you're done with it.
     * <p>
     * Note that values borrowed from the returned child are not guaranteed to
     * still be valid after the child is freed even if you still hold a reference
     * to {@code value}, if {@code value} has not been serialized at the time this function is
     * called. To avoid this, you can serialize {@code value} by calling
     * g_variant_get_data() and optionally ignoring the return value.
     * <p>
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in the unit tuple being returned as the child value,
     * instead of further nested children. {@link Variant} is guaranteed to handle
     * nesting up to at least 64 levels.
     * <p>
     * This function is O(1).
     * @param index the index of the child to fetch
     * @return the child at the specified index
     */
    public org.gtk.glib.Variant getChildValue(long index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_child_value.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a pointer to the serialized form of a {@link Variant} instance.
     * The returned data may not be in fully-normalised form if read from an
     * untrusted source.  The returned data must not be freed; it remains
     * valid for as long as {@code value} exists.
     * <p>
     * If {@code value} is a fixed-sized value that was deserialized from a
     * corrupted serialized container then {@code null} may be returned.  In this
     * case, the proper thing to do is typically to use the appropriate
     * number of nul bytes in place of {@code value}.  If {@code value} is not fixed-sized
     * then {@code null} is never returned.
     * <p>
     * In the case that {@code value} is already in serialized form, this function
     * is O(1).  If the value is not already in serialized form,
     * serialization occurs implicitly and is approximately O(n) in the size
     * of the result.
     * <p>
     * To deserialize the data returned by this function, in addition to the
     * serialized data, you must know the type of the {@link Variant}, and (if the
     * machine might be different) the endianness of the machine that stored
     * it. As a result, file formats or network messages that incorporate
     * serialized {@code GVariants} must include this information either
     * implicitly (for instance "the file always contains a
     * {@code G_VARIANT_TYPE_VARIANT} and it is always in little-endian order") or
     * explicitly (by storing the type and/or endianness in addition to the
     * serialized data).
     * @return the serialized form of {@code value}, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a pointer to the serialized form of a {@link Variant} instance.
     * The semantics of this function are exactly the same as
     * g_variant_get_data(), except that the returned {@link Bytes} holds
     * a reference to the variant data.
     * @return A new {@link Bytes} representing the variant data
     */
    public org.gtk.glib.Bytes getDataAsBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_data_as_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the double precision floating point value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_DOUBLE}.
     * @return a {@code gdouble}
     */
    public double getDouble() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_variant_get_double.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Provides access to the serialized data for an array of fixed-sized
     * items.
     * <p>
     * {@code value} must be an array with fixed-sized elements.  Numeric types are
     * fixed-size, as are tuples containing only other fixed-sized types.
     * <p>
     * {@code element_size} must be the size of a single element in the array,
     * as given by the section on
     * [serialized data memory][gvariant-serialized-data-memory].
     * <p>
     * In particular, arrays of these fixed-sized types can be interpreted
     * as an array of the given C type, with {@code element_size} set to the size
     * the appropriate type:
     * <ul>
     * <li>{@code G_VARIANT_TYPE_INT16} (etc.): {@code gint16} (etc.)
     * <li>{@code G_VARIANT_TYPE_BOOLEAN}: {@code guchar} (not {@code gboolean}!)
     * <li>{@code G_VARIANT_TYPE_BYTE}: {@code guint8}
     * <li>{@code G_VARIANT_TYPE_HANDLE}: {@code guint32}
     * <li>{@code G_VARIANT_TYPE_DOUBLE}: {@code gdouble}
     * </ul>
     * <p>
     * For example, if calling this function for an array of 32-bit integers,
     * you might say {@code sizeof(gint32)}. This value isn't used except for the purpose
     * of a double-check that the form of the serialized data matches the caller's
     * expectation.
     * <p>
     * {@code n_elements}, which must be non-{@code null}, is set equal to the number of
     * items in the array.
     * @param nElements a pointer to the location to store the number of items
     * @param elementSize the size of each element
     * @return a pointer to
     *     the fixed array
     */
    public java.lang.foreign.MemoryAddress[] getFixedArray(Out<Long> nElements, long elementSize) {
        MemorySegment nElementsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_fixed_array.invokeExact(
                    handle(),
                    (Addressable) nElementsPOINTER.address(),
                    elementSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nElements.set(nElementsPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.foreign.MemoryAddress[] resultARRAY = new java.lang.foreign.MemoryAddress[nElements.get().intValue()];
        for (int I = 0; I < nElements.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ;
        }
        return resultARRAY;
    }
    
    /**
     * Returns the 32-bit signed integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type other
     * than {@code G_VARIANT_TYPE_HANDLE}.
     * <p>
     * By convention, handles are indexes into an array of file descriptors
     * that are sent alongside a D-Bus message.  If you're not interacting
     * with D-Bus, you probably don't need them.
     * @return a {@code gint32}
     */
    public int getHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the 16-bit signed integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_INT16}.
     * @return a {@code gint16}
     */
    public short getInt16() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_variant_get_int16.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the 32-bit signed integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_INT32}.
     * @return a {@code gint32}
     */
    public int getInt32() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_get_int32.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the 64-bit signed integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_INT64}.
     * @return a {@code gint64}
     */
    public long getInt64() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_get_int64.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Given a maybe-typed {@link Variant} instance, extract its value.  If the
     * value is Nothing, then this function returns {@code null}.
     * @return the contents of {@code value}, or {@code null}
     */
    public @Nullable org.gtk.glib.Variant getMaybe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_maybe.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a {@link Variant} instance that has the same value as {@code value} and is
     * trusted to be in normal form.
     * <p>
     * If {@code value} is already trusted to be in normal form then a new
     * reference to {@code value} is returned.
     * <p>
     * If {@code value} is not already trusted, then it is scanned to check if it
     * is in normal form.  If it is found to be in normal form then it is
     * marked as trusted and a new reference to it is returned.
     * <p>
     * If {@code value} is found not to be in normal form then a new trusted
     * {@link Variant} is created with the same value as {@code value}.
     * <p>
     * It makes sense to call this function if you've received {@link Variant}
     * data from untrusted sources and you want to ensure your serialized
     * output is definitely in normal form.
     * <p>
     * If {@code value} is already in normal form, a new reference will be returned
     * (which will be floating if {@code value} is floating). If it is not in normal form,
     * the newly created {@link Variant} will be returned with a single non-floating
     * reference. Typically, g_variant_take_ref() should be called on the return
     * value from this function to guarantee ownership of a single non-floating
     * reference to it.
     * @return a trusted {@link Variant}
     */
    public org.gtk.glib.Variant getNormalForm() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_normal_form.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the contents of an array of object paths {@link Variant}.  This call
     * makes a shallow copy; the return result should be released with
     * g_free(), but the individual strings must not be modified.
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result
     * is stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of constant strings
     */
    public java.lang.String[] getObjv(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_objv.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Determines the number of bytes that would be required to store {@code value}
     * with g_variant_store().
     * <p>
     * If {@code value} has a fixed-sized type then this function always returned
     * that fixed size.
     * <p>
     * In the case that {@code value} is already in serialized form or the size has
     * already been calculated (ie: this function has been called before)
     * then this function is O(1).  Otherwise, the size is calculated, an
     * operation which is approximately O(n) in the number of values
     * involved.
     * @return the serialized size of {@code value}
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the string value of a {@link Variant} instance with a string
     * type.  This includes the types {@code G_VARIANT_TYPE_STRING},
     * {@code G_VARIANT_TYPE_OBJECT_PATH} and {@code G_VARIANT_TYPE_SIGNATURE}.
     * <p>
     * The string will always be UTF-8 encoded, will never be {@code null}, and will never
     * contain nul bytes.
     * <p>
     * If {@code length} is non-{@code null} then the length of the string (in bytes) is
     * returned there.  For trusted values, this information is already
     * known.  Untrusted values will be validated and, if valid, a strlen() will be
     * performed. If invalid, a default value will be returned — for
     * {@code G_VARIANT_TYPE_OBJECT_PATH}, this is {@code "/"}, and for other types it is the
     * empty string.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than those three.
     * <p>
     * The return value remains valid as long as {@code value} exists.
     * @param length a pointer to a {@code gsize},
     *          to store the length
     * @return the constant string, UTF-8 encoded
     */
    public java.lang.String getString(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_string.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the contents of an array of strings {@link Variant}.  This call
     * makes a shallow copy; the return result should be released with
     * g_free(), but the individual strings must not be modified.
     * <p>
     * If {@code length} is non-{@code null} then the number of elements in the result
     * is stored there.  In any case, the resulting array will be
     * {@code null}-terminated.
     * <p>
     * For an empty array, {@code length} will be set to 0 and a pointer to a
     * {@code null} pointer will be returned.
     * @param length the length of the result, or {@code null}
     * @return an array of constant strings
     */
    public java.lang.String[] getStrv(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_strv.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Determines the type of {@code value}.
     * <p>
     * The return value is valid for the lifetime of {@code value} and must not
     * be freed.
     * @return a {@link VariantType}
     */
    public org.gtk.glib.VariantType getType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantType.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the type string of {@code value}.  Unlike the result of calling
     * g_variant_type_peek_string(), this string is nul-terminated.  This
     * string belongs to {@link Variant} and must not be freed.
     * @return the type string for the type of {@code value}
     */
    public java.lang.String getTypeString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_type_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the 16-bit unsigned integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_UINT16}.
     * @return a {@code guint16}
     */
    public short getUint16() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_variant_get_uint16.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the 32-bit unsigned integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_UINT32}.
     * @return a {@code guint32}
     */
    public int getUint32() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_get_uint32.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the 64-bit unsigned integer value of {@code value}.
     * <p>
     * It is an error to call this function with a {@code value} of any type
     * other than {@code G_VARIANT_TYPE_UINT64}.
     * @return a {@code guint64}
     */
    public long getUint64() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_get_uint64.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is intended to be used by libraries based on {@link Variant}
     * that want to provide g_variant_get()-like functionality to their
     * users.
     * <p>
     * The API is more general than g_variant_get() to allow a wider range
     * of possible uses.
     * <p>
     * {@code format_string} must still point to a valid format string, but it only
     * need to be nul-terminated if {@code endptr} is {@code null}.  If {@code endptr} is
     * non-{@code null} then it is updated to point to the first character past the
     * end of the format string.
     * <p>
     * {@code app} is a pointer to a {@code va_list}.  The arguments, according to
     * {@code format_string}, are collected from this {@code va_list} and the list is left
     * pointing to the argument following the last.
     * <p>
     * These two generalisations allow mixing of multiple calls to
     * g_variant_new_va() and g_variant_get_va() within a single actual
     * varargs call by the user.
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed,
     * see the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * @param formatString a string that is prefixed with a format string
     * @param endptr location to store the end pointer,
     *          or {@code null}
     * @param app a pointer to a {@code va_list}
     */
    public void getVa(java.lang.String formatString, @Nullable PointerString endptr, VaList app) {
        try {
            DowncallHandles.g_variant_get_va.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(formatString, null),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : endptr.handle()),
                    app);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unboxes {@code value}.  The result is the {@link Variant} instance that was
     * contained in {@code value}.
     * @return the item contained in the variant
     */
    public org.gtk.glib.Variant getVariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_get_variant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Generates a hash value for a {@link Variant} instance.
     * <p>
     * The output of this function is guaranteed to be the same for a given
     * value only per-process.  It may change between different processor
     * architectures or even different versions of GLib.  Do not use this
     * function as a basis for building protocols or file formats.
     * <p>
     * The type of {@code value} is {@code gconstpointer} only to allow use of this
     * function with {@link HashTable}.  {@code value} must be a {@link Variant}.
     * @return a hash value corresponding to {@code value}
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_hash.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code value} is a container.
     * @return {@code true} if {@code value} is a container
     */
    public boolean isContainer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_container.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether {@code value} has a floating reference count.
     * <p>
     * This function should only ever be used to assert that a given variant
     * is or is not floating, or for debug purposes. To acquire a reference
     * to a variant that might be floating, always use g_variant_ref_sink()
     * or g_variant_take_ref().
     * <p>
     * See g_variant_ref_sink() for more information about floating reference
     * counts.
     * @return whether {@code value} is floating
     */
    public boolean isFloating() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_floating.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code value} is in normal form.
     * <p>
     * The main reason to do this is to detect if a given chunk of
     * serialized data is in normal form: load the data into a {@link Variant}
     * using g_variant_new_from_data() and then use this function to
     * check.
     * <p>
     * If {@code value} is found to be in normal form then it will be marked as
     * being trusted.  If the value was already marked as being trusted then
     * this function will immediately return {@code true}.
     * <p>
     * There may be implementation specific restrictions on deeply nested values.
     * GVariant is guaranteed to handle nesting up to at least 64 levels.
     * @return {@code true} if {@code value} is in normal form
     */
    public boolean isNormalForm() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_normal_form.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a value has a type matching the provided type.
     * @param type a {@link VariantType}
     * @return {@code true} if the type of {@code value} matches {@code type}
     */
    public boolean isOfType(org.gtk.glib.VariantType type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_of_type.invokeExact(
                    handle(),
                    type.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a heap-allocated {@link VariantIter} for iterating over the items
     * in {@code value}.
     * <p>
     * Use g_variant_iter_free() to free the return value when you no longer
     * need it.
     * <p>
     * A reference is taken to {@code value} and will be released only when
     * g_variant_iter_free() is called.
     * @return a new heap-allocated {@link VariantIter}
     */
    public org.gtk.glib.VariantIter iterNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_iter_new.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantIter.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Looks up a value in a dictionary {@link Variant}.
     * <p>
     * This function is a wrapper around g_variant_lookup_value() and
     * g_variant_get().  In the case that {@code null} would have been returned,
     * this function returns {@code false}.  Otherwise, it unpacks the returned
     * value and returns {@code true}.
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed,
     * see the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * <p>
     * This function is currently implemented with a linear scan.  If you
     * plan to do many lookups then {@link VariantDict} may be more efficient.
     * @param key the key to look up in the dictionary
     * @param formatString a GVariant format string
     * @param varargs the arguments to unpack the value into
     * @return {@code true} if a value was unpacked
     */
    public boolean lookup(java.lang.String key, java.lang.String formatString, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_lookup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Looks up a value in a dictionary {@link Variant}.
     * <p>
     * This function works with dictionaries of the type a{s*} (and equally
     * well with type a{o*}, but we only further discuss the string case
     * for sake of clarity).
     * <p>
     * In the event that {@code dictionary} has the type a{sv}, the {@code expected_type}
     * string specifies what type of value is expected to be inside of the
     * variant. If the value inside the variant has a different type then
     * {@code null} is returned. In the event that {@code dictionary} has a value type other
     * than v then {@code expected_type} must directly match the value type and it is
     * used to unpack the value directly or an error occurs.
     * <p>
     * In either case, if {@code key} is not found in {@code dictionary}, {@code null} is returned.
     * <p>
     * If the key is found and the value has the correct type, it is
     * returned.  If {@code expected_type} was specified then any non-{@code null} return
     * value will have this type.
     * <p>
     * This function is currently implemented with a linear scan.  If you
     * plan to do many lookups then {@link VariantDict} may be more efficient.
     * @param key the key to look up in the dictionary
     * @param expectedType a {@link VariantType}, or {@code null}
     * @return the value of the dictionary key, or {@code null}
     */
    public org.gtk.glib.Variant lookupValue(java.lang.String key, @Nullable org.gtk.glib.VariantType expectedType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_lookup_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    (Addressable) (expectedType == null ? MemoryAddress.NULL : expectedType.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Determines the number of children in a container {@link Variant} instance.
     * This includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * {@link Variant}.
     * <p>
     * For variants, the return value is always 1.  For values with maybe
     * types, it is always zero or one.  For arrays, it is the length of the
     * array.  For tuples it is the number of tuple items (which depends
     * only on the type).  For dictionary entries, it is always 2
     * <p>
     * This function is O(1).
     * @return the number of children in the container
     */
    public long nChildren() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_n_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pretty-prints {@code value} in the format understood by g_variant_parse().
     * <p>
     * The format is described [here][gvariant-text].
     * <p>
     * If {@code type_annotate} is {@code true}, then type information is included in
     * the output.
     * @param typeAnnotate {@code true} if type information should be included in
     *                 the output
     * @return a newly-allocated string holding the result.
     */
    public java.lang.String print(boolean typeAnnotate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_print.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(typeAnnotate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Behaves as g_variant_print(), but operates on a {@link GString}.
     * <p>
     * If {@code string} is non-{@code null} then it is appended to and returned.  Else,
     * a new empty {@link GString} is allocated and it is returned.
     * @param string a {@link GString}, or {@code null}
     * @param typeAnnotate {@code true} if type information should be included in
     *                 the output
     * @return a {@link GString} containing the string
     */
    public org.gtk.glib.GString printString(@Nullable org.gtk.glib.GString string, boolean typeAnnotate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_print_string.invokeExact(
                    handle(),
                    (Addressable) (string == null ? MemoryAddress.NULL : string.handle()),
                    Marshal.booleanToInteger.marshal(typeAnnotate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Increases the reference count of {@code value}.
     * @return the same {@code value}
     */
    public org.gtk.glib.Variant ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * {@link Variant} uses a floating reference count system.  All functions with
     * names starting with {@code g_variant_new_} return floating
     * references.
     * <p>
     * Calling g_variant_ref_sink() on a {@link Variant} with a floating reference
     * will convert the floating reference into a full reference.  Calling
     * g_variant_ref_sink() on a non-floating {@link Variant} results in an
     * additional normal reference being added.
     * <p>
     * In other words, if the {@code value} is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference.  If the {@code value} is not floating, then this call adds a
     * new normal reference increasing the reference count by one.
     * <p>
     * All calls that result in a {@link Variant} instance being inserted into a
     * container will call g_variant_ref_sink() on the instance.  This means
     * that if the value was just created (and has only its floating
     * reference) then the container will assume sole ownership of the value
     * at that point and the caller will not need to unreference it.  This
     * makes certain common styles of programming much easier while still
     * maintaining normal refcounting semantics in situations where values
     * are not floating.
     * @return the same {@code value}
     */
    public org.gtk.glib.Variant refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_ref_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Stores the serialized form of {@code value} at {@code data}.  {@code data} should be
     * large enough.  See g_variant_get_size().
     * <p>
     * The stored data is in machine native byte order but may not be in
     * fully-normalised form if read from an untrusted source.  See
     * g_variant_get_normal_form() for a solution.
     * <p>
     * As with g_variant_get_data(), to be able to deserialize the
     * serialized variant successfully, its type and (if the destination
     * machine might be different) its endianness must also be available.
     * <p>
     * This function is approximately O(n) in the size of {@code data}.
     */
    public void store() {
        try {
            DowncallHandles.g_variant_store.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code value} is floating, sink it.  Otherwise, do nothing.
     * <p>
     * Typically you want to use g_variant_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     * <p>
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * {@link Variant}.  We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the value that is being returned already exists).
     * <p>
     * At the same time, the style of the {@link Variant} API makes it likely that
     * for newly-created {@link Variant} instances, the user can be saved some
     * typing if they are allowed to return a {@link Variant} with a floating
     * reference.
     * <p>
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them.  The caller
     * will always receives exactly one full reference to the value: either
     * the one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     * <p>
     * This function has an odd interaction when combined with
     * g_variant_ref_sink() running at the same time in another thread on
     * the same {@link Variant} instance.  If g_variant_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference.  If g_variant_take_ref() runs first then the result will
     * be that the floating reference is converted to a hard reference and
     * an additional reference on top of that one is added.  It is best to
     * avoid this situation.
     * @return the same {@code value}
     */
    public org.gtk.glib.Variant takeRef() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_take_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of {@code value}.  When its reference count
     * drops to 0, the memory used by the variant is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_variant_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * should ensure that a string is a valid D-Bus object path before
     * passing it to g_variant_new_object_path().
     * <p>
     * A valid object path starts with {@code /} followed by zero or more
     * sequences of characters separated by {@code /} characters.  Each sequence
     * must contain only the characters {@code [A-Z][a-z][0-9]_}.  No sequence
     * (including the one following the final {@code /} character) may be empty.
     * @param string a normal C nul-terminated string
     * @return {@code true} if {@code string} is a D-Bus object path
     */
    public static boolean isObjectPath(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_object_path.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * should ensure that a string is a valid D-Bus type signature before
     * passing it to g_variant_new_signature().
     * <p>
     * D-Bus type signatures consist of zero or more definite {@link VariantType}
     * strings in sequence.
     * @param string a normal C nul-terminated string
     * @return {@code true} if {@code string} is a D-Bus type signature
     */
    public static boolean isSignature(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_signature.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses a {@link Variant} from a text representation.
     * <p>
     * A single {@link Variant} is parsed from the content of {@code text}.
     * <p>
     * The format is described [here][gvariant-text].
     * <p>
     * The memory at {@code limit} will never be accessed and the parser behaves as
     * if the character at {@code limit} is the nul terminator.  This has the
     * effect of bounding {@code text}.
     * <p>
     * If {@code endptr} is non-{@code null} then {@code text} is permitted to contain data
     * following the value that this function parses and {@code endptr} will be
     * updated to point to the first character past the end of the text
     * parsed by this function.  If {@code endptr} is {@code null} and there is extra data
     * then an error is returned.
     * <p>
     * If {@code type} is non-{@code null} then the value will be parsed to have that
     * type.  This may result in additional parse errors (in the case that
     * the parsed value doesn't fit the type) but may also result in fewer
     * errors (in the case that the type would have been ambiguous, such as
     * with empty arrays).
     * <p>
     * In the event that the parsing is successful, the resulting {@link Variant}
     * is returned. It is never floating, and must be freed with
     * g_variant_unref().
     * <p>
     * In case of any error, {@code null} will be returned.  If {@code error} is non-{@code null}
     * then it will be set to reflect the error that occurred.
     * <p>
     * Officially, the language understood by the parser is "any string
     * produced by g_variant_print()".
     * <p>
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in a {@link VariantParseError#RECURSION} error. {@link Variant} is
     * guaranteed to handle nesting up to at least 64 levels.
     * @param type a {@link VariantType}, or {@code null}
     * @param text a string containing a GVariant in text form
     * @param limit a pointer to the end of {@code text}, or {@code null}
     * @param endptr a location to store the end pointer, or {@code null}
     * @return a non-floating reference to a {@link Variant}, or {@code null}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.Variant parse(@Nullable org.gtk.glib.VariantType type, java.lang.String text, @Nullable java.lang.String limit, @Nullable PointerString endptr) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_parse.invokeExact(
                    (Addressable) (type == null ? MemoryAddress.NULL : type.handle()),
                    Marshal.stringToAddress.marshal(text, null),
                    (Addressable) (limit == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(limit, null)),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : endptr.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Pretty-prints a message showing the context of a {@link Variant} parse
     * error within the string for which parsing was attempted.
     * <p>
     * The resulting string is suitable for output to the console or other
     * monospace media where newlines are treated in the usual way.
     * <p>
     * The message will typically look something like one of the following:
     * <pre>{@code 
     * unterminated string constant:
     *   (1, 2, 3, 'abc
     *             ^^^^
     * }</pre>
     * <p>
     * or
     * <pre>{@code 
     * unable to find a common type:
     *   [1, 2, 3, 'str']
     *    ^        ^^^^^
     * }</pre>
     * <p>
     * The format of the message may change in a future version.
     * <p>
     * {@code error} must have come from a failed attempt to g_variant_parse() and
     * {@code source_str} must be exactly the same string that caused the error.
     * If {@code source_str} was not nul-terminated when you passed it to
     * g_variant_parse() then you must add nul termination before using this
     * function.
     * @param error a {@link Error} from the {@link VariantParseError} domain
     * @param sourceStr the string that was given to the parser
     * @return the printed message
     */
    public static java.lang.String parseErrorPrintContext(org.gtk.glib.Error error, java.lang.String sourceStr) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_parse_error_print_context.invokeExact(
                    error.handle(),
                    Marshal.stringToAddress.marshal(sourceStr, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.Quark parseErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_parse_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Same as g_variant_error_quark().
     * @deprecated Use g_variant_parse_error_quark() instead.
     */
    @Deprecated
    public static org.gtk.glib.Quark parserGetErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_parser_get_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_variant_new = Interop.downcallHandle(
            "g_variant_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_new_array = Interop.downcallHandle(
            "g_variant_new_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_boolean = Interop.downcallHandle(
            "g_variant_new_boolean",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_new_byte = Interop.downcallHandle(
            "g_variant_new_byte",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle g_variant_new_bytestring = Interop.downcallHandle(
            "g_variant_new_bytestring",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_bytestring_array = Interop.downcallHandle(
            "g_variant_new_bytestring_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_dict_entry = Interop.downcallHandle(
            "g_variant_new_dict_entry",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_double = Interop.downcallHandle(
            "g_variant_new_double",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_variant_new_fixed_array = Interop.downcallHandle(
            "g_variant_new_fixed_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_from_bytes = Interop.downcallHandle(
            "g_variant_new_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_new_from_data = Interop.downcallHandle(
            "g_variant_new_from_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_handle = Interop.downcallHandle(
            "g_variant_new_handle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_new_int16 = Interop.downcallHandle(
            "g_variant_new_int16",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_variant_new_int32 = Interop.downcallHandle(
            "g_variant_new_int32",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_new_int64 = Interop.downcallHandle(
            "g_variant_new_int64",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_maybe = Interop.downcallHandle(
            "g_variant_new_maybe",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_object_path = Interop.downcallHandle(
            "g_variant_new_object_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_objv = Interop.downcallHandle(
            "g_variant_new_objv",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_parsed = Interop.downcallHandle(
            "g_variant_new_parsed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_new_parsed_va = Interop.downcallHandle(
            "g_variant_new_parsed_va",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_printf = Interop.downcallHandle(
            "g_variant_new_printf",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_new_signature = Interop.downcallHandle(
            "g_variant_new_signature",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_string = Interop.downcallHandle(
            "g_variant_new_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_strv = Interop.downcallHandle(
            "g_variant_new_strv",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_take_string = Interop.downcallHandle(
            "g_variant_new_take_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_tuple = Interop.downcallHandle(
            "g_variant_new_tuple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_uint16 = Interop.downcallHandle(
            "g_variant_new_uint16",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_variant_new_uint32 = Interop.downcallHandle(
            "g_variant_new_uint32",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_new_uint64 = Interop.downcallHandle(
            "g_variant_new_uint64",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_new_va = Interop.downcallHandle(
            "g_variant_new_va",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_new_variant = Interop.downcallHandle(
            "g_variant_new_variant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_byteswap = Interop.downcallHandle(
            "g_variant_byteswap",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_check_format_string = Interop.downcallHandle(
            "g_variant_check_format_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_classify = Interop.downcallHandle(
            "g_variant_classify",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_compare = Interop.downcallHandle(
            "g_variant_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dup_bytestring = Interop.downcallHandle(
            "g_variant_dup_bytestring",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dup_bytestring_array = Interop.downcallHandle(
            "g_variant_dup_bytestring_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dup_objv = Interop.downcallHandle(
            "g_variant_dup_objv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dup_string = Interop.downcallHandle(
            "g_variant_dup_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dup_strv = Interop.downcallHandle(
            "g_variant_dup_strv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_equal = Interop.downcallHandle(
            "g_variant_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get = Interop.downcallHandle(
            "g_variant_get",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_get_boolean = Interop.downcallHandle(
            "g_variant_get_boolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_byte = Interop.downcallHandle(
            "g_variant_get_byte",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_bytestring = Interop.downcallHandle(
            "g_variant_get_bytestring",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_bytestring_array = Interop.downcallHandle(
            "g_variant_get_bytestring_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_child = Interop.downcallHandle(
            "g_variant_get_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_get_child_value = Interop.downcallHandle(
            "g_variant_get_child_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_get_data = Interop.downcallHandle(
            "g_variant_get_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_data_as_bytes = Interop.downcallHandle(
            "g_variant_get_data_as_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_double = Interop.downcallHandle(
            "g_variant_get_double",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_fixed_array = Interop.downcallHandle(
            "g_variant_get_fixed_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_variant_get_handle = Interop.downcallHandle(
            "g_variant_get_handle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_int16 = Interop.downcallHandle(
            "g_variant_get_int16",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_int32 = Interop.downcallHandle(
            "g_variant_get_int32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_int64 = Interop.downcallHandle(
            "g_variant_get_int64",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_maybe = Interop.downcallHandle(
            "g_variant_get_maybe",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_normal_form = Interop.downcallHandle(
            "g_variant_get_normal_form",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_objv = Interop.downcallHandle(
            "g_variant_get_objv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_size = Interop.downcallHandle(
            "g_variant_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_string = Interop.downcallHandle(
            "g_variant_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_strv = Interop.downcallHandle(
            "g_variant_get_strv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_type = Interop.downcallHandle(
            "g_variant_get_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_type_string = Interop.downcallHandle(
            "g_variant_get_type_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_uint16 = Interop.downcallHandle(
            "g_variant_get_uint16",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_uint32 = Interop.downcallHandle(
            "g_variant_get_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_uint64 = Interop.downcallHandle(
            "g_variant_get_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_va = Interop.downcallHandle(
            "g_variant_get_va",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_get_variant = Interop.downcallHandle(
            "g_variant_get_variant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_hash = Interop.downcallHandle(
            "g_variant_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_container = Interop.downcallHandle(
            "g_variant_is_container",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_floating = Interop.downcallHandle(
            "g_variant_is_floating",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_normal_form = Interop.downcallHandle(
            "g_variant_is_normal_form",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_of_type = Interop.downcallHandle(
            "g_variant_is_of_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_iter_new = Interop.downcallHandle(
            "g_variant_iter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_lookup = Interop.downcallHandle(
            "g_variant_lookup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_lookup_value = Interop.downcallHandle(
            "g_variant_lookup_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_n_children = Interop.downcallHandle(
            "g_variant_n_children",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_print = Interop.downcallHandle(
            "g_variant_print",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_print_string = Interop.downcallHandle(
            "g_variant_print_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_ref = Interop.downcallHandle(
            "g_variant_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_ref_sink = Interop.downcallHandle(
            "g_variant_ref_sink",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_store = Interop.downcallHandle(
            "g_variant_store",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_take_ref = Interop.downcallHandle(
            "g_variant_take_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_unref = Interop.downcallHandle(
            "g_variant_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_object_path = Interop.downcallHandle(
            "g_variant_is_object_path",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_is_signature = Interop.downcallHandle(
            "g_variant_is_signature",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_parse = Interop.downcallHandle(
            "g_variant_parse",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_parse_error_print_context = Interop.downcallHandle(
            "g_variant_parse_error_print_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_parse_error_quark = Interop.downcallHandle(
            "g_variant_parse_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_variant_parser_get_error_quark = Interop.downcallHandle(
            "g_variant_parser_get_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
