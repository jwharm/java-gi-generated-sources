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
 * 
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
 * 
 * <h2>CSS nodes</h2>
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
 * 
 * <h2>Accessibility</h2>
 * {@code AdwHeaderBar} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class HeaderBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public HeaderBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to HeaderBar */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        return new HeaderBar(gobject.refcounted());
    }
    
    private static final MethodHandle adw_header_bar_new = Interop.downcallHandle(
        "adw_header_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_header_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwHeaderBar}.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_header_bar_get_centering_policy = Interop.downcallHandle(
        "adw_header_bar_get_centering_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the policy for aligning the center widget.
     */
    public @NotNull CenteringPolicy getCenteringPolicy() {
        int RESULT;
        try {
            RESULT = (int) adw_header_bar_get_centering_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CenteringPolicy(RESULT);
    }
    
    private static final MethodHandle adw_header_bar_get_decoration_layout = Interop.downcallHandle(
        "adw_header_bar_get_decoration_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the decoration layout for {@code self}.
     */
    public @Nullable java.lang.String getDecorationLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_header_bar_get_decoration_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_header_bar_get_show_end_title_buttons = Interop.downcallHandle(
        "adw_header_bar_get_show_end_title_buttons",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to show title buttons at the end of {@code self}.
     */
    public boolean getShowEndTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) adw_header_bar_get_show_end_title_buttons.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_header_bar_get_show_start_title_buttons = Interop.downcallHandle(
        "adw_header_bar_get_show_start_title_buttons",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to show title buttons at the start of {@code self}.
     */
    public boolean getShowStartTitleButtons() {
        int RESULT;
        try {
            RESULT = (int) adw_header_bar_get_show_start_title_buttons.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_header_bar_get_title_widget = Interop.downcallHandle(
        "adw_header_bar_get_title_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title widget widget of {@code self}.
     */
    public @Nullable org.gtk.gtk.Widget getTitleWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_header_bar_get_title_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_header_bar_pack_end = Interop.downcallHandle(
        "adw_header_bar_pack_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the end of {@code self}.
     */
    public @NotNull void packEnd(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_header_bar_pack_end.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_pack_start = Interop.downcallHandle(
        "adw_header_bar_pack_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the start of the {@code self}.
     */
    public @NotNull void packStart(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_header_bar_pack_start.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_remove = Interop.downcallHandle(
        "adw_header_bar_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code self}.
     * <p>
     * The child must have been added with {@link HeaderBar#packStart},
     * {@code HeaderBar:title-widget}.
     */
    public @NotNull void remove(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_header_bar_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_set_centering_policy = Interop.downcallHandle(
        "adw_header_bar_set_centering_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the policy for aligning the center widget.
     */
    public @NotNull void setCenteringPolicy(@NotNull CenteringPolicy centeringPolicy) {
        try {
            adw_header_bar_set_centering_policy.invokeExact(handle(), centeringPolicy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_set_decoration_layout = Interop.downcallHandle(
        "adw_header_bar_set_decoration_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the decoration layout for {@code self}.
     */
    public @NotNull void setDecorationLayout(@Nullable java.lang.String layout) {
        try {
            adw_header_bar_set_decoration_layout.invokeExact(handle(), Interop.allocateNativeString(layout));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_set_show_end_title_buttons = Interop.downcallHandle(
        "adw_header_bar_set_show_end_title_buttons",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to show title buttons at the end of {@code self}.
     */
    public @NotNull void setShowEndTitleButtons(@NotNull boolean setting) {
        try {
            adw_header_bar_set_show_end_title_buttons.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_set_show_start_title_buttons = Interop.downcallHandle(
        "adw_header_bar_set_show_start_title_buttons",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to show title buttons at the start of {@code self}.
     */
    public @NotNull void setShowStartTitleButtons(@NotNull boolean setting) {
        try {
            adw_header_bar_set_show_start_title_buttons.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_header_bar_set_title_widget = Interop.downcallHandle(
        "adw_header_bar_set_title_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title widget for {@code self}.
     */
    public @NotNull void setTitleWidget(@Nullable org.gtk.gtk.Widget titleWidget) {
        try {
            adw_header_bar_set_title_widget.invokeExact(handle(), titleWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
