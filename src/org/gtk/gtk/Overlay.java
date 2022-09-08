package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkOverlay` is a container which contains a single main child, on top
 * of which it can place “overlay” widgets.
 * 
 * ![An example GtkOverlay](overlay.png)
 * 
 * The position of each overlay widget is determined by its
 * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties. E.g. a widget with both alignments set to %GTK_ALIGN_START
 * will be placed at the top left corner of the `GtkOverlay` container,
 * whereas an overlay with halign set to %GTK_ALIGN_CENTER and valign set
 * to %GTK_ALIGN_END will be placed a the bottom edge of the `GtkOverlay`,
 * horizontally centered. The position can be adjusted by setting the margin
 * properties of the child to non-zero values.
 * 
 * More complicated placement of overlays is possible by connecting
 * to the [signal@Gtk.Overlay::get-child-position] signal.
 * 
 * An overlay’s minimum and natural sizes are those of its main child.
 * The sizes of overlay children are not considered when measuring these
 * preferred sizes.
 * 
 * # GtkOverlay as GtkBuildable
 * 
 * The `GtkOverlay` implementation of the `GtkBuildable` interface
 * supports placing a child as an overlay by specifying “overlay” as
 * the “type” attribute of a `<child>` element.
 * 
 * # CSS nodes
 * 
 * `GtkOverlay` has a single CSS node with the name “overlay”. Overlay children
 * whose alignments cause them to be positioned at an edge get the style classes
 * “.left”, “.right”, “.top”, and/or “.bottom” according to their position.
 */
public class Overlay extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Overlay(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Overlay */
    public static Overlay castFrom(org.gtk.gobject.Object gobject) {
        return new Overlay(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkOverlay`.
     */
    public Overlay() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_new(), false));
    }
    
    /**
     * Adds @widget to @overlay.
     * 
     * The widget will be stacked on top of the main widget
     * added with [method@Gtk.Overlay.set_child].
     * 
     * The position at which @widget is placed is determined
     * from its [property@Gtk.Widget:halign] and
     * [property@Gtk.Widget:valign] properties.
     */
    public void addOverlay(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_add_overlay(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Gets the child widget of @overlay.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_get_child(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether @widget should be clipped within the parent.
     */
    public boolean getClipOverlay(Widget widget) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_get_clip_overlay(HANDLE(), widget.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether @widget's size is included in the measurement of
     * @overlay.
     */
    public boolean getMeasureOverlay(Widget widget) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_get_measure_overlay(HANDLE(), widget.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     */
    public void removeOverlay(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_remove_overlay(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Sets the child widget of @overlay.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets whether @widget should be clipped within the parent.
     */
    public void setClipOverlay(Widget widget, boolean clipOverlay) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_set_clip_overlay(HANDLE(), widget.HANDLE(), clipOverlay ? 1 : 0);
    }
    
    /**
     * Sets whether @widget is included in the measured size of @overlay.
     * 
     * The overlay will request the size of the largest child that has
     * this property set to %TRUE. Children who are not included may
     * be drawn outside of @overlay's allocation if they are too large.
     */
    public void setMeasureOverlay(Widget widget, boolean measure) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_overlay_set_measure_overlay(HANDLE(), widget.HANDLE(), measure ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface GetChildPositionHandler {
        boolean signalReceived(Overlay source, Widget widget, org.gtk.gdk.Rectangle allocation);
    }
    
    /**
     * Emitted to determine the position and size of any overlay
     * child widgets.
     * 
     * A handler for this signal should fill @allocation with
     * the desired position and size for @widget, relative to
     * the 'main' child of @overlay.
     * 
     * The default handler for this signal uses the @widget's
     * halign and valign properties to determine the position
     * and gives the widget its natural size (except that an
     * alignment of %GTK_ALIGN_FILL will cause the overlay to
     * be full-width/height). If the main child is a
     * `GtkScrolledWindow`, the overlays are placed relative
     * to its contents.
     */
    public void onGetChildPosition(GetChildPositionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalOverlayGetChildPosition", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("get-child-position").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
