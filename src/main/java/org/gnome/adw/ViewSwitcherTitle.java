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
     */
    protected ViewSwitcherTitle(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ViewSwitcherTitle> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ViewSwitcherTitle(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     * @return the stack
     */
    public @Nullable org.gnome.adw.ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStack) Interop.register(RESULT, org.gnome.adw.ViewStack.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the subtitle of {@code self}.
     * @return the subtitle
     */
    public java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_subtitle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_title_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.adw_view_switcher_title_get_title_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self}'s view switcher is enabled.
     * @return whether the view switcher is enabled
     */
    public boolean getViewSwitcherEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_title_get_view_switcher_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public void setSubtitle(java.lang.String subtitle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_view_switcher_title_set_subtitle.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(subtitle, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * <p>
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     * @param title a title
     */
    public void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_view_switcher_title_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_view_switcher_title_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ViewSwitcherTitle.Builder} object constructs a {@link ViewSwitcherTitle} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ViewSwitcherTitle.Builder#build()}. 
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
         * Finish building the {@link ViewSwitcherTitle} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewSwitcherTitle}.
         * @return A new instance of {@code ViewSwitcherTitle} with the properties 
         *         that were set in the Builder object.
         */
        public ViewSwitcherTitle build() {
            return (ViewSwitcherTitle) org.gtk.gobject.GObject.newWithProperties(
                ViewSwitcherTitle.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The stack the view switcher controls.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStack(org.gnome.adw.ViewStack stack) {
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
        public Builder setSubtitle(java.lang.String subtitle) {
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
        public Builder setTitle(java.lang.String title) {
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
        public Builder setTitleVisible(boolean titleVisible) {
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
        public Builder setViewSwitcherEnabled(boolean viewSwitcherEnabled) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_view_switcher_title_get_type != null;
    }
}
