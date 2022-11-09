package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBitset";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Bitset allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Bitset newInstance = new Bitset(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Bitset proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Bitset(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewEmpty() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bitset_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty bitset.
     * @return A new empty bitset
     */
    public static Bitset newEmpty() {
        return new Bitset(constructNewEmpty(), Ownership.FULL);
    }
    
    private static Addressable constructNewRange(int start, int nItems) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bitset_new_range.invokeExact(
                    start,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a bitset with the given range set.
     * @param start first value to add
     * @param nItems number of consecutive values to add
     * @return A new bitset
     */
    public static Bitset newRange(int start, int nItems) {
        return new Bitset(constructNewRange(start, nItems), Ownership.FULL);
    }
    
    /**
     * Adds {@code value} to {@code self} if it wasn't part of it before.
     * @param value value to add
     * @return {@code true} if {@code value} was not part of {@code self} and {@code self}
     *   was changed
     */
    public boolean add(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_add.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Adds all values from {@code start} (inclusive) to {@code start} + {@code n_items}
     * (exclusive) in {@code self}.
     * @param start first value to add
     * @param nItems number of consecutive values to add
     */
    public void addRange(int start, int nItems) {
        try {
            DowncallHandles.gtk_bitset_add_range.invokeExact(
                    handle(),
                    start,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     * @param first first value to add
     * @param last last value to add
     */
    public void addRangeClosed(int first, int last) {
        try {
            DowncallHandles.gtk_bitset_add_range_closed.invokeExact(
                    handle(),
                    first,
                    last);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, adds a rectangle with the given {@code width} and {@code height}.
     * @param start first value to add
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
     */
    public void addRectangle(int start, int width, int height, int stride) {
        try {
            DowncallHandles.gtk_bitset_add_rectangle.invokeExact(
                    handle(),
                    start,
                    width,
                    height,
                    stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if the given {@code value} has been added to {@code self}
     * @param value the value to check
     * @return {@code true} if {@code self} contains {@code value}
     */
    public boolean contains(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_contains.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a copy of {@code self}.
     * @return A new bitset that contains the same
     *   values as {@code self}
     */
    public @NotNull org.gtk.gtk.Bitset copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bitset_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Bitset(RESULT, Ownership.FULL);
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
     * @param other the {@code GtkBitset} to compute the difference from
     */
    public void difference(@NotNull org.gtk.gtk.Bitset other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.gtk_bitset_difference.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if {@code self} and {@code other} contain the same values.
     * @param other another {@code GtkBitset}
     * @return {@code true} if {@code self} and {@code other} contain the same values
     */
    public boolean equals(@NotNull org.gtk.gtk.Bitset other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_equals.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the largest value in {@code self}.
     * <p>
     * If {@code self} is empty, 0 is returned.
     * @return The largest value in {@code self}
     */
    public int getMaximum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_get_maximum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the smallest value in {@code self}.
     * <p>
     * If {@code self} is empty, {@code G_MAXUINT} is returned.
     * @return The smallest value in {@code self}
     */
    public int getMinimum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_get_minimum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of the {@code nth} item in self.
     * <p>
     * If {@code nth} is &gt;= the size of {@code self}, 0 is returned.
     * @param nth index of the item to get
     * @return the value of the {@code nth} item in {@code self}
     */
    public int getNth(int nth) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_get_nth.invokeExact(
                    handle(),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return The number of values in the set.
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_bitset_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of values that are part of the set from {@code first} to {@code last}
     * (inclusive).
     * <p>
     * Note that this function returns a {@code guint64}, because when all values are
     * set, the return value is {@code G_MAXUINT + 1}. Unless you are sure this cannot
     * happen (it can't with {@code GListModel}), be sure to use a 64bit type.
     * @param first the first element to include
     * @param last the last element to include
     * @return The number of values in the set from {@code first} to {@code last}.
     */
    public long getSizeInRange(int first, int last) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_bitset_get_size_in_range.invokeExact(
                    handle(),
                    first,
                    last);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets {@code self} to be the intersection of {@code self} and {@code other}.
     * <p>
     * In other words, remove all values from {@code self} that are not part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
     * happen in that case.
     * @param other the {@code GtkBitset} to intersect with
     */
    public void intersect(@NotNull org.gtk.gtk.Bitset other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.gtk_bitset_intersect.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if no value is contained in bitset.
     * @return {@code true} if {@code self} is empty
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Acquires a reference on the given {@code GtkBitset}.
     * @return the {@code GtkBitset} with an additional reference
     */
    public @NotNull org.gtk.gtk.Bitset ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bitset_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Bitset(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes {@code value} from {@code self} if it was part of it before.
     * @param value value to add
     * @return {@code true} if {@code value} was part of {@code self} and {@code self}
     *   was changed
     */
    public boolean remove(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_remove.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes all values from the bitset so that it is empty again.
     */
    public void removeAll() {
        try {
            DowncallHandles.gtk_bitset_remove_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all values from {@code start} (inclusive) to {@code start} + {@code n_items} (exclusive)
     * in {@code self}.
     * @param start first value to remove
     * @param nItems number of consecutive values to remove
     */
    public void removeRange(int start, int nItems) {
        try {
            DowncallHandles.gtk_bitset_remove_range.invokeExact(
                    handle(),
                    start,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the closed range {@code last}, so {@code first}, {@code last} and all
     * values in between. {@code first} must be smaller than {@code last}.
     * @param first first value to remove
     * @param last last value to remove
     */
    public void removeRangeClosed(int first, int last) {
        try {
            DowncallHandles.gtk_bitset_remove_range_closed.invokeExact(
                    handle(),
                    first,
                    last);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Interprets the values as a 2-dimensional boolean grid with the given {@code stride}
     * and inside that grid, removes a rectangle with the given {@code width} and {@code height}.
     * @param start first value to remove
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
     */
    public void removeRectangle(int start, int width, int height, int stride) {
        try {
            DowncallHandles.gtk_bitset_remove_rectangle.invokeExact(
                    handle(),
                    start,
                    width,
                    height,
                    stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shifts all values in {@code self} to the left by {@code amount}.
     * <p>
     * Values smaller than {@code amount} are discarded.
     * @param amount amount to shift all values to the left
     */
    public void shiftLeft(int amount) {
        try {
            DowncallHandles.gtk_bitset_shift_left.invokeExact(
                    handle(),
                    amount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shifts all values in {@code self} to the right by {@code amount}.
     * <p>
     * Values that end up too large to be held in a {@code guint} are discarded.
     * @param amount amount to shift all values to the right
     */
    public void shiftRight(int amount) {
        try {
            DowncallHandles.gtk_bitset_shift_right.invokeExact(
                    handle(),
                    amount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param position position at which to slice
     * @param removed number of values to remove
     * @param added number of values to add
     */
    public void splice(int position, int removed, int added) {
        try {
            DowncallHandles.gtk_bitset_splice.invokeExact(
                    handle(),
                    position,
                    removed,
                    added);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} to be the subtraction of {@code other} from {@code self}.
     * <p>
     * In other words, remove all values from {@code self} that are part of {@code other}.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. The bitset
     * will be emptied in that case.
     * @param other the {@code GtkBitset} to subtract
     */
    public void subtract(@NotNull org.gtk.gtk.Bitset other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.gtk_bitset_subtract.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} to be the union of {@code self} and {@code other}.
     * <p>
     * That is, add all values from {@code other} into {@code self} that weren't part of it.
     * <p>
     * It is allowed for {@code self} and {@code other} to be the same bitset. Nothing will
     * happen in that case.
     * @param other the {@code GtkBitset} to union with
     */
    public void union(@NotNull org.gtk.gtk.Bitset other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.gtk_bitset_union.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Releases a reference on the given {@code GtkBitset}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        try {
            DowncallHandles.gtk_bitset_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bitset_new_empty = Interop.downcallHandle(
            "gtk_bitset_new_empty",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_new_range = Interop.downcallHandle(
            "gtk_bitset_new_range",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_add = Interop.downcallHandle(
            "gtk_bitset_add",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_add_range = Interop.downcallHandle(
            "gtk_bitset_add_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_add_range_closed = Interop.downcallHandle(
            "gtk_bitset_add_range_closed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_add_rectangle = Interop.downcallHandle(
            "gtk_bitset_add_rectangle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_contains = Interop.downcallHandle(
            "gtk_bitset_contains",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_copy = Interop.downcallHandle(
            "gtk_bitset_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_difference = Interop.downcallHandle(
            "gtk_bitset_difference",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_equals = Interop.downcallHandle(
            "gtk_bitset_equals",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_get_maximum = Interop.downcallHandle(
            "gtk_bitset_get_maximum",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_get_minimum = Interop.downcallHandle(
            "gtk_bitset_get_minimum",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_get_nth = Interop.downcallHandle(
            "gtk_bitset_get_nth",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_get_size = Interop.downcallHandle(
            "gtk_bitset_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_get_size_in_range = Interop.downcallHandle(
            "gtk_bitset_get_size_in_range",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_intersect = Interop.downcallHandle(
            "gtk_bitset_intersect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_is_empty = Interop.downcallHandle(
            "gtk_bitset_is_empty",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_ref = Interop.downcallHandle(
            "gtk_bitset_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_remove = Interop.downcallHandle(
            "gtk_bitset_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_remove_all = Interop.downcallHandle(
            "gtk_bitset_remove_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_remove_range = Interop.downcallHandle(
            "gtk_bitset_remove_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_remove_range_closed = Interop.downcallHandle(
            "gtk_bitset_remove_range_closed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_remove_rectangle = Interop.downcallHandle(
            "gtk_bitset_remove_rectangle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_shift_left = Interop.downcallHandle(
            "gtk_bitset_shift_left",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_shift_right = Interop.downcallHandle(
            "gtk_bitset_shift_right",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_splice = Interop.downcallHandle(
            "gtk_bitset_splice",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_bitset_subtract = Interop.downcallHandle(
            "gtk_bitset_subtract",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_union = Interop.downcallHandle(
            "gtk_bitset_union",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_unref = Interop.downcallHandle(
            "gtk_bitset_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
