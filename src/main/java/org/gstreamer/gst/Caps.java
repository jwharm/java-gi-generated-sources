package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Caps (capabilities) are lightweight refcounted objects describing media types.
 * They are composed of an array of {@link Structure}.
 * <p>
 * Caps are exposed on {@link PadTemplate} to describe all possible types a
 * given pad can handle. They are also stored in the {@link Registry} along with
 * a description of the {@link Element}.
 * <p>
 * Caps are exposed on the element pads using the gst_pad_query_caps() pad
 * function. This function describes the possible types that the pad can
 * handle or produce at runtime.
 * <p>
 * A {@link Caps} can be constructed with the following code fragment:
 * <pre>{@code  C
 *   GstCaps *caps = gst_caps_new_simple ("video/x-raw",
 *      "format", G_TYPE_STRING, "I420",
 *      "framerate", GST_TYPE_FRACTION, 25, 1,
 *      "pixel-aspect-ratio", GST_TYPE_FRACTION, 1, 1,
 *      "width", G_TYPE_INT, 320,
 *      "height", G_TYPE_INT, 240,
 *      NULL);
 * }</pre>
 * <p>
 * A {@link Caps} is fixed when it has no fields with ranges or lists. Use
 * gst_caps_is_fixed() to test for fixed caps. Fixed caps can be used in a
 * caps event to notify downstream elements of the current media type.
 * <p>
 * Various methods exist to work with the media types such as subtracting
 * or intersecting.
 * <p>
 * Be aware that until 1.20 the {@link Caps} / {@link Structure} serialization into string
 * had limited support for nested {@link Caps} / {@link Structure} fields. It could only
 * support one level of nesting. Using more levels would lead to unexpected
 * behavior when using serialization features, such as gst_caps_to_string() or
 * gst_value_serialize() and their counterparts.
 */
