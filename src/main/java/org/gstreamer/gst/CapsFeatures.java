package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link CapsFeatures} can optionally be set on a {@link Caps} to add requirements
 * for additional features for a specific {@link Structure}. Caps structures with
 * the same name but with a non-equal set of caps features are not compatible.
 * If a pad supports multiple sets of features it has to add multiple equal
 * structures with different feature sets to the caps.
 * <p>
 * Empty {@link CapsFeatures} are equivalent with the {@link CapsFeatures} that only
 * contain {@code GST_CAPS_FEATURE_MEMORY_SYSTEM_MEMORY}. ANY {@link CapsFeatures} as
 * created by gst_caps_features_new_any() are equal to any other {@link CapsFeatures}
 * and can be used to specify that any {@link CapsFeatures} would be supported, e.g.
 * for elements that don't touch buffer memory. {@link Caps} with ANY {@link CapsFeatures}
 * are considered non-fixed and during negotiation some {@link CapsFeatures} have
 * to be selected.
 * <p>
 * Examples for caps features would be the requirement of a specific {@link Memory}
 * types or the requirement of having a specific {@link Meta} on the buffer. Features
 * are given as a string of the format {@code memory:GstMemoryTypeName} or
 * {@code meta:GstMetaAPIName}.
 * @version 1.2
 */
