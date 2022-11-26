package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A view switcher title.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher-title.png" alt="view-switcher-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * A widget letting you switch between multiple views contained by a
 * {@link ViewStack}.
 * <p>
 * It is designed to be used as the title widget of a {@link HeaderBar}, and
 * will display the window's title when the window is too narrow to fit the view
 * switcher e.g. on mobile phones, or if there are less than two views.
 * <p>
 * In order to center the title in narrow windows, the header bar should have
 * {@code HeaderBar:centering-policy} set to
 * {@code ADW_CENTERING_POLICY_STRICT}.
 * <p>
 * {@code AdwViewSwitcherTitle} is intended to be used together with
 * {@link ViewSwitcherBar}.
 * <p>
 * A common use case is to bind the {@code ViewSwitcherBar:reveal} property
 * to {@code ViewSwitcherTitle:title-visible} to automatically reveal the
 * view switcher bar when the title label is displayed in place of the view
 * switcher, as follows:
 * <pre>{@code xml
 * <object class="GtkWindow">
 *   <property name="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <property name="title-widget">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 *   <property>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwViewStack" id="stack"/>
 *       </child>
 *       <child>
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwViewSwitcherTitle} has a single CSS node with name {@code viewswitchertitle}.
 * @version 1.0
 */
public class ViewSwitcherTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcherTitle";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ViewSwitcherTitle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ViewSwitcherTitle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ViewSwitcherTitle if its GType is a (or inherits from) "AdwViewSwitcherTitle".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ViewSwitcherTitle} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewSwitcherTitle", a ClassCastException will be thrown.
     */
    public static ViewSwitcherTitle castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ViewSwitcherTitle.getType())) {
            return new ViewSwitcherTitle(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewSwitcherTitle");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherTitle}.
     */
    public ViewSwitcherTitle() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     * @return the stack
     */
    public @Nullable org.gnome.adw.ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStack(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the subtitle of {@code self}.
     * @return the subtitle
     */
    public @NotNull java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the title of {@code self} is currently visible.
     * <p>
     * If the title is visible, it means the view switcher is hidden an it may be
     * wanted to show an alternative switcher, e.g. a {@link ViewSwitcherBar}.
     * @return whether the title of {@code self} is currently visible
     */
    public boolean getTitleVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_title_get_title_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self}'s view switcher is enabled.
     * @return whether the view switcher is enabled
     */
    public boolean getViewSwitcherEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_title_get_view_switcher_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     * @param stack a stack
     */
    public void setStack(@Nullable org.gnome.adw.ViewStack stack) {
        try {
            DowncallHandles.adw_view_switcher_title_set_stack.invokeExact(
                    handle(),
                    (Addressable) (stack == null ? MemoryAddress.NULL : stack.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the subtitle of {@code self}.
     * <p>
     * The subtitle should give the user additional details.
     * @param subtitle a subtitle
     */
    public void setSubtitle(@NotNull java.lang.String subtitle) {
        java.util.Objects.requireNonNull(subtitle, "Parameter 'subtitle' must not be null");
        try {
            DowncallHandles.adw_view_switcher_title_set_subtitle.invokeExact(
                    handle(),
                    Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * <p>
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     * @param title a title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_view_switcher_title_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self}'s view switcher is enabled.
     * <p>
     * If it is disabled, the title will be displayed instead. This allows to
     * programmatically hide the view switcher even if it fits in the available
     * space.
     * <p>
     * This can be used e.g. to ensure the view switcher is hidden below a certain
     * window width, or any other constraint you find suitable.
     * @param enabled whether the view switcher is enabled
     */
    public void setViewSwitcherEnabled(boolean enabled) {
        try {
            DowncallHandles.adw_view_switcher_title_set_view_switcher_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
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
            RESULT = (long) DowncallHandles.adw_view_switcher_title_get_type.invokeExact();
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
         * A {@link ViewSwitcherTitle.Build} object constructs a {@link ViewSwitcherTitle} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ViewSwitcherTitle} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewSwitcherTitle} using {@link ViewSwitcherTitle#castFrom}.
         * @return A new instance of {@code ViewSwitcherTitle} with the properties 
         *         that were set in the Build object.
         */
        public ViewSwitcherTitle construct() {
            return ViewSwitcherTitle.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ViewSwitcherTitle.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The stack the view switcher controls.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStack(org.gnome.adw.ViewStack stack) {
            names.add("stack");
            values.add(org.gtk.gobject.Value.create(stack));
            return this;
        }
        
        /**
         * The subtitle to display.
         * <p>
         * The subtitle should give the user additional details.
         * @param subtitle The value for the {@code subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
        
        /**
         * The title to display.
         * <p>
         * The title typically identifies the current view or content item, and
         * generally does not use the application name.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether the title is currently visible.
         * <p>
         * If the title is visible, it means the view switcher is hidden an it may be
         * wanted to show an alternative switcher, e.g. a {@link ViewSwitcherBar}.
         * @param titleVisible The value for the {@code title-visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitleVisible(boolean titleVisible) {
            names.add("title-visible");
            values.add(org.gtk.gobject.Value.create(titleVisible));
            return this;
        }
        
        /**
         * Whether the view switcher is enabled.
         * <p>
         * If it is disabled, the title will be displayed instead. This allows to
         * programmatically hide the view switcher even if it fits in the available
         * space.
         * <p>
         * This can be used e.g. to ensure the view switcher is hidden below a certain
         * window width, or any other constraint you find suitable.
         * @param viewSwitcherEnabled The value for the {@code view-switcher-enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setViewSwitcherEnabled(boolean viewSwitcherEnabled) {
            names.add("view-switcher-enabled");
            values.add(org.gtk.gobject.Value.create(viewSwitcherEnabled));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_switcher_title_new = Interop.downcallHandle(
            "adw_view_switcher_title_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_stack = Interop.downcallHandle(
            "adw_view_switcher_title_get_stack",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_subtitle = Interop.downcallHandle(
            "adw_view_switcher_title_get_subtitle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_title = Interop.downcallHandle(
            "adw_view_switcher_title_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_title_visible = Interop.downcallHandle(
            "adw_view_switcher_title_get_title_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_view_switcher_enabled = Interop.downcallHandle(
            "adw_view_switcher_title_get_view_switcher_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_set_stack = Interop.downcallHandle(
            "adw_view_switcher_title_set_stack",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_set_subtitle = Interop.downcallHandle(
            "adw_view_switcher_title_set_subtitle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_set_title = Interop.downcallHandle(
            "adw_view_switcher_title_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_set_view_switcher_enabled = Interop.downcallHandle(
            "adw_view_switcher_title_set_view_switcher_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_switcher_title_get_type = Interop.downcallHandle(
            "adw_view_switcher_title_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
