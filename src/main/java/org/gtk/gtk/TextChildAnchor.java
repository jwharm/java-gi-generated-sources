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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextChildAnchor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("segment")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TextChildAnchor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextChildAnchor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextChildAnchor if its GType is a (or inherits from) "GtkTextChildAnchor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TextChildAnchor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextChildAnchor", a ClassCastException will be thrown.
     */
    public static TextChildAnchor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TextChildAnchor.getType())) {
            return new TextChildAnchor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextChildAnchor");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    
    private static Addressable constructNewWithReplacement(@NotNull java.lang.String character) {
        java.util.Objects.requireNonNull(character, "Parameter 'character' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_child_anchor_new_with_replacement.invokeExact(
                    Interop.allocateNativeString(character));
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
    public static TextChildAnchor newWithReplacement(@NotNull java.lang.String character) {
        return new TextChildAnchor(constructNewWithReplacement(character), Ownership.FULL);
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
        return RESULT != 0;
    }
    
    /**
     * Gets a list of all widgets anchored at this child anchor.
     * <p>
     * The order in which the widgets are returned is not defined.
     * @param outLen return location for the length of the array
     * @return an
     *   array of widgets anchored at {@code anchor}
     */
    public @NotNull org.gtk.gtk.Widget[] getWidgets(Out<Integer> outLen) {
        java.util.Objects.requireNonNull(outLen, "Parameter 'outLen' must not be null");
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
            resultARRAY[I] = new org.gtk.gtk.Widget(OBJ, Ownership.CONTAINER);
        }
        return resultARRAY;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_child_anchor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link TextChildAnchor.Build} object constructs a {@link TextChildAnchor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TextChildAnchor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextChildAnchor} using {@link TextChildAnchor#castFrom}.
         * @return A new instance of {@code TextChildAnchor} with the properties 
         *         that were set in the Build object.
         */
        public TextChildAnchor construct() {
            return TextChildAnchor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TextChildAnchor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
