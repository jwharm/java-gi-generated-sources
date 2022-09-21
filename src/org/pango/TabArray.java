package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoTabArray} contains an array of tab stops.
 * <p>
 * {@code PangoTabArray} can be used to set tab stops in a {@code PangoLayout}.
 * Each tab stop has an alignment, a position, and optionally
 * a character to use as decimal point.
 */
public class TabArray extends io.github.jwharm.javagi.ResourceBase {

    public TabArray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(int initialSize, boolean positionsInPixels) {
        Reference RESULT = References.get(gtk_h.pango_tab_array_new(initialSize, positionsInPixels ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates an array of {@code initial_size} tab stops.
     * <p>
     * Tab stops are specified in pixel units if {@code positions_in_pixels} is <code>true</code>,
     * otherwise in Pango units. All stops are initially at position 0.
     */
    public TabArray(int initialSize, boolean positionsInPixels) {
        super(constructNew(initialSize, positionsInPixels));
    }
    
    /**
     * Copies a {@code PangoTabArray}.
     */
    public TabArray copy() {
        var RESULT = gtk_h.pango_tab_array_copy(handle());
        return new TabArray(References.get(RESULT, true));
    }
    
    /**
     * Frees a tab array and associated resources.
     */
    public void free() {
        gtk_h.pango_tab_array_free(handle());
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
     */
    public int getDecimalPoint(int tabIndex) {
        var RESULT = gtk_h.pango_tab_array_get_decimal_point(handle(), tabIndex);
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if the tab positions are in pixels,
     * <code>false</code> if they are in Pango units.
     */
    public boolean getPositionsInPixels() {
        var RESULT = gtk_h.pango_tab_array_get_positions_in_pixels(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of tab stops in {@code tab_array}.
     */
    public int getSize() {
        var RESULT = gtk_h.pango_tab_array_get_size(handle());
        return RESULT;
    }
    
    /**
     * Resizes a tab array.
     * <p>
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     */
    public void resize(int newSize) {
        gtk_h.pango_tab_array_resize(handle(), newSize);
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
     */
    public void setDecimalPoint(int tabIndex, int decimalPoint) {
        gtk_h.pango_tab_array_set_decimal_point(handle(), tabIndex, decimalPoint);
    }
    
    /**
     * Sets whether positions in this array are specified in
     * pixels.
     */
    public void setPositionsInPixels(boolean positionsInPixels) {
        gtk_h.pango_tab_array_set_positions_in_pixels(handle(), positionsInPixels ? 1 : 0);
    }
    
    /**
     * Sets the alignment and location of a tab stop.
     */
    public void setTab(int tabIndex, TabAlign alignment, int location) {
        gtk_h.pango_tab_array_set_tab(handle(), tabIndex, alignment.getValue(), location);
    }
    
    /**
     * Utility function to ensure that the tab stops are in increasing order.
     */
    public void sort() {
        gtk_h.pango_tab_array_sort(handle());
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
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_tab_array_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     */
    public static TabArray fromString(java.lang.String text) {
        var RESULT = gtk_h.pango_tab_array_from_string(Interop.allocateNativeString(text).handle());
        return new TabArray(References.get(RESULT, true));
    }
    
}
