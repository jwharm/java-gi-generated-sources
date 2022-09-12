package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkBitset` represents a set of unsigned integers.
 * 
 * Another name for this data structure is "bitmap".
 * 
 * The current implementation is based on [roaring bitmaps](https://roaringbitmap.org/).
 * 
 * A bitset allows adding a set of integers and provides support for set operations
 * like unions, intersections and checks for equality or if a value is contained
 * in the set. `GtkBitset` also contains various functions to query metadata about
 * the bitset, such as the minimum or maximum values or its size.
 * 
 * The fastest way to iterate values in a bitset is [struct@Gtk.BitsetIter].
 * 
 * The main use case for `GtkBitset` is implementing complex selections for
 * [iface@Gtk.SelectionModel].
 */
public class Bitset extends io.github.jwharm.javagi.ResourceBase {

    public Bitset(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewEmpty() {
        Reference RESULT = References.get(gtk_h.gtk_bitset_new_empty(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty bitset.
     */
    public static Bitset newEmpty() {
        return new Bitset(constructNewEmpty());
    }
    
    private static Reference constructNewRange(int start, int nItems) {
        Reference RESULT = References.get(gtk_h.gtk_bitset_new_range(start, nItems), true);
        return RESULT;
    }
    
    /**
     * Creates a bitset with the given range set.
     */
    public static Bitset newRange(int start, int nItems) {
        return new Bitset(constructNewRange(start, nItems));
    }
    
    /**
     * Adds @value to @self if it wasn't part of it before.
     */
    public boolean add(int value) {
        var RESULT = gtk_h.gtk_bitset_add(handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Adds all values from @start (inclusive) to @start + @n_items
     * (exclusive) in @self.
     */
    public void addRange(int start, int nItems) {
        gtk_h.gtk_bitset_add_range(handle(), start, nItems);
    }
    
    /**
     * Adds the closed range [@first, @last], so @first, @last and all
     * values in between. @first must be smaller than @last.
     */
    public void addRangeClosed(int first, int last) {
        gtk_h.gtk_bitset_add_range_closed(handle(), first, last);
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given @stride
     * and inside that grid, adds a rectangle with the given @width and @height.
     */
    public void addRectangle(int start, int width, int height, int stride) {
        gtk_h.gtk_bitset_add_rectangle(handle(), start, width, height, stride);
    }
    
    /**
     * Checks if the given @value has been added to @self
     */
    public boolean contains(int value) {
        var RESULT = gtk_h.gtk_bitset_contains(handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Creates a copy of @self.
     */
    public Bitset copy() {
        var RESULT = gtk_h.gtk_bitset_copy(handle());
        return new Bitset(References.get(RESULT, true));
    }
    
    /**
     * Sets @self to be the symmetric difference of @self and @other.
     * 
     * The symmetric difference is set @self to contain all values that
     * were either contained in @self or in @other, but not in both.
     * This operation is also called an XOR.
     * 
     * It is allowed for @self and @other to be the same bitset. The bitset
     * will be emptied in that case.
     */
    public void difference(Bitset other) {
        gtk_h.gtk_bitset_difference(handle(), other.handle());
    }
    
    /**
     * Returns %TRUE if @self and @other contain the same values.
     */
    public boolean equals(Bitset other) {
        var RESULT = gtk_h.gtk_bitset_equals(handle(), other.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the largest value in @self.
     * 
     * If @self is empty, 0 is returned.
     */
    public int getMaximum() {
        var RESULT = gtk_h.gtk_bitset_get_maximum(handle());
        return RESULT;
    }
    
    /**
     * Returns the smallest value in @self.
     * 
     * If @self is empty, `G_MAXUINT` is returned.
     */
    public int getMinimum() {
        var RESULT = gtk_h.gtk_bitset_get_minimum(handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the @nth item in self.
     * 
     * If @nth is >= the size of @self, 0 is returned.
     */
    public int getNth(int nth) {
        var RESULT = gtk_h.gtk_bitset_get_nth(handle(), nth);
        return RESULT;
    }
    
    /**
     * Gets the number of values that were added to the set.
     * 
     * For example, if the set is empty, 0 is returned.
     * 
     * Note that this function returns a `guint64`, because when all
     * values are set, the return value is `G_MAXUINT + 1`. Unless you
     * are sure this cannot happen (it can't with `GListModel`), be sure
     * to use a 64bit type.
     */
    public long getSize() {
        var RESULT = gtk_h.gtk_bitset_get_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of values that are part of the set from @first to @last
     * (inclusive).
     * 
     * Note that this function returns a `guint64`, because when all values are
     * set, the return value is `G_MAXUINT + 1`. Unless you are sure this cannot
     * happen (it can't with `GListModel`), be sure to use a 64bit type.
     */
    public long getSizeInRange(int first, int last) {
        var RESULT = gtk_h.gtk_bitset_get_size_in_range(handle(), first, last);
        return RESULT;
    }
    
    /**
     * Sets @self to be the intersection of @self and @other.
     * 
     * In other words, remove all values from @self that are not part of @other.
     * 
     * It is allowed for @self and @other to be the same bitset. Nothing will
     * happen in that case.
     */
    public void intersect(Bitset other) {
        gtk_h.gtk_bitset_intersect(handle(), other.handle());
    }
    
    /**
     * Check if no value is contained in bitset.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.gtk_bitset_is_empty(handle());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given `GtkBitset`.
     */
    public Bitset ref() {
        var RESULT = gtk_h.gtk_bitset_ref(handle());
        return new Bitset(References.get(RESULT, false));
    }
    
    /**
     * Removes @value from @self if it was part of it before.
     */
    public boolean remove(int value) {
        var RESULT = gtk_h.gtk_bitset_remove(handle(), value);
        return (RESULT != 0);
    }
    
    /**
     * Removes all values from the bitset so that it is empty again.
     */
    public void removeAll() {
        gtk_h.gtk_bitset_remove_all(handle());
    }
    
    /**
     * Removes all values from @start (inclusive) to @start + @n_items (exclusive)
     * in @self.
     */
    public void removeRange(int start, int nItems) {
        gtk_h.gtk_bitset_remove_range(handle(), start, nItems);
    }
    
    /**
     * Removes the closed range [@first, @last], so @first, @last and all
     * values in between. @first must be smaller than @last.
     */
    public void removeRangeClosed(int first, int last) {
        gtk_h.gtk_bitset_remove_range_closed(handle(), first, last);
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given @stride
     * and inside that grid, removes a rectangle with the given @width and @height.
     */
    public void removeRectangle(int start, int width, int height, int stride) {
        gtk_h.gtk_bitset_remove_rectangle(handle(), start, width, height, stride);
    }
    
    /**
     * Shifts all values in @self to the left by @amount.
     * 
     * Values smaller than @amount are discarded.
     */
    public void shiftLeft(int amount) {
        gtk_h.gtk_bitset_shift_left(handle(), amount);
    }
    
    /**
     * Shifts all values in @self to the right by @amount.
     * 
     * Values that end up too large to be held in a #guint are discarded.
     */
    public void shiftRight(int amount) {
        gtk_h.gtk_bitset_shift_right(handle(), amount);
    }
    
    /**
     * This is a support function for `GListModel` handling, by mirroring
     * the `GlistModel::items-changed` signal.
     * 
     * First, it "cuts" the values from @position to @removed from
     * the bitset. That is, it removes all those values and shifts
     * all larger values to the left by @removed places.
     * 
     * Then, it "pastes" new room into the bitset by shifting all values
     * larger than @position by @added spaces to the right. This frees
     * up space that can then be filled.
     */
    public void splice(int position, int removed, int added) {
        gtk_h.gtk_bitset_splice(handle(), position, removed, added);
    }
    
    /**
     * Sets @self to be the subtraction of @other from @self.
     * 
     * In other words, remove all values from @self that are part of @other.
     * 
     * It is allowed for @self and @other to be the same bitset. The bitset
     * will be emptied in that case.
     */
    public void subtract(Bitset other) {
        gtk_h.gtk_bitset_subtract(handle(), other.handle());
    }
    
    /**
     * Sets @self to be the union of @self and @other.
     * 
     * That is, add all values from @other into @self that weren't part of it.
     * 
     * It is allowed for @self and @other to be the same bitset. Nothing will
     * happen in that case.
     */
    public void union(Bitset other) {
        gtk_h.gtk_bitset_union(handle(), other.handle());
    }
    
    /**
     * Releases a reference on the given `GtkBitset`.
     * 
     * If the reference was the last, the resources associated to the @self are
     * freed.
     */
    public void unref() {
        gtk_h.gtk_bitset_unref(handle());
    }
    
}