public class Caps extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCaps";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Caps}
     * @return A new, uninitialized @{link Caps}
     */
    public static Caps allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Caps newInstance = new Caps(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject getMiniObject() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code mini_object}
     * @param miniObject The new value of the field {@code mini_object}
     */
    public void setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
    }
    
    /**
     * Create a Caps proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Caps(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Caps> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Caps(input, ownership);
    
    private static MemoryAddress constructNewAny() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_any.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} that indicates that it is compatible with
     * any media format.
     * @return the new {@link Caps}
     */
    public static Caps newAny() {
        var RESULT = constructNewAny();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} that is empty.  That is, the returned
     * {@link Caps} contains no media formats.
     * The {@link Caps} is guaranteed to be writable.
     * @return the new {@link Caps}
     */
    public static Caps newEmpty() {
        var RESULT = constructNewEmpty();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewEmptySimple(java.lang.String mediaType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_empty_simple.invokeExact(
                    Marshal.stringToAddress.marshal(mediaType, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} that contains one {@link Structure} with name
     * {@code media_type}.
     * @param mediaType the media type of the structure
     * @return the new {@link Caps}
     */
    public static Caps newEmptySimple(java.lang.String mediaType) {
        var RESULT = constructNewEmptySimple(mediaType);
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFull(org.gstreamer.gst.Structure struct1, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_full.invokeExact(
                    struct1.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} and adds all the structures listed as
     * arguments.  The list must be {@code null}-terminated.  The structures
     * are not copied; the returned {@link Caps} owns the structures.
     * @param struct1 the first structure to add
     * @param varargs additional structures to add
     * @return the new {@link Caps}
     */
    public static Caps newFull(org.gstreamer.gst.Structure struct1, java.lang.Object... varargs) {
        var RESULT = constructNewFull(struct1, varargs);
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFullValist(org.gstreamer.gst.Structure structure, VaList varArgs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_full_valist.invokeExact(
                    structure.handle(),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} and adds all the structures listed as
     * arguments.  The list must be {@code null}-terminated.  The structures
     * are not copied; the returned {@link Caps} owns the structures.
     * @param structure the first structure to add
     * @param varArgs additional structures to add
     * @return the new {@link Caps}
     */
    public static Caps newFullValist(org.gstreamer.gst.Structure structure, VaList varArgs) {
        var RESULT = constructNewFullValist(structure, varArgs);
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSimple(java.lang.String mediaType, java.lang.String fieldname, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_new_simple.invokeExact(
                    Marshal.stringToAddress.marshal(mediaType, null),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Caps} that contains one {@link Structure}.  The
     * structure is defined by the arguments, which have the same format
     * as gst_structure_new().
     * @param mediaType the media type of the structure
     * @param fieldname first field to set
     * @param varargs additional arguments
     * @return the new {@link Caps}
     */
    public static Caps newSimple(java.lang.String mediaType, java.lang.String fieldname, java.lang.Object... varargs) {
        var RESULT = constructNewSimple(mediaType, fieldname, varargs);
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Appends the structures contained in {@code caps2} to {@code caps1}. The structures in
     * {@code caps2} are not copied -- they are transferred to {@code caps1}, and then {@code caps2} is
     * freed. If either caps is ANY, the resulting caps will be ANY.
     * @param caps2 the {@link Caps} to append
     */
    public void append(org.gstreamer.gst.Caps caps2) {
        try {
            DowncallHandles.gst_caps_append.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps2.yieldOwnership();
    }
    
    /**
     * Appends {@code structure} to {@code caps}.  The structure is not copied; {@code caps}
     * becomes the owner of {@code structure}.
     * @param structure the {@link Structure} to append
     */
    public void appendStructure(org.gstreamer.gst.Structure structure) {
        try {
            DowncallHandles.gst_caps_append_structure.invokeExact(
                    handle(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
    }
    
    /**
     * Appends {@code structure} with {@code features} to {@code caps}.  The structure is not copied; {@code caps}
     * becomes the owner of {@code structure}.
     * @param structure the {@link Structure} to append
     * @param features the {@link CapsFeatures} to append
     */
    public void appendStructureFull(org.gstreamer.gst.Structure structure, @Nullable org.gstreamer.gst.CapsFeatures features) {
        try {
            DowncallHandles.gst_caps_append_structure_full.invokeExact(
                    handle(),
                    structure.handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        features.yieldOwnership();
    }
    
    /**
     * Tries intersecting {@code caps1} and {@code caps2} and reports whether the result would not
     * be empty
     * @param caps2 a {@link Caps} to intersect
     * @return {@code true} if intersection would be not empty
     */
    public boolean canIntersect(org.gstreamer.gst.Caps caps2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_can_intersect.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a new {@link Caps} as a copy of the old {@code caps}. The new caps will have a
     * refcount of 1, owned by the caller. The structures are copied as well.
     * <p>
     * Note that this function is the semantic equivalent of a gst_caps_ref()
     * followed by a gst_caps_make_writable(). If you only want to hold on to a
     * reference to the data, you should use gst_caps_ref().
     * @return the new {@link Caps}
     */
    public org.gstreamer.gst.Caps copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link Caps} and appends a copy of the nth structure
     * contained in {@code caps}.
     * @param nth the nth structure to copy
     * @return the new {@link Caps}
     */
    public org.gstreamer.gst.Caps copyNth(int nth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_copy_nth.invokeExact(
                    handle(),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls the provided function once for each structure and caps feature in the
     * {@link Caps}. In contrast to gst_caps_foreach(), the function may modify the
     * structure and features. In contrast to gst_caps_filter_and_map_in_place(),
     * the structure and features are removed from the caps if {@code false} is returned
     * from the function.
     * The caps must be mutable.
     * @param func a function to call for each field
     */
    public void filterAndMapInPlace(org.gstreamer.gst.CapsFilterMapFunc func) {
        try {
            DowncallHandles.gst_caps_filter_and_map_in_place.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Modifies the given {@code caps} into a representation with only fixed
     * values. First the caps will be truncated and then the first structure will be
     * fixated with gst_structure_fixate().
     * <p>
     * This function takes ownership of {@code caps} and will call gst_caps_make_writable()
     * on it so you must not use {@code caps} afterwards unless you keep an additional
     * reference to it with gst_caps_ref().
     * <p>
     * Note that it is not guaranteed that the returned caps have exactly one
     * structure. If {@code caps} are empty caps then the returned caps will be
     * the empty too and contain no structure at all.
     * <p>
     * Calling this function with ANY caps is not allowed.
     * @return the fixated caps
     */
    public org.gstreamer.gst.Caps fixate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_fixate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls the provided function once for each structure and caps feature in the
     * {@link Caps}. The function must not modify the fields.
     * Also see gst_caps_map_in_place() and gst_caps_filter_and_map_in_place().
     * @param func a function to call for each field
     * @return {@code true} if the supplied function returns {@code true} for each call,
     * {@code false} otherwise.
     */
    public boolean foreach(org.gstreamer.gst.CapsForeachFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Finds the features in {@code caps} at {@code index}, and returns it.
     * <p>
     * WARNING: This function takes a {@code const GstCaps *}, but returns a
     * non-const {@code GstCapsFeatures *}.  This is for programming convenience --
     * the caller should be aware that features inside a constant
     * {@link Caps} should not be modified. However, if you know the caps
     * are writable, either because you have just copied them or made
     * them writable with gst_caps_make_writable(), you may modify the
     * features returned in the usual way, e.g. with functions like
     * gst_caps_features_add().
     * @param index the index of the structure
     * @return a pointer to the {@link CapsFeatures}
     *     corresponding to {@code index}
     */
    public @Nullable org.gstreamer.gst.CapsFeatures getFeatures(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_get_features.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.CapsFeatures.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the number of structures contained in {@code caps}.
     * @return the number of structures that {@code caps} contains
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Finds the structure in {@code caps} at {@code index}, and returns it.
     * <p>
     * WARNING: This function takes a {@code const GstCaps *}, but returns a
     * non-const {@code GstStructure *}.  This is for programming convenience --
     * the caller should be aware that structures inside a constant
     * {@link Caps} should not be modified. However, if you know the caps
     * are writable, either because you have just copied them or made
     * them writable with gst_caps_make_writable(), you may modify the
     * structure returned in the usual way, e.g. with functions like
     * gst_structure_set().
     * @param index the index of the structure
     * @return a pointer to the {@link Structure} corresponding
     *     to {@code index}
     */
    public org.gstreamer.gst.Structure getStructure(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_get_structure.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Creates a new {@link Caps} that contains all the formats that are common
     * to both {@code caps1} and {@code caps2}. Defaults to {@link CapsIntersectMode#ZIG_ZAG} mode.
     * @param caps2 a {@link Caps} to intersect
     * @return the new {@link Caps}
     */
    public org.gstreamer.gst.Caps intersect(org.gstreamer.gst.Caps caps2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_intersect.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link Caps} that contains all the formats that are common
     * to both {@code caps1} and {@code caps2}, the order is defined by the {@link CapsIntersectMode}
     * used.
     * @param caps2 a {@link Caps} to intersect
     * @param mode The intersection algorithm/mode to use
     * @return the new {@link Caps}
     */
    public org.gstreamer.gst.Caps intersectFull(org.gstreamer.gst.Caps caps2, org.gstreamer.gst.CapsIntersectMode mode) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_intersect_full.invokeExact(
                    handle(),
                    caps2.handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A given {@link Caps} structure is always compatible with another if
     * every media format that is in the first is also contained in the
     * second.  That is, {@code caps1} is a subset of {@code caps2}.
     * @param caps2 the {@link Caps} to test
     * @return {@code true} if {@code caps1} is a subset of {@code caps2}.
     */
    public boolean isAlwaysCompatible(org.gstreamer.gst.Caps caps2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_always_compatible.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if {@code caps} represents any media format.
     * @return {@code true} if {@code caps} represents any format.
     */
    public boolean isAny() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_any.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if {@code caps} represents no media formats.
     * @return {@code true} if {@code caps} represents no formats.
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the given caps represent the same set of caps.
     * @param caps2 another {@link Caps}
     * @return {@code true} if both caps are equal.
     */
    public boolean isEqual(org.gstreamer.gst.Caps caps2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_equal.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Tests if two {@link Caps} are equal.  This function only works on fixed
     * {@link Caps}.
     * @param caps2 the {@link Caps} to test
     * @return {@code true} if the arguments represent the same format
     */
    public boolean isEqualFixed(org.gstreamer.gst.Caps caps2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_equal_fixed.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fixed {@link Caps} describe exactly one format, that is, they have exactly
     * one structure, and each field in the structure describes a fixed type.
     * Examples of non-fixed types are GST_TYPE_INT_RANGE and GST_TYPE_LIST.
     * @return {@code true} if {@code caps} is fixed
     */
    public boolean isFixed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_fixed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the given caps are exactly the same set of caps.
     * @param caps2 another {@link Caps}
     * @return {@code true} if both caps are strictly equal.
     */
    public boolean isStrictlyEqual(org.gstreamer.gst.Caps caps2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_strictly_equal.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if all caps represented by {@code subset} are also represented by {@code superset}.
     * @param superset a potentially greater {@link Caps}
     * @return {@code true} if {@code subset} is a subset of {@code superset}
     */
    public boolean isSubset(org.gstreamer.gst.Caps superset) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_subset.invokeExact(
                    handle(),
                    superset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code structure} is a subset of {@code caps}. See gst_caps_is_subset()
     * for more information.
     * @param structure a potential {@link Structure} subset of {@code caps}
     * @return {@code true} if {@code structure} is a subset of {@code caps}
     */
    public boolean isSubsetStructure(org.gstreamer.gst.Structure structure) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_subset_structure.invokeExact(
                    handle(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code structure} is a subset of {@code caps}. See gst_caps_is_subset()
     * for more information.
     * @param structure a potential {@link Structure} subset of {@code caps}
     * @param features a {@link CapsFeatures} for {@code structure}
     * @return {@code true} if {@code structure} is a subset of {@code caps}
     */
    public boolean isSubsetStructureFull(org.gstreamer.gst.Structure structure, @Nullable org.gstreamer.gst.CapsFeatures features) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_is_subset_structure_full.invokeExact(
                    handle(),
                    structure.handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls the provided function once for each structure and caps feature in the
     * {@link Caps}. In contrast to gst_caps_foreach(), the function may modify but not
     * delete the structures and features. The caps must be mutable.
     * @param func a function to call for each field
     * @return {@code true} if the supplied function returns {@code true} for each call,
     * {@code false} otherwise.
     */
    public boolean mapInPlace(org.gstreamer.gst.CapsMapFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_map_in_place.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Appends the structures contained in {@code caps2} to {@code caps1} if they are not yet
     * expressed by {@code caps1}. The structures in {@code caps2} are not copied -- they are
     * transferred to a writable copy of {@code caps1}, and then {@code caps2} is freed.
     * If either caps is ANY, the resulting caps will be ANY.
     * @param caps2 the {@link Caps} to merge in
     * @return the merged caps.
     */
    public org.gstreamer.gst.Caps merge(org.gstreamer.gst.Caps caps2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_merge.invokeExact(
                    handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        caps2.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Appends {@code structure} to {@code caps} if it is not already expressed by {@code caps}.
     * @param structure the {@link Structure} to merge
     * @return the merged caps.
     */
    public org.gstreamer.gst.Caps mergeStructure(org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_merge_structure.invokeExact(
                    handle(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        structure.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Appends {@code structure} with {@code features} to {@code caps} if its not already expressed by {@code caps}.
     * @param structure the {@link Structure} to merge
     * @param features the {@link CapsFeatures} to merge
     * @return the merged caps.
     */
    public org.gstreamer.gst.Caps mergeStructureFull(org.gstreamer.gst.Structure structure, @Nullable org.gstreamer.gst.CapsFeatures features) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_merge_structure_full.invokeExact(
                    handle(),
                    structure.handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        structure.yieldOwnership();
        features.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link Caps} that represents the same set of formats as
     * {@code caps}, but contains no lists.  Each list is expanded into separate
     * {@link Structure}.
     * <p>
     * This function takes ownership of {@code caps} and will call gst_caps_make_writable()
     * on it so you must not use {@code caps} afterwards unless you keep an additional
     * reference to it with gst_caps_ref().
     * @return the normalized {@link Caps}
     */
    public org.gstreamer.gst.Caps normalize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_normalize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes the structure with the given index from the list of structures
     * contained in {@code caps}.
     * @param idx Index of the structure to remove
     */
    public void removeStructure(int idx) {
        try {
            DowncallHandles.gst_caps_remove_structure.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts {@code caps} to a string representation.  This string representation can be
     * converted back to a {@link Caps} by gst_caps_from_string().
     * <p>
     * This prints the caps in human readable form.
     * <p>
     * This version of the caps serialization function introduces support for nested
     * structures and caps but the resulting strings won't be parsable with
     * GStreamer prior to 1.20 unless {@code GST_SERIALIZE_FLAG_BACKWARD_COMPAT} is passed
     * as {@code flag}.
     * @param flags a {@link SerializeFlags}
     * @return a newly allocated string representing {@code caps}.
     */
    public java.lang.String serialize(org.gstreamer.gst.SerializeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_serialize.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the {@code features} for the structure at {@code index}.
     * @param index the index of the structure
     * @param features the {@link CapsFeatures} to set
     */
    public void setFeatures(int index, @Nullable org.gstreamer.gst.CapsFeatures features) {
        try {
            DowncallHandles.gst_caps_set_features.invokeExact(
                    handle(),
                    index,
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        features.yieldOwnership();
    }
    
    /**
     * Sets the {@code features} for all the structures of {@code caps}.
     * @param features the {@link CapsFeatures} to set
     */
    public void setFeaturesSimple(@Nullable org.gstreamer.gst.CapsFeatures features) {
        try {
            DowncallHandles.gst_caps_set_features_simple.invokeExact(
                    handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : features.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        features.yieldOwnership();
    }
    
    /**
     * Sets fields in a {@link Caps}.  The arguments must be passed in the same
     * manner as gst_structure_set(), and be {@code null}-terminated.
     * @param field first field to set
     * @param varargs additional parameters
     */
    public void setSimple(java.lang.String field, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_caps_set_simple.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(field, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets fields in a {@link Caps}.  The arguments must be passed in the same
     * manner as gst_structure_set(), and be {@code null}-terminated.
     * @param field first field to set
     * @param varargs additional parameters
     */
    public void setSimpleValist(java.lang.String field, VaList varargs) {
        try {
            DowncallHandles.gst_caps_set_simple_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(field, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given {@code field} on all structures of {@code caps} to the given {@code value}.
     * This is a convenience function for calling gst_structure_set_value() on
     * all structures of {@code caps}.
     * @param field name of the field to set
     * @param value value to set the field to
     */
    public void setValue(java.lang.String field, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_caps_set_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(field, null),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts the given {@code caps} into a representation that represents the
     * same set of formats, but in a simpler form.  Component structures that are
     * identical are merged.  Component structures that have values that can be
     * merged are also merged.
     * <p>
     * This function takes ownership of {@code caps} and will call gst_caps_make_writable()
     * on it if necessary, so you must not use {@code caps} afterwards unless you keep an
     * additional reference to it with gst_caps_ref().
     * <p>
     * This method does not preserve the original order of {@code caps}.
     * @return The simplified caps.
     */
    public org.gstreamer.gst.Caps simplify() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_simplify.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the structure with the given index from the list of structures
     * contained in {@code caps}. The caller becomes the owner of the returned structure.
     * @param index Index of the structure to retrieve
     * @return a pointer to the {@link Structure}
     *     corresponding to {@code index}.
     */
    public @Nullable org.gstreamer.gst.Structure stealStructure(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_steal_structure.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Subtracts the {@code subtrahend} from the {@code minuend}.
     * <blockquote>
     *  This function does not work reliably if optional properties for caps
     *  are included on one caps and omitted on the other.
     * </blockquote>
     * @param subtrahend {@link Caps} to subtract
     * @return the resulting caps
     */
    public org.gstreamer.gst.Caps subtract(org.gstreamer.gst.Caps subtrahend) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_subtract.invokeExact(
                    handle(),
                    subtrahend.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Converts {@code caps} to a string representation.  This string representation
     * can be converted back to a {@link Caps} by gst_caps_from_string().
     * <p>
     * For debugging purposes its easier to do something like this:
     * <pre>{@code  C
     * GST_LOG ("caps are %" GST_PTR_FORMAT, caps);
     * }</pre>
     * <p>
     * This prints the caps in human readable form.
     * <p>
     * The implementation of serialization up to 1.20 would lead to unexpected results
     * when there were nested {@link Caps} / {@link Structure} deeper than one level.
     * @return a newly allocated string representing {@code caps}.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Discards all but the first structure from {@code caps}. Useful when
     * fixating.
     * <p>
     * This function takes ownership of {@code caps} and will call gst_caps_make_writable()
     * on it if necessary, so you must not use {@code caps} afterwards unless you keep an
     * additional reference to it with gst_caps_ref().
     * <p>
     * Note that it is not guaranteed that the returned caps have exactly one
     * structure. If {@code caps} is any or empty caps then the returned caps will be
     * the same and contain no structure at all.
     * @return truncated caps
     */
    public org.gstreamer.gst.Caps truncate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_truncate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Converts {@code caps} from a string representation.
     * <p>
     * The implementation of serialization up to 1.20 would lead to unexpected results
     * when there were nested {@link Caps} / {@link Structure} deeper than one level.
     * @param string a string to convert to {@link Caps}
     * @return a newly allocated {@link Caps}
     */
    public static @Nullable org.gstreamer.gst.Caps fromString(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_caps_new_any = Interop.downcallHandle(
            "gst_caps_new_any",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_new_empty = Interop.downcallHandle(
            "gst_caps_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_new_empty_simple = Interop.downcallHandle(
            "gst_caps_new_empty_simple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_new_full = Interop.downcallHandle(
            "gst_caps_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_caps_new_full_valist = Interop.downcallHandle(
            "gst_caps_new_full_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_new_simple = Interop.downcallHandle(
            "gst_caps_new_simple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_caps_append = Interop.downcallHandle(
            "gst_caps_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_append_structure = Interop.downcallHandle(
            "gst_caps_append_structure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_append_structure_full = Interop.downcallHandle(
            "gst_caps_append_structure_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_can_intersect = Interop.downcallHandle(
            "gst_caps_can_intersect",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_copy = Interop.downcallHandle(
            "gst_caps_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_copy_nth = Interop.downcallHandle(
            "gst_caps_copy_nth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_filter_and_map_in_place = Interop.downcallHandle(
            "gst_caps_filter_and_map_in_place",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_fixate = Interop.downcallHandle(
            "gst_caps_fixate",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_foreach = Interop.downcallHandle(
            "gst_caps_foreach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_get_features = Interop.downcallHandle(
            "gst_caps_get_features",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_get_size = Interop.downcallHandle(
            "gst_caps_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_get_structure = Interop.downcallHandle(
            "gst_caps_get_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_intersect = Interop.downcallHandle(
            "gst_caps_intersect",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_intersect_full = Interop.downcallHandle(
            "gst_caps_intersect_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_is_always_compatible = Interop.downcallHandle(
            "gst_caps_is_always_compatible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_any = Interop.downcallHandle(
            "gst_caps_is_any",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_empty = Interop.downcallHandle(
            "gst_caps_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_equal = Interop.downcallHandle(
            "gst_caps_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_equal_fixed = Interop.downcallHandle(
            "gst_caps_is_equal_fixed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_fixed = Interop.downcallHandle(
            "gst_caps_is_fixed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_strictly_equal = Interop.downcallHandle(
            "gst_caps_is_strictly_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_subset = Interop.downcallHandle(
            "gst_caps_is_subset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_subset_structure = Interop.downcallHandle(
            "gst_caps_is_subset_structure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_is_subset_structure_full = Interop.downcallHandle(
            "gst_caps_is_subset_structure_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_map_in_place = Interop.downcallHandle(
            "gst_caps_map_in_place",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_merge = Interop.downcallHandle(
            "gst_caps_merge",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_merge_structure = Interop.downcallHandle(
            "gst_caps_merge_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_merge_structure_full = Interop.downcallHandle(
            "gst_caps_merge_structure_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_normalize = Interop.downcallHandle(
            "gst_caps_normalize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_remove_structure = Interop.downcallHandle(
            "gst_caps_remove_structure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_serialize = Interop.downcallHandle(
            "gst_caps_serialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_set_features = Interop.downcallHandle(
            "gst_caps_set_features",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_set_features_simple = Interop.downcallHandle(
            "gst_caps_set_features_simple",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_set_simple = Interop.downcallHandle(
            "gst_caps_set_simple",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_caps_set_simple_valist = Interop.downcallHandle(
            "gst_caps_set_simple_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_set_value = Interop.downcallHandle(
            "gst_caps_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_simplify = Interop.downcallHandle(
            "gst_caps_simplify",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_steal_structure = Interop.downcallHandle(
            "gst_caps_steal_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_subtract = Interop.downcallHandle(
            "gst_caps_subtract",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_to_string = Interop.downcallHandle(
            "gst_caps_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_truncate = Interop.downcallHandle(
            "gst_caps_truncate",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_from_string = Interop.downcallHandle(
            "gst_caps_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Caps.Builder} object constructs a {@link Caps} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Caps.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Caps struct;
        
        private Builder() {
            struct = Caps.allocate();
        }
        
         /**
         * Finish building the {@link Caps} struct.
         * @return A new instance of {@code Caps} with the fields 
         *         that were set in the Builder object.
         */
        public Caps build() {
            return struct;
        }
        
        /**
         * the parent type
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
    }
}
