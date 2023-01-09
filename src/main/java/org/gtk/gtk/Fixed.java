package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFixed} places its child widgets at fixed positions and with fixed sizes.
 * <p>
 * {@code GtkFixed} performs no automatic layout management.
 * <p>
 * For most applications, you should not use this container! It keeps
 * you from having to learn about the other GTK containers, but it
 * results in broken applications.  With {@code GtkFixed}, the following
 * things will result in truncated text, overlapping widgets, and
 * other display bugs:
 * <ul>
 * <li>Themes, which may change widget sizes.
 * </ul>
 * <ul>
 * <li>Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different fonts.
 * </ul>
 * <ul>
 * <li>Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 * </ul>
 * <p>
 * In addition, {@code GtkFixed} does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately for the text direction, e.g. to put labels to
 * the right of the thing they label when using an RTL language, but it can’t
 * do that with {@code GtkFixed}. So if you need to reorder widgets depending on
 * the text direction, you would need to manually detect it and adjust child
 * positions accordingly.
 * <p>
 * Finally, fixed positioning makes it kind of annoying to add/remove
 * UI elements, since you have to reposition all the other elements. This
 * is a long-term maintenance problem for your application.
 * <p>
 * If you know none of these things are an issue for your application,
 * and prefer the simplicity of {@code GtkFixed}, by all means use the
 * widget. But you should be aware of the tradeoffs.
 */
public class Fixed extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFixed";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Fixed proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Fixed(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Fixed> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Fixed(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFixed}.
     */
    public Fixed() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Retrieves the translation transformation of the
     * given child {@code GtkWidget} in the {@code GtkFixed}.
     * <p>
     * See also: {@link Fixed#getChildTransform}.
     * @param widget a child of {@code fixed}
     * @param x the horizontal position of the {@code widget}
     * @param y the vertical position of the {@code widget}
     */
    public void getChildPosition(org.gtk.gtk.Widget widget, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            try {
                DowncallHandles.gtk_fixed_get_child_position.invokeExact(
                        handle(),
                        widget.handle(),
                        (Addressable) xPOINTER.address(),
                        (Addressable) yPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        }
    }
    
    /**
     * Retrieves the transformation for {@code widget} set using
     * gtk_fixed_set_child_transform().
     * @param widget a {@code GtkWidget}, child of {@code fixed}
     * @return a {@code GskTransform}
     */
    public @Nullable org.gtk.gsk.Transform getChildTransform(org.gtk.gtk.Widget widget) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_get_child_transform.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sets a translation transformation to the given {@code x} and {@code y}
     * coordinates to the child {@code widget} of the {@code GtkFixed}.
     * @param widget the child widget
     * @param x the horizontal position to move the widget to
     * @param y the vertical position to move the widget to
     */
    public void move(org.gtk.gtk.Widget widget, double x, double y) {
        try {
            DowncallHandles.gtk_fixed_move.invokeExact(
                    handle(),
                    widget.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to a {@code GtkFixed} at the given position.
     * @param widget the widget to add
     * @param x the horizontal position to place the widget at
     * @param y the vertical position to place the widget at
     */
    public void put(org.gtk.gtk.Widget widget, double x, double y) {
        try {
            DowncallHandles.gtk_fixed_put.invokeExact(
                    handle(),
                    widget.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code fixed}.
     * @param widget the child widget to remove
     */
    public void remove(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_fixed_remove.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transformation for {@code widget}.
     * <p>
     * This is a convenience function that retrieves the
     * {@link FixedLayoutChild} instance associated to
     * {@code widget} and calls {@link FixedLayoutChild#setTransform}.
     * @param widget a {@code GtkWidget}, child of {@code fixed}
     * @param transform the transformation assigned to {@code widget}
     *   to reset {@code widget}'s transform
     */
    public void setChildTransform(org.gtk.gtk.Widget widget, @Nullable org.gtk.gsk.Transform transform) {
        try {
            DowncallHandles.gtk_fixed_set_child_transform.invokeExact(
                    handle(),
                    widget.handle(),
                    (Addressable) (transform == null ? MemoryAddress.NULL : transform.handle()));
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
            RESULT = (long) DowncallHandles.gtk_fixed_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Fixed.Builder} object constructs a {@link Fixed} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Fixed.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Fixed} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Fixed}.
         * @return A new instance of {@code Fixed} with the properties 
         *         that were set in the Builder object.
         */
        public Fixed build() {
            return (Fixed) org.gtk.gobject.GObject.newWithProperties(
                Fixed.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_fixed_new = Interop.downcallHandle(
                "gtk_fixed_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_fixed_get_child_position = Interop.downcallHandle(
                "gtk_fixed_get_child_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_fixed_get_child_transform = Interop.downcallHandle(
                "gtk_fixed_get_child_transform",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_fixed_move = Interop.downcallHandle(
                "gtk_fixed_move",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_fixed_put = Interop.downcallHandle(
                "gtk_fixed_put",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_fixed_remove = Interop.downcallHandle(
                "gtk_fixed_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_fixed_set_child_transform = Interop.downcallHandle(
                "gtk_fixed_set_child_transform",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_fixed_get_type = Interop.downcallHandle(
                "gtk_fixed_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_fixed_get_type != null;
    }
}
