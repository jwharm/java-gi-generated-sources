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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public HeaderBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to HeaderBar */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        return new HeaderBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_header_bar_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwHeaderBar}.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    /**
     * Gets the policy for aligning the center widget.
     * @return the centering policy
     */
    public @NotNull org.gnome.adw.CenteringPolicy getCenteringPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_header_bar_get_centering_policy.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_header_bar_get_decoration_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether to show title buttons at the end of {@code self}.
     * @return {@code TRUE} if title buttons at the end are shown
     */
    public boolean getShowEndTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_header_bar_get_show_end_title_buttons.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.adw_header_bar_get_show_start_title_buttons.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_header_bar_get_title_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the end of {@code self}.
     * @param child the widget to be added to {@code self}
     */
    public void packEnd(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_header_bar_pack_end.invokeExact(handle(), child.handle());
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
            DowncallHandles.adw_header_bar_pack_start.invokeExact(handle(), child.handle());
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
            DowncallHandles.adw_header_bar_remove.invokeExact(handle(), child.handle());
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
            DowncallHandles.adw_header_bar_set_centering_policy.invokeExact(handle(), centeringPolicy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the decoration layout for {@code self}.
     * @param layout a decoration layout
     */
    public void setDecorationLayout(@Nullable java.lang.String layout) {
        java.util.Objects.requireNonNullElse(layout, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_header_bar_set_decoration_layout.invokeExact(handle(), Interop.allocateNativeString(layout));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show title buttons at the end of {@code self}.
     * @param setting {@code TRUE} to show standard title buttons
     */
    public void setShowEndTitleButtons(boolean setting) {
        try {
            DowncallHandles.adw_header_bar_set_show_end_title_buttons.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show title buttons at the start of {@code self}.
     * @param setting {@code TRUE} to show standard title buttons
     */
    public void setShowStartTitleButtons(boolean setting) {
        try {
            DowncallHandles.adw_header_bar_set_show_start_title_buttons.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title widget for {@code self}.
     * @param titleWidget a widget to use for a title
     */
    public void setTitleWidget(@Nullable org.gtk.gtk.Widget titleWidget) {
        java.util.Objects.requireNonNullElse(titleWidget, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_header_bar_set_title_widget.invokeExact(handle(), titleWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_header_bar_new = Interop.downcallHandle(
            "adw_header_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_get_centering_policy = Interop.downcallHandle(
            "adw_header_bar_get_centering_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_get_decoration_layout = Interop.downcallHandle(
            "adw_header_bar_get_decoration_layout",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_get_show_end_title_buttons = Interop.downcallHandle(
            "adw_header_bar_get_show_end_title_buttons",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_get_show_start_title_buttons = Interop.downcallHandle(
            "adw_header_bar_get_show_start_title_buttons",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_get_title_widget = Interop.downcallHandle(
            "adw_header_bar_get_title_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_pack_end = Interop.downcallHandle(
            "adw_header_bar_pack_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_pack_start = Interop.downcallHandle(
            "adw_header_bar_pack_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_remove = Interop.downcallHandle(
            "adw_header_bar_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_set_centering_policy = Interop.downcallHandle(
            "adw_header_bar_set_centering_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_header_bar_set_decoration_layout = Interop.downcallHandle(
            "adw_header_bar_set_decoration_layout",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_header_bar_set_show_end_title_buttons = Interop.downcallHandle(
            "adw_header_bar_set_show_end_title_buttons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_header_bar_set_show_start_title_buttons = Interop.downcallHandle(
            "adw_header_bar_set_show_start_title_buttons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_header_bar_set_title_widget = Interop.downcallHandle(
            "adw_header_bar_set_title_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
