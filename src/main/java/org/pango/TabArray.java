package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoTabArray} contains an array of tab stops.
 * <p>
 * {@code PangoTabArray} can be used to set tab stops in a {@code PangoLayout}.
 * Each tab stop has an alignment, a position, and optionally
 * a character to use as decimal point.
 */
public class TabArray extends io.github.jwharm.javagi.ResourceBase {

    public TabArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_tab_array_new = Interop.downcallHandle(
        "pango_tab_array_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(int initialSize, boolean positionsInPixels) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_tab_array_new.invokeExact(initialSize, positionsInPixels ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an array of {@code initial_size} tab stops.
     * <p>
     * Tab stops are specified in pixel units if {@code positions_in_pixels} is {@code true},
     * otherwise in Pango units. All stops are initially at position 0.
     */
    public TabArray(int initialSize, boolean positionsInPixels) {
        super(constructNew(initialSize, positionsInPixels));
    }
    
    static final MethodHandle pango_tab_array_copy = Interop.downcallHandle(
        "pango_tab_array_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code PangoTabArray}.
     */
    public TabArray copy() {
        try {
            var RESULT = (MemoryAddress) pango_tab_array_copy.invokeExact(handle());
            return new TabArray(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_free = Interop.downcallHandle(
        "pango_tab_array_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a tab array and associated resources.
     */
    public void free() {
        try {
            pango_tab_array_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_get_decimal_point = Interop.downcallHandle(
        "pango_tab_array_get_decimal_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the Unicode character to use as decimal point.
     * <p>
     * This is only relevant for tabs with {@link TabAlign#DECIMAL} alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * <p>
     * The default value of 0 means that Pango will use the
     * decimal point according to the current locale.
     */
    public int getDecimalPoint(int tabIndex) {
        try {
            var RESULT = (int) pango_tab_array_get_decimal_point.invokeExact(handle(), tabIndex);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_get_positions_in_pixels = Interop.downcallHandle(
        "pango_tab_array_get_positions_in_pixels",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the tab positions are in pixels,
     * {@code false} if they are in Pango units.
     */
    public boolean getPositionsInPixels() {
        try {
            var RESULT = (int) pango_tab_array_get_positions_in_pixels.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_get_size = Interop.downcallHandle(
        "pango_tab_array_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of tab stops in {@code tab_array}.
     */
    public int getSize() {
        try {
            var RESULT = (int) pango_tab_array_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_get_tab = Interop.downcallHandle(
        "pango_tab_array_get_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the alignment and position of a tab stop.
     */
    public void getTab(int tabIndex, TabAlign alignment, PointerInteger location) {
        try {
            pango_tab_array_get_tab.invokeExact(handle(), tabIndex, new PointerInteger(alignment.getValue()).handle(), location.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_get_tabs = Interop.downcallHandle(
        "pango_tab_array_get_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * If non-{@code null}, {@code alignments} and {@code locations} are filled with allocated
     * arrays.
     * <p>
     * The arrays are of length {@link TabArray#getSize}.
     * You must free the returned array.
     */
    public void getTabs(TabAlign[] alignments, int[] locations) {
        try {
            pango_tab_array_get_tabs.invokeExact(handle(), Interop.allocateNativeArray(TabAlign.getValues(alignments)).handle(), Interop.allocateNativeArray(locations).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_resize = Interop.downcallHandle(
        "pango_tab_array_resize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Resizes a tab array.
     * <p>
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     */
    public void resize(int newSize) {
        try {
            pango_tab_array_resize.invokeExact(handle(), newSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_set_decimal_point = Interop.downcallHandle(
        "pango_tab_array_set_decimal_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the Unicode character to use as decimal point.
     * <p>
     * This is only relevant for tabs with {@link TabAlign#DECIMAL} alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * <p>
     * By default, Pango uses the decimal point according
     * to the current locale.
     */
    public void setDecimalPoint(int tabIndex, int decimalPoint) {
        try {
            pango_tab_array_set_decimal_point.invokeExact(handle(), tabIndex, decimalPoint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_set_positions_in_pixels = Interop.downcallHandle(
        "pango_tab_array_set_positions_in_pixels",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether positions in this array are specified in
     * pixels.
     */
    public void setPositionsInPixels(boolean positionsInPixels) {
        try {
            pango_tab_array_set_positions_in_pixels.invokeExact(handle(), positionsInPixels ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_set_tab = Interop.downcallHandle(
        "pango_tab_array_set_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the alignment and location of a tab stop.
     */
    public void setTab(int tabIndex, TabAlign alignment, int location) {
        try {
            pango_tab_array_set_tab.invokeExact(handle(), tabIndex, alignment.getValue(), location);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_sort = Interop.downcallHandle(
        "pango_tab_array_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Utility function to ensure that the tab stops are in increasing order.
     */
    public void sort() {
        try {
            pango_tab_array_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_to_string = Interop.downcallHandle(
        "pango_tab_array_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serializes a {@code PangoTabArray} to a string.
     * <p>
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * <p>
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) pango_tab_array_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_from_string = Interop.downcallHandle(
        "pango_tab_array_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     */
    public static TabArray fromString(java.lang.String text) {
        try {
            var RESULT = (MemoryAddress) pango_tab_array_from_string.invokeExact(Interop.allocateNativeString(text).handle());
            return new TabArray(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
