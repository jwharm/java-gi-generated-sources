package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoTabArray` contains an array of tab stops.
 * 
 * `PangoTabArray` can be used to set tab stops in a `PangoLayout`.
 * Each tab stop has an alignment, a position, and optionally
 * a character to use as decimal point.
 */
public class TabArray extends io.github.jwharm.javagi.interop.ResourceBase {

    public TabArray(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates an array of @initial_size tab stops.
     * 
     * Tab stops are specified in pixel units if @positions_in_pixels is %TRUE,
     * otherwise in Pango units. All stops are initially at position 0.
     */
    public TabArray(int initialSize, boolean positionsInPixels) {
        super(References.get(gtk_h.pango_tab_array_new(initialSize, positionsInPixels ? 1 : 0), true));
    }
    
    /**
     * Copies a `PangoTabArray`.
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
     * 
     * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * 
     * The default value of 0 means that Pango will use the
     * decimal point according to the current locale.
     */
    public int getDecimalPoint(int tabIndex) {
        var RESULT = gtk_h.pango_tab_array_get_decimal_point(handle(), tabIndex);
        return RESULT;
    }
    
    /**
     * Returns %TRUE if the tab positions are in pixels,
     * %FALSE if they are in Pango units.
     */
    public boolean getPositionsInPixels() {
        var RESULT = gtk_h.pango_tab_array_get_positions_in_pixels(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of tab stops in @tab_array.
     */
    public int getSize() {
        var RESULT = gtk_h.pango_tab_array_get_size(handle());
        return RESULT;
    }
    
    /**
     * Resizes a tab array.
     * 
     * You must subsequently initialize any tabs
     * that were added as a result of growing the array.
     */
    public void resize(int newSize) {
        gtk_h.pango_tab_array_resize(handle(), newSize);
    }
    
    /**
     * Sets the Unicode character to use as decimal point.
     * 
     * This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * which align content at the first occurrence of the decimal point
     * character.
     * 
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
     * Serializes a `PangoTabArray` to a string.
     * 
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * 
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_tab_array_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Deserializes a `PangoTabArray` from a string.
     * 
     * This is the counterpart to [method@Pango.TabArray.to_string].
     * See that functions for details about the format.
     */
    public static TabArray fromString(java.lang.String text) {
        var RESULT = gtk_h.pango_tab_array_from_string(Interop.allocateNativeString(text).handle());
        return new TabArray(References.get(RESULT, true));
    }
    
}
