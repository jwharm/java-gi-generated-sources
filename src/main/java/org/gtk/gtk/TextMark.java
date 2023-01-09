package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class TextMark extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextMark";
    
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
     * Create a TextMark proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextMark(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextMark> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextMark(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name, boolean leftGravity) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_text_mark_new.invokeExact(
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)),
                        Marshal.booleanToInteger.marshal(leftGravity, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
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
     * @param name mark name
     * @param leftGravity whether the mark should have left gravity
     */
    public TextMark(@Nullable java.lang.String name, boolean leftGravity) {
        super(constructNew(name, leftGravity));
        this.takeOwnership();
    }
    
    /**
     * Gets the buffer this mark is located inside.
     * <p>
     * Returns {@code null} if the mark is deleted.
     * @return the mark’s {@code GtkTextBuffer}
     */
    public @Nullable org.gtk.gtk.TextBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_mark_get_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TextBuffer) Interop.register(RESULT, org.gtk.gtk.TextBuffer.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns {@code true} if the mark has been removed from its buffer.
     * <p>
     * See {@link TextBuffer#addMark} for a way to add it
     * to a buffer again.
     * @return whether the mark is deleted
     */
    public boolean getDeleted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_mark_get_deleted.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether the mark has left gravity.
     * @return {@code true} if the mark has left gravity, {@code false} otherwise
     */
    public boolean getLeftGravity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_mark_get_left_gravity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the mark name.
     * <p>
     * Returns {@code null} for anonymous marks.
     * @return mark name
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_mark_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns {@code true} if the mark is visible.
     * <p>
     * A cursor is displayed for visible marks.
     * @return {@code true} if visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_mark_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public void setVisible(boolean setting) {
        try {
            DowncallHandles.gtk_text_mark_set_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_mark_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TextMark.Builder} object constructs a {@link TextMark} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TextMark.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TextMark} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextMark}.
         * @return A new instance of {@code TextMark} with the properties 
         *         that were set in the Builder object.
         */
        public TextMark build() {
            return (TextMark) org.gtk.gobject.GObject.newWithProperties(
                TextMark.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the mark has left gravity.
         * <p>
         * When text is inserted at the mark’s current location, if the mark
         * has left gravity it will be moved to the left of the newly-inserted
         * text, otherwise to the right.
         * @param leftGravity The value for the {@code left-gravity} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLeftGravity(boolean leftGravity) {
            names.add("left-gravity");
            values.add(org.gtk.gobject.Value.create(leftGravity));
            return this;
        }
        
        /**
         * The name of the mark or {@code null} if the mark is anonymous.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_mark_new = Interop.downcallHandle(
                "gtk_text_mark_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_buffer = Interop.downcallHandle(
                "gtk_text_mark_get_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_deleted = Interop.downcallHandle(
                "gtk_text_mark_get_deleted",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_left_gravity = Interop.downcallHandle(
                "gtk_text_mark_get_left_gravity",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_name = Interop.downcallHandle(
                "gtk_text_mark_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_visible = Interop.downcallHandle(
                "gtk_text_mark_get_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_mark_set_visible = Interop.downcallHandle(
                "gtk_text_mark_set_visible",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_mark_get_type = Interop.downcallHandle(
                "gtk_text_mark_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_text_mark_get_type != null;
    }
}
