package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkTextChildAnchor} is a spot in a {@code GtkTextBuffer} where child widgets can
 * be “anchored”.
 * <p>
 * The anchor can have multiple widgets anchored, to allow for multiple views.
 */
public class TextChildAnchor extends org.gtk.gobject.Object {

    public TextChildAnchor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextChildAnchor */
    public static TextChildAnchor castFrom(org.gtk.gobject.Object gobject) {
        return new TextChildAnchor(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_text_child_anchor_new = Interop.downcallHandle(
        "gtk_text_child_anchor_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_child_anchor_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTextChildAnchor}.
     * <p>
     * Usually you would then insert it into a {@code GtkTextBuffer} with
     * {@link TextBuffer#insertChildAnchor}. To perform the
     * creation and insertion in one step, use the convenience
     * function {@link TextBuffer#createChildAnchor}.
     */
    public TextChildAnchor() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_text_child_anchor_new_with_replacement = Interop.downcallHandle(
        "gtk_text_child_anchor_new_with_replacement",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithReplacement(@NotNull java.lang.String character) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_child_anchor_new_with_replacement.invokeExact(Interop.allocateNativeString(character)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTextChildAnchor} with the given replacement character.
     * <p>
     * Usually you would then insert it into a {@code GtkTextBuffer} with
     * {@link TextBuffer#insertChildAnchor}.
     */
    public static TextChildAnchor newWithReplacement(@NotNull java.lang.String character) {
        return new TextChildAnchor(constructNewWithReplacement(character));
    }
    
    private static final MethodHandle gtk_text_child_anchor_get_deleted = Interop.downcallHandle(
        "gtk_text_child_anchor_get_deleted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether a child anchor has been deleted from
     * the buffer.
     * <p>
     * Keep in mind that the child anchor will be unreferenced
     * when removed from the buffer, so you need to hold your own
     * reference (with g_object_ref()) if you plan to use this
     * function — otherwise all deleted child anchors will also
     * be finalized.
     */
    public boolean getDeleted() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_child_anchor_get_deleted.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_child_anchor_get_widgets = Interop.downcallHandle(
        "gtk_text_child_anchor_get_widgets",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all widgets anchored at this child anchor.
     * <p>
     * The order in which the widgets are returned is not defined.
     */
    public Widget[] getWidgets(@NotNull Out<Integer> outLen) {
        MemorySegment outLenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_child_anchor_get_widgets.invokeExact(handle(), (Addressable) outLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outLen.set(outLenPOINTER.get(ValueLayout.JAVA_INT, 0));
        Widget[] resultARRAY = new Widget[outLen.get().intValue()];
        for (int I = 0; I < outLen.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new Widget(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
}
