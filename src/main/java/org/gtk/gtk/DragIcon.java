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
     */
    protected DragIcon(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DragIcon> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DragIcon(input);
    
    /**
     * Gets the widget currently used as drag icon.
     * @return The drag icon
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
    public static org.gtk.glib.Type getType() {
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
    public static @Nullable org.gtk.gtk.Widget createWidgetForValue(org.gtk.gobject.Value value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_create_widget_for_value.invokeExact(value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the {@code GtkDragIcon} in use with {@code drag}.
     * <p>
     * If no drag icon exists yet, a new one will be created
     * and shown.
     * @param drag a {@code GdkDrag}
     * @return the {@code GtkDragIcon}
     */
    public static org.gtk.gtk.Widget getForDrag(org.gtk.gdk.Drag drag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_icon_get_for_drag.invokeExact(drag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
    public static void setFromPaintable(org.gtk.gdk.Drag drag, org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
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
     * A {@link DragIcon.Builder} object constructs a {@link DragIcon} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DragIcon.Builder#build()}. 
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
         * Finish building the {@link DragIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DragIcon}.
         * @return A new instance of {@code DragIcon} with the properties 
         *         that were set in the Builder object.
         */
        public DragIcon build() {
            return (DragIcon) org.gtk.gobject.GObject.newWithProperties(
                DragIcon.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The widget to display as drag icon.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_drag_icon_get_type != null;
    }
}
