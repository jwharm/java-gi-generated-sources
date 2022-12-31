package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Structure} is a collection of key/value pairs. The keys are expressed as
 * GQuarks and the values can be of any GType.
 * <p>
 * In addition to the key/value pairs, a {@link Structure} also has a name. The name
 * starts with a letter and can be filled by letters, numbers and any of
 * "/-_.:".
 * <p>
 * {@link Structure} is used by various GStreamer subsystems to store information in
 * a flexible and extensible way. A {@link Structure} does not have a refcount
 * because it usually is part of a higher level object such as {@link Caps},
 * {@link Message}, {@link Event}, {@link Query}. It provides a means to enforce mutability
 * using the refcount of the parent with the gst_structure_set_parent_refcount()
 * method.
 * <p>
 * A {@link Structure} can be created with gst_structure_new_empty() or
 * gst_structure_new(), which both take a name and an optional set of key/value
 * pairs along with the types of the values.
 * <p>
 * Field values can be changed with gst_structure_set_value() or
 * gst_structure_set().
 * <p>
 * Field values can be retrieved with gst_structure_get_value() or the more
 * convenient gst_structure_get_*() functions.
 * <p>
 * Fields can be removed with gst_structure_remove_field() or
 * gst_structure_remove_fields().
 * <p>
 * Strings in structures must be ASCII or UTF-8 encoded. Other encodings are not
 * allowed. Strings may be {@code null} however.
 * <p>
 * <strong>The serialization format</strong><br/>
 * GstStructure serialization format serialize the GstStructure name,
 * keys/GType/values in a comma separated list with the structure name as first
 * field without value followed by separated key/value pairs in the form
 * {@code key=value}, for example:
 * <pre>{@code 
 * a-structure, key=value
 * }</pre>{@code 
 * 
 * The values type will be inferred if not explicitly specified with the
 * }(GTypeName)value{@code  syntax, for example the following struct will have one
 * field called 'is-string' which has the string 'true' as a value:
 * 
 * }`{@code 
 * a-struct, field-is-string=(string)true, field-is-boolean=true
 * }`{@code 
 * 
 * *Note*: without specifying }(string), {@code field-is-string} type would have been
 * inferred as boolean.
 * <p>
 * <em>Note</em>: we specified {@code (string)} as a type even if {@code gchararray} is the actual
 * GType name as for convenience some well known types have been aliased or
 * abbreviated.
 * <p>
 * To avoid specifying the type, you can give some hints to the "type system".
 * For example to specify a value as a double, you should add a decimal (ie. {@code 1}
 * is an {@code int} while {@code 1.0} is a {@code double}).
 * <p>
 * <em>Note</em>: when a structure is serialized with {@code gst_structure_to_string}, all
 * values are explicitly typed.
 * <p>
 * Some types have special delimiters:
 * <ul>
 * <li><a href="GST_TYPE_ARRAY">GstValueArray</a> are inside curly brackets ({@code {} and {@code }}).
 *   For example {@code a-structure, array={1, 2, 3}}
 * <li>Ranges are inside brackets ({@code [} and {@code ]}). For example {@code a-structure,
 *   range=[1, 6, 2]} 1 being the min value, 6 the maximum and 2 the step. To
 *   specify a {@code GST_TYPE_INT64_RANGE} you need to explicitly specify it like:
 *   {@code a-structure, a-int64-range=(gint64) [1, 5]}
 * <li><a href="GST_TYPE_LIST">GstValueList</a> are inside "less and greater than" ({@code <} and
 *   {@code >}). For example {@code a-structure, list=<1, 2, 3>
 * 
 * Structures are delimited either by a null character }\\0{@code  or a semicolon };{@code 
 * the latter allowing to store multiple structures in the same string (see
 * #GstCaps).
 * 
 * Quotes are used as "default" delimiters and can be used around any types that
 * don't use other delimiters (for example }a-struct, i=(int)"1"{@code ). They are use
 * to allow adding spaces or special characters (such as delimiters,
 * semicolumns, etc..) inside strings and you can use backslashes }\\{@code  to escape
 * characters inside them, for example:
 * 
 * }`{@code 
 * a-struct, special="\\"{[(;)]}\\" can be used inside quotes"
 * }`{@code 
 * 
 * They also allow for nested structure, such as:
 * 
 * }`{@code 
 * a-struct, nested=(GstStructure)"nested-struct, nested=true"
 * }`{@code 
 * 
 * Since 1.20, nested structures and caps can be specified using brackets (}[{@code 
 * and }]{@code ), for example:
 * 
 * }`{@code 
 * a-struct, nested=[nested-struct, nested=true]
 * }``
 * </ul>
 * <p>
 * <blockquote>
 *  <em>note</em>: gst_structure_to_string() won't use that syntax for backward
 *  compatibility reason, gst_structure_serialize() has been added for
 *  that purpose.
 * </blockquote>
 */
public class Structure extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStructure";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.C_INT.withName("name")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Structure}
     * @return A new, uninitialized @{link Structure}
     */
    public static Structure allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Structure newInstance = new Structure(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type getType() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
    }
    
    /**
     * Create a Structure proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Structure(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Structure> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Structure(input, ownership);
    
    private static MemoryAddress constructFromString(java.lang.String string, @Nullable Out<java.lang.String> end) {
        MemorySegment endPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null),
                    (Addressable) (end == null ? MemoryAddress.NULL : (Addressable) endPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (end != null) end.set(Marshal.addressToString.marshal(endPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
    
    /**
     * Creates a {@link Structure} from a string representation.
     * If end is not {@code null}, a pointer to the place inside the given string
     * where parsing ended will be returned.
     * <p>
     * Free-function: gst_structure_free
     * @param string a string representation of a {@link Structure}.
     * @param end pointer to store the end of the string in.
     * @return a new {@link Structure} or {@code null}
     *     when the string could not be parsed. Free with
     *     gst_structure_free() after use.
     */
    public static Structure fromString(java.lang.String string, @Nullable Out<java.lang.String> end) {
        var RESULT = constructFromString(string, end);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String firstfield, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(firstfield, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Structure} with the given name.  Parses the
     * list of variable arguments and sets fields to the values listed.
     * Variable arguments should be passed as field name, field type,
     * and value.  Last variable argument should be {@code null}.
     * <p>
     * Free-function: gst_structure_free
     * @param name name of new structure
     * @param firstfield name of first field to set
     * @param varargs additional arguments
     */
    public Structure(java.lang.String name, java.lang.String firstfield, java.lang.Object... varargs) {
        super(constructNew(name, firstfield, varargs), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewEmpty(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new_empty.invokeExact(
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty {@link Structure} with the given {@code name}.
     * <p>
     * See gst_structure_set_name() for constraints on the {@code name} parameter.
     * <p>
     * Free-function: gst_structure_free
     * @param name name of new structure
     * @return a new, empty {@link Structure}
     */
    public static Structure newEmpty(java.lang.String name) {
        var RESULT = constructNewEmpty(name);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link Structure} from a string representation.
     * If end is not {@code null}, a pointer to the place inside the given string
     * where parsing ended will be returned.
     * <p>
     * The current implementation of serialization will lead to unexpected results
     * when there are nested {@link Caps} / {@link Structure} deeper than one level unless
     * the gst_structure_serialize() function is used (without
     * {@code GST_SERIALIZE_FLAG_BACKWARD_COMPAT})
     * <p>
     * Free-function: gst_structure_free
     * @param string a string representation of a {@link Structure}
     * @return a new {@link Structure} or {@code null}
     *     when the string could not be parsed. Free with
     *     gst_structure_free() after use.
     */
    public static Structure newFromString(java.lang.String string) {
        var RESULT = constructNewFromString(string);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewId(org.gtk.glib.Quark nameQuark, org.gtk.glib.Quark fieldQuark, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new_id.invokeExact(
                    nameQuark.getValue().intValue(),
                    fieldQuark.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Structure} with the given name as a GQuark, followed by
     * fieldname quark, GType, argument(s) "triplets" in the same format as
     * gst_structure_id_set(). Basically a convenience wrapper around
     * gst_structure_new_id_empty() and gst_structure_id_set().
     * <p>
     * The last variable argument must be {@code null} (or 0).
     * <p>
     * Free-function: gst_structure_free
     * @param nameQuark name of new structure
     * @param fieldQuark the GQuark for the name of the field to set
     * @param varargs variable arguments
     * @return a new {@link Structure}
     */
    public static Structure newId(org.gtk.glib.Quark nameQuark, org.gtk.glib.Quark fieldQuark, java.lang.Object... varargs) {
        var RESULT = constructNewId(nameQuark, fieldQuark, varargs);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewIdEmpty(org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new_id_empty.invokeExact(
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty {@link Structure} with the given name as a GQuark.
     * <p>
     * Free-function: gst_structure_free
     * @param quark name of new structure
     * @return a new, empty {@link Structure}
     */
    public static Structure newIdEmpty(org.gtk.glib.Quark quark) {
        var RESULT = constructNewIdEmpty(quark);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewValist(java.lang.String name, java.lang.String firstfield, VaList varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_new_valist.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(firstfield, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Structure} with the given {@code name}.  Structure fields
     * are set according to the varargs in a manner similar to
     * gst_structure_new().
     * <p>
     * See gst_structure_set_name() for constraints on the {@code name} parameter.
     * <p>
     * Free-function: gst_structure_free
     * @param name name of new structure
     * @param firstfield name of first field to set
     * @param varargs variable argument list
     * @return a new {@link Structure}
     */
    public static Structure newValist(java.lang.String name, java.lang.String firstfield, VaList varargs) {
        var RESULT = constructNewValist(name, firstfield, varargs);
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Tries intersecting {@code struct1} and {@code struct2} and reports whether the result
     * would not be empty.
     * @param struct2 a {@link Structure}
     * @return {@code true} if intersection would not be empty
     */
    public boolean canIntersect(org.gstreamer.gst.Structure struct2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_can_intersect.invokeExact(
                    handle(),
                    struct2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Duplicates a {@link Structure} and all its fields and values.
     * <p>
     * Free-function: gst_structure_free
     * @return a new {@link Structure}.
     */
    public org.gstreamer.gst.Structure copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls the provided function once for each field in the {@link Structure}. In
     * contrast to gst_structure_foreach(), the function may modify the fields.
     * In contrast to gst_structure_map_in_place(), the field is removed from
     * the structure if {@code false} is returned from the function.
     * The structure must be mutable.
     * @param func a function to call for each field
     */
    public void filterAndMapInPlace(org.gstreamer.gst.StructureFilterMapFunc func) {
        try {
            DowncallHandles.gst_structure_filter_and_map_in_place.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fixate all values in {@code structure} using gst_value_fixate().
     * {@code structure} will be modified in-place and should be writable.
     */
    public void fixate() {
        try {
            DowncallHandles.gst_structure_fixate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fixates a {@link Structure} by changing the given field with its fixated value.
     * @param fieldName a field in {@code structure}
     * @return {@code true} if the structure field could be fixated
     */
    public boolean fixateField(java.lang.String fieldName) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixates a {@link Structure} by changing the given {@code field_name} field to the given
     * {@code target} boolean if that field is not fixed yet.
     * @param fieldName a field in {@code structure}
     * @param target the target value of the fixation
     * @return {@code true} if the structure could be fixated
     */
    public boolean fixateFieldBoolean(java.lang.String fieldName, boolean target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field_boolean.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null),
                    Marshal.booleanToInteger.marshal(target, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixates a {@link Structure} by changing the given field to the nearest
     * double to {@code target} that is a subset of the existing field.
     * @param fieldName a field in {@code structure}
     * @param target the target value of the fixation
     * @return {@code true} if the structure could be fixated
     */
    public boolean fixateFieldNearestDouble(java.lang.String fieldName, double target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field_nearest_double.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null),
                    target);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixates a {@link Structure} by changing the given field to the nearest
     * fraction to {@code target_numerator}/{@code target_denominator} that is a subset
     * of the existing field.
     * @param fieldName a field in {@code structure}
     * @param targetNumerator The numerator of the target value of the fixation
     * @param targetDenominator The denominator of the target value of the fixation
     * @return {@code true} if the structure could be fixated
     */
    public boolean fixateFieldNearestFraction(java.lang.String fieldName, int targetNumerator, int targetDenominator) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field_nearest_fraction.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null),
                    targetNumerator,
                    targetDenominator);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixates a {@link Structure} by changing the given field to the nearest
     * integer to {@code target} that is a subset of the existing field.
     * @param fieldName a field in {@code structure}
     * @param target the target value of the fixation
     * @return {@code true} if the structure could be fixated
     */
    public boolean fixateFieldNearestInt(java.lang.String fieldName, int target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field_nearest_int.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null),
                    target);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixates a {@link Structure} by changing the given {@code field_name} field to the given
     * {@code target} string if that field is not fixed yet.
     * @param fieldName a field in {@code structure}
     * @param target the target value of the fixation
     * @return {@code true} if the structure could be fixated
     */
    public boolean fixateFieldString(java.lang.String fieldName, java.lang.String target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_fixate_field_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldName, null),
                    Marshal.stringToAddress.marshal(target, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls the provided function once for each field in the {@link Structure}. The
     * function must not modify the fields. Also see gst_structure_map_in_place()
     * and gst_structure_filter_and_map_in_place().
     * @param func a function to call for each field
     * @return {@code true} if the supplied function returns {@code true} For each of the fields,
     * {@code false} otherwise.
     */
    public boolean foreach(org.gstreamer.gst.StructureForeachFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Frees a {@link Structure} and all its fields and values. The structure must not
     * have a parent when this function is called.
     */
    public void free() {
        try {
            DowncallHandles.gst_structure_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Parses the variable arguments and reads fields from {@code structure} accordingly.
     * Variable arguments should be in the form field name, field type
     * (as a GType), pointer(s) to a variable(s) to hold the return value(s).
     * The last variable argument should be {@code null}.
     * <p>
     * For refcounted (mini)objects you will receive a new reference which
     * you must release with a suitable _unref\\() when no longer needed. For
     * strings and boxed types you will receive a copy which you will need to
     * release with either g_free() or the suitable function for the boxed type.
     * @param firstFieldname the name of the first field to read
     * @param varargs variable arguments
     * @return {@code false} if there was a problem reading any of the fields (e.g.
     *     because the field requested did not exist, or was of a type other
     *     than the type specified), otherwise {@code true}.
     */
    public boolean get(java.lang.String firstFieldname, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstFieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This is useful in language bindings where unknown {@link org.gtk.gobject.Value} types are not
     * supported. This function will convert the {@code GST_TYPE_ARRAY} into a newly
     * allocated {@link org.gtk.gobject.ValueArray} and return it through {@code array}. Be aware that this is
     * slower then getting the {@link org.gtk.gobject.Value} directly.
     * @param fieldname the name of a field
     * @param array a pointer to a {@link org.gtk.gobject.ValueArray}
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a {@code GST_TYPE_ARRAY},
     * this function returns {@code false}.
     */
    public boolean getArray(java.lang.String fieldname, Out<org.gtk.gobject.ValueArray> array) {
        MemorySegment arrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_array.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) arrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        array.set(org.gtk.gobject.ValueArray.fromAddress.marshal(arrayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the boolean pointed to by {@code value} corresponding to the value of the
     * given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a {@code gboolean} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a boolean, this
     * function returns {@code false}.
     */
    public boolean getBoolean(java.lang.String fieldname, Out<Boolean> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_boolean.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the clock time pointed to by {@code value} corresponding to the clock time
     * of the given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a {@link ClockTime} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a {@link ClockTime}, this
     * function returns {@code false}.
     */
    public boolean getClockTime(java.lang.String fieldname, org.gstreamer.gst.ClockTime value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_clock_time.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.setValue(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the date pointed to by {@code value} corresponding to the date of the
     * given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * <p>
     * On success {@code value} will point to a newly-allocated copy of the date which
     * should be freed with g_date_free() when no longer needed (note: this is
     * inconsistent with e.g. gst_structure_get_string() which doesn't return a
     * copy of the string).
     * @param fieldname the name of a field
     * @param value a pointer to a {@link org.gtk.glib.Date} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a data, this function
     * returns {@code false}.
     */
    public boolean getDate(java.lang.String fieldname, Out<org.gtk.glib.Date> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_date.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(org.gtk.glib.Date.fromAddress.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the datetime pointed to by {@code value} corresponding to the datetime of the
     * given field. Caller is responsible for making sure the field exists
     * and has the correct type.
     * <p>
     * On success {@code value} will point to a reference of the datetime which
     * should be unreffed with gst_date_time_unref() when no longer needed
     * (note: this is inconsistent with e.g. gst_structure_get_string()
     * which doesn't return a copy of the string).
     * @param fieldname the name of a field
     * @param value a pointer to a {@link DateTime} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a data, this function
     * returns {@code false}.
     */
    public boolean getDateTime(java.lang.String fieldname, Out<org.gstreamer.gst.DateTime> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_date_time.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(org.gstreamer.gst.DateTime.fromAddress.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the double pointed to by {@code value} corresponding to the value of the
     * given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a gdouble to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a double, this
     * function returns {@code false}.
     */
    public boolean getDouble(java.lang.String fieldname, Out<Double> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_double.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the int pointed to by {@code value} corresponding to the value of the
     * given field.  Caller is responsible for making sure the field exists,
     * has the correct type and that the enumtype is correct.
     * @param fieldname the name of a field
     * @param enumtype the enum type of a field
     * @param value a pointer to an int to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain an enum of the given
     * type, this function returns {@code false}.
     */
    public boolean getEnum(java.lang.String fieldname, org.gtk.glib.Type enumtype, Out<Integer> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_enum.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    enumtype.getValue().longValue(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Finds the field with the given name, and returns the type of the
     * value it contains.  If the field is not found, G_TYPE_INVALID is
     * returned.
     * @param fieldname the name of the field
     * @return the {@link org.gtk.gobject.Value} of the field
     */
    public org.gtk.glib.Type getFieldType(java.lang.String fieldname) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_structure_get_field_type.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Read the GstFlagSet flags and mask out of the structure into the
     * provided pointers.
     * @param fieldname the name of a field
     * @param valueFlags a pointer to a guint for the flags field
     * @param valueMask a pointer to a guint for the mask field
     * @return {@code true} if the values could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a GstFlagSet, this
     * function returns {@code false}.
     */
    public boolean getFlagset(java.lang.String fieldname, Out<Integer> valueFlags, Out<Integer> valueMask) {
        MemorySegment valueFlagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment valueMaskPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_flagset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) (valueFlags == null ? MemoryAddress.NULL : (Addressable) valueFlagsPOINTER.address()),
                    (Addressable) (valueMask == null ? MemoryAddress.NULL : (Addressable) valueMaskPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (valueFlags != null) valueFlags.set(valueFlagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (valueMask != null) valueMask.set(valueMaskPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the integers pointed to by {@code value_numerator} and {@code value_denominator}
     * corresponding to the value of the given field.  Caller is responsible
     * for making sure the field exists and has the correct type.
     * @param fieldname the name of a field
     * @param valueNumerator a pointer to an int to set
     * @param valueDenominator a pointer to an int to set
     * @return {@code true} if the values could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a GstFraction, this
     * function returns {@code false}.
     */
    public boolean getFraction(java.lang.String fieldname, Out<Integer> valueNumerator, Out<Integer> valueDenominator) {
        MemorySegment valueNumeratorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment valueDenominatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_fraction.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valueNumeratorPOINTER.address(),
                    (Addressable) valueDenominatorPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        valueNumerator.set(valueNumeratorPOINTER.get(Interop.valueLayout.C_INT, 0));
        valueDenominator.set(valueDenominatorPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the int pointed to by {@code value} corresponding to the value of the
     * given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to an int to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain an int, this function
     * returns {@code false}.
     */
    public boolean getInt(java.lang.String fieldname, Out<Integer> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_int.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the {@code gint64} pointed to by {@code value} corresponding to the value of the
     * given field. Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a {@code gint64} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a {@code gint64}, this function
     * returns {@code false}.
     */
    public boolean getInt64(java.lang.String fieldname, Out<Long> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_int64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This is useful in language bindings where unknown {@link org.gtk.gobject.Value} types are not
     * supported. This function will convert the {@code GST_TYPE_LIST} into a newly
     * allocated GValueArray and return it through {@code array}. Be aware that this is
     * slower then getting the {@link org.gtk.gobject.Value} directly.
     * @param fieldname the name of a field
     * @param array a pointer to a {@link org.gtk.gobject.ValueArray}
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a {@code GST_TYPE_LIST}, this
     * function returns {@code false}.
     */
    public boolean getList(java.lang.String fieldname, Out<org.gtk.gobject.ValueArray> array) {
        MemorySegment arrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_list.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) arrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        array.set(org.gtk.gobject.ValueArray.fromAddress.marshal(arrayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the name of {@code structure} as a string.
     * @return the name of the structure.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the name of {@code structure} as a GQuark.
     * @return the quark representing the name of the structure.
     */
    public org.gtk.glib.Quark getNameId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_name_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Finds the field corresponding to {@code fieldname}, and returns the string
     * contained in the field's value.  Caller is responsible for making
     * sure the field exists and has the correct type.
     * <p>
     * The string should not be modified, and remains valid until the next
     * call to a gst_structure_*() function with the given structure.
     * @param fieldname the name of a field
     * @return a pointer to the string or {@code null} when the
     * field did not exist or did not contain a string.
     */
    public @Nullable java.lang.String getString(java.lang.String fieldname) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_get_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the uint pointed to by {@code value} corresponding to the value of the
     * given field.  Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a uint to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a uint, this function
     * returns {@code false}.
     */
    public boolean getUint(java.lang.String fieldname, Out<Integer> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_uint.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the {@code guint64} pointed to by {@code value} corresponding to the value of the
     * given field. Caller is responsible for making sure the field exists
     * and has the correct type.
     * @param fieldname the name of a field
     * @param value a pointer to a {@code guint64} to set
     * @return {@code true} if the value could be set correctly. If there was no field
     * with {@code fieldname} or the existing field did not contain a {@code guint64}, this function
     * returns {@code false}.
     */
    public boolean getUint64(java.lang.String fieldname, Out<Long> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_uint64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses the variable arguments and reads fields from {@code structure} accordingly.
     * valist-variant of gst_structure_get(). Look at the documentation of
     * gst_structure_get() for more details.
     * @param firstFieldname the name of the first field to read
     * @param args variable arguments
     * @return {@code true}, or {@code false} if there was a problem reading any of the fields
     */
    public boolean getValist(java.lang.String firstFieldname, VaList args) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_get_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstFieldname, null),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the value of the field with name {@code fieldname}.
     * @param fieldname the name of the field to get
     * @return the {@link org.gtk.gobject.Value} corresponding to the field with the given
     * name.
     */
    public @Nullable org.gtk.gobject.Value getValue(java.lang.String fieldname) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_get_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Check if {@code structure} contains a field named {@code fieldname}.
     * @param fieldname the name of a field
     * @return {@code true} if the structure contains a field with the given name
     */
    public boolean hasField(java.lang.String fieldname) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_has_field.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code structure} contains a field named {@code fieldname} and with GType {@code type}.
     * @param fieldname the name of a field
     * @param type the type of a value
     * @return {@code true} if the structure contains a field with the given name and type
     */
    public boolean hasFieldTyped(java.lang.String fieldname, org.gtk.glib.Type type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_has_field_typed.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the structure has the given name
     * @param name structure name to check for
     * @return {@code true} if {@code name} matches the name of the structure.
     */
    public boolean hasName(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_has_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses the variable arguments and reads fields from {@code structure} accordingly.
     * Variable arguments should be in the form field id quark, field type
     * (as a GType), pointer(s) to a variable(s) to hold the return value(s).
     * The last variable argument should be {@code null} (technically it should be a
     * 0 quark, but we require {@code null} so compilers that support it can check for
     * the {@code null} terminator and warn if it's not there).
     * <p>
     * This function is just like gst_structure_get() only that it is slightly
     * more efficient since it saves the string-to-quark lookup in the global
     * quark hashtable.
     * <p>
     * For refcounted (mini)objects you will receive a new reference which
     * you must release with a suitable _unref\\() when no longer needed. For
     * strings and boxed types you will receive a copy which you will need to
     * release with either g_free() or the suitable function for the boxed type.
     * @param firstFieldId the quark of the first field to read
     * @param varargs variable arguments
     * @return {@code false} if there was a problem reading any of the fields (e.g.
     *     because the field requested did not exist, or was of a type other
     *     than the type specified), otherwise {@code true}.
     */
    public boolean idGet(org.gtk.glib.Quark firstFieldId, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_id_get.invokeExact(
                    handle(),
                    firstFieldId.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses the variable arguments and reads fields from {@code structure} accordingly.
     * valist-variant of gst_structure_id_get(). Look at the documentation of
     * gst_structure_id_get() for more details.
     * @param firstFieldId the quark of the first field to read
     * @param args variable arguments
     * @return {@code true}, or {@code false} if there was a problem reading any of the fields
     */
    public boolean idGetValist(org.gtk.glib.Quark firstFieldId, VaList args) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_id_get_valist.invokeExact(
                    handle(),
                    firstFieldId.getValue().intValue(),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the value of the field with GQuark {@code field}.
     * @param field the {@link org.gtk.glib.Quark} of the field to get
     * @return the {@link org.gtk.gobject.Value} corresponding to the field with the given
     * name identifier.
     */
    public @Nullable org.gtk.gobject.Value idGetValue(org.gtk.glib.Quark field) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_id_get_value.invokeExact(
                    handle(),
                    field.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Check if {@code structure} contains a field named {@code field}.
     * @param field {@link org.gtk.glib.Quark} of the field name
     * @return {@code true} if the structure contains a field with the given name
     */
    public boolean idHasField(org.gtk.glib.Quark field) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_id_has_field.invokeExact(
                    handle(),
                    field.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code structure} contains a field named {@code field} and with GType {@code type}.
     * @param field {@link org.gtk.glib.Quark} of the field name
     * @param type the type of a value
     * @return {@code true} if the structure contains a field with the given name and type
     */
    public boolean idHasFieldTyped(org.gtk.glib.Quark field, org.gtk.glib.Type type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_id_has_field_typed.invokeExact(
                    handle(),
                    field.getValue().intValue(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Identical to gst_structure_set, except that field names are
     * passed using the GQuark for the field name. This allows more efficient
     * setting of the structure if the caller already knows the associated
     * quark values.
     * The last variable argument must be {@code null}.
     * @param fieldname the GQuark for the name of the field to set
     * @param varargs variable arguments
     */
    public void idSet(org.gtk.glib.Quark fieldname, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_structure_id_set.invokeExact(
                    handle(),
                    fieldname.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * va_list form of gst_structure_id_set().
     * @param fieldname the name of the field to set
     * @param varargs variable arguments
     */
    public void idSetValist(org.gtk.glib.Quark fieldname, VaList varargs) {
        try {
            DowncallHandles.gst_structure_id_set_valist.invokeExact(
                    handle(),
                    fieldname.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the field with the given GQuark {@code field} to {@code value}.  If the field
     * does not exist, it is created.  If the field exists, the previous
     * value is replaced and freed.
     * @param field a {@link org.gtk.glib.Quark} representing a field
     * @param value the new value of the field
     */
    public void idSetValue(org.gtk.glib.Quark field, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_structure_id_set_value.invokeExact(
                    handle(),
                    field.getValue().intValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the field with the given GQuark {@code field} to {@code value}.  If the field
     * does not exist, it is created.  If the field exists, the previous
     * value is replaced and freed.
     * @param field a {@link org.gtk.glib.Quark} representing a field
     * @param value the new value of the field
     */
    public void idTakeValue(org.gtk.glib.Quark field, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_structure_id_take_value.invokeExact(
                    handle(),
                    field.getValue().intValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.yieldOwnership();
    }
    
    /**
     * Intersects {@code struct1} and {@code struct2} and returns the intersection.
     * @param struct2 a {@link Structure}
     * @return Intersection of {@code struct1} and {@code struct2}
     */
    public @Nullable org.gstreamer.gst.Structure intersect(org.gstreamer.gst.Structure struct2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_intersect.invokeExact(
                    handle(),
                    struct2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Tests if the two {@link Structure} are equal.
     * @param structure2 a {@link Structure}.
     * @return {@code true} if the two structures have the same name and field.
     */
    public boolean isEqual(org.gstreamer.gst.Structure structure2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_is_equal.invokeExact(
                    handle(),
                    structure2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code subset} is a subset of {@code superset}, i.e. has the same
     * structure name and for all fields that are existing in {@code superset},
     * {@code subset} has a value that is a subset of the value in {@code superset}.
     * @param superset a potentially greater {@link Structure}
     * @return {@code true} if {@code subset} is a subset of {@code superset}
     */
    public boolean isSubset(org.gstreamer.gst.Structure superset) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_is_subset.invokeExact(
                    handle(),
                    superset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls the provided function once for each field in the {@link Structure}. In
     * contrast to gst_structure_foreach(), the function may modify but not delete the
     * fields. The structure must be mutable.
     * @param func a function to call for each field
     * @return {@code true} if the supplied function returns {@code true} For each of the fields,
     * {@code false} otherwise.
     */
    public boolean mapInPlace(org.gstreamer.gst.StructureMapFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_map_in_place.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the number of fields in the structure.
     * @return the number of fields in the structure
     */
    public int nFields() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_n_fields.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the name of the given field number, counting from 0 onwards.
     * @param index the index to get the name of
     * @return the name of the given field number
     */
    public java.lang.String nthFieldName(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_nth_field_name.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Removes all fields in a GstStructure.
     */
    public void removeAllFields() {
        try {
            DowncallHandles.gst_structure_remove_all_fields.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the field with the given name.  If the field with the given
     * name does not exist, the structure is unchanged.
     * @param fieldname the name of the field to remove
     */
    public void removeField(java.lang.String fieldname) {
        try {
            DowncallHandles.gst_structure_remove_field.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the fields with the given names. If a field does not exist, the
     * argument is ignored.
     * @param fieldname the name of the field to remove
     * @param varargs {@code null}-terminated list of more fieldnames to remove
     */
    public void removeFields(java.lang.String fieldname, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_structure_remove_fields.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * va_list form of gst_structure_remove_fields().
     * @param fieldname the name of the field to remove
     * @param varargs {@code null}-terminated list of more fieldnames to remove
     */
    public void removeFieldsValist(java.lang.String fieldname, VaList varargs) {
        try {
            DowncallHandles.gst_structure_remove_fields_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts {@code structure} to a human-readable string representation.
     * <p>
     * This version of the caps serialization function introduces support for nested
     * structures and caps but the resulting strings won't be parsable with
     * GStreamer prior to 1.20 unless {@code GST_SERIALIZE_FLAG_BACKWARD_COMPAT} is passed
     * as {@code flag}.
     * <p>
     * Free-function: g_free
     * @param flags The flags to use to serialize structure
     * @return a pointer to string allocated by g_malloc().
     *     g_free() after usage.
     */
    public java.lang.String serialize(org.gstreamer.gst.SerializeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_serialize.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Parses the variable arguments and sets fields accordingly. Fields that
     * weren't already part of the structure are added as needed.
     * Variable arguments should be in the form field name, field type
     * (as a GType), value(s).  The last variable argument should be {@code null}.
     * @param fieldname the name of the field to set
     * @param varargs variable arguments
     */
    public void set(java.lang.String fieldname, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_structure_set.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is useful in language bindings where unknown GValue types are not
     * supported. This function will convert a {@code array} to {@code GST_TYPE_ARRAY} and set
     * the field specified by {@code fieldname}.  Be aware that this is slower then using
     * {@code GST_TYPE_ARRAY} in a {@link org.gtk.gobject.Value} directly.
     * @param fieldname the name of a field
     * @param array a pointer to a {@link org.gtk.gobject.ValueArray}
     */
    public void setArray(java.lang.String fieldname, org.gtk.gobject.ValueArray array) {
        try {
            DowncallHandles.gst_structure_set_array.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    array.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is useful in language bindings where unknown GValue types are not
     * supported. This function will convert a {@code array} to {@code GST_TYPE_LIST} and set
     * the field specified by {@code fieldname}. Be aware that this is slower then using
     * {@code GST_TYPE_LIST} in a {@link org.gtk.gobject.Value} directly.
     * @param fieldname the name of a field
     * @param array a pointer to a {@link org.gtk.gobject.ValueArray}
     */
    public void setList(java.lang.String fieldname, org.gtk.gobject.ValueArray array) {
        try {
            DowncallHandles.gst_structure_set_list.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    array.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the structure to the given {@code name}.  The string
     * provided is copied before being used. It must not be empty, start with a
     * letter and can be followed by letters, numbers and any of "/-_.:".
     * @param name the new name of the structure
     */
    public void setName(java.lang.String name) {
        try {
            DowncallHandles.gst_structure_set_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parent_refcount field of {@link Structure}. This field is used to
     * determine whether a structure is mutable or not. This function should only be
     * called by code implementing parent objects of {@link Structure}, as described in
     * the MT Refcounting section of the design documents.
     * @param refcount a pointer to the parent's refcount
     * @return {@code true} if the parent refcount could be set.
     */
    public boolean setParentRefcount(PointerInteger refcount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_set_parent_refcount.invokeExact(
                    handle(),
                    refcount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * va_list form of gst_structure_set().
     * @param fieldname the name of the field to set
     * @param varargs variable arguments
     */
    public void setValist(java.lang.String fieldname, VaList varargs) {
        try {
            DowncallHandles.gst_structure_set_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the field with the given name {@code field} to {@code value}.  If the field
     * does not exist, it is created.  If the field exists, the previous
     * value is replaced and freed.
     * @param fieldname the name of the field to set
     * @param value the new value of the field
     */
    public void setValue(java.lang.String fieldname, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_structure_set_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the field with the given name {@code field} to {@code value}.  If the field
     * does not exist, it is created.  If the field exists, the previous
     * value is replaced and freed. The function will take ownership of {@code value}.
     * @param fieldname the name of the field to set
     * @param value the new value of the field
     */
    public void takeValue(java.lang.String fieldname, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_structure_take_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.yieldOwnership();
    }
    
    /**
     * Converts {@code structure} to a human-readable string representation.
     * <p>
     * For debugging purposes its easier to do something like this: <pre>{@code <!--
     * language="C" --> GST_LOG ("structure is %" GST_PTR_FORMAT, structure);
     * }</pre>
     * This prints the structure in human readable form.
     * <p>
     * This function will lead to unexpected results when there are nested {@link Caps}
     * / {@link Structure} deeper than one level, you should user
     * gst_structure_serialize() instead for those cases.
     * <p>
     * Free-function: g_free
     * @return a pointer to string allocated by g_malloc().
     *     g_free() after usage.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_structure_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Atomically modifies a pointer to point to a new structure.
     * The {@link Structure} {@code oldstr_ptr} is pointing to is freed and
     * {@code newstr} is taken ownership over.
     * <p>
     * Either {@code newstr} and the value pointed to by {@code oldstr_ptr} may be {@code null}.
     * <p>
     * It is a programming error if both {@code newstr} and the value pointed to by
     * {@code oldstr_ptr} refer to the same, non-{@code null} structure.
     * @param oldstrPtr pointer to a place of
     *     a {@link Structure} to take
     * @param newstr a new {@link Structure}
     * @return {@code true} if {@code newstr} was different from {@code oldstr_ptr}
     */
    public static boolean take(@Nullable Out<org.gstreamer.gst.Structure> oldstrPtr, @Nullable org.gstreamer.gst.Structure newstr) {
        MemorySegment oldstrPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_structure_take.invokeExact(
                    (Addressable) (oldstrPtr == null ? MemoryAddress.NULL : (Addressable) oldstrPtrPOINTER.address()),
                    (Addressable) (newstr == null ? MemoryAddress.NULL : newstr.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (oldstrPtr != null) oldstrPtr.set(org.gstreamer.gst.Structure.fromAddress.marshal(oldstrPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        newstr.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_structure_from_string = Interop.downcallHandle(
            "gst_structure_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_new = Interop.downcallHandle(
            "gst_structure_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_structure_new_empty = Interop.downcallHandle(
            "gst_structure_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_new_from_string = Interop.downcallHandle(
            "gst_structure_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_new_id = Interop.downcallHandle(
            "gst_structure_new_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle gst_structure_new_id_empty = Interop.downcallHandle(
            "gst_structure_new_id_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_new_valist = Interop.downcallHandle(
            "gst_structure_new_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_can_intersect = Interop.downcallHandle(
            "gst_structure_can_intersect",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_copy = Interop.downcallHandle(
            "gst_structure_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_filter_and_map_in_place = Interop.downcallHandle(
            "gst_structure_filter_and_map_in_place",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_fixate = Interop.downcallHandle(
            "gst_structure_fixate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field = Interop.downcallHandle(
            "gst_structure_fixate_field",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field_boolean = Interop.downcallHandle(
            "gst_structure_fixate_field_boolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field_nearest_double = Interop.downcallHandle(
            "gst_structure_fixate_field_nearest_double",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field_nearest_fraction = Interop.downcallHandle(
            "gst_structure_fixate_field_nearest_fraction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field_nearest_int = Interop.downcallHandle(
            "gst_structure_fixate_field_nearest_int",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_fixate_field_string = Interop.downcallHandle(
            "gst_structure_fixate_field_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_foreach = Interop.downcallHandle(
            "gst_structure_foreach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_free = Interop.downcallHandle(
            "gst_structure_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get = Interop.downcallHandle(
            "gst_structure_get",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_structure_get_array = Interop.downcallHandle(
            "gst_structure_get_array",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_boolean = Interop.downcallHandle(
            "gst_structure_get_boolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_get_clock_time = Interop.downcallHandle(
            "gst_structure_get_clock_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_date = Interop.downcallHandle(
            "gst_structure_get_date",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_date_time = Interop.downcallHandle(
            "gst_structure_get_date_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_double = Interop.downcallHandle(
            "gst_structure_get_double",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_enum = Interop.downcallHandle(
            "gst_structure_get_enum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_field_type = Interop.downcallHandle(
            "gst_structure_get_field_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_flagset = Interop.downcallHandle(
            "gst_structure_get_flagset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_fraction = Interop.downcallHandle(
            "gst_structure_get_fraction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_int = Interop.downcallHandle(
            "gst_structure_get_int",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_int64 = Interop.downcallHandle(
            "gst_structure_get_int64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_list = Interop.downcallHandle(
            "gst_structure_get_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_name = Interop.downcallHandle(
            "gst_structure_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_name_id = Interop.downcallHandle(
            "gst_structure_get_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_string = Interop.downcallHandle(
            "gst_structure_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_uint = Interop.downcallHandle(
            "gst_structure_get_uint",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_uint64 = Interop.downcallHandle(
            "gst_structure_get_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_valist = Interop.downcallHandle(
            "gst_structure_get_valist",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_get_value = Interop.downcallHandle(
            "gst_structure_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_has_field = Interop.downcallHandle(
            "gst_structure_has_field",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_has_field_typed = Interop.downcallHandle(
            "gst_structure_has_field_typed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_structure_has_name = Interop.downcallHandle(
            "gst_structure_has_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_id_get = Interop.downcallHandle(
            "gst_structure_id_get",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle gst_structure_id_get_valist = Interop.downcallHandle(
            "gst_structure_id_get_valist",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_id_get_value = Interop.downcallHandle(
            "gst_structure_id_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_id_has_field = Interop.downcallHandle(
            "gst_structure_id_has_field",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_id_has_field_typed = Interop.downcallHandle(
            "gst_structure_id_has_field_typed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_structure_id_set = Interop.downcallHandle(
            "gst_structure_id_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle gst_structure_id_set_valist = Interop.downcallHandle(
            "gst_structure_id_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_id_set_value = Interop.downcallHandle(
            "gst_structure_id_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_id_take_value = Interop.downcallHandle(
            "gst_structure_id_take_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_intersect = Interop.downcallHandle(
            "gst_structure_intersect",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_is_equal = Interop.downcallHandle(
            "gst_structure_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_is_subset = Interop.downcallHandle(
            "gst_structure_is_subset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_map_in_place = Interop.downcallHandle(
            "gst_structure_map_in_place",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_n_fields = Interop.downcallHandle(
            "gst_structure_n_fields",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_nth_field_name = Interop.downcallHandle(
            "gst_structure_nth_field_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_remove_all_fields = Interop.downcallHandle(
            "gst_structure_remove_all_fields",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_remove_field = Interop.downcallHandle(
            "gst_structure_remove_field",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_remove_fields = Interop.downcallHandle(
            "gst_structure_remove_fields",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_structure_remove_fields_valist = Interop.downcallHandle(
            "gst_structure_remove_fields_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_serialize = Interop.downcallHandle(
            "gst_structure_serialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_structure_set = Interop.downcallHandle(
            "gst_structure_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_structure_set_array = Interop.downcallHandle(
            "gst_structure_set_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_set_list = Interop.downcallHandle(
            "gst_structure_set_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_set_name = Interop.downcallHandle(
            "gst_structure_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_set_parent_refcount = Interop.downcallHandle(
            "gst_structure_set_parent_refcount",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_set_valist = Interop.downcallHandle(
            "gst_structure_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_set_value = Interop.downcallHandle(
            "gst_structure_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_take_value = Interop.downcallHandle(
            "gst_structure_take_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_to_string = Interop.downcallHandle(
            "gst_structure_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_structure_take = Interop.downcallHandle(
            "gst_structure_take",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Structure.Builder} object constructs a {@link Structure} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Structure.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Structure struct;
        
        private Builder() {
            struct = Structure.allocate();
        }
        
         /**
         * Finish building the {@link Structure} struct.
         * @return A new instance of {@code Structure} with the fields 
         *         that were set in the Builder object.
         */
        public Structure build() {
            return struct;
        }
        
        /**
         * the GType of a structure
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        public Builder setName(org.gtk.glib.Quark name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : name.getValue().intValue()));
            return this;
        }
    }
}
