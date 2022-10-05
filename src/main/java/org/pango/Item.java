package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoItem} structure stores information about a segment of text.
 * <p>
 * You typically obtain {@code PangoItems} by itemizing a piece of text
 * with {@link itemize#null}.
 */
public class Item extends io.github.jwharm.javagi.ResourceBase {

    public Item(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_item_new = Interop.downcallHandle(
        "pango_item_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_item_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code PangoItem} structure initialized to default values.
     */
    public Item() {
        super(constructNew());
    }
    
    static final MethodHandle pango_item_apply_attrs = Interop.downcallHandle(
        "pango_item_apply_attrs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add attributes to a {@code PangoItem}.
     * <p>
     * The idea is that you have attributes that don't affect itemization,
     * such as font features, so you filter them out using
     * {@link AttrList#filter}, itemize your text, then reapply the
     * attributes to the resulting items using this function.
     * <p>
     * The {@code iter} should be positioned before the range of the item,
     * and will be advanced past it. This function is meant to be called
     * in a loop over the items resulting from itemization, while passing
     * the iter to each call.
     */
    public void applyAttrs(AttrIterator iter) {
        try {
            pango_item_apply_attrs.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_item_copy = Interop.downcallHandle(
        "pango_item_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy an existing {@code PangoItem} structure.
     */
    public Item copy() {
        try {
            var RESULT = (MemoryAddress) pango_item_copy.invokeExact(handle());
            return new Item(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_item_free = Interop.downcallHandle(
        "pango_item_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free a {@code PangoItem} and all associated memory.
     */
    public void free() {
        try {
            pango_item_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_item_split = Interop.downcallHandle(
        "pango_item_split",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Modifies {@code orig} to cover only the text after {@code split_index}, and
     * returns a new item that covers the text before {@code split_index} that
     * used to be in {@code orig}.
     * <p>
     * You can think of {@code split_index} as the length of the returned item.
     * {@code split_index} may not be 0, and it may not be greater than or equal
     * to the length of {@code orig} (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     * {@code split_offset} is the length of the first item in chars, and must be
     * provided because the text used to generate the item isn't available,
     * so {@code pango_item_split()} can't count the char length of the split items
     * itself.
     */
    public Item split(int splitIndex, int splitOffset) {
        try {
            var RESULT = (MemoryAddress) pango_item_split.invokeExact(handle(), splitIndex, splitOffset);
            return new Item(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
