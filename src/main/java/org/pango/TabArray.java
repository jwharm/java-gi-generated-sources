package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle pango_tab_array_new = Interop.downcallHandle(
        "pango_tab_array_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull int initialSize, @NotNull boolean positionsInPixels) {
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
    public TabArray(@NotNull int initialSize, @NotNull boolean positionsInPixels) {
        super(constructNew(initialSize, positionsInPixels));
    }
    
    private static final MethodHandle pango_tab_array_copy = Interop.downcallHandle(
        "pango_tab_array_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code PangoTabArray}.
     */
    public @NotNull TabArray copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_tab_array_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TabArray(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_tab_array_free = Interop.downcallHandle(
        "pango_tab_array_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a tab array and associated resources.
     */
    public @NotNull void free() {
        try {
            pango_tab_array_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_get_decimal_point = Interop.downcallHandle(
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
    public int getDecimalPoint(@NotNull int tabIndex) {
        int RESULT;
        try {
            RESULT = (int) pango_tab_array_get_decimal_point.invokeExact(handle(), tabIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_tab_array_get_positions_in_pixels = Interop.downcallHandle(
        "pango_tab_array_get_positions_in_pixels",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the tab positions are in pixels,
     * {@code false} if they are in Pango units.
     */
    public boolean getPositionsInPixels() {
        int RESULT;
        try {
            RESULT = (int) pango_tab_array_get_positions_in_pixels.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_tab_array_get_size = Interop.downcallHandle(
        "pango_tab_array_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of tab stops in {@code tab_array}.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) pango_tab_array_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_tab_array_get_tab = Interop.downcallHandle(
        "pango_tab_array_get_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the alignment and position of a tab stop.
     */
    public @NotNull void getTab(@NotNull int tabIndex, @NotNull Out<TabAlign> alignment, @NotNull Out<Integer> location) {
        MemorySegment alignmentPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment locationPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_tab_array_get_tab.invokeExact(handle(), tabIndex, (Addressable) alignmentPOINTER.address(), (Addressable) locationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        alignment.set(new TabAlign(alignmentPOINTER.get(ValueLayout.JAVA_INT, 0)));
        location.set(locationPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle pango_tab_array_resize = Interop.downcallHandle(
        "pango_tab_array_resize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Resizes a tab array.
     * <p>
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     */
    public @NotNull void resize(@NotNull int newSize) {
        try {
            pango_tab_array_resize.invokeExact(handle(), newSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_set_decimal_point = Interop.downcallHandle(
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
    public @NotNull void setDecimalPoint(@NotNull int tabIndex, @NotNull int decimalPoint) {
        try {
            pango_tab_array_set_decimal_point.invokeExact(handle(), tabIndex, decimalPoint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_set_positions_in_pixels = Interop.downcallHandle(
        "pango_tab_array_set_positions_in_pixels",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether positions in this array are specified in
     * pixels.
     */
    public @NotNull void setPositionsInPixels(@NotNull boolean positionsInPixels) {
        try {
            pango_tab_array_set_positions_in_pixels.invokeExact(handle(), positionsInPixels ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_set_tab = Interop.downcallHandle(
        "pango_tab_array_set_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the alignment and location of a tab stop.
     */
    public @NotNull void setTab(@NotNull int tabIndex, @NotNull TabAlign alignment, @NotNull int location) {
        try {
            pango_tab_array_set_tab.invokeExact(handle(), tabIndex, alignment.getValue(), location);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_sort = Interop.downcallHandle(
        "pango_tab_array_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Utility function to ensure that the tab stops are in increasing order.
     */
    public @NotNull void sort() {
        try {
            pango_tab_array_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_tab_array_to_string = Interop.downcallHandle(
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
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_tab_array_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_tab_array_from_string = Interop.downcallHandle(
        "pango_tab_array_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     */
    public static @Nullable TabArray fromString(@NotNull java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_tab_array_from_string.invokeExact(Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TabArray(Refcounted.get(RESULT, true));
    }
    
}
