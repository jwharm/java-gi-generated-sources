package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Layout managers are delegate classes that handle the preferred size
 * and the allocation of a widget.
 * <p>
 * You typically subclass {@code GtkLayoutManager} if you want to implement a
 * layout policy for the children of a widget, or if you want to determine
 * the size of a widget depending on its contents.
 * <p>
 * Each {@code GtkWidget} can only have a {@code GtkLayoutManager} instance associated
 * to it at any given time; it is possible, though, to replace the layout
 * manager instance using {@link Widget#setLayoutManager}.
 * <p>
 * <h2>Layout properties</h2>
 * <p>
 * A layout manager can expose properties for controlling the layout of
 * each child, by creating an object type derived from {@link LayoutChild}
 * and installing the properties on it as normal {@code GObject} properties.
 * <p>
 * Each {@code GtkLayoutChild} instance storing the layout properties for a
 * specific child is created through the {@link LayoutManager#getLayoutChild}
 * method; a {@code GtkLayoutManager} controls the creation of its {@code GtkLayoutChild}
 * instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * virtual function. The typical implementation should look like:
 * <p>
 * <pre>{@code c
 * static GtkLayoutChild *
 * create_layout_child (GtkLayoutManager *manager,
 *                      GtkWidget        *container,
 *                      GtkWidget        *child)
 * {
 *   return g_object_new (your_layout_child_get_type (),
 *                        "layout-manager", manager,
 *                        "child-widget", child,
 *                        NULL);
 * }
 * }</pre>
 * <p>
 * The {@code Gtk.LayoutChild:layout-manager} and
 * {@code Gtk.LayoutChild:child-widget} properties
 * on the newly created {@code GtkLayoutChild} instance are mandatory. The
 * {@code GtkLayoutManager} will cache the newly created {@code GtkLayoutChild} instance
 * until the widget is removed from its parent, or the parent removes the
 * layout manager.
 * <p>
 * Each {@code GtkLayoutManager} instance creating a {@code GtkLayoutChild} should use
 * {@link LayoutManager#getLayoutChild} every time it needs to query
 * the layout properties; each {@code GtkLayoutChild} instance should call
 * {@link LayoutManager#layoutChanged} every time a property is
 * updated, in order to queue a new size measuring and allocation.
 */
public class LayoutManager extends org.gtk.gobject.Object {

    public LayoutManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LayoutManager */
    public static LayoutManager castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutManager(gobject.refcounted());
    }
    
    static final MethodHandle gtk_layout_manager_allocate = Interop.downcallHandle(
        "gtk_layout_manager_allocate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Assigns the given {@code width}, {@code height}, and {@code baseline} to
     * a {@code widget}, and computes the position and sizes of the children of
     * the {@code widget} using the layout management policy of {@code manager}.
     */
    public void allocate(Widget widget, int width, int height, int baseline) {
        try {
            gtk_layout_manager_allocate.invokeExact(handle(), widget.handle(), width, height, baseline);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_manager_get_layout_child = Interop.downcallHandle(
        "gtk_layout_manager_get_layout_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a {@code GtkLayoutChild} instance for the {@code GtkLayoutManager},
     * creating one if necessary.
     * <p>
     * The {@code child} widget must be a child of the widget using {@code manager}.
     * <p>
     * The {@code GtkLayoutChild} instance is owned by the {@code GtkLayoutManager},
     * and is guaranteed to exist as long as {@code child} is a child of the
     * {@code GtkWidget} using the given {@code GtkLayoutManager}.
     */
    public LayoutChild getLayoutChild(Widget child) {
        try {
            var RESULT = (MemoryAddress) gtk_layout_manager_get_layout_child.invokeExact(handle(), child.handle());
            return new LayoutChild(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_manager_get_request_mode = Interop.downcallHandle(
        "gtk_layout_manager_get_request_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the request mode of {@code manager}.
     */
    public SizeRequestMode getRequestMode() {
        try {
            var RESULT = (int) gtk_layout_manager_get_request_mode.invokeExact(handle());
            return new SizeRequestMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_manager_get_widget = Interop.downcallHandle(
        "gtk_layout_manager_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkWidget} using the given {@code GtkLayoutManager}.
     */
    public Widget getWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_layout_manager_get_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_manager_layout_changed = Interop.downcallHandle(
        "gtk_layout_manager_layout_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Queues a resize on the {@code GtkWidget} using {@code manager}, if any.
     * <p>
     * This function should be called by subclasses of {@code GtkLayoutManager}
     * in response to changes to their layout management policies.
     */
    public void layoutChanged() {
        try {
            gtk_layout_manager_layout_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_manager_measure = Interop.downcallHandle(
        "gtk_layout_manager_measure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Measures the size of the {@code widget} using {@code manager}, for the
     * given {@code orientation} and size.
     * <p>
     * See the {@link Widget} documentation on layout management for
     * more details.
     */
    public void measure(Widget widget, Orientation orientation, int forSize, PointerInteger minimum, PointerInteger natural, PointerInteger minimumBaseline, PointerInteger naturalBaseline) {
        try {
            gtk_layout_manager_measure.invokeExact(handle(), widget.handle(), orientation.getValue(), forSize, minimum.handle(), natural.handle(), minimumBaseline.handle(), naturalBaseline.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}