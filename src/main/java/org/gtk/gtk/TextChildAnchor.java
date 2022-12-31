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
public class TextChildAnchor extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextChildAnchor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("segment")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TextChildAnchor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TextChildAnchor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextChildAnchor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TextChildAnchor(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_child_anchor_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithReplacement(java.lang.String character) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_child_anchor_new_with_replacement.invokeExact(
                    Marshal.stringToAddress.marshal(character, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTextChildAnchor} with the given replacement character.
     * <p>
     * Usually you would then insert it into a {@code GtkTextBuffer} with
     * {@link TextBuffer#insertChildAnchor}.
     * @return a new {@code GtkTextChildAnchor}
     */
    public static TextChildAnchor newWithReplacement(java.lang.String character) {
        var RESULT = constructNewWithReplacement(character);
        return (org.gtk.gtk.TextChildAnchor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TextChildAnchor.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Determines whether a child anchor has been deleted from
     * the buffer.
     * <p>
     * Keep in mind that the child anchor will be unreferenced
     * when removed from the buffer, so you need to hold your own
     * reference (with g_object_ref()) if you plan to use this
     * function — otherwise all deleted child anchors will also
     * be finalized.
     * @return {@code true} if the child anchor has been deleted from its buffer
     */
    public boolean getDeleted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_child_anchor_get_deleted.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets a list of all widgets anchored at this child anchor.
     * <p>
     * The order in which the widgets are returned is not defined.
     * @param outLen return location for the length of the array
     * @return an
     *   array of widgets anchored at {@code anchor}
     */
    public org.gtk.gtk.Widget[] getWidgets(Out<Integer> outLen) {
        MemorySegment outLenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_child_anchor_get_widgets.invokeExact(
                    handle(),
                    (Addressable) outLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outLen.set(outLenPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.gtk.Widget[] resultARRAY = new org.gtk.gtk.Widget[outLen.get().intValue()];
        for (int I = 0; I < outLen.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(OBJ)), org.gtk.gtk.Widget.fromAddress).marshal(OBJ, Ownership.CONTAINER);
        }
        return resultARRAY;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_child_anchor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TextChildAnchor.Builder} object constructs a {@link TextChildAnchor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TextChildAnchor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TextChildAnchor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextChildAnchor}.
         * @return A new instance of {@code TextChildAnchor} with the properties 
         *         that were set in the Builder object.
         */
        public TextChildAnchor build() {
            return (TextChildAnchor) org.gtk.gobject.GObject.newWithProperties(
                TextChildAnchor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_child_anchor_new = Interop.downcallHandle(
            "gtk_text_child_anchor_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_child_anchor_new_with_replacement = Interop.downcallHandle(
            "gtk_text_child_anchor_new_with_replacement",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_child_anchor_get_deleted = Interop.downcallHandle(
            "gtk_text_child_anchor_get_deleted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_child_anchor_get_widgets = Interop.downcallHandle(
            "gtk_text_child_anchor_get_widgets",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_child_anchor_get_type = Interop.downcallHandle(
            "gtk_text_child_anchor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
