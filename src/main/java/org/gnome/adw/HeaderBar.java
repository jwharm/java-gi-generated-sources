package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A title bar widget.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="header-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="header-bar.png" alt="header-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwHeaderBar} is similar to {@link org.gtk.gtk.HeaderBar}, but provides additional
 * features compared to it. Refer to {@code GtkHeaderBar} for details.
 * <p>
 * {@code HeaderBar:centering-policy} allows to enforce strict centering of
 * the title widget, this is useful for {@link ViewSwitcherTitle}.
 * <p>
 * {@code HeaderBar:show-start-title-buttons} and
 * {@code HeaderBar:show-end-title-buttons} allow to easily create split
 * header bar layouts using {@link Leaflet}, as follows:
 * <pre>{@code xml
 * <object class="AdwLeaflet" id="leaflet">
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-end-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 *   <!-- ... -->
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <property name="hexpand">True</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-start-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="header-bar-split-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="header-bar-split.png" alt="header-bar-split"&gt;
 * &lt;/picture&gt;
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── widget
 *         │   ╰── box.start
 *         │       ├── windowcontrols.start
 *         │       ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── widget
 *             ╰── box.end
 *                 ├── [other children]
 *                 ╰── windowcontrols.end
 * }</pre>
 * <p>
 * {@code AdwHeaderBar}'s CSS node is called {@code headerbar}. It contains a {@code windowhandle}
 * subnode, which contains a {@code box} subnode, which contains two {@code widget} subnodes
 * at the start and end of the header bar, each of which contains a {@code box}
 * subnode with the {@code .start} and {@code .end} style classes respectively, as well as a
 * center node that represents the title.
 * <p>
 * Each of the boxes contains a {@code windowcontrols} subnode, see
 * {@link org.gtk.gtk.WindowControls} for details, as well as other children.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwHeaderBar} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class HeaderBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwHeaderBar";
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public HeaderBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to HeaderBar if its GType is a (or inherits from) "AdwHeaderBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code HeaderBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwHeaderBar", a ClassCastException will be thrown.
     */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), HeaderBar.getType())) {
            return new HeaderBar(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwHeaderBar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_header_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwHeaderBar}.
     */
    public HeaderBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the policy for aligning the center widget.
     * @return the centering policy
     */
    public @NotNull org.gnome.adw.CenteringPolicy getCenteringPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_header_bar_get_centering_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.CenteringPolicy(RESULT);
    }
    
    /**
     * Gets the decoration layout for {@code self}.
     * @return the decoration layout
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_header_bar_get_decoration_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether to show title buttons at the end of {@code self}.
     * @return {@code TRUE} if title buttons at the end are shown
     */
    public boolean getShowEndTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_header_bar_get_show_end_title_buttons.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether to show title buttons at the start of {@code self}.
     * @return {@code TRUE} if title buttons at the start are shown
     */
    public boolean getShowStartTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_header_bar_get_show_start_title_buttons.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the title widget widget of {@code self}.
     * @return the title widget
     */
    public @Nullable org.gtk.gtk.Widget getTitleWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_header_bar_get_title_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the end of {@code self}.
     * @param child the widget to be added to {@code self}
     */
    public void packEnd(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_header_bar_pack_end.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the start of the {@code self}.
     * @param child the widget to be added to {@code self}
     */
    public void packStart(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_header_bar_pack_start.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code self}.
     * <p>
     * The child must have been added with {@code HeaderBar#packStart},
     * {@code HeaderBar.pack_end#] or [property@HeaderBar:titleWidget}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_header_bar_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the policy for aligning the center widget.
     * @param centeringPolicy the centering policy
     */
    public void setCenteringPolicy(@NotNull org.gnome.adw.CenteringPolicy centeringPolicy) {
        java.util.Objects.requireNonNull(centeringPolicy, "Parameter 'centeringPolicy' must not be null");
        try {
            DowncallHandles.adw_header_bar_set_centering_policy.invokeExact(
                    handle(),
                    centeringPolicy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the decoration layout for {@code self}.
     * <p>
     * If this property is not set, the
     * {@code Gtk.Settings:gtk-decoration-layout} setting is used.
     * <p>
     * The format of the string is button names, separated by commas. A colon
     * separates the buttons that should appear at the start from those at the end.
     * Recognized button names are minimize, maximize, close and icon (the window
     * icon).
     * <p>
     * For example, “icon:minimize,maximize,close” specifies an icon at the start,
     * and minimize, maximize and close buttons at the end.
     * @param layout a decoration layout
     */
    public void setDecorationLayout(@Nullable java.lang.String layout) {
        try {
            DowncallHandles.adw_header_bar_set_decoration_layout.invokeExact(
                    handle(),
                    (Addressable) (layout == null ? MemoryAddress.NULL : Interop.allocateNativeString(layout)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show title buttons at the end of {@code self}.
     * <p>
     * See {@code HeaderBar:show-start-title-buttons} for the other side.
     * <p>
     * Which buttons are actually shown and where is determined by the
     * {@code HeaderBar:decoration-layout} property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be closed).
     * @param setting {@code TRUE} to show standard title buttons
     */
    public void setShowEndTitleButtons(boolean setting) {
        try {
            DowncallHandles.adw_header_bar_set_show_end_title_buttons.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show title buttons at the start of {@code self}.
     * <p>
     * See {@code HeaderBar:show-end-title-buttons} for the other side.
     * <p>
     * Which buttons are actually shown and where is determined by the
     * {@code HeaderBar:decoration-layout} property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be closed).
     * @param setting {@code TRUE} to show standard title buttons
     */
    public void setShowStartTitleButtons(boolean setting) {
        try {
            DowncallHandles.adw_header_bar_set_show_start_title_buttons.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title widget for {@code self}.
     * <p>
     * When set to {@code NULL}, the header bar will display the title of the window it
     * is contained in.
     * <p>
     * To use a different title, use {@link WindowTitle}:
     * <pre>{@code xml
     * <object class="AdwHeaderBar">
     *   <property name="title-widget">
     *     <object class="AdwWindowTitle">
     *       <property name="title" translatable="yes">Title</property>
     *     </object>
     *   </property>
     * </object>
     * }</pre>
     * @param titleWidget a widget to use for a title
     */
    public void setTitleWidget(@Nullable org.gtk.gtk.Widget titleWidget) {
        try {
            DowncallHandles.adw_header_bar_set_title_widget.invokeExact(
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_header_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link HeaderBar.Build} object constructs a {@link HeaderBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link HeaderBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link HeaderBar} using {@link HeaderBar#castFrom}.
         * @return A new instance of {@code HeaderBar} with the properties 
         *         that were set in the Build object.
         */
        public HeaderBar construct() {
            return HeaderBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    HeaderBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The policy for aligning the center widget.
         * @param centeringPolicy The value for the {@code centering-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCenteringPolicy(org.gnome.adw.CenteringPolicy centeringPolicy) {
            names.add("centering-policy");
            values.add(org.gtk.gobject.Value.create(centeringPolicy));
            return this;
        }
        
        /**
         * The decoration layout for buttons.
         * <p>
         * If this property is not set, the
         * {@code Gtk.Settings:gtk-decoration-layout} setting is used.
         * <p>
         * The format of the string is button names, separated by commas. A colon
         * separates the buttons that should appear at the start from those at the
         * end. Recognized button names are minimize, maximize, close and icon (the
         * window icon).
         * <p>
         * For example, “icon:minimize,maximize,close” specifies an icon at the start,
         * and minimize, maximize and close buttons at the end.
         * @param decorationLayout The value for the {@code decoration-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDecorationLayout(java.lang.String decorationLayout) {
            names.add("decoration-layout");
            values.add(org.gtk.gobject.Value.create(decorationLayout));
            return this;
        }
        
        /**
         * Whether to show title buttons at the end of the header bar.
         * <p>
         * See {@code HeaderBar:show-start-title-buttons} for the other side.
         * <p>
         * Which buttons are actually shown and where is determined by the
         * {@code HeaderBar:decoration-layout} property, and by the state of the
         * window (e.g. a close button will not be shown if the window can't be
         * closed).
         * @param showEndTitleButtons The value for the {@code show-end-title-buttons} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowEndTitleButtons(boolean showEndTitleButtons) {
            names.add("show-end-title-buttons");
            values.add(org.gtk.gobject.Value.create(showEndTitleButtons));
            return this;
        }
        
        /**
         * Whether to show title buttons at the start of the header bar.
         * <p>
         * See {@code HeaderBar:show-end-title-buttons} for the other side.
         * <p>
         * Which buttons are actually shown and where is determined by the
         * {@code HeaderBar:decoration-layout} property, and by the state of the
         * window (e.g. a close button will not be shown if the window can't be
         * closed).
         * @param showStartTitleButtons The value for the {@code show-start-title-buttons} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowStartTitleButtons(boolean showStartTitleButtons) {
            names.add("show-start-title-buttons");
            values.add(org.gtk.gobject.Value.create(showStartTitleButtons));
            return this;
        }
        
        /**
         * The title widget to display.
         * <p>
         * When set to {@code NULL}, the header bar will display the title of the window it
         * is contained in.
         * <p>
         * To use a different title, use {@link WindowTitle}:
         * <pre>{@code xml
         * <object class="AdwHeaderBar">
         *   <property name="title-widget">
         *     <object class="AdwWindowTitle">
         *       <property name="title" translatable="yes">Title</property>
         *     </object>
         *   </property>
         * </object>
         * }</pre>
         * @param titleWidget The value for the {@code title-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitleWidget(org.gtk.gtk.Widget titleWidget) {
            names.add("title-widget");
            values.add(org.gtk.gobject.Value.create(titleWidget));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_header_bar_new = Interop.downcallHandle(
            "adw_header_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_centering_policy = Interop.downcallHandle(
            "adw_header_bar_get_centering_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_decoration_layout = Interop.downcallHandle(
            "adw_header_bar_get_decoration_layout",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_show_end_title_buttons = Interop.downcallHandle(
            "adw_header_bar_get_show_end_title_buttons",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_show_start_title_buttons = Interop.downcallHandle(
            "adw_header_bar_get_show_start_title_buttons",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_title_widget = Interop.downcallHandle(
            "adw_header_bar_get_title_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_pack_end = Interop.downcallHandle(
            "adw_header_bar_pack_end",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_pack_start = Interop.downcallHandle(
            "adw_header_bar_pack_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_remove = Interop.downcallHandle(
            "adw_header_bar_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_set_centering_policy = Interop.downcallHandle(
            "adw_header_bar_set_centering_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_header_bar_set_decoration_layout = Interop.downcallHandle(
            "adw_header_bar_set_decoration_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_set_show_end_title_buttons = Interop.downcallHandle(
            "adw_header_bar_set_show_end_title_buttons",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_header_bar_set_show_start_title_buttons = Interop.downcallHandle(
            "adw_header_bar_set_show_start_title_buttons",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_header_bar_set_title_widget = Interop.downcallHandle(
            "adw_header_bar_set_title_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_header_bar_get_type = Interop.downcallHandle(
            "adw_header_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
