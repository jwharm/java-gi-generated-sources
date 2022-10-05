package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkTextMark} is a position in a {@code GtkTextbuffer} that is preserved
 * across modifications.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * A {@code GtkTextMark} is like a bookmark in a text buffer; it preserves
 * a position in the text. You can convert the mark to an iterator using
 * {@link TextBuffer#getIterAtMark}. Unlike iterators, marks remain
 * valid across buffer mutations, because their behavior is defined when
 * text is inserted or deleted. When text containing a mark is deleted,
 * the mark remains in the position originally occupied by the deleted
 * text. When text is inserted at a mark, a mark with “left gravity” will
 * be moved to the beginning of the newly-inserted text, and a mark with
 * “right gravity” will be moved to the end.
 * <p>
 * Note that “left” and “right” here refer to logical direction (left
 * is the toward the start of the buffer); in some languages such as
 * Hebrew the logically-leftmost text is not actually on the left when
 * displayed.
 * <p>
 * Marks are reference counted, but the reference count only controls
 * the validity of the memory; marks can be deleted from the buffer at
 * any time with {@link TextBuffer#deleteMark}. Once deleted from
 * the buffer, a mark is essentially useless.
 * <p>
 * Marks optionally have names; these can be convenient to avoid passing
 * the {@code GtkTextMark} object around.
 * <p>
 * Marks are typically created using the {@link TextBuffer#createMark}
 * function.
 */
public class TextMark extends org.gtk.gobject.Object {

    public TextMark(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextMark */
    public static TextMark castFrom(org.gtk.gobject.Object gobject) {
        return new TextMark(gobject.refcounted());
    }
    
    static final MethodHandle gtk_text_mark_new = Interop.downcallHandle(
        "gtk_text_mark_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String name, boolean leftGravity) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_mark_new.invokeExact(Interop.allocateNativeString(name).handle(), leftGravity ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a text mark.
     * <p>
     * Add it to a buffer using {@link TextBuffer#addMark}.
     * If {@code name} is {@code null}, the mark is anonymous; otherwise, the mark can be
     * retrieved by name using {@link TextBuffer#getMark}. If a mark
     * has left gravity, and text is inserted at the mark’s current location,
     * the mark will be moved to the left of the newly-inserted text. If the
     * mark has right gravity ({@code left_gravity} = {@code false}), the mark will end up
     * on the right of newly-inserted text. The standard left-to-right cursor
     * is a mark with right gravity (when you type, the cursor stays on the
     * right side of the text you’re typing).
     */
    public TextMark(java.lang.String name, boolean leftGravity) {
        super(constructNew(name, leftGravity));
    }
    
    static final MethodHandle gtk_text_mark_get_buffer = Interop.downcallHandle(
        "gtk_text_mark_get_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the buffer this mark is located inside.
     * <p>
     * Returns {@code null} if the mark is deleted.
     */
    public TextBuffer getBuffer() {
        try {
            var RESULT = (MemoryAddress) gtk_text_mark_get_buffer.invokeExact(handle());
            return new TextBuffer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_mark_get_deleted = Interop.downcallHandle(
        "gtk_text_mark_get_deleted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the mark has been removed from its buffer.
     * <p>
     * See {@link TextBuffer#addMark} for a way to add it
     * to a buffer again.
     */
    public boolean getDeleted() {
        try {
            var RESULT = (int) gtk_text_mark_get_deleted.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_mark_get_left_gravity = Interop.downcallHandle(
        "gtk_text_mark_get_left_gravity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether the mark has left gravity.
     */
    public boolean getLeftGravity() {
        try {
            var RESULT = (int) gtk_text_mark_get_left_gravity.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_mark_get_name = Interop.downcallHandle(
        "gtk_text_mark_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the mark name.
     * <p>
     * Returns {@code null} for anonymous marks.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_text_mark_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_mark_get_visible = Interop.downcallHandle(
        "gtk_text_mark_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the mark is visible.
     * <p>
     * A cursor is displayed for visible marks.
     */
    public boolean getVisible() {
        try {
            var RESULT = (int) gtk_text_mark_get_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_mark_set_visible = Interop.downcallHandle(
        "gtk_text_mark_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    public void setVisible(boolean setting) {
        try {
            gtk_text_mark_set_visible.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
