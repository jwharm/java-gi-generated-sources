package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to present actions.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="action-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="action-row.png" alt="action-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwActionRow} widget can have a title, a subtitle and an icon. The row
 * can receive additional widgets at its end, or prefix widgets at its start.
 * <p>
 * It is convenient to present a preference and its related actions.
 * <p>
 * {@code AdwActionRow} is unactivatable by default, giving it an activatable widget
 * will automatically make it activatable, but unsetting it won't change the
 * row's activatability.
 * 
 * <h2>AdwActionRow as GtkBuildable</h2>
 * The {@code AdwActionRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a &lt;child&gt; element.
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwActionRow} has a main CSS node with name {@code row}.
 * <p>
 * It contains the subnode {@code box.header} for its main horizontal box, and
 * {@code box.title} for the vertical box containing the title and subtitle labels.
 * <p>
 * It contains subnodes {@code label.title} and {@code label.subtitle} representing
 * respectively the title label and subtitle label.
 */
public class ActionRow extends PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ActionRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ActionRow */
    public static ActionRow castFrom(org.gtk.gobject.Object gobject) {
        return new ActionRow(gobject.refcounted());
    }
    
    private static final MethodHandle adw_action_row_new = Interop.downcallHandle(
        "adw_action_row_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_action_row_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwActionRow}.
     */
    public ActionRow() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_action_row_activate = Interop.downcallHandle(
        "adw_action_row_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Activates {@code self}.
     */
    public @NotNull void activateRow() {
        try {
            adw_action_row_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_add_prefix = Interop.downcallHandle(
        "adw_action_row_add_prefix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a prefix widget to {@code self}.
     */
    public @NotNull void addPrefix(@NotNull org.gtk.gtk.Widget widget) {
        try {
            adw_action_row_add_prefix.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_add_suffix = Interop.downcallHandle(
        "adw_action_row_add_suffix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a suffix widget to {@code self}.
     */
    public @NotNull void addSuffix(@NotNull org.gtk.gtk.Widget widget) {
        try {
            adw_action_row_add_suffix.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_get_activatable_widget = Interop.downcallHandle(
        "adw_action_row_get_activatable_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget activated when {@code self} is activated.
     */
    public @Nullable org.gtk.gtk.Widget getActivatableWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_action_row_get_activatable_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_action_row_get_icon_name = Interop.downcallHandle(
        "adw_action_row_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name for {@code self}.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_action_row_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_action_row_get_subtitle = Interop.downcallHandle(
        "adw_action_row_get_subtitle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the subtitle for {@code self}.
     */
    public @Nullable java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_action_row_get_subtitle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_action_row_get_subtitle_lines = Interop.downcallHandle(
        "adw_action_row_get_subtitle_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public int getSubtitleLines() {
        int RESULT;
        try {
            RESULT = (int) adw_action_row_get_subtitle_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_action_row_get_title_lines = Interop.downcallHandle(
        "adw_action_row_get_title_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of lines at the end of which the title label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public int getTitleLines() {
        int RESULT;
        try {
            RESULT = (int) adw_action_row_get_title_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_action_row_remove = Interop.downcallHandle(
        "adw_action_row_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code self}.
     */
    public @NotNull void remove(@NotNull org.gtk.gtk.Widget widget) {
        try {
            adw_action_row_remove.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_set_activatable_widget = Interop.downcallHandle(
        "adw_action_row_set_activatable_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget to activate when {@code self} is activated.
     */
    public @NotNull void setActivatableWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            adw_action_row_set_activatable_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_set_icon_name = Interop.downcallHandle(
        "adw_action_row_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name for {@code self}.
     */
    public @NotNull void setIconName(@Nullable java.lang.String iconName) {
        try {
            adw_action_row_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_set_subtitle = Interop.downcallHandle(
        "adw_action_row_set_subtitle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the subtitle for {@code self}.
     */
    public @NotNull void setSubtitle(@NotNull java.lang.String subtitle) {
        try {
            adw_action_row_set_subtitle.invokeExact(handle(), Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_set_subtitle_lines = Interop.downcallHandle(
        "adw_action_row_set_subtitle_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public @NotNull void setSubtitleLines(@NotNull int subtitleLines) {
        try {
            adw_action_row_set_subtitle_lines.invokeExact(handle(), subtitleLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_action_row_set_title_lines = Interop.downcallHandle(
        "adw_action_row_set_title_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of lines at the end of which the title label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public @NotNull void setTitleLines(@NotNull int titleLines) {
        try {
            adw_action_row_set_title_lines.invokeExact(handle(), titleLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivatedHandler {
        void signalReceived(ActionRow source);
    }
    
    /**
     * This signal is emitted after the row has been activated.
     */
    public SignalHandle onActivated(ActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionRow.Callbacks.class, "signalActionRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalActionRowActivated(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionRow.ActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionRow(Refcounted.get(source)));
        }
        
    }
}
