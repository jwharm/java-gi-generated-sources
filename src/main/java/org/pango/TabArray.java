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
public class TabArray extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoTabArray";
    
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
     * Allocate a new {@link TabArray}
     * @return A new, uninitialized @{link TabArray}
     */
    public static TabArray allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TabArray newInstance = new TabArray(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TabArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TabArray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TabArray> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TabArray(input, ownership);
    
    private static MemoryAddress constructNew(int initialSize, boolean positionsInPixels) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_new.invokeExact(
                    initialSize,
                    Marshal.booleanToInteger.marshal(positionsInPixels, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an array of {@code initial_size} tab stops.
     * <p>
     * Tab stops are specified in pixel units if {@code positions_in_pixels} is {@code true},
     * otherwise in Pango units. All stops are initially at position 0.
     * @param initialSize Initial number of tab stops to allocate, can be 0
     * @param positionsInPixels whether positions are in pixel units
     */
    public TabArray(int initialSize, boolean positionsInPixels) {
        super(constructNew(initialSize, positionsInPixels), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithPositions(int size, boolean positionsInPixels, org.pango.TabAlign firstAlignment, int firstPosition, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_new_with_positions.invokeExact(
                    size,
                    Marshal.booleanToInteger.marshal(positionsInPixels, null).intValue(),
                    firstAlignment.getValue(),
                    firstPosition,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code PangoTabArray} and allows you to specify the alignment
     * and position of each tab stop.
     * <p>
     * You <strong>must</strong> provide an alignment and position for {@code size} tab stops.
     * @param size number of tab stops in the array
     * @param positionsInPixels whether positions are in pixel units
     * @param firstAlignment alignment of first tab stop
     * @param firstPosition position of first tab stop
     * @param varargs additional alignment/position pairs
     * @return the newly allocated {@code PangoTabArray}, which should
     *   be freed with {@link TabArray#free}.
     */
    public static TabArray newWithPositions(int size, boolean positionsInPixels, org.pango.TabAlign firstAlignment, int firstPosition, java.lang.Object... varargs) {
        var RESULT = constructNewWithPositions(size, positionsInPixels, firstAlignment, firstPosition, varargs);
        return org.pango.TabArray.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Copies a {@code PangoTabArray}.
     * @return the newly allocated {@code PangoTabArray}, which should
     *   be freed with {@link TabArray#free}.
     */
    public org.pango.TabArray copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.TabArray.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a tab array and associated resources.
     */
    public void free() {
        try {
            DowncallHandles.pango_tab_array_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the Unicode character to use as decimal point.
     * <p>
     * This is only relevant for tabs with {@link TabAlign#DECIMAL} alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * <p>
     * The default value of 0 means that Pango will use the
     * decimal point according to the current locale.
     * @param tabIndex the index of a tab stop
     */
    public int getDecimalPoint(int tabIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_tab_array_get_decimal_point.invokeExact(
                    handle(),
                    tabIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the tab positions are in pixels,
     * {@code false} if they are in Pango units.
     * @return whether positions are in pixels.
     */
    public boolean getPositionsInPixels() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_tab_array_get_positions_in_pixels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the number of tab stops in {@code tab_array}.
     * @return the number of tab stops in the array.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_tab_array_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the alignment and position of a tab stop.
     * @param tabIndex tab stop index
     * @param alignment location to store alignment
     * @param location location to store tab position
     */
    public void getTab(int tabIndex, @Nullable Out<org.pango.TabAlign> alignment, Out<Integer> location) {
        MemorySegment alignmentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment locationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_tab_array_get_tab.invokeExact(
                    handle(),
                    tabIndex,
                    (Addressable) (alignment == null ? MemoryAddress.NULL : (Addressable) alignmentPOINTER.address()),
                    (Addressable) (location == null ? MemoryAddress.NULL : (Addressable) locationPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (alignment != null) alignment.set(org.pango.TabAlign.of(alignmentPOINTER.get(Interop.valueLayout.C_INT, 0)));
        if (location != null) location.set(locationPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * If non-{@code null}, {@code alignments} and {@code locations} are filled with allocated
     * arrays.
     * <p>
     * The arrays are of length {@link TabArray#getSize}.
     * You must free the returned array.
     * @param alignments location to store an array of tab
     *   stop alignments
     * @param locations location to store an array
     *   of tab positions
     */
    public void getTabs(@Nullable Out<org.pango.TabAlign> alignments, int[] locations) {
        MemorySegment alignmentsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_tab_array_get_tabs.invokeExact(
                    handle(),
                    (Addressable) (alignments == null ? MemoryAddress.NULL : (Addressable) alignmentsPOINTER.address()),
                    (Addressable) (locations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(locations, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (alignments != null) alignments.set(org.pango.TabAlign.of(alignmentsPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Resizes a tab array.
     * <p>
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     * @param newSize new size of the array
     */
    public void resize(int newSize) {
        try {
            DowncallHandles.pango_tab_array_resize.invokeExact(
                    handle(),
                    newSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the Unicode character to use as decimal point.
     * <p>
     * This is only relevant for tabs with {@link TabAlign#DECIMAL} alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * <p>
     * By default, Pango uses the decimal point according
     * to the current locale.
     * @param tabIndex the index of a tab stop
     * @param decimalPoint the decimal point to use
     */
    public void setDecimalPoint(int tabIndex, int decimalPoint) {
        try {
            DowncallHandles.pango_tab_array_set_decimal_point.invokeExact(
                    handle(),
                    tabIndex,
                    decimalPoint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether positions in this array are specified in
     * pixels.
     * @param positionsInPixels whether positions are in pixels
     */
    public void setPositionsInPixels(boolean positionsInPixels) {
        try {
            DowncallHandles.pango_tab_array_set_positions_in_pixels.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(positionsInPixels, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alignment and location of a tab stop.
     * @param tabIndex the index of a tab stop
     * @param alignment tab alignment
     * @param location tab location in Pango units
     */
    public void setTab(int tabIndex, org.pango.TabAlign alignment, int location) {
        try {
            DowncallHandles.pango_tab_array_set_tab.invokeExact(
                    handle(),
                    tabIndex,
                    alignment.getValue(),
                    location);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Utility function to ensure that the tab stops are in increasing order.
     */
    public void sort() {
        try {
            DowncallHandles.pango_tab_array_sort.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serializes a {@code PangoTabArray} to a string.
     * <p>
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * <p>
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     * @return a newly allocated string
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     * @param text a string
     * @return a new {@code PangoTabArray}
     */
    public static @Nullable org.pango.TabArray fromString(java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(text, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.TabArray.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_tab_array_new = Interop.downcallHandle(
            "pango_tab_array_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_new_with_positions = Interop.downcallHandle(
            "pango_tab_array_new_with_positions",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle pango_tab_array_copy = Interop.downcallHandle(
            "pango_tab_array_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_free = Interop.downcallHandle(
            "pango_tab_array_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_get_decimal_point = Interop.downcallHandle(
            "pango_tab_array_get_decimal_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_get_positions_in_pixels = Interop.downcallHandle(
            "pango_tab_array_get_positions_in_pixels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_get_size = Interop.downcallHandle(
            "pango_tab_array_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_get_tab = Interop.downcallHandle(
            "pango_tab_array_get_tab",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_get_tabs = Interop.downcallHandle(
            "pango_tab_array_get_tabs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_resize = Interop.downcallHandle(
            "pango_tab_array_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_set_decimal_point = Interop.downcallHandle(
            "pango_tab_array_set_decimal_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_set_positions_in_pixels = Interop.downcallHandle(
            "pango_tab_array_set_positions_in_pixels",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_set_tab = Interop.downcallHandle(
            "pango_tab_array_set_tab",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_tab_array_sort = Interop.downcallHandle(
            "pango_tab_array_sort",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_to_string = Interop.downcallHandle(
            "pango_tab_array_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_from_string = Interop.downcallHandle(
            "pango_tab_array_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