public class CapsFeatures extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCapsFeatures";
    
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
     * Allocate a new {@link CapsFeatures}
     * @return A new, uninitialized @{link CapsFeatures}
     */
    public static CapsFeatures allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CapsFeatures newInstance = new CapsFeatures(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CapsFeatures proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CapsFeatures(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull java.lang.String feature1, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(feature1, "Parameter 'feature1' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new.invokeExact(
                    Interop.allocateNativeString(feature1),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CapsFeatures} with the given features.
     * The last argument must be {@code null}.
     * @param feature1 name of first feature to set
     * @param varargs additional features
     */
    public CapsFeatures(@NotNull java.lang.String feature1, java.lang.Object... varargs) {
        super(constructNew(feature1, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewAny() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_any.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, ANY {@link CapsFeatures}. This will be equal
     * to any other {@link CapsFeatures} but caps with these are
     * unfixed.
     * @return a new, ANY {@link CapsFeatures}
     */
    public static CapsFeatures newAny() {
        return new CapsFeatures(constructNewAny(), Ownership.FULL);
    }
    
    private static Addressable constructNewEmpty() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty {@link CapsFeatures}.
     * @return a new, empty {@link CapsFeatures}
     */
    public static CapsFeatures newEmpty() {
        return new CapsFeatures(constructNewEmpty(), Ownership.FULL);
    }
    
    private static Addressable constructNewId(@NotNull org.gtk.glib.Quark feature1, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(feature1, "Parameter 'feature1' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_id.invokeExact(
                    feature1.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CapsFeatures} with the given features.
     * The last argument must be 0.
     * @param feature1 name of first feature to set
     * @param varargs additional features
     * @return a new, empty {@link CapsFeatures}
     */
    public static CapsFeatures newId(@NotNull org.gtk.glib.Quark feature1, java.lang.Object... varargs) {
        return new CapsFeatures(constructNewId(feature1, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewIdValist(@NotNull org.gtk.glib.Quark feature1, @NotNull VaList varargs) {
        java.util.Objects.requireNonNull(feature1, "Parameter 'feature1' must not be null");
        java.util.Objects.requireNonNull(varargs, "Parameter 'varargs' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_id_valist.invokeExact(
                    feature1.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CapsFeatures} with the given features.
     * @param feature1 name of first feature to set
     * @param varargs variable argument list
     * @return a new, empty {@link CapsFeatures}
     */
    public static CapsFeatures newIdValist(@NotNull org.gtk.glib.Quark feature1, @NotNull VaList varargs) {
        return new CapsFeatures(constructNewIdValist(feature1, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewSingle(@NotNull java.lang.String feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_single.invokeExact(
                    Interop.allocateNativeString(feature));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CapsFeatures} with a single feature.
     * @param feature The feature
     * @return a new {@link CapsFeatures}
     */
    public static CapsFeatures newSingle(@NotNull java.lang.String feature) {
        return new CapsFeatures(constructNewSingle(feature), Ownership.FULL);
    }
    
    private static Addressable constructNewValist(@NotNull java.lang.String feature1, @NotNull VaList varargs) {
        java.util.Objects.requireNonNull(feature1, "Parameter 'feature1' must not be null");
        java.util.Objects.requireNonNull(varargs, "Parameter 'varargs' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_new_valist.invokeExact(
                    Interop.allocateNativeString(feature1),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CapsFeatures} with the given features.
     * @param feature1 name of first feature to set
     * @param varargs variable argument list
     * @return a new, empty {@link CapsFeatures}
     */
    public static CapsFeatures newValist(@NotNull java.lang.String feature1, @NotNull VaList varargs) {
        return new CapsFeatures(constructNewValist(feature1, varargs), Ownership.FULL);
    }
    
    /**
     * Adds {@code feature} to {@code features}.
     * @param feature a feature.
     */
    public void add(@NotNull java.lang.String feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        try {
            DowncallHandles.gst_caps_features_add.invokeExact(
                    handle(),
                    Interop.allocateNativeString(feature));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code feature} to {@code features}.
     * @param feature a feature.
     */
    public void addId(@NotNull org.gtk.glib.Quark feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        try {
            DowncallHandles.gst_caps_features_add_id.invokeExact(
                    handle(),
                    feature.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if {@code features} contains {@code feature}.
     * @param feature a feature
     * @return {@code true} if {@code features} contains {@code feature}.
     */
    public boolean contains(@NotNull java.lang.String feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_contains.invokeExact(
                    handle(),
                    Interop.allocateNativeString(feature));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code features} contains {@code feature}.
     * @param feature a feature
     * @return {@code true} if {@code features} contains {@code feature}.
     */
    public boolean containsId(@NotNull org.gtk.glib.Quark feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_contains_id.invokeExact(
                    handle(),
                    feature.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Duplicates a {@link CapsFeatures} and all its values.
     * @return a new {@link CapsFeatures}.
     */
    public @NotNull org.gstreamer.gst.CapsFeatures copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.CapsFeatures(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a {@link CapsFeatures} and all its values. The caps features must not
     * have a parent when this function is called.
     */
    public void free() {
        try {
            DowncallHandles.gst_caps_features_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Returns the {@code i}-th feature of {@code features}.
     * @param i index of the feature
     * @return The {@code i}-th feature of {@code features}.
     */
    public @Nullable java.lang.String getNth(int i) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_get_nth.invokeExact(
                    handle(),
                    i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the {@code i}-th feature of {@code features}.
     * @param i index of the feature
     * @return The {@code i}-th feature of {@code features}.
     */
    public @NotNull org.gtk.glib.Quark getNthId(int i) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_get_nth_id.invokeExact(
                    handle(),
                    i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Returns the number of features in {@code features}.
     * @return The number of features in {@code features}.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code features} is {@code GST_CAPS_FEATURES_ANY}.
     * @return {@code true} if {@code features} is {@code GST_CAPS_FEATURES_ANY}.
     */
    public boolean isAny() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_is_any.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code features1} and {@code features2} are equal.
     * @param features2 a {@link CapsFeatures}.
     * @return {@code true} if {@code features1} and {@code features2} are equal.
     */
    public boolean isEqual(@NotNull org.gstreamer.gst.CapsFeatures features2) {
        java.util.Objects.requireNonNull(features2, "Parameter 'features2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_is_equal.invokeExact(
                    handle(),
                    features2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes {@code feature} from {@code features}.
     * @param feature a feature.
     */
    public void remove(@NotNull java.lang.String feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        try {
            DowncallHandles.gst_caps_features_remove.invokeExact(
                    handle(),
                    Interop.allocateNativeString(feature));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code feature} from {@code features}.
     * @param feature a feature.
     */
    public void removeId(@NotNull org.gtk.glib.Quark feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        try {
            DowncallHandles.gst_caps_features_remove_id.invokeExact(
                    handle(),
                    feature.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parent_refcount field of {@link CapsFeatures}. This field is used to
     * determine whether a caps features is mutable or not. This function should only be
     * called by code implementing parent objects of {@link CapsFeatures}, as described in
     * <a href="additional/design/MT-refcounting.md">the MT refcounting design document</a>.
     * @param refcount a pointer to the parent's refcount
     * @return {@code true} if the parent refcount could be set.
     */
    public boolean setParentRefcount(PointerInteger refcount) {
        java.util.Objects.requireNonNull(refcount, "Parameter 'refcount' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_caps_features_set_parent_refcount.invokeExact(
                    handle(),
                    refcount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Converts {@code features} to a human-readable string representation.
     * <p>
     * For debugging purposes its easier to do something like this:
     * <pre>{@code  C
     * GST_LOG ("features is %" GST_PTR_FORMAT, features);
     * }</pre>
     * <p>
     * This prints the features in human readable form.
     * @return a pointer to string allocated by g_malloc().
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Creates a {@link CapsFeatures} from a string representation.
     * @param features a string representation of a {@link CapsFeatures}.
     * @return a new {@link CapsFeatures} or
     *     {@code null} when the string could not be parsed.
     */
    public static @Nullable org.gstreamer.gst.CapsFeatures fromString(@NotNull java.lang.String features) {
        java.util.Objects.requireNonNull(features, "Parameter 'features' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_caps_features_from_string.invokeExact(
                    Interop.allocateNativeString(features));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.CapsFeatures(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_caps_features_new = Interop.downcallHandle(
            "gst_caps_features_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_caps_features_new_any = Interop.downcallHandle(
            "gst_caps_features_new_any",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_new_empty = Interop.downcallHandle(
            "gst_caps_features_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_new_id = Interop.downcallHandle(
            "gst_caps_features_new_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle gst_caps_features_new_id_valist = Interop.downcallHandle(
            "gst_caps_features_new_id_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_new_single = Interop.downcallHandle(
            "gst_caps_features_new_single",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_new_valist = Interop.downcallHandle(
            "gst_caps_features_new_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_add = Interop.downcallHandle(
            "gst_caps_features_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_add_id = Interop.downcallHandle(
            "gst_caps_features_add_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_features_contains = Interop.downcallHandle(
            "gst_caps_features_contains",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_contains_id = Interop.downcallHandle(
            "gst_caps_features_contains_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_features_copy = Interop.downcallHandle(
            "gst_caps_features_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_free = Interop.downcallHandle(
            "gst_caps_features_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_get_nth = Interop.downcallHandle(
            "gst_caps_features_get_nth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_features_get_nth_id = Interop.downcallHandle(
            "gst_caps_features_get_nth_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_features_get_size = Interop.downcallHandle(
            "gst_caps_features_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_is_any = Interop.downcallHandle(
            "gst_caps_features_is_any",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_is_equal = Interop.downcallHandle(
            "gst_caps_features_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_remove = Interop.downcallHandle(
            "gst_caps_features_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_remove_id = Interop.downcallHandle(
            "gst_caps_features_remove_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_caps_features_set_parent_refcount = Interop.downcallHandle(
            "gst_caps_features_set_parent_refcount",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_to_string = Interop.downcallHandle(
            "gst_caps_features_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_caps_features_from_string = Interop.downcallHandle(
            "gst_caps_features_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
