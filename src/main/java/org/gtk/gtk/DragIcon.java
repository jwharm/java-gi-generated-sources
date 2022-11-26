package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDragIcon} is a {@code GtkRoot} implementation for drag icons.
 * <p>
 * A drag icon moves with the pointer during a Drag-and-Drop operation
 * and is destroyed when the drag ends.
 * <p>
 * To set up a drag icon and associate it with an ongoing drag operation,
 * use {@link DragIcon#getForDrag} to get the icon for a drag. You can
 * then use it like any other widget and use {@link DragIcon#setChild}
 * to set whatever widget should be used for the drag icon.
 * <p>
 * Keep in mind that drag icons do not allow user input.
 */
public class DragIcon extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDragIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DragIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DragIcon(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DragIcon if its GType is a (or inherits from) "GtkDragIcon".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DragIcon} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDragIcon", a ClassCastException will be thrown.
     */
    public static DragIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), DragIcon.getType())) {
            return new DragIcon(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDragIcon");
        }
    }
    
    /**
     * Gets the widget currently used as drag icon.
     * @return The drag icon
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the widget to display as the drag icon.
     * @param child a {@code GtkWidget}
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_drag_icon_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_drag_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a widget that can be used as a drag icon for the given
     * {@code value}.
     * <p>
     * Supported types include strings, {@code GdkRGBA} and {@code GtkTextBuffer}.
     * If GTK does not know how to create a widget for a given value,
     * it will return {@code null}.
     * <p>
     * This method is used to set the default drag icon on drag-and-drop
     * operations started by {@code GtkDragSource}, so you don't need to set
     * a drag icon using this function there.
     * @param value a {@code GValue}
     * @return A new {@code GtkWidget}
     *   for displaying {@code value} as a drag icon.
     */
    public static @Nullable org.gtk.gtk.Widget createWidgetForValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_create_widget_for_value.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@code GtkDragIcon} in use with {@code drag}.
     * <p>
     * If no drag icon exists yet, a new one will be created
     * and shown.
     * @param drag a {@code GdkDrag}
     * @return the {@code GtkDragIcon}
     */
    public static @NotNull org.gtk.gtk.Widget getForDrag(@NotNull org.gtk.gdk.Drag drag) {
        java.util.Objects.requireNonNull(drag, "Parameter 'drag' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_get_for_drag.invokeExact(
                    drag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Creates a {@code GtkDragIcon} that shows {@code paintable}, and associates
     * it with the drag operation.
     * <p>
     * The hotspot position on the paintable is aligned with the
     * hotspot of the cursor.
     * @param drag a {@code GdkDrag}
     * @param paintable a {@code GdkPaintable} to display
     * @param hotX X coordinate of the hotspot
     * @param hotY Y coordinate of the hotspot
     */
    public static void setFromPaintable(@NotNull org.gtk.gdk.Drag drag, @NotNull org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
        java.util.Objects.requireNonNull(drag, "Parameter 'drag' must not be null");
        java.util.Objects.requireNonNull(paintable, "Parameter 'paintable' must not be null");
        try {
            DowncallHandles.gtk_drag_icon_set_from_paintable.invokeExact(
                    drag.handle(),
                    paintable.handle(),
                    hotX,
                    hotY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link DragIcon.Build} object constructs a {@link DragIcon} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DragIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DragIcon} using {@link DragIcon#castFrom}.
         * @return A new instance of {@code DragIcon} with the properties 
         *         that were set in the Build object.
         */
        public DragIcon construct() {
            return DragIcon.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DragIcon.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The widget to display as drag icon.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drag_icon_get_child = Interop.downcallHandle(
            "gtk_drag_icon_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_icon_set_child = Interop.downcallHandle(
            "gtk_drag_icon_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_icon_get_type = Interop.downcallHandle(
            "gtk_drag_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_drag_icon_create_widget_for_value = Interop.downcallHandle(
            "gtk_drag_icon_create_widget_for_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_icon_get_for_drag = Interop.downcallHandle(
            "gtk_drag_icon_get_for_drag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_icon_set_from_paintable = Interop.downcallHandle(
            "gtk_drag_icon_set_from_paintable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
