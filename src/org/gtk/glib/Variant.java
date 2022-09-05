package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GVariant is a variant datatype; it can contain one or more values
 * along with information about the type of the values.
 * 
 * A #GVariant may contain simple types, like an integer, or a boolean value;
 * or complex types, like an array of two strings, or a dictionary of key
 * value pairs. A #GVariant is also immutable: once it's been created neither
 * its type nor its content can be modified further.
 * 
 * GVariant is useful whenever data needs to be serialized, for example when
 * sending method parameters in D-Bus, or when saving settings using GSettings.
 * 
 * When creating a new #GVariant, you pass the data you want to store in it
 * along with a string representing the type of data you wish to pass to it.
 * 
 * For instance, if you want to create a #GVariant holding an integer value you
 * can use:
 * 
 * |[<!-- language="C" -->
 *   GVariant *v = g_variant_new ("u", 40);
 * ]|
 * 
 * The string "u" in the first argument tells #GVariant that the data passed to
 * the constructor (40) is going to be an unsigned integer.
 * 
 * More advanced examples of #GVariant in use can be found in documentation for
 * [GVariant format strings][gvariant-format-strings-pointers].
 * 
 * The range of possible values is determined by the type.
 * 
 * The type system used by #GVariant is #GVariantType.
 * 
 * #GVariant instances always have a type and a value (which are given
 * at construction time).  The type and value of a #GVariant instance
 * can never change other than by the #GVariant itself being
 * destroyed.  A #GVariant cannot contain a pointer.
 * 
 * #GVariant is reference counted using g_variant_ref() and
 * g_variant_unref().  #GVariant also has floating reference counts --
 * see g_variant_ref_sink().
 * 
 * #GVariant is completely threadsafe.  A #GVariant instance can be
 * concurrently accessed in any way from any number of threads without
 * problems.
 * 
 * #GVariant is heavily optimised for dealing with data in serialized
 * form.  It works particularly well with data located in memory-mapped
 * files.  It can perform nearly all deserialization operations in a
 * small constant time, usually touching only a single memory page.
 * Serialized #GVariant data can also be sent over the network.
 * 
 * #GVariant is largely compatible with D-Bus.  Almost all types of
 * #GVariant instances can be sent over D-Bus.  See #GVariantType for
 * exceptions.  (However, #GVariant's serialization format is not the same
 * as the serialization format of a D-Bus message body: use #GDBusMessage,
 * in the gio library, for those.)
 * 
 * For space-efficiency, the #GVariant serialization format does not
 * automatically include the variant's length, type or endianness,
 * which must either be implied from context (such as knowledge that a
 * particular file format always contains a little-endian
 * %G_VARIANT_TYPE_VARIANT which occupies the whole length of the file)
 * or supplied out-of-band (for instance, a length, type and/or endianness
 * indicator could be placed at the beginning of a file, network message
 * or network stream).
 * 
 * A #GVariant's size is limited mainly by any lower level operating
 * system constraints, such as the number of bits in #gsize.  For
 * example, it is reasonable to have a 2GB file mapped into memory
 * with #GMappedFile, and call g_variant_new_from_data() on it.
 * 
 * For convenience to C programmers, #GVariant features powerful
 * varargs-based value construction and destruction.  This feature is
 * designed to be embedded in other libraries.
 * 
 * There is a Python-inspired text language for describing #GVariant
 * values.  #GVariant includes a printer for this language and a parser
 * with type inferencing.
 * 
 * ## Memory Use
 * 
 * #GVariant tries to be quite efficient with respect to memory use.
 * This section gives a rough idea of how much memory is used by the
 * current implementation.  The information here is subject to change
 * in the future.
 * 
 * The memory allocated by #GVariant can be grouped into 4 broad
 * purposes: memory for serialized data, memory for the type
 * information cache, buffer management memory and memory for the
 * #GVariant structure itself.
 * 
 * ## Serialized Data Memory
 * 
 * This is the memory that is used for storing GVariant data in
 * serialized form.  This is what would be sent over the network or
 * what would end up on disk, not counting any indicator of the
 * endianness, or of the length or type of the top-level variant.
 * 
 * The amount of memory required to store a boolean is 1 byte. 16,
 * 32 and 64 bit integers and double precision floating point numbers
 * use their "natural" size.  Strings (including object path and
 * signature strings) are stored with a nul terminator, and as such
 * use the length of the string plus 1 byte.
 * 
 * Maybe types use no space at all to represent the null value and
 * use the same amount of space (sometimes plus one byte) as the
 * equivalent non-maybe-typed value to represent the non-null case.
 * 
 * Arrays use the amount of space required to store each of their
 * members, concatenated.  Additionally, if the items stored in an
 * array are not of a fixed-size (ie: strings, other arrays, etc)
 * then an additional framing offset is stored for each item.  The
 * size of this offset is either 1, 2 or 4 bytes depending on the
 * overall size of the container.  Additionally, extra padding bytes
 * are added as required for alignment of child values.
 * 
 * Tuples (including dictionary entries) use the amount of space
 * required to store each of their members, concatenated, plus one
 * framing offset (as per arrays) for each non-fixed-sized item in
 * the tuple, except for the last one.  Additionally, extra padding
 * bytes are added as required for alignment of child values.
 * 
 * Variants use the same amount of space as the item inside of the
 * variant, plus 1 byte, plus the length of the type string for the
 * item inside the variant.
 * 
 * As an example, consider a dictionary mapping strings to variants.
 * In the case that the dictionary is empty, 0 bytes are required for
 * the serialization.
 * 
 * If we add an item "width" that maps to the int32 value of 500 then
 * we will use 4 byte to store the int32 (so 6 for the variant
 * containing it) and 6 bytes for the string.  The variant must be
 * aligned to 8 after the 6 bytes of the string, so that's 2 extra
 * bytes.  6 (string) + 2 (padding) + 6 (variant) is 14 bytes used
 * for the dictionary entry.  An additional 1 byte is added to the
 * array as a framing offset making a total of 15 bytes.
 * 
 * If we add another entry, "title" that maps to a nullable string
 * that happens to have a value of null, then we use 0 bytes for the
 * null value (and 3 bytes for the variant to contain it along with
 * its type string) plus 6 bytes for the string.  Again, we need 2
 * padding bytes.  That makes a total of 6 + 2 + 3 = 11 bytes.
 * 
 * We now require extra padding between the two items in the array.
 * After the 14 bytes of the first item, that's 2 bytes required.
 * We now require 2 framing offsets for an extra two
 * bytes. 14 + 2 + 11 + 2 = 29 bytes to encode the entire two-item
 * dictionary.
 * 
 * ## Type Information Cache
 * 
 * For each GVariant type that currently exists in the program a type
 * information structure is kept in the type information cache.  The
 * type information structure is required for rapid deserialization.
 * 
 * Continuing with the above example, if a #GVariant exists with the
 * type "a{sv}" then a type information struct will exist for
 * "a{sv}", "{sv}", "s", and "v".  Multiple uses of the same type
 * will share the same type information.  Additionally, all
 * single-digit types are stored in read-only static memory and do
 * not contribute to the writable memory footprint of a program using
 * #GVariant.
 * 
 * Aside from the type information structures stored in read-only
 * memory, there are two forms of type information.  One is used for
 * container types where there is a single element type: arrays and
 * maybe types.  The other is used for container types where there
 * are multiple element types: tuples and dictionary entries.
 * 
 * Array type info structures are 6 * sizeof (void *), plus the
 * memory required to store the type string itself.  This means that
 * on 32-bit systems, the cache entry for "a{sv}" would require 30
 * bytes of memory (plus malloc overhead).
 * 
 * Tuple type info structures are 6 * sizeof (void *), plus 4 *
 * sizeof (void *) for each item in the tuple, plus the memory
 * required to store the type string itself.  A 2-item tuple, for
 * example, would have a type information structure that consumed
 * writable memory in the size of 14 * sizeof (void *) (plus type
 * string)  This means that on 32-bit systems, the cache entry for
 * "{sv}" would require 61 bytes of memory (plus malloc overhead).
 * 
 * This means that in total, for our "a{sv}" example, 91 bytes of
 * type information would be allocated.
 * 
 * The type information cache, additionally, uses a #GHashTable to
 * store and look up the cached items and stores a pointer to this
 * hash table in static storage.  The hash table is freed when there
 * are zero items in the type cache.
 * 
 * Although these sizes may seem large it is important to remember
 * that a program will probably only have a very small number of
 * different types of values in it and that only one type information
 * structure is required for many different values of the same type.
 * 
 * ## Buffer Management Memory
 * 
 * #GVariant uses an internal buffer management structure to deal
 * with the various different possible sources of serialized data
 * that it uses.  The buffer is responsible for ensuring that the
 * correct call is made when the data is no longer in use by
 * #GVariant.  This may involve a g_free() or a g_slice_free() or
 * even g_mapped_file_unref().
 * 
 * One buffer management structure is used for each chunk of
 * serialized data.  The size of the buffer management structure
 * is 4 * (void *).  On 32-bit systems, that's 16 bytes.
 * 
 * ## GVariant structure
 * 
 * The size of a #GVariant structure is 6 * (void *).  On 32-bit
 * systems, that's 24 bytes.
 * 
 * #GVariant structures only exist if they are explicitly created
 * with API calls.  For example, if a #GVariant is constructed out of
 * serialized data for the example given above (with the dictionary)
 * then although there are 9 individual values that comprise the
 * entire dictionary (two keys, two values, two variants containing
 * the values, two dictionary entries, plus the dictionary itself),
 * only 1 #GVariant instance exists -- the one referring to the
 * dictionary.
 * 
 * If calls are made to start accessing the other values then
 * #GVariant instances will exist for those values only for as long
 * as they are in use (ie: until you call g_variant_unref()).  The
 * type information is shared.  The serialized data and the buffer
 * management structure for that serialized data is shared by the
 * child.
 * 
 * ## Summary
 * 
 * To put the entire example together, for our dictionary mapping
 * strings to variants (with two entries, as given above), we are
 * using 91 bytes of memory for type information, 29 bytes of memory
 * for the serialized data, 16 bytes for buffer management and 24
 * bytes for the #GVariant instance, or a total of 160 bytes, plus
 * malloc overhead.  If we were to use g_variant_get_child_value() to
 * access the two dictionary entries, we would use an additional 48
 * bytes.  If we were to have other dictionaries of the same type, we
 * would use more memory for the serialized data and buffer
 * management for those dictionaries, but the type information would
 * be shared.
 */
