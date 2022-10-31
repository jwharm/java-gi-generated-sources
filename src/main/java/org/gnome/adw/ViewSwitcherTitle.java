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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ViewSwitcherTitle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ViewSwitcherTitle if its GType is a (or inherits from) "AdwViewSwitcherTitle".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ViewSwitcherTitle" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewSwitcherTitle", a ClassCastException will be thrown.
     */
    public static ViewSwitcherTitle castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwViewSwitcherTitle"))) {
            return new ViewSwitcherTitle(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewSwitcherTitle");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_view_switcher_title_new.invokeExact(), false);
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
        return new org.gnome.adw.ViewStack(Refcounted.get(RESULT, false));
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_switcher_title_new = Interop.downcallHandle(
            "adw_view_switcher_title_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_get_stack = Interop.downcallHandle(
            "adw_view_switcher_title_get_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_get_subtitle = Interop.downcallHandle(
            "adw_view_switcher_title_get_subtitle",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_get_title = Interop.downcallHandle(
            "adw_view_switcher_title_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_get_title_visible = Interop.downcallHandle(
            "adw_view_switcher_title_get_title_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_get_view_switcher_enabled = Interop.downcallHandle(
            "adw_view_switcher_title_get_view_switcher_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_set_stack = Interop.downcallHandle(
            "adw_view_switcher_title_set_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_set_subtitle = Interop.downcallHandle(
            "adw_view_switcher_title_set_subtitle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_set_title = Interop.downcallHandle(
            "adw_view_switcher_title_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_title_set_view_switcher_enabled = Interop.downcallHandle(
            "adw_view_switcher_title_set_view_switcher_enabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
