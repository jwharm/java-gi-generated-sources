package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkBitset} represents a set of unsigned integers.
 * <p>
 * Another name for this data structure is "bitmap".
 * <p>
 * The current implementation is based on <a href="https://roaringbitmap.org/">roaring bitmaps</a>.
 * <p>
 * A bitset allows adding a set of integers and provides support for set operations
 * like unions, intersections and checks for equality or if a value is contained
 * in the set. {@code GtkBitset} also contains various functions to query metadata about
 * the bitset, such as the minimum or maximum values or its size.
 * <p>
 * The fastest way to iterate values in a bitset is {@code Gtk.BitsetIter}.
 * <p>
 * The main use case for {@code GtkBitset} is implementing complex selections for
 * {@code Gtk.SelectionModel}.
 */
public class Bitset extends io.github.jwharm.javagi.ResourceBase {

    public Bitset(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNewEmpty() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_bitset_new_empty(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty bitset.
     */
    public static Bitset newEmpty() {
        return new Bitset(constructNewEmpty());
    }
    
    private static Refcounted constructNewRange(int start, int nItems) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_bitset_new_range(start, nItems), true);
        return RESULT;
    }
    
    /**
     * Creates a bitset with the given range set.
     */
    public static Bitset newRange(int start, int nItems) {
        return new Bitset(constructNewRange(start, nItems));
    }
    
    /**
     * Adds {@code value} to {@code self} if it wasn't part of it before.
     */
    public boolean add(int value) {
        var RESULT = gtk_h.gtk_bitset_add(handle(), value);
        return RESULT != 0;
    }
    
    /**
     * Adds all values from {@code start} (inclusive) to {@code start} + {@code n_items}
     * (exclusive) in {@code self}.
     */
    public void addRange(int start, int nItems) {
        gtk_h.gtk_bitset_add_range(handle(), start, nItems);
    }
    
