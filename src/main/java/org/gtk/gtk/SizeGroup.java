package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSizeGroup} groups widgets together so they all request the same size.
 * <p>
 * This is typically useful when you want a column of widgets to have the
 * same size, but you can’t use a {@code GtkGrid}.
 * <p>
 * In detail, the size requested for each widget in a {@code GtkSizeGroup} is
 * the maximum of the sizes that would have been requested for each
 * widget in the size group if they were not in the size group. The mode
 * of the size group (see {@link SizeGroup#setMode}) determines whether
 * this applies to the horizontal size, the vertical size, or both sizes.
 * <p>
 * Note that size groups only affect the amount of space requested, not
 * the size that the widgets finally receive. If you want the widgets in
 * a {@code GtkSizeGroup} to actually be the same size, you need to pack them in
 * such a way that they get the size they request and not more.
 * <p>
 * {@code GtkSizeGroup} objects are referenced by each widget in the size group,
 * so once you have added all widgets to a {@code GtkSizeGroup}, you can drop
 * the initial reference to the size group with g_object_unref(). If the
 * widgets in the size group are subsequently destroyed, then they will
 * be removed from the size group and drop their references on the size
 * group; when all widgets have been removed, the size group will be
 * freed.
 * <p>
 * Widgets can be part of multiple size groups; GTK will compute the
 * horizontal size of a widget from the horizontal requisition of all
 * widgets that can be reached from the widget by a chain of size groups
 * of type {@link SizeGroupMode#HORIZONTAL} or {@link SizeGroupMode#BOTH}, and the
 * vertical size from the vertical requisition of all widgets that can be
 * reached from the widget by a chain of size groups of type
 * {@link SizeGroupMode#VERTICAL} or {@link SizeGroupMode#BOTH}.
 * <p>
 * Note that only non-contextual sizes of every widget are ever consulted
 * by size groups (since size groups have no knowledge of what size a widget
 * will be allocated in one dimension, it cannot derive how much height
 * a widget will receive for a given width). When grouping widgets that
 * trade height for width in mode {@link SizeGroupMode#VERTICAL} or {@link SizeGroupMode#BOTH}:
 * the height for the minimum width will be the requested height for all
 * widgets in the group. The same is of course true when horizontally grouping
 * width for height widgets.
 * <p>
 * Widgets that trade height-for-width should set a reasonably large minimum
 * width by way of {@code Gtk.Label:width-chars} for instance. Widgets with
 * static sizes as well as widgets that grow (such as ellipsizing text) need no
 * such considerations.
 * <p>
 * <strong>GtkSizeGroup as GtkBuildable</strong><br/>
 * Size groups can be specified in a UI definition by placing an &lt;object&gt;
 * element with {@code class="GtkSizeGroup"} somewhere in the UI definition. The
 * widgets that belong to the size group are specified by a &lt;widgets&gt; element
 * that may contain multiple &lt;widget&gt; elements, one for each member of the
 * size group. The ”name” attribute gives the id of the widget.
 * <p>
 * An example of a UI definition fragment with {@code GtkSizeGroup}:
 * <pre>{@code xml
 * <object class="GtkSizeGroup">
 *   <property name="mode">horizontal</property>
 *   <widgets>
 *     <widget name="radio1"/>
 *     <widget name="radio2"/>
 *   </widgets>
 * </object>
 * }</pre>
 */
public class SizeGroup extends org.gtk.gobject.Object implements org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSizeGroup";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public SizeGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SizeGroup if its GType is a (or inherits from) "GtkSizeGroup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SizeGroup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSizeGroup", a ClassCastException will be thrown.
     */
    public static SizeGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSizeGroup"))) {
            return new SizeGroup(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSizeGroup");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.SizeGroupMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_size_group_new.invokeExact(
                    mode.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkSizeGroup}.
     * @param mode the mode for the new size group.
     */
    public SizeGroup(@NotNull org.gtk.gtk.SizeGroupMode mode) {
        super(constructNew(mode));
    }
    
    /**
     * Adds a widget to a {@code GtkSizeGroup}.
     * <p>
     * In the future, the requisition
     * of the widget will be determined as the maximum of its requisition
     * and the requisition of the other widgets in the size group.
     * Whether this applies horizontally, vertically, or in both directions
     * depends on the mode of the size group.
     * See {@link SizeGroup#setMode}.
     * <p>
     * When the widget is destroyed or no longer referenced elsewhere, it
     * will be removed from the size group.
     * @param widget the {@code GtkWidget} to add
     */
    public void addWidget(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_size_group_add_widget.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current mode of the size group.
     * @return the current mode of the size group.
     */
    public @NotNull org.gtk.gtk.SizeGroupMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_size_group_get_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SizeGroupMode(RESULT);
    }
    
    /**
     * Returns the list of widgets associated with {@code size_group}.
     * @return a {@code GSList} of
     *   widgets. The list is owned by GTK and should not be modified.
     */
    public @NotNull org.gtk.glib.SList getWidgets() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_size_group_get_widgets.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a widget from a {@code GtkSizeGroup}.
     * @param widget the {@code GtkWidget} to remove
     */
    public void removeWidget(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_size_group_remove_widget.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkSizeGroupMode} of the size group.
     * <p>
     * The mode of the size group determines whether the widgets in the
     * size group should all have the same horizontal requisition
     * ({@link SizeGroupMode#HORIZONTAL}) all have the same vertical requisition
     * ({@link SizeGroupMode#VERTICAL}), or should all have the same requisition
     * in both directions ({@link SizeGroupMode#BOTH}).
     * @param mode the mode to set for the size group.
     */
    public void setMode(@NotNull org.gtk.gtk.SizeGroupMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_size_group_set_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_size_group_new = Interop.downcallHandle(
            "gtk_size_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_size_group_add_widget = Interop.downcallHandle(
            "gtk_size_group_add_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_size_group_get_mode = Interop.downcallHandle(
            "gtk_size_group_get_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_size_group_get_widgets = Interop.downcallHandle(
            "gtk_size_group_get_widgets",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_size_group_remove_widget = Interop.downcallHandle(
            "gtk_size_group_remove_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_size_group_set_mode = Interop.downcallHandle(
            "gtk_size_group_set_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
