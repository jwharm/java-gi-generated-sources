package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ValueArray} contains an array of {@link Value} elements.
 */
public class ValueArray extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("n_values"),
        org.gtk.gobject.Value.getMemoryLayout().withName("values"),
        ValueLayout.JAVA_INT.withName("n_prealloced")
    ).withName("GValueArray");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ValueArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Insert a copy of {@code value} as last element of {@code value_array}. If {@code value} is
     * {@code null}, an uninitialized value is appended.
     * @param value {@link Value} to copy into {@link ValueArray}, or {@code null}
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_append_val() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray append(@Nullable org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_append.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, false));
    }
    
    /**
     * Construct an exact copy of a {@link ValueArray} by duplicating all its
     * contents.
     * @return Newly allocated copy of {@link ValueArray}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_ref() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, true));
    }
    
    /**
     * Free a {@link ValueArray} including its contents.
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_unref() instead.
     */
    @Deprecated
    public void free() {
        try {
            DowncallHandles.g_value_array_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Return a pointer to the value at {@code index_} containd in {@code value_array}.
     * @param index index of the value of interest
     * @return pointer to a value at {@code index_} in {@code value_array}
     * @deprecated Use g_array_index() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.Value getNth(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_get_nth.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Insert a copy of {@code value} at specified position into {@code value_array}. If {@code value}
     * is {@code null}, an uninitialized value is inserted.
     * @param index insertion position, must be &lt;= value_array-&gt;;n_values
     * @param value {@link Value} to copy into {@link ValueArray}, or {@code null}
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_insert_val() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray insert(int index, @Nullable org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_insert.invokeExact(handle(), index, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, false));
    }
    
    /**
     * Insert a copy of {@code value} as first element of {@code value_array}. If {@code value} is
     * {@code null}, an uninitialized value is prepended.
     * @param value {@link Value} to copy into {@link ValueArray}, or {@code null}
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_prepend_val() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray prepend(@Nullable org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_prepend.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, false));
    }
    
    /**
     * Remove the value at position {@code index_} from {@code value_array}.
     * @param index position of value to remove, which must be less than
     *     {@code value_array}-&gt;n_values
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_remove_index() instead.
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray remove(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_remove.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sort {@code value_array} using {@code compare_func} to compare the elements according to
     * the semantics of {@link org.gtk.glib.CompareFunc}.
     * <p>
     * The current implementation uses the same sorting algorithm as standard
     * C qsort() function.
     * @param compareFunc function to compare elements
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_sort().
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray sort(@NotNull org.gtk.glib.CompareFunc compareFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sort {@code value_array} using {@code compare_func} to compare the elements according
     * to the semantics of {@link org.gtk.glib.CompareDataFunc}.
     * <p>
     * The current implementation uses the same sorting algorithm as standard
     * C qsort() function.
     * @param compareFunc function to compare elements
     * @return the {@link ValueArray} passed in as {@code value_array}
     * @deprecated Use {@link org.gtk.glib.Array} and g_array_sort_with_data().
     */
    @Deprecated
    public @NotNull org.gtk.gobject.ValueArray sortWithData(@NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_array_sort_with_data.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ValueArray(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_value_array_new = Interop.downcallHandle(
            "g_value_array_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_value_array_append = Interop.downcallHandle(
            "g_value_array_append",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_copy = Interop.downcallHandle(
            "g_value_array_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_free = Interop.downcallHandle(
            "g_value_array_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_get_nth = Interop.downcallHandle(
            "g_value_array_get_nth",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_value_array_insert = Interop.downcallHandle(
            "g_value_array_insert",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_prepend = Interop.downcallHandle(
            "g_value_array_prepend",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_remove = Interop.downcallHandle(
            "g_value_array_remove",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_value_array_sort = Interop.downcallHandle(
            "g_value_array_sort",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_value_array_sort_with_data = Interop.downcallHandle(
            "g_value_array_sort_with_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
