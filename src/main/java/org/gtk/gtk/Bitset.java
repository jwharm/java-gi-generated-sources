package org.gtk.gtk;

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
    
    static final MethodHandle gtk_bitset_new_empty = Interop.downcallHandle(
        "gtk_bitset_new_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewEmpty() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_bitset_new_empty.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty bitset.
     */
    public static Bitset newEmpty() {
        return new Bitset(constructNewEmpty());
    }
    
    static final MethodHandle gtk_bitset_new_range = Interop.downcallHandle(
        "gtk_bitset_new_range",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewRange(int start, int nItems) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_bitset_new_range.invokeExact(start, nItems), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a bitset with the given range set.
     */
    public static Bitset newRange(int start, int nItems) {
        return new Bitset(constructNewRange(start, nItems));
    }
    
    static final MethodHandle gtk_bitset_add = Interop.downcallHandle(
        "gtk_bitset_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code value} to {@code self} if it wasn't part of it before.
     */
    public boolean add(int value) {
        try {
            var RESULT = (int) gtk_bitset_add.invokeExact(handle(), value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_add_range = Interop.downcallHandle(
        "gtk_bitset_add_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds all values from {@code start} (inclusive) to {@code start} + {@code n_items}
     * (exclusive) in {@code self}.
     */
    public void addRange(int start, int nItems) {
        try {
            gtk_bitset_add_range.invokeExact(handle(), start, nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_add_range_closed = Interop.downcallHandle(
        "gtk_bitset_add_range_closed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     */
    public void addRangeClosed(int first, int last) {
        try {
            gtk_bitset_add_range_closed.invokeExact(handle(), first, last);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_add_rectangle = Interop.downcallHandle(
        "gtk_bitset_add_rectangle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, adds a rectangle with the given {@code width} and {@code height}.
     */
    public void addRectangle(int start, int width, int height, int stride) {
        try {
            gtk_bitset_add_rectangle.invokeExact(handle(), start, width, height, stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_contains = Interop.downcallHandle(
        "gtk_bitset_contains",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if the given {@code value} has been added to {@code self}
     */
    public boolean contains(int value) {
        try {
            var RESULT = (int) gtk_bitset_contains.invokeExact(handle(), value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_copy = Interop.downcallHandle(
        "gtk_bitset_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a copy of {@code self}.
     */
    public Bitset copy() {
        try {
            var RESULT = (MemoryAddress) gtk_bitset_copy.invokeExact(handle());
            return new Bitset(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_difference = Interop.downcallHandle(
        "gtk_bitset_difference",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_bitset_difference.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_equals = Interop.downcallHandle(
        "gtk_bitset_equals",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code self} and {@code other} contain the same values.
     */
    public boolean equals(Bitset other) {
        try {
            var RESULT = (int) gtk_bitset_equals.invokeExact(handle(), other.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_get_maximum = Interop.downcallHandle(
        "gtk_bitset_get_maximum",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the largest value in {@code self}.
     * <p>
     * If {@code self} is empty, 0 is returned.
     */
    public int getMaximum() {
        try {
            var RESULT = (int) gtk_bitset_get_maximum.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_get_minimum = Interop.downcallHandle(
        "gtk_bitset_get_minimum",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the smallest value in {@code self}.
     * <p>
     * If {@code self} is empty, {@code G_MAXUINT} is returned.
     */
    public int getMinimum() {
        try {
            var RESULT = (int) gtk_bitset_get_minimum.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_get_nth = Interop.downcallHandle(
        "gtk_bitset_get_nth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the value of the {@code nth} item in self.
     * <p>
     * If {@code nth} is >= the size of {@code self}, 0 is returned.
     */
    public int getNth(int nth) {
        try {
            var RESULT = (int) gtk_bitset_get_nth.invokeExact(handle(), nth);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_get_size = Interop.downcallHandle(
        "gtk_bitset_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (long) gtk_bitset_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_get_size_in_range = Interop.downcallHandle(
        "gtk_bitset_get_size_in_range",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the number of values that are part of the set from {@code first} to {@code last}
     * (inclusive).
     * <p>
     * Note that this function returns a {@code guint64}, because when all values are
     * set, the return value is {@code G_MAXUINT + 1}. Unless you are sure this cannot
     * happen (it can't with {@code GListModel}), be sure to use a 64bit type.
     */
    public long getSizeInRange(int first, int last) {
        try {
            var RESULT = (long) gtk_bitset_get_size_in_range.invokeExact(handle(), first, last);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_intersect = Interop.downcallHandle(
        "gtk_bitset_intersect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code self} to be the intersection of {@code self} and {@code other}.
     * <p>
     * In other words, remove all values from {@code self} that are not part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
     * happen in that case.
     */
    public void intersect(Bitset other) {
        try {
            gtk_bitset_intersect.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_is_empty = Interop.downcallHandle(
        "gtk_bitset_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if no value is contained in bitset.
     */
    public boolean isEmpty() {
        try {
            var RESULT = (int) gtk_bitset_is_empty.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_ref = Interop.downcallHandle(
        "gtk_bitset_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code GtkBitset}.
     */
    public Bitset ref() {
        try {
            var RESULT = (MemoryAddress) gtk_bitset_ref.invokeExact(handle());
            return new Bitset(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_remove = Interop.downcallHandle(
        "gtk_bitset_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes {@code value} from {@code self} if it was part of it before.
     */
    public boolean remove(int value) {
        try {
            var RESULT = (int) gtk_bitset_remove.invokeExact(handle(), value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_remove_all = Interop.downcallHandle(
        "gtk_bitset_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all values from the bitset so that it is empty again.
     */
    public void removeAll() {
        try {
            gtk_bitset_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_remove_range = Interop.downcallHandle(
        "gtk_bitset_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes all values from {@code start} (inclusive) to {@code start} + {@code n_items} (exclusive)
     * in {@code self}.
     */
    public void removeRange(int start, int nItems) {
        try {
            gtk_bitset_remove_range.invokeExact(handle(), start, nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_remove_range_closed = Interop.downcallHandle(
        "gtk_bitset_remove_range_closed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     */
    public void removeRangeClosed(int first, int last) {
        try {
            gtk_bitset_remove_range_closed.invokeExact(handle(), first, last);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_remove_rectangle = Interop.downcallHandle(
        "gtk_bitset_remove_rectangle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, removes a rectangle with the given {@code width} and {@code height}.
     */
    public void removeRectangle(int start, int width, int height, int stride) {
        try {
            gtk_bitset_remove_rectangle.invokeExact(handle(), start, width, height, stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_shift_left = Interop.downcallHandle(
        "gtk_bitset_shift_left",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Shifts all values in {@code self} to the left by {@code amount}.
     * <p>
     * Values smaller than {@code amount} are discarded.
     */
    public void shiftLeft(int amount) {
        try {
            gtk_bitset_shift_left.invokeExact(handle(), amount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_shift_right = Interop.downcallHandle(
        "gtk_bitset_shift_right",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Shifts all values in {@code self} to the right by {@code amount}.
     * <p>
     * Values that end up too large to be held in a {@code guint} are discarded.
     */
    public void shiftRight(int amount) {
        try {
            gtk_bitset_shift_right.invokeExact(handle(), amount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_splice = Interop.downcallHandle(
        "gtk_bitset_splice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_bitset_splice.invokeExact(handle(), position, removed, added);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_subtract = Interop.downcallHandle(
        "gtk_bitset_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code self} to be the subtraction of {@code other} from {@code self}.
     * <p>
     * In other words, remove all values from {@code self} that are part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. The bitset
     * will be emptied in that case.
     */
    public void subtract(Bitset other) {
        try {
            gtk_bitset_subtract.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_union = Interop.downcallHandle(
        "gtk_bitset_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code self} to be the union of {@code self} and {@code other}.
     * <p>
     * That is, add all values from {@code other} into {@code self} that weren't part of it.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
     * happen in that case.
     */
    public void union(Bitset other) {
        try {
            gtk_bitset_union.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bitset_unref = Interop.downcallHandle(
        "gtk_bitset_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code GtkBitset}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        try {
            gtk_bitset_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
