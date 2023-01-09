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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a HeaderBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected HeaderBar(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, HeaderBar> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new HeaderBar(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_header_bar_new.invokeExact();
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
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the decoration layout of the {@code GtkHeaderBar}.
     * @return the decoration layout
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_header_bar_get_decoration_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether this header bar shows the standard window
     * title buttons.
     * @return {@code true} if title buttons are shown
     */
    public boolean getShowTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_header_bar_get_show_title_buttons.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_header_bar_get_title_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Adds {@code child} to {@code bar}, packed with reference to the
     * end of the {@code bar}.
     * @param child the {@code GtkWidget} to be added to {@code bar}
     */
    public void packEnd(org.gtk.gtk.Widget child) {
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
    public void packStart(org.gtk.gtk.Widget child) {
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
    public void remove(org.gtk.gtk.Widget child) {
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_header_bar_set_decoration_layout.invokeExact(
                        handle(),
                        (Addressable) (layout == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(layout, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_header_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link HeaderBar.Builder} object constructs a {@link HeaderBar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link HeaderBar.Builder#build()}. 
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
         * Finish building the {@link HeaderBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link HeaderBar}.
         * @return A new instance of {@code HeaderBar} with the properties 
         *         that were set in the Builder object.
         */
        public HeaderBar build() {
            return (HeaderBar) org.gtk.gobject.GObject.newWithProperties(
                HeaderBar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The decoration layout for buttons.
         * <p>
         * If this property is not set, the
         * {@code Gtk.Settings:gtk-decoration-layout} setting is used.
         * @param decorationLayout The value for the {@code decoration-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDecorationLayout(java.lang.String decorationLayout) {
            names.add("decoration-layout");
            values.add(org.gtk.gobject.Value.create(decorationLayout));
            return this;
        }
        
        /**
         * Whether to show title buttons like close, minimize, maximize.
         * <p>
         * Which buttons are actually shown and where is determined
         * by the {@code Gtk.HeaderBar:decoration-layout} property,
         * and by the state of the window (e.g. a close button will not
         * be shown if the window can't be closed).
         * @param showTitleButtons The value for the {@code show-title-buttons} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowTitleButtons(boolean showTitleButtons) {
            names.add("show-title-buttons");
            values.add(org.gtk.gobject.Value.create(showTitleButtons));
            return this;
        }
        
        public Builder setTitleWidget(org.gtk.gtk.Widget titleWidget) {
            names.add("title-widget");
            values.add(org.gtk.gobject.Value.create(titleWidget));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_header_bar_new = Interop.downcallHandle(
                "gtk_header_bar_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_get_decoration_layout = Interop.downcallHandle(
                "gtk_header_bar_get_decoration_layout",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_get_show_title_buttons = Interop.downcallHandle(
                "gtk_header_bar_get_show_title_buttons",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_get_title_widget = Interop.downcallHandle(
                "gtk_header_bar_get_title_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_pack_end = Interop.downcallHandle(
                "gtk_header_bar_pack_end",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_pack_start = Interop.downcallHandle(
                "gtk_header_bar_pack_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_remove = Interop.downcallHandle(
                "gtk_header_bar_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_set_decoration_layout = Interop.downcallHandle(
                "gtk_header_bar_set_decoration_layout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_set_show_title_buttons = Interop.downcallHandle(
                "gtk_header_bar_set_show_title_buttons",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_header_bar_set_title_widget = Interop.downcallHandle(
                "gtk_header_bar_set_title_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_header_bar_get_type = Interop.downcallHandle(
                "gtk_header_bar_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_header_bar_get_type != null;
    }
}
