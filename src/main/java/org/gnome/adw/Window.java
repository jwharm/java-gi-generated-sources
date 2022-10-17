package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A freeform window.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window.png" alt="window"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwWindow} widget is a subclass of {@link org.gtk.gtk.Window} which has no
 * titlebar area. It means {@link org.gtk.gtk.HeaderBar} can be used as follows:
 * 
 * <pre>{@code xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="GtkHeaderBar"/>
 *       </child>
 *       <child>
 *         <!-- ... -->
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * Using {@code Gtk.Window.set_titlebar}
 * is not supported and will result in a crash.
 */
public class Window extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {

    public Window(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Window */
    public static Window castFrom(org.gtk.gobject.Object gobject) {
        return new Window(gobject.refcounted());
    }
    
    private static final MethodHandle adw_window_new = Interop.downcallHandle(
        "adw_window_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_window_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwWindow}.
     */
    public Window() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_window_get_content = Interop.downcallHandle(
        "adw_window_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#getChild}.
     */
    public @Nullable org.gtk.gtk.Widget getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_window_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_window_set_content = Interop.downcallHandle(
        "adw_window_set_content",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#setChild}.
     */
    public @NotNull void setContent(@Nullable org.gtk.gtk.Widget content) {
        try {
            adw_window_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
