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
 * use {@link Gtk#DragIcon} to get the icon for a drag. You can
 * then use it like any other widget and use {@link DragIcon#setChild}
 * to set whatever widget should be used for the drag icon.
 * <p>
 * Keep in mind that drag icons do not allow user input.
 */
public class DragIcon extends Widget implements Accessible, Buildable, ConstraintTarget, Native, Root {

    public DragIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DragIcon */
    public static DragIcon castFrom(org.gtk.gobject.Object gobject) {
        return new DragIcon(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_drag_icon_get_child = Interop.downcallHandle(
        "gtk_drag_icon_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget currently used as drag icon.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_drag_icon_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_drag_icon_set_child = Interop.downcallHandle(
        "gtk_drag_icon_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget to display as the drag icon.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_drag_icon_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drag_icon_create_widget_for_value = Interop.downcallHandle(
        "gtk_drag_icon_create_widget_for_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @Nullable Widget createWidgetForValue(@NotNull org.gtk.gobject.Value value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_drag_icon_create_widget_for_value.invokeExact(value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_drag_icon_get_for_drag = Interop.downcallHandle(
        "gtk_drag_icon_get_for_drag",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkDragIcon} in use with {@code drag}.
     * <p>
     * If no drag icon exists yet, a new one will be created
     * and shown.
     */
    public static @NotNull Widget getForDrag(@NotNull org.gtk.gdk.Drag drag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_drag_icon_get_for_drag.invokeExact(drag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_drag_icon_set_from_paintable = Interop.downcallHandle(
        "gtk_drag_icon_set_from_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a {@code GtkDragIcon} that shows {@code paintable}, and associates
     * it with the drag operation.
     * <p>
     * The hotspot position on the paintable is aligned with the
     * hotspot of the cursor.
     */
    public static @NotNull void setFromPaintable(@NotNull org.gtk.gdk.Drag drag, @NotNull org.gtk.gdk.Paintable paintable, @NotNull int hotX, @NotNull int hotY) {
        try {
            gtk_drag_icon_set_from_paintable.invokeExact(drag.handle(), paintable.handle(), hotX, hotY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