    /**
     * Adds the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     */
    public void addRangeClosed(int first, int last) {
        gtk_h.gtk_bitset_add_range_closed(handle(), first, last);
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, adds a rectangle with the given {@code width} and {@code height}.
     */
    public void addRectangle(int start, int width, int height, int stride) {
        gtk_h.gtk_bitset_add_rectangle(handle(), start, width, height, stride);
    }
    
    /**
     * Checks if the given {@code value} has been added to {@code self}
     */
    public boolean contains(int value) {
        var RESULT = gtk_h.gtk_bitset_contains(handle(), value);
        return RESULT != 0;
    }
    
    /**
     * Creates a copy of {@code self}.
     */
    public Bitset copy() {
        var RESULT = gtk_h.gtk_bitset_copy(handle());
        return new Bitset(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets {@code self} to be the symmetric difference of {@code self} and {@code other}.
     * <p>
     * The symmetric difference is set {@code self} to contain all values that
     * were either contained in {@code self} or in {@code other}, but not in both.
     * This operation is also called an XOR.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. The bitset
     * will be emptied in that case.
     */
    public void difference(Bitset other) {
        gtk_h.gtk_bitset_difference(handle(), other.handle());
    }
    
    /**
     * Returns {@code true} if {@code self} and {@code other} contain the same values.
     */
    public boolean equals(Bitset other) {
        var RESULT = gtk_h.gtk_bitset_equals(handle(), other.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the largest value in {@code self}.
     * <p>
     * If {@code self} is empty, 0 is returned.
     */
    public int getMaximum() {
        var RESULT = gtk_h.gtk_bitset_get_maximum(handle());
        return RESULT;
    }
    
    /**
     * Returns the smallest value in {@code self}.
     * <p>
     * If {@code self} is empty, {@code G_MAXUINT} is returned.
     */
    public int getMinimum() {
        var RESULT = gtk_h.gtk_bitset_get_minimum(handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the {@code nth} item in self.
     * <p>
     * If {@code nth} is >= the size of {@code self}, 0 is returned.
     */
    public int getNth(int nth) {
        var RESULT = gtk_h.gtk_bitset_get_nth(handle(), nth);
        return RESULT;
    }
    
    /**
     * Gets the number of values that were added to the set.
     * <p>
     * For example, if the set is empty, 0 is returned.
     * <p>
     * Note that this function returns a {@code guint64}, because when all
     * values are set, the return value is {@code G_MAXUINT + 1}. Unless you
     * are sure this cannot happen (it can't with {@code GListModel}), be sure
     * to use a 64bit type.
     */
    public long getSize() {
        var RESULT = gtk_h.gtk_bitset_get_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of values that are part of the set from {@code first} to {@code last}
     * (inclusive).
     * <p>
     * Note that this function returns a {@code guint64}, because when all values are
     * set, the return value is {@code G_MAXUINT + 1}. Unless you are sure this cannot
     * happen (it can't with {@code GListModel}), be sure to use a 64bit type.
     */
    public long getSizeInRange(int first, int last) {
        var RESULT = gtk_h.gtk_bitset_get_size_in_range(handle(), first, last);
        return RESULT;
    }
    
    /**
     * Sets {@code self} to be the intersection of {@code self} and {@code other}.
     * <p>
     * In other words, remove all values from {@code self} that are not part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
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
        return RESULT != 0;
    }
    
    /**
     * Acquires a reference on the given {@code GtkBitset}.
     */
    public Bitset ref() {
        var RESULT = gtk_h.gtk_bitset_ref(handle());
        return new Bitset(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes {@code value} from {@code self} if it was part of it before.
     */
    public boolean remove(int value) {
        var RESULT = gtk_h.gtk_bitset_remove(handle(), value);
        return RESULT != 0;
    }
    
    /**
     * Removes all values from the bitset so that it is empty again.
     */
    public void removeAll() {
        gtk_h.gtk_bitset_remove_all(handle());
    }
    
    /**
     * Removes all values from {@code start} (inclusive) to {@code start} + {@code n_items} (exclusive)
     * in {@code self}.
     */
    public void removeRange(int start, int nItems) {
        gtk_h.gtk_bitset_remove_range(handle(), start, nItems);
    }
    
    /**
     * Removes the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     */
    public void removeRangeClosed(int first, int last) {
        gtk_h.gtk_bitset_remove_range_closed(handle(), first, last);
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, removes a rectangle with the given {@code width} and {@code height}.
     */
    public void removeRectangle(int start, int width, int height, int stride) {
        gtk_h.gtk_bitset_remove_rectangle(handle(), start, width, height, stride);
    }
    
    /**
     * Shifts all values in {@code self} to the left by {@code amount}.
     * <p>
     * Values smaller than {@code amount} are discarded.
     */
    public void shiftLeft(int amount) {
        gtk_h.gtk_bitset_shift_left(handle(), amount);
    }
    
    /**
     * Shifts all values in {@code self} to the right by {@code amount}.
     * <p>
     * Values that end up too large to be held in a {@code guint} are discarded.
     */
    public void shiftRight(int amount) {
        gtk_h.gtk_bitset_shift_right(handle(), amount);
    }
    
    /**
     * This is a support function for {@code GListModel} handling, by mirroring
     * the {@code GlistModel::items-changed} signal.
     * <p>
     * First, it "cuts" the values from {@code position} to {@code removed} from
     * the bitset. That is, it removes all those values and shifts
     * all larger values to the left by {@code removed} places.
     * <p>
     * Then, it "pastes" new room into the bitset by shifting all values
     * larger than {@code position} by {@code added} spaces to the right. This frees
     * up space that can then be filled.
     */
    public void splice(int position, int removed, int added) {
        gtk_h.gtk_bitset_splice(handle(), position, removed, added);
    }
    
    /**
     * Sets {@code self} to be the subtraction of {@code other} from {@code self}.
     * <p>
     * In other words, remove all values from {@code self} that are part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. The bitset
     * will be emptied in that case.
     */
    public void subtract(Bitset other) {
        gtk_h.gtk_bitset_subtract(handle(), other.handle());
    }
    
    /**
     * Sets {@code self} to be the union of {@code self} and {@code other}.
     * <p>
     * That is, add all values from {@code other} into {@code self} that weren't part of it.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
     * happen in that case.
     */
    public void union(Bitset other) {
        gtk_h.gtk_bitset_union(handle(), other.handle());
    }
    
    /**
     * Releases a reference on the given {@code GtkBitset}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        gtk_h.gtk_bitset_unref(handle());
    }
    
}
