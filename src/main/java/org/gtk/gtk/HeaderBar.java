package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkHeaderBar} is a widget for creating custom title bars for windows.
 * <p>
 * <img src="./doc-files/headerbar.png" alt="An example GtkHeaderBar">
 * <p>
 * {@code GtkHeaderBar} is similar to a horizontal {@code GtkCenterBox}. It allows
 * children to be placed at the start or the end. In addition, it allows
 * the window title to be displayed. The title will be centered with respect
 * to the width of the box, even if the children at either side take up
 * different amounts of space.
 * <p>
 * {@code GtkHeaderBar} can add typical window frame controls, such as minimize,
 * maximize and close buttons, or the window icon.
 * <p>
 * For these reasons, {@code GtkHeaderBar} is the natural choice for use as the
 * custom titlebar widget of a {@code GtkWindow} (see {@link Window#setTitlebar}),
 * as it gives features typical of titlebars while allowing the addition of
 * child widgets.
 * <p>
 * <strong>GtkHeaderBar as GtkBuildable</strong><br/>
 * The {@code GtkHeaderBar} implementation of the {@code GtkBuildable} interface supports
 * adding children at the start or end sides by specifying “start” or “end” as
 * the “type” attribute of a &lt;child&gt; element, or setting the title widget by
 * specifying “title” value.
 * <p>
 * By default the {@code GtkHeaderBar} uses a {@code GtkLabel} displaying the title of the
 * window it is contained in as the title widget, equivalent to the following
 * UI definition:
 * <pre>{@code xml
 * <object class="GtkHeaderBar">
 *   <property name="title-widget">
 *     <object class="GtkLabel">
 *       <property name="label" translatable="yes">Label</property>
 *       <property name="single-line-mode">True</property>
 *       <property name="ellipsize">end</property>
 *       <property name="width-chars">5</property>
 *       <style>
 *         <class name="title"/>
 *       </style>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── box.start
 *         │   ├── windowcontrols.start
 *         │   ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── box.end
 *             ├── [other children]
 *             ╰── windowcontrols.end
 * }</pre>
 * <p>
 * A {@code GtkHeaderBar}'s CSS node is called {@code headerbar}. It contains a {@code windowhandle}
 * subnode, which contains a {@code box} subnode, which contains two {@code box} subnodes at
 * the start and end of the header bar, as well as a center node that represents
 * the title.
 * <p>
 * Each of the boxes contains a {@code windowcontrols} subnode, see
 * {@link WindowControls} for details, as well as other children.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkHeaderBar} uses the {@link AccessibleRole#GROUP} role.
 */
public class HeaderBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkHeaderBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public HeaderBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to HeaderBar if its GType is a (or inherits from) "GtkHeaderBar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "HeaderBar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkHeaderBar", a ClassCastException will be thrown.
     */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkHeaderBar"))) {
            return new HeaderBar(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkHeaderBar");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_header_bar_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkHeaderBar} widget.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    /**
     * Gets the decoration layout of the {@code GtkHeaderBar}.
     * @return the decoration layout
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_header_bar_get_decoration_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether this header bar shows the standard window
     * title buttons.
     * @return {@code true} if title buttons are shown
     */
    public boolean getShowTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_header_bar_get_show_title_buttons.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the title widget of the header.
     * <p>
     * See {@link HeaderBar#setTitleWidget}.
     * @return the title widget of the header
     */
    public @Nullable org.gtk.gtk.Widget getTitleWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_header_bar_get_title_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code child} to {@code bar}, packed with reference to the
     * end of the {@code bar}.
     * @param child the {@code GtkWidget} to be added to {@code bar}
     */
    public void packEnd(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_header_bar_pack_end.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} to {@code bar}, packed with reference to the
     * start of the {@code bar}.
     * @param child the {@code GtkWidget} to be added to {@code bar}
     */
    public void packStart(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_header_bar_pack_start.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from the {@code GtkHeaderBar}.
     * <p>
     * The child must have been added with
     * {@link HeaderBar#packStart},
     * {@link HeaderBar#packEnd} or
     * {@link HeaderBar#setTitleWidget}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_header_bar_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the decoration layout for this header bar.
     * <p>
     * This property overrides the
     * {@code Gtk.Settings:gtk-decoration-layout} setting.
     * <p>
     * There can be valid reasons for overriding the setting, such
     * as a header bar design that does not allow for buttons to take
     * room on the right, or only offers room for a single close button.
     * Split header bars are another example for overriding the setting.
     * <p>
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * <p>
     * For example, “icon:minimize,maximize,close” specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     * @param layout a decoration layout, or {@code null} to unset the layout
     */
    public void setDecorationLayout(@Nullable java.lang.String layout) {
        try {
            DowncallHandles.gtk_header_bar_set_decoration_layout.invokeExact(
                    handle(),
                    (Addressable) (layout == null ? MemoryAddress.NULL : Interop.allocateNativeString(layout)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this header bar shows the standard window
     * title buttons.
     * @param setting {@code true} to show standard title buttons
     */
    public void setShowTitleButtons(boolean setting) {
        try {
            DowncallHandles.gtk_header_bar_set_show_title_buttons.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title for the {@code GtkHeaderBar}.
     * <p>
     * When set to {@code null}, the headerbar will display the title of
     * the window it is contained in.
     * <p>
     * The title should help a user identify the current view.
     * To achieve the same style as the builtin title, use the
     * “title” style class.
     * <p>
     * You should set the title widget to {@code null}, for the window
     * title label to be visible again.
     * @param titleWidget a widget to use for a title
     */
    public void setTitleWidget(@Nullable org.gtk.gtk.Widget titleWidget) {
        try {
            DowncallHandles.gtk_header_bar_set_title_widget.invokeExact(
                    handle(),
                    (Addressable) (titleWidget == null ? MemoryAddress.NULL : titleWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_header_bar_new = Interop.downcallHandle(
            "gtk_header_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_get_decoration_layout = Interop.downcallHandle(
            "gtk_header_bar_get_decoration_layout",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_get_show_title_buttons = Interop.downcallHandle(
            "gtk_header_bar_get_show_title_buttons",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_get_title_widget = Interop.downcallHandle(
            "gtk_header_bar_get_title_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_pack_end = Interop.downcallHandle(
            "gtk_header_bar_pack_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_pack_start = Interop.downcallHandle(
            "gtk_header_bar_pack_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_remove = Interop.downcallHandle(
            "gtk_header_bar_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_set_decoration_layout = Interop.downcallHandle(
            "gtk_header_bar_set_decoration_layout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_header_bar_set_show_title_buttons = Interop.downcallHandle(
            "gtk_header_bar_set_show_title_buttons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_header_bar_set_title_widget = Interop.downcallHandle(
            "gtk_header_bar_set_title_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