public class Variant extends io.github.jwharm.javagi.interop.ResourceBase {

    public Variant(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GVariant array from @children.
     * 
     * @child_type must be non-%NULL if @n_children is zero.  Otherwise, the
     * child type is determined by inspecting the first element of the
     * @children array.  If @child_type is non-%NULL then it must be a
     * definite type.
     * 
     * The items of the array are taken from the @children array.  No entry
     * in the @children array may be %NULL.
     * 
     * All items in the array must have the same type, which must be the
     * same as @child_type, if given.
     * 
     * If the @children are floating references (see g_variant_ref_sink()), the
     * new instance takes ownership of them as if via g_variant_ref_sink().
     */
    public Variant(VariantType childType, Variant[] children, long nChildren) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_array(childType.HANDLE(), Interop.allocateNativeArray(children), nChildren), false));
    }
    
    /**
     * Creates a new boolean #GVariant instance -- either %TRUE or %FALSE.
     */
    public Variant(boolean value) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_boolean(value ? 1 : 0), false));
    }
    
    /**
     * Creates a new byte #GVariant instance.
     */
    public Variant(byte value) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_byte(value), false));
    }
    
    /**
     * Creates an array-of-bytes #GVariant with the contents of @string.
     * This function is just like g_variant_new_string() except that the
     * string need not be valid UTF-8.
     * 
     * The nul terminator character at the end of the string is stored in
     * the array.
     */
    public Variant(byte[] string) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_bytestring(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, string)), false));
    }
    
    /**
     * Constructs an array of bytestring #GVariant from the given array of
     * strings.
     * 
     * If @length is -1 then @strv is %NULL-terminated.
     */
    public static Variant newBytestringArray(java.lang.String[] strv, long length) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_bytestring_array(Interop.allocateNativeArray(strv), length), false));
    }
    
    /**
     * Creates a new dictionary entry #GVariant. @key and @value must be
     * non-%NULL. @key must be a value of a basic type (ie: not a container).
     * 
     * If the @key or @value are floating references (see g_variant_ref_sink()),
     * the new instance takes ownership of them as if via g_variant_ref_sink().
     */
    public Variant(Variant key, Variant value) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_dict_entry(key.HANDLE(), value.HANDLE()), false));
    }
    
    /**
     * Creates a new double #GVariant instance.
     */
    public Variant(double value) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_double(value), false));
    }
    
    /**
     * Constructs a new array #GVariant instance, where the elements are
     * of @element_type type.
     * 
     * @elements must be an array with fixed-sized elements.  Numeric types are
     * fixed-size as are tuples containing only other fixed-sized types.
     * 
     * @element_size must be the size of a single element in the array.
     * For example, if calling this function for an array of 32-bit integers,
     * you might say sizeof(gint32). This value isn't used except for the purpose
     * of a double-check that the form of the serialized data matches the caller's
     * expectation.
     * 
     * @n_elements must be the length of the @elements array.
     */
    public Variant(VariantType elementType, jdk.incubator.foreign.MemoryAddress elements, long nElements, long elementSize) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_fixed_array(elementType.HANDLE(), elements, nElements, elementSize), false));
    }
    
    /**
     * Constructs a new serialized-mode #GVariant instance.  This is the
     * inner interface for creation of new serialized values that gets
     * called from various functions in gvariant.c.
     * 
     * A reference is taken on @bytes.
     * 
     * The data in @bytes must be aligned appropriately for the @type being loaded.
     * Otherwise this function will internally create a copy of the memory (since
     * GLib 2.60) or (in older versions) fail and exit the process.
     */
    public Variant(VariantType type, Bytes bytes, boolean trusted) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_from_bytes(type.HANDLE(), bytes.HANDLE(), trusted ? 1 : 0), false));
    }
    
    /**
     * Creates a new handle #GVariant instance.
     * 
     * By convention, handles are indexes into an array of file descriptors
     * that are sent alongside a D-Bus message.  If you're not interacting
     * with D-Bus, you probably don't need them.
     */
    public static Variant newHandle(int value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_handle(value), false));
    }
    
    /**
     * Creates a new int16 #GVariant instance.
     */
    public static Variant newInt16(short value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_int16(value), false));
    }
    
    /**
     * Creates a new int32 #GVariant instance.
     */
    public static Variant newInt32(int value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_int32(value), false));
    }
    
    /**
     * Creates a new int64 #GVariant instance.
     */
    public static Variant newInt64(long value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_int64(value), false));
    }
    
    /**
     * Depending on if @child is %NULL, either wraps @child inside of a
     * maybe container or creates a Nothing instance for the given @type.
     * 
     * At least one of @child_type and @child must be non-%NULL.
     * If @child_type is non-%NULL then it must be a definite type.
     * If they are both non-%NULL then @child_type must be the type
     * of @child.
     * 
     * If @child is a floating reference (see g_variant_ref_sink()), the new
     * instance takes ownership of @child.
     */
    public Variant(VariantType childType, Variant child) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_maybe(childType.HANDLE(), child.HANDLE()), false));
    }
    
    /**
     * Creates a D-Bus object path #GVariant with the contents of @string.
     * @string must be a valid D-Bus object path.  Use
     * g_variant_is_object_path() if you're not sure.
     */
    public static Variant newObjectPath(java.lang.String objectPath) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_object_path(Interop.getAllocator().allocateUtf8String(objectPath)), false));
    }
    
    /**
     * Constructs an array of object paths #GVariant from the given array of
     * strings.
     * 
     * Each string must be a valid #GVariant object path; see
     * g_variant_is_object_path().
     * 
     * If @length is -1 then @strv is %NULL-terminated.
     */
    public static Variant newObjv(java.lang.String[] strv, long length) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_objv(Interop.allocateNativeArray(strv), length), false));
    }
    
    /**
     * Parses @format and returns the result.
     * 
     * This is the version of g_variant_new_parsed() intended to be used
     * from libraries.
     * 
     * The return value will be floating if it was a newly created GVariant
     * instance.  In the case that @format simply specified the collection
     * of a #GVariant pointer (eg: @format was "%*") then the collected
     * #GVariant pointer will be returned unmodified, without adding any
     * additional references.
     * 
     * Note that the arguments in @app must be of the correct width for their types
     * specified in @format when collected into the #va_list. See
     * the [GVariant varargs documentation][gvariant-varargs].
     * 
     * In order to behave correctly in all cases it is necessary for the
     * calling function to g_variant_ref_sink() the return result before
     * returning control to the user that originally provided the pointer.
     * At this point, the caller will have their own full reference to the
     * result.  This can also be done by adding the result to a container,
     * or by passing it to another g_variant_new() call.
     */
    public Variant(java.lang.String format, VaList app) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_parsed_va(Interop.getAllocator().allocateUtf8String(format), app), true));
    }
    
    /**
     * Creates a D-Bus type signature #GVariant with the contents of
     * @string.  @string must be a valid D-Bus type signature.  Use
     * g_variant_is_signature() if you're not sure.
     */
    public static Variant newSignature(java.lang.String signature) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_signature(Interop.getAllocator().allocateUtf8String(signature)), false));
    }
    
    /**
     * Creates a string #GVariant with the contents of @string.
     * 
     * @string must be valid UTF-8, and must not be %NULL. To encode
     * potentially-%NULL strings, use g_variant_new() with `ms` as the
     * [format string][gvariant-format-strings-maybe-types].
     */
    public static Variant newString(java.lang.String string) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_string(Interop.getAllocator().allocateUtf8String(string)), false));
    }
    
    /**
     * Constructs an array of strings #GVariant from the given array of
     * strings.
     * 
     * If @length is -1 then @strv is %NULL-terminated.
     */
    public static Variant newStrv(java.lang.String[] strv, long length) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_strv(Interop.allocateNativeArray(strv), length), false));
    }
    
    /**
     * Creates a string #GVariant with the contents of @string.
     * 
     * @string must be valid UTF-8, and must not be %NULL. To encode
     * potentially-%NULL strings, use this with g_variant_new_maybe().
     * 
     * This function consumes @string.  g_free() will be called on @string
     * when it is no longer required.
     * 
     * You must not modify or access @string in any other way after passing
     * it to this function.  It is even possible that @string is immediately
     * freed.
     */
    public static Variant newTakeString(java.lang.String string) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_take_string(Interop.getAllocator().allocateUtf8String(string)), false));
    }
    
    /**
     * Creates a new tuple #GVariant out of the items in @children.  The
     * type is determined from the types of @children.  No entry in the
     * @children array may be %NULL.
     * 
     * If @n_children is 0 then the unit tuple is constructed.
     * 
     * If the @children are floating references (see g_variant_ref_sink()), the
     * new instance takes ownership of them as if via g_variant_ref_sink().
     */
    public static Variant newTuple(Variant[] children, long nChildren) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_tuple(Interop.allocateNativeArray(children), nChildren), false));
    }
    
    /**
     * Creates a new uint16 #GVariant instance.
     */
    public static Variant newUint16(short value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_uint16(value), false));
    }
    
    /**
     * Creates a new uint32 #GVariant instance.
     */
    public static Variant newUint32(int value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_uint32(value), false));
    }
    
    /**
     * Creates a new uint64 #GVariant instance.
     */
    public static Variant newUint64(long value) {
        return new Variant(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_uint64(value), false));
    }
    
    /**
     * This function is intended to be used by libraries based on
     * #GVariant that want to provide g_variant_new()-like functionality
     * to their users.
     * 
     * The API is more general than g_variant_new() to allow a wider range
     * of possible uses.
     * 
     * @format_string must still point to a valid format string, but it only
     * needs to be nul-terminated if @endptr is %NULL.  If @endptr is
     * non-%NULL then it is updated to point to the first character past the
     * end of the format string.
     * 
     * @app is a pointer to a #va_list.  The arguments, according to
     * @format_string, are collected from this #va_list and the list is left
     * pointing to the argument following the last.
     * 
     * Note that the arguments in @app must be of the correct width for their
     * types specified in @format_string when collected into the #va_list.
     * See the [GVariant varargs documentation][gvariant-varargs].
     * 
     * These two generalisations allow mixing of multiple calls to
     * g_variant_new_va() and g_variant_get_va() within a single actual
     * varargs call by the user.
     * 
     * The return value will be floating if it was a newly created GVariant
     * instance (for example, if the format string was "(ii)").  In the case
     * that the format_string was '*', '?', 'r', or a format starting with
     * '@' then the collected #GVariant pointer will be returned unmodified,
     * without adding any additional references.
     * 
     * In order to behave correctly in all cases it is necessary for the
     * calling function to g_variant_ref_sink() the return result before
     * returning control to the user that originally provided the pointer.
     * At this point, the caller will have their own full reference to the
     * result.  This can also be done by adding the result to a container,
     * or by passing it to another g_variant_new() call.
     */
    public Variant(java.lang.String formatString, java.lang.String[] endptr, VaList app) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_va(Interop.getAllocator().allocateUtf8String(formatString), Interop.allocateNativeArray(endptr), app), true));
    }
    
    /**
     * Boxes @value.  The result is a #GVariant instance representing a
     * variant containing the original value.
     * 
     * If @child is a floating reference (see g_variant_ref_sink()), the new
     * instance takes ownership of @child.
     */
    public Variant(Variant value) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_new_variant(value.HANDLE()), false));
    }
    
    /**
     * Performs a byteswapping operation on the contents of @value.  The
     * result is that all multi-byte numeric data contained in @value is
     * byteswapped.  That includes 16, 32, and 64bit signed and unsigned
     * integers as well as file handles and double precision floating point
     * values.
     * 
     * This function is an identity mapping on any value that does not
     * contain multi-byte numeric data.  That include strings, booleans,
     * bytes and containers containing only these things (recursively).
     * 
     * The returned value is always in normal form and is marked as trusted.
     */
    public Variant byteswap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_byteswap(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Checks if calling g_variant_get() with @format_string on @value would
     * be valid from a type-compatibility standpoint.  @format_string is
     * assumed to be a valid format string (from a syntactic standpoint).
     * 
     * If @copy_only is %TRUE then this function additionally checks that it
     * would be safe to call g_variant_unref() on @value immediately after
     * the call to g_variant_get() without invalidating the result.  This is
     * only possible if deep copies are made (ie: there are no pointers to
     * the data inside of the soon-to-be-freed #GVariant instance).  If this
     * check fails then a g_critical() is printed and %FALSE is returned.
     * 
     * This function is meant to be used by functions that wish to provide
     * varargs accessors to #GVariant values of uncertain values (eg:
     * g_variant_lookup() or g_menu_model_get_item_attribute()).
     */
    public boolean checkFormatString(java.lang.String formatString, boolean copyOnly) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_check_format_string(HANDLE(), Interop.getAllocator().allocateUtf8String(formatString), copyOnly ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Classifies @value according to its top-level type.
     */
    public VariantClass classify() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_classify(HANDLE());
        return VariantClass.fromValue(RESULT);
    }
    
    /**
     * Compares @one and @two.
     * 
     * The types of @one and @two are #gconstpointer only to allow use of
     * this function with #GTree, #GPtrArray, etc.  They must each be a
     * #GVariant.
     * 
     * Comparison is only defined for basic types (ie: booleans, numbers,
     * strings).  For booleans, %FALSE is less than %TRUE.  Numbers are
     * ordered in the usual way.  Strings are in ASCII lexographical order.
     * 
     * It is a programmer error to attempt to compare container values or
     * two values that have types that are not exactly equal.  For example,
     * you cannot compare a 32-bit signed integer with a 32-bit unsigned
     * integer.  Also note that this function is not particularly
     * well-behaved when it comes to comparison of doubles; in particular,
     * the handling of incomparable values (ie: NaN) is undefined.
     * 
     * If you only require an equality comparison, g_variant_equal() is more
     * general.
     */
    public int compare(Variant two) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_compare(HANDLE(), two.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if @one and @two have the same type and value.
     * 
     * The types of @one and @two are #gconstpointer only to allow use of
     * this function with #GHashTable.  They must each be a #GVariant.
     */
    public boolean equal(Variant two) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_equal(HANDLE(), two.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the boolean value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_BOOLEAN.
     */
    public boolean getBoolean() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_boolean(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the byte value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_BYTE.
     */
    public byte getByte() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_byte(HANDLE());
        return RESULT;
    }
    
    /**
     * Reads a child item out of a container #GVariant instance.  This
     * includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * #GVariant.
     * 
     * It is an error if @index_ is greater than the number of child items
     * in the container.  See g_variant_n_children().
     * 
     * The returned value is never floating.  You should free it with
     * g_variant_unref() when you're done with it.
     * 
     * Note that values borrowed from the returned child are not guaranteed to
     * still be valid after the child is freed even if you still hold a reference
     * to @value, if @value has not been serialized at the time this function is
     * called. To avoid this, you can serialize @value by calling
     * g_variant_get_data() and optionally ignoring the return value.
     * 
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in the unit tuple being returned as the child value,
     * instead of further nested children. #GVariant is guaranteed to handle
     * nesting up to at least 64 levels.
     * 
     * This function is O(1).
     */
    public Variant getChildValue(long index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_child_value(HANDLE(), index);
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns a pointer to the serialized form of a #GVariant instance.
     * The returned data may not be in fully-normalised form if read from an
     * untrusted source.  The returned data must not be freed; it remains
     * valid for as long as @value exists.
     * 
     * If @value is a fixed-sized value that was deserialized from a
     * corrupted serialized container then %NULL may be returned.  In this
     * case, the proper thing to do is typically to use the appropriate
     * number of nul bytes in place of @value.  If @value is not fixed-sized
     * then %NULL is never returned.
     * 
     * In the case that @value is already in serialized form, this function
     * is O(1).  If the value is not already in serialized form,
     * serialization occurs implicitly and is approximately O(n) in the size
     * of the result.
     * 
     * To deserialize the data returned by this function, in addition to the
     * serialized data, you must know the type of the #GVariant, and (if the
     * machine might be different) the endianness of the machine that stored
     * it. As a result, file formats or network messages that incorporate
     * serialized #GVariants must include this information either
     * implicitly (for instance "the file always contains a
     * %G_VARIANT_TYPE_VARIANT and it is always in little-endian order") or
     * explicitly (by storing the type and/or endianness in addition to the
     * serialized data).
     */
    public jdk.incubator.foreign.MemoryAddress getData() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_data(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns a pointer to the serialized form of a #GVariant instance.
     * The semantics of this function are exactly the same as
     * g_variant_get_data(), except that the returned #GBytes holds
     * a reference to the variant data.
     */
    public Bytes getDataAsBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_data_as_bytes(HANDLE());
        return new Bytes(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns the double precision floating point value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_DOUBLE.
     */
    public double getDouble() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_double(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 32-bit signed integer value of @value.
     * 
     * It is an error to call this function with a @value of any type other
     * than %G_VARIANT_TYPE_HANDLE.
     * 
     * By convention, handles are indexes into an array of file descriptors
     * that are sent alongside a D-Bus message.  If you're not interacting
     * with D-Bus, you probably don't need them.
     */
    public int getHandle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_handle(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 16-bit signed integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT16.
     */
    public short getInt16() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_int16(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 32-bit signed integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT32.
     */
    public int getInt32() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_int32(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 64-bit signed integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT64.
     */
    public long getInt64() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_int64(HANDLE());
        return RESULT;
    }
    
    /**
     * Given a maybe-typed #GVariant instance, extract its value.  If the
     * value is Nothing, then this function returns %NULL.
     */
    public Variant getMaybe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_maybe(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets a #GVariant instance that has the same value as @value and is
     * trusted to be in normal form.
     * 
     * If @value is already trusted to be in normal form then a new
     * reference to @value is returned.
     * 
     * If @value is not already trusted, then it is scanned to check if it
     * is in normal form.  If it is found to be in normal form then it is
     * marked as trusted and a new reference to it is returned.
     * 
     * If @value is found not to be in normal form then a new trusted
     * #GVariant is created with the same value as @value.
     * 
     * It makes sense to call this function if you've received #GVariant
     * data from untrusted sources and you want to ensure your serialized
     * output is definitely in normal form.
     * 
     * If @value is already in normal form, a new reference will be returned
     * (which will be floating if @value is floating). If it is not in normal form,
     * the newly created #GVariant will be returned with a single non-floating
     * reference. Typically, g_variant_take_ref() should be called on the return
     * value from this function to guarantee ownership of a single non-floating
     * reference to it.
     */
    public Variant getNormalForm() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_normal_form(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Determines the number of bytes that would be required to store @value
     * with g_variant_store().
     * 
     * If @value has a fixed-sized type then this function always returned
     * that fixed size.
     * 
     * In the case that @value is already in serialized form or the size has
     * already been calculated (ie: this function has been called before)
     * then this function is O(1).  Otherwise, the size is calculated, an
     * operation which is approximately O(n) in the number of values
     * involved.
     */
    public long getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Determines the type of @value.
     * 
     * The return value is valid for the lifetime of @value and must not
     * be freed.
     */
    public VariantType getType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_type(HANDLE());
        return new VariantType(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the type string of @value.  Unlike the result of calling
     * g_variant_type_peek_string(), this string is nul-terminated.  This
     * string belongs to #GVariant and must not be freed.
     */
    public java.lang.String getTypeString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_type_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the 16-bit unsigned integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT16.
     */
    public short getUint16() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_uint16(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 32-bit unsigned integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT32.
     */
    public int getUint32() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_uint32(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the 64-bit unsigned integer value of @value.
     * 
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT64.
     */
    public long getUint64() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_uint64(HANDLE());
        return RESULT;
    }
    
    /**
     * This function is intended to be used by libraries based on #GVariant
     * that want to provide g_variant_get()-like functionality to their
     * users.
     * 
     * The API is more general than g_variant_get() to allow a wider range
     * of possible uses.
     * 
     * @format_string must still point to a valid format string, but it only
     * need to be nul-terminated if @endptr is %NULL.  If @endptr is
     * non-%NULL then it is updated to point to the first character past the
     * end of the format string.
     * 
     * @app is a pointer to a #va_list.  The arguments, according to
     * @format_string, are collected from this #va_list and the list is left
     * pointing to the argument following the last.
     * 
     * These two generalisations allow mixing of multiple calls to
     * g_variant_new_va() and g_variant_get_va() within a single actual
     * varargs call by the user.
     * 
     * @format_string determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed,
     * see the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     */
    public void getVa(java.lang.String formatString, java.lang.String[] endptr, VaList app) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_va(HANDLE(), Interop.getAllocator().allocateUtf8String(formatString), Interop.allocateNativeArray(endptr), app);
    }
    
    /**
     * Unboxes @value.  The result is the #GVariant instance that was
     * contained in @value.
     */
    public Variant getVariant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_get_variant(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Generates a hash value for a #GVariant instance.
     * 
     * The output of this function is guaranteed to be the same for a given
     * value only per-process.  It may change between different processor
     * architectures or even different versions of GLib.  Do not use this
     * function as a basis for building protocols or file formats.
     * 
     * The type of @value is #gconstpointer only to allow use of this
     * function with #GHashTable.  @value must be a #GVariant.
     */
    public int hash() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_hash(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if @value is a container.
     */
    public boolean isContainer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_is_container(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @value has a floating reference count.
     * 
     * This function should only ever be used to assert that a given variant
     * is or is not floating, or for debug purposes. To acquire a reference
     * to a variant that might be floating, always use g_variant_ref_sink()
     * or g_variant_take_ref().
     * 
     * See g_variant_ref_sink() for more information about floating reference
     * counts.
     */
    public boolean isFloating() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_is_floating(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @value is in normal form.
     * 
     * The main reason to do this is to detect if a given chunk of
     * serialized data is in normal form: load the data into a #GVariant
     * using g_variant_new_from_data() and then use this function to
     * check.
     * 
     * If @value is found to be in normal form then it will be marked as
     * being trusted.  If the value was already marked as being trusted then
     * this function will immediately return %TRUE.
     * 
     * There may be implementation specific restrictions on deeply nested values.
     * GVariant is guaranteed to handle nesting up to at least 64 levels.
     */
    public boolean isNormalForm() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_is_normal_form(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a value has a type matching the provided type.
     */
    public boolean isOfType(VariantType type) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_is_of_type(HANDLE(), type.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Creates a heap-allocated #GVariantIter for iterating over the items
     * in @value.
     * 
     * Use g_variant_iter_free() to free the return value when you no longer
     * need it.
     * 
     * A reference is taken to @value and will be released only when
     * g_variant_iter_free() is called.
     */
    public VariantIter iterNew() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_new(HANDLE());
        return new VariantIter(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Looks up a value in a dictionary #GVariant.
     * 
     * This function works with dictionaries of the type a{s*} (and equally
     * well with type a{o*}, but we only further discuss the string case
     * for sake of clarity).
     * 
     * In the event that @dictionary has the type a{sv}, the @expected_type
     * string specifies what type of value is expected to be inside of the
     * variant. If the value inside the variant has a different type then
     * %NULL is returned. In the event that @dictionary has a value type other
     * than v then @expected_type must directly match the value type and it is
     * used to unpack the value directly or an error occurs.
     * 
     * In either case, if @key is not found in @dictionary, %NULL is returned.
     * 
     * If the key is found and the value has the correct type, it is
     * returned.  If @expected_type was specified then any non-%NULL return
     * value will have this type.
     * 
     * This function is currently implemented with a linear scan.  If you
     * plan to do many lookups then #GVariantDict may be more efficient.
     */
    public Variant lookupValue(java.lang.String key, VariantType expectedType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_lookup_value(HANDLE(), Interop.getAllocator().allocateUtf8String(key), expectedType.HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Determines the number of children in a container #GVariant instance.
     * This includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * #GVariant.
     * 
     * For variants, the return value is always 1.  For values with maybe
     * types, it is always zero or one.  For arrays, it is the length of the
     * array.  For tuples it is the number of tuple items (which depends
     * only on the type).  For dictionary entries, it is always 2
     * 
     * This function is O(1).
     */
    public long nChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_n_children(HANDLE());
        return RESULT;
    }
    
    /**
     * Pretty-prints @value in the format understood by g_variant_parse().
     * 
     * The format is described [here][gvariant-text].
     * 
     * If @type_annotate is %TRUE, then type information is included in
     * the output.
     */
    public java.lang.String print(boolean typeAnnotate) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_print(HANDLE(), typeAnnotate ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Behaves as g_variant_print(), but operates on a #GString.
     * 
     * If @string is non-%NULL then it is appended to and returned.  Else,
     * a new empty #GString is allocated and it is returned.
     */
    public String printString(String string, boolean typeAnnotate) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_print_string(HANDLE(), string.HANDLE(), typeAnnotate ? 1 : 0);
        return new String(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Increases the reference count of @value.
     */
    public Variant ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_ref(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * #GVariant uses a floating reference count system.  All functions with
     * names starting with `g_variant_new_` return floating
     * references.
     * 
     * Calling g_variant_ref_sink() on a #GVariant with a floating reference
     * will convert the floating reference into a full reference.  Calling
     * g_variant_ref_sink() on a non-floating #GVariant results in an
     * additional normal reference being added.
     * 
     * In other words, if the @value is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference.  If the @value is not floating, then this call adds a
     * new normal reference increasing the reference count by one.
     * 
     * All calls that result in a #GVariant instance being inserted into a
     * container will call g_variant_ref_sink() on the instance.  This means
     * that if the value was just created (and has only its floating
     * reference) then the container will assume sole ownership of the value
     * at that point and the caller will not need to unreference it.  This
     * makes certain common styles of programming much easier while still
     * maintaining normal refcounting semantics in situations where values
     * are not floating.
     */
    public Variant refSink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_ref_sink(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Stores the serialized form of @value at @data.  @data should be
     * large enough.  See g_variant_get_size().
     * 
     * The stored data is in machine native byte order but may not be in
     * fully-normalised form if read from an untrusted source.  See
     * g_variant_get_normal_form() for a solution.
     * 
     * As with g_variant_get_data(), to be able to deserialize the
     * serialized variant successfully, its type and (if the destination
     * machine might be different) its endianness must also be available.
     * 
     * This function is approximately O(n) in the size of @data.
     */
    public void store(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_store(HANDLE(), data);
    }
    
    /**
     * If @value is floating, sink it.  Otherwise, do nothing.
     * 
     * Typically you want to use g_variant_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     * 
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * #GVariant.  We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the value that is being returned already exists).
     * 
     * At the same time, the style of the #GVariant API makes it likely that
     * for newly-created #GVariant instances, the user can be saved some
     * typing if they are allowed to return a #GVariant with a floating
     * reference.
     * 
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them.  The caller
     * will always receives exactly one full reference to the value: either
     * the one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     * 
     * This function has an odd interaction when combined with
     * g_variant_ref_sink() running at the same time in another thread on
     * the same #GVariant instance.  If g_variant_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference.  If g_variant_take_ref() runs first then the result will
     * be that the floating reference is converted to a hard reference and
     * an additional reference on top of that one is added.  It is best to
     * avoid this situation.
     */
    public Variant takeRef() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_take_ref(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Decreases the reference count of @value.  When its reference count
     * drops to 0, the memory used by the variant is freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_unref(HANDLE());
    }
    
}
