package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkWindow} is a toplevel window which can contain other widgets.
 * <p>
 * <img src="./doc-files/window.png" alt="An example GtkWindow">
 * <p>
 * Windows normally have decorations that are under the control
 * of the windowing system and allow the user to manipulate the window
 * (resize it, move it, close it,...).
 * <p>
 * <strong>GtkWindow as GtkBuildable</strong><br/>
 * The {@code GtkWindow} implementation of the {@code Gtk.Buildable} interface supports
 * setting a child as the titlebar by specifying “titlebar” as the “type”
 * attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * window.background [.csd / .solid-csd / .ssd] [.maximized / .fullscreen / .tiled]
 * ├── <child>
 * ╰── <titlebar child>.titlebar [.default-decoration]
 * }</pre>
 * <p>
 * {@code GtkWindow} has a main CSS node with name window and style class .background.
 * <p>
 * Style classes that are typically used with the main CSS node are .csd (when
 * client-side decorations are in use), .solid-csd (for client-side decorations
 * without invisible borders), .ssd (used by mutter when rendering server-side
 * decorations). GtkWindow also represents window states with the following
 * style classes on the main node: .maximized, .fullscreen, .tiled (when supported,
 * also .tiled-top, .tiled-left, .tiled-right, .tiled-bottom).
 * <p>
 * {@code GtkWindow} subclasses often add their own discriminating style classes,
 * such as .dialog, .popup or .tooltip.
 * <p>
 * Generally, some CSS properties don't make sense on the toplevel window node,
 * such as margins or padding. When client-side decorations without invisible
 * borders are in use (i.e. the .solid-csd style class is added to the
 * main window node), the CSS border of the toplevel window is used for
 * resize drags. In the .csd case, the shadow area outside of the window
 * can be used to resize it.
 * <p>
 * {@code GtkWindow} adds the .titlebar and .default-decoration style classes to the
 * widget that is added as a titlebar child.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkWindow} uses the {@link AccessibleRole#WINDOW} role.
 * <p>
 * <strong>Actions</strong><br/>
 * {@code GtkWindow} defines a set of built-in actions:
 * <ul>
 * <li>{@code default.activate}: Activate the default widget.
 * <li>{@code window.minimize}: Minimize the window.
 * <li>{@code window.toggle-maximized}: Maximize or restore the window.
 * <li>{@code window.close}: Close the window.
 * </ul>
 */
public class Window extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWindow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Window proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Window(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Window if its GType is a (or inherits from) "GtkWindow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Window" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkWindow", a ClassCastException will be thrown.
     */
    public static Window castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkWindow"))) {
            return new Window(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkWindow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkWindow}.
     * <p>
     * To get an undecorated window (no window borders), use
     * {@link Window#setDecorated}.
     * <p>
     * All top-level windows created by gtk_window_new() are stored
     * in an internal top-level window list. This list can be obtained
     * from {@link Window#listToplevels}. Due to GTK keeping a
     * reference to the window internally, gtk_window_new() does not
     * return a reference to the caller.
     * <p>
     * To delete a {@code GtkWindow}, call {@link Window#destroy}.
     */
    public Window() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Requests that the window is closed.
     * <p>
     * This is similar to what happens when a window manager
     * close button is clicked.
     * <p>
     * This function can be used with close buttons in custom
     * titlebars.
     */
    public void close() {
        try {
            DowncallHandles.gtk_window_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Drop the internal reference GTK holds on toplevel windows.
     */
    public void destroy() {
        try {
            DowncallHandles.gtk_window_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to place {@code window} in the fullscreen state.
     * <p>
     * Note that you shouldn’t assume the window is definitely fullscreen
     * afterward, because other entities (e.g. the user or window manager
     * unfullscreen it again, and not all window managers honor requests
     * to fullscreen windows.
     * <p>
     * You can track the result of this operation via the
     * {@code Gdk.Toplevel:state} property, or by listening to
     * notifications of the {@code Gtk.Window:fullscreened} property.
     */
    public void fullscreen() {
        try {
            DowncallHandles.gtk_window_fullscreen.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to place {@code window} in the fullscreen state on the given {@code monitor}.
     * <p>
     * Note that you shouldn't assume the window is definitely fullscreen
     * afterward, or that the windowing system allows fullscreen windows on
     * any given monitor.
     * <p>
     * You can track the result of this operation via the
     * {@code Gdk.Toplevel:state} property, or by listening to
     * notifications of the {@code Gtk.Window:fullscreened} property.
     * @param monitor which monitor to go fullscreen on
     */
    public void fullscreenOnMonitor(@NotNull org.gtk.gdk.Monitor monitor) {
        java.util.Objects.requireNonNull(monitor, "Parameter 'monitor' must not be null");
        try {
            DowncallHandles.gtk_window_fullscreen_on_monitor.invokeExact(
                    handle(),
                    monitor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code GtkApplication} associated with the window.
     * @return a {@code GtkApplication}
     */
    public @Nullable org.gtk.gtk.Application getApplication() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_application.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Application(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code window}.
     * @return the child widget of {@code window}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the window has been set to have decorations.
     * @return {@code true} if the window has been set to have decorations
     */
    public boolean getDecorated() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_decorated.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the default size of the window.
     * <p>
     * A value of 0 for the width or height indicates that a default
     * size has not been explicitly set for that dimension, so the
     * “natural” size of the window will be used.
     * @param width location to store the default width
     * @param height location to store the default height
     */
    public void getDefaultSize(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_window_get_default_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Returns the default widget for {@code window}.
     * @return the default widget
     */
    public @Nullable org.gtk.gtk.Widget getDefaultWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_default_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the window has been set to have a close button.
     * @return {@code true} if the window has been set to have a close button
     */
    public boolean getDeletable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_deletable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the window will be destroyed with its transient parent.
     * @return {@code true} if the window will be destroyed with its transient parent.
     */
    public boolean getDestroyWithParent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_destroy_with_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current focused widget within the window.
     * <p>
     * Note that this is the widget that would have the focus
     * if the toplevel window focused; if the toplevel window
     * is not focused then {@code gtk_widget_has_focus (widget)} will
     * not be {@code true} for the widget.
     * @return the currently focused widget
     */
    public @Nullable org.gtk.gtk.Widget getFocus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether “focus rectangles” are supposed to be visible.
     * @return {@code true} if “focus rectangles” are supposed to be visible
     *   in this window.
     */
    public boolean getFocusVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_focus_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the group for {@code window}.
     * <p>
     * If the window has no group, then the default group is returned.
     * @return the {@code GtkWindowGroup} for a window
     *   or the default group
     */
    public @NotNull org.gtk.gtk.WindowGroup getGroup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_group.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.WindowGroup(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether this window reacts to F10 key presses by
     * activating a menubar it contains.
     * @return {@code true} if the window handles F10
     */
    public boolean getHandleMenubarAccel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_handle_menubar_accel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the window will be hidden when the close button is clicked.
     * @return {@code true} if the window will be hidden
     */
    public boolean getHideOnClose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_hide_on_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the name of the themed icon for the window.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether mnemonics are supposed to be visible.
     * @return {@code true} if mnemonics are supposed to be visible
     *   in this window.
     */
    public boolean getMnemonicsVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_mnemonics_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the window is modal.
     * @return {@code true} if the window is set to be modal and
     *   establishes a grab when shown
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_modal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value set by gtk_window_set_resizable().
     * @return {@code true} if the user can resize the window
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_get_resizable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the title of the window.
     * @return the title of the window
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the custom titlebar that has been set with
     * gtk_window_set_titlebar().
     * @return the custom titlebar
     */
    public @Nullable org.gtk.gtk.Widget getTitlebar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_titlebar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetches the transient parent for this window.
     * @return the transient parent for this window
     */
    public @Nullable org.gtk.gtk.Window getTransientFor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_transient_for.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Window(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether {@code window} has an explicit window group.
     * @return {@code true} if {@code window} has an explicit window group.
     */
    public boolean hasGroup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_has_group.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the window is part of the current active toplevel.
     * <p>
     * The active toplevel is the window receiving keystrokes.
     * <p>
     * The return value is {@code true} if the window is active toplevel itself.
     * You might use this function if you wanted to draw a widget
     * differently in an active window from a widget in an inactive window.
     * @return {@code true} if the window part of the current active window.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current fullscreen state of {@code window}.
     * <p>
     * Note that since fullscreening is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * {@link Window#fullscreen} or {@link Window#unfullscreen}.
     * <p>
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is fullscreen.
     * @return whether the window has a fullscreen state.
     */
    public boolean isFullscreen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_is_fullscreen.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current maximized state of {@code window}.
     * <p>
     * Note that since maximization is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * {@link Window#maximize} or {@link Window#unmaximize}.
     * <p>
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is maximized.
     * @return whether the window has a maximized state.
     */
    public boolean isMaximized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_window_is_maximized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asks to maximize {@code window}, so that it fills the screen.
     * <p>
     * Note that you shouldn’t assume the window is definitely maximized
     * afterward, because other entities (e.g. the user or window manager
     * could unmaximize it again, and not all window managers support
     * maximization.
     * <p>
     * It’s permitted to call this function before showing a window,
     * in which case the window will be maximized when it appears onscreen
     * initially.
     * <p>
     * You can track the result of this operation via the
     * {@code Gdk.Toplevel:state} property, or by listening to
     * notifications on the {@code Gtk.Window:maximized}
     * property.
     */
    public void maximize() {
        try {
            DowncallHandles.gtk_window_maximize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to minimize the specified {@code window}.
     * <p>
     * Note that you shouldn’t assume the window is definitely minimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager
     * could unminimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     * <p>
     * It’s permitted to call this function before showing a window,
     * in which case the window will be minimized before it ever appears
     * onscreen.
     * <p>
     * You can track result of this operation via the
     * {@code Gdk.Toplevel:state} property.
     */
    public void minimize() {
        try {
            DowncallHandles.gtk_window_minimize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Presents a window to the user.
     * <p>
     * This function should not be used as when it is called,
     * it is too late to gather a valid timestamp to allow focus
     * stealing prevention to work correctly.
     */
    public void present() {
        try {
            DowncallHandles.gtk_window_present.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Presents a window to the user.
     * <p>
     * This may mean raising the window in the stacking order,
     * unminimizing it, moving it to the current desktop, and/or
     * giving it the keyboard focus, possibly dependent on the user’s
     * platform, window manager, and preferences.
     * <p>
     * If {@code window} is hidden, this function calls {@link Widget#show}
     * as well.
     * <p>
     * This function should be used when the user tries to open a window
     * that’s already open. Say for example the preferences dialog is
     * currently open, and the user chooses Preferences from the menu
     * a second time; use {@link Window#present} to move the
     * already-open dialog where the user can see it.
     * <p>
     * Presents a window to the user in response to a user interaction.
     * The timestamp should be gathered when the window was requested
     * to be shown (when clicking a link for example), rather than once
     * the window is ready to be shown.
     * @param timestamp the timestamp of the user interaction (typically a
     *   button or key press event) which triggered this call
     */
    public void presentWithTime(int timestamp) {
        try {
            DowncallHandles.gtk_window_present_with_time.invokeExact(
                    handle(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or unsets the {@code GtkApplication} associated with the window.
     * <p>
     * The application will be kept alive for at least as long as it has
     * any windows associated with it (see g_application_hold() for a way
     * to keep it alive without windows).
     * <p>
     * Normally, the connection between the application and the window will
     * remain until the window is destroyed, but you can explicitly remove
     * it by setting the {@code application} to {@code null}.
     * <p>
     * This is equivalent to calling {@link Application#removeWindow}
     * and/or {@link Application#addWindow} on the old/new applications
     * as relevant.
     * @param application a {@code GtkApplication}, or {@code null} to unset
     */
    public void setApplication(@Nullable org.gtk.gtk.Application application) {
        try {
            DowncallHandles.gtk_window_set_application.invokeExact(
                    handle(),
                    (Addressable) (application == null ? MemoryAddress.NULL : application.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code window}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_window_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the window should be decorated.
     * <p>
     * By default, windows are decorated with a title bar, resize
     * controls, etc. Some window managers allow GTK to disable these
     * decorations, creating a borderless window. If you set the decorated
     * property to {@code false} using this function, GTK will do its best to
     * convince the window manager not to decorate the window. Depending on
     * the system, this function may not have any effect when called on a
     * window that is already visible, so you should call it before calling
     * {@link Widget#show}.
     * <p>
     * On Windows, this function always works, since there’s no window manager
     * policy involved.
     * @param setting {@code true} to decorate the window
     */
    public void setDecorated(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_decorated.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default size of a window.
     * <p>
     * If the window’s “natural” size (its size request) is larger than
     * the default, the default will be ignored.
     * <p>
     * Unlike {@link Widget#setSizeRequest}, which sets a size
     * request for a widget and thus would keep users from shrinking
     * the window, this function only sets the initial size, just as
     * if the user had resized the window themselves. Users can still
     * shrink the window again as they normally would. Setting a default
     * size of -1 means to use the “natural” default size (the size request
     * of the window).
     * <p>
     * The default size of a window only affects the first time a window is
     * shown; if a window is hidden and re-shown, it will remember the size
     * it had prior to hiding, rather than using the default size.
     * <p>
     * Windows can’t actually be 0x0 in size, they must be at least 1x1, but
     * passing 0 for {@code width} and {@code height} is OK, resulting in a 1x1 default size.
     * <p>
     * If you use this function to reestablish a previously saved window size,
     * note that the appropriate size to save is the one returned by
     * {@link Window#getDefaultSize}. Using the window allocation
     * directly will not work in all circumstances and can lead to growing
     * or shrinking windows.
     * @param width width in pixels, or -1 to unset the default width
     * @param height height in pixels, or -1 to unset the default height
     */
    public void setDefaultSize(int width, int height) {
        try {
            DowncallHandles.gtk_window_set_default_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default widget.
     * <p>
     * The default widget is the widget that is activated when the user
     * presses Enter in a dialog (for example).
     * @param defaultWidget widget to be the default
     *   to unset the default widget for the toplevel
     */
    public void setDefaultWidget(@Nullable org.gtk.gtk.Widget defaultWidget) {
        try {
            DowncallHandles.gtk_window_set_default_widget.invokeExact(
                    handle(),
                    (Addressable) (defaultWidget == null ? MemoryAddress.NULL : defaultWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the window should be deletable.
     * <p>
     * By default, windows have a close button in the window frame.
     * Some  window managers allow GTK to disable this button. If you
     * set the deletable property to {@code false} using this function, GTK
     * will do its best to convince the window manager not to show a
     * close button. Depending on the system, this function may not
     * have any effect when called on a window that is already visible,
     * so you should call it before calling {@link Widget#show}.
     * <p>
     * On Windows, this function always works, since there’s no window
     * manager policy involved.
     * @param setting {@code true} to decorate the window as deletable
     */
    public void setDeletable(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_deletable.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code setting} is {@code true}, then destroying the transient parent of {@code window}
     * will also destroy {@code window} itself.
     * <p>
     * This is useful for dialogs that shouldn’t persist beyond the lifetime
     * of the main window they are associated with, for example.
     * @param setting whether to destroy {@code window} with its transient parent
     */
    public void setDestroyWithParent(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_destroy_with_parent.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GdkDisplay} where the {@code window} is displayed.
     * <p>
     * If the window is already mapped, it will be unmapped,
     * and then remapped on the new display.
     * @param display a {@code GdkDisplay}
     */
    public void setDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        try {
            DowncallHandles.gtk_window_set_display.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the focus widget.
     * <p>
     * If {@code focus} is not the current focus widget, and is focusable,
     * sets it as the focus widget for the window. If {@code focus} is {@code null},
     * unsets the focus widget for this window. To set the focus to a
     * particular widget in the toplevel, it is usually more convenient
     * to use {@link Widget#grabFocus} instead of this function.
     * @param focus widget to be the new focus widget, or {@code null} to unset
     *   any focus widget for the toplevel window.
     */
    public void setFocus(@Nullable org.gtk.gtk.Widget focus) {
        try {
            DowncallHandles.gtk_window_set_focus.invokeExact(
                    handle(),
                    (Addressable) (focus == null ? MemoryAddress.NULL : focus.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether “focus rectangles” are supposed to be visible.
     * @param setting the new value
     */
    public void setFocusVisible(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_focus_visible.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this window should react to F10 key presses
     * by activating a menubar it contains.
     * @param handleMenubarAccel {@code true} to make {@code window} handle F10
     */
    public void setHandleMenubarAccel(boolean handleMenubarAccel) {
        try {
            DowncallHandles.gtk_window_set_handle_menubar_accel.invokeExact(
                    handle(),
                    handleMenubarAccel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code setting} is {@code true}, then clicking the close button on the window
     * will not destroy it, but only hide it.
     * @param setting whether to hide the window when it is closed
     */
    public void setHideOnClose(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_hide_on_close.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon for the window from a named themed icon.
     * <p>
     * See the docs for {@link IconTheme} for more details.
     * On some platforms, the window icon is not used at all.
     * <p>
     * Note that this has nothing to do with the WM_ICON_NAME
     * property which is mentioned in the ICCCM.
     * @param name the name of the themed icon
     */
    public void setIconName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_window_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether mnemonics are supposed to be visible.
     * @param setting the new value
     */
    public void setMnemonicsVisible(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_mnemonics_visible.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a window modal or non-modal.
     * <p>
     * Modal windows prevent interaction with other windows in the same
     * application. To keep modal dialogs on top of main application windows,
     * use {@link Window#setTransientFor} to make the dialog transient
     * for the parent; most window managers will then disallow lowering the
     * dialog below the parent.
     * @param modal whether the window is modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_window_set_modal.invokeExact(
                    handle(),
                    modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the user can resize a window.
     * <p>
     * Windows are user resizable by default.
     * @param resizable {@code true} if the user can resize this window
     */
    public void setResizable(boolean resizable) {
        try {
            DowncallHandles.gtk_window_set_resizable.invokeExact(
                    handle(),
                    resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the startup notification ID.
     * <p>
     * Startup notification identifiers are used by desktop environment
     * to track application startup, to provide user feedback and other
     * features. This function changes the corresponding property on the
     * underlying {@code GdkSurface}.
     * <p>
     * Normally, startup identifier is managed automatically and you should
     * only use this function in special cases like transferring focus from
     * other processes. You should use this function before calling
     * {@link Window#present} or any equivalent function generating
     * a window map event.
     * <p>
     * This function is only useful on X11, not with other GTK targets.
     * @param startupId a string with startup-notification identifier
     */
    public void setStartupId(@NotNull java.lang.String startupId) {
        java.util.Objects.requireNonNull(startupId, "Parameter 'startupId' must not be null");
        try {
            DowncallHandles.gtk_window_set_startup_id.invokeExact(
                    handle(),
                    Interop.allocateNativeString(startupId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of the {@code GtkWindow}.
     * <p>
     * The title of a window will be displayed in its title bar; on the
     * X Window System, the title bar is rendered by the window manager
     * so exactly how the title appears to users may vary according to a
     * user’s exact configuration. The title should help a user distinguish
     * this window from other windows they may have open. A good title might
     * include the application name and current document filename, for example.
     * <p>
     * Passing {@code null} does the same as setting the title to an empty string.
     * @param title title of the window
     */
    public void setTitle(@Nullable java.lang.String title) {
        try {
            DowncallHandles.gtk_window_set_title.invokeExact(
                    handle(),
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a custom titlebar for {@code window}.
     * <p>
     * A typical widget used here is {@link HeaderBar}, as it
     * provides various features expected of a titlebar while allowing
     * the addition of child widgets to it.
     * <p>
     * If you set a custom titlebar, GTK will do its best to convince
     * the window manager not to put its own titlebar on the window.
     * Depending on the system, this function may not work for a window
     * that is already visible, so you set the titlebar before calling
     * {@link Widget#show}.
     * @param titlebar the widget to use as titlebar
     */
    public void setTitlebar(@Nullable org.gtk.gtk.Widget titlebar) {
        try {
            DowncallHandles.gtk_window_set_titlebar.invokeExact(
                    handle(),
                    (Addressable) (titlebar == null ? MemoryAddress.NULL : titlebar.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Dialog windows should be set transient for the main application
     * window they were spawned from. This allows window managers to e.g.
     * keep the dialog on top of the main window, or center the dialog
     * over the main window. {@link Dialog#newWithButtons} and other
     * convenience functions in GTK will sometimes call
     * gtk_window_set_transient_for() on your behalf.
     * <p>
     * Passing {@code null} for {@code parent} unsets the current transient window.
     * <p>
     * On Windows, this function puts the child window on top of the parent,
     * much as the window manager would have done on X.
     * @param parent parent window
     */
    public void setTransientFor(@Nullable org.gtk.gtk.Window parent) {
        try {
            DowncallHandles.gtk_window_set_transient_for.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to remove the fullscreen state for {@code window}, and return to
     * its previous state.
     * <p>
     * Note that you shouldn’t assume the window is definitely not
     * fullscreen afterward, because other entities (e.g. the user or
     * window manager could fullscreen it again, and not all window
     * managers honor requests to unfullscreen windows; normally the
     * window will end up restored to its normal state. Just don’t
     * write code that crashes if not.
     * <p>
     * You can track the result of this operation via the
     * {@code Gdk.Toplevel:state} property, or by listening to
     * notifications of the {@code Gtk.Window:fullscreened} property.
     */
    public void unfullscreen() {
        try {
            DowncallHandles.gtk_window_unfullscreen.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to unmaximize {@code window}.
     * <p>
     * Note that you shouldn’t assume the window is definitely unmaximized
     * afterward, because other entities (e.g. the user or window manager
     * maximize it again, and not all window managers honor requests to
     * unmaximize.
     * <p>
     * You can track the result of this operation via the
     * {@code Gdk.Toplevel:state} property, or by listening to
     * notifications on the {@code Gtk.Window:maximized} property.
     */
    public void unmaximize() {
        try {
            DowncallHandles.gtk_window_unmaximize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Asks to unminimize the specified {@code window}.
     * <p>
     * Note that you shouldn’t assume the window is definitely unminimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager
     * could minimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     * <p>
     * You can track result of this operation via the
     * {@code Gdk.Toplevel:state} property.
     */
    public void unminimize() {
        try {
            DowncallHandles.gtk_window_unminimize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the fallback icon name for windows.
     * <p>
     * The returned string is owned by GTK and should not
     * be modified. It is only valid until the next call to
     * {@link Window#setDefaultIconName}.
     * @return the fallback icon name for windows
     */
    public static @Nullable java.lang.String getDefaultIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_default_icon_name.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns a list of all existing toplevel windows.
     * <p>
     * If you want to iterate through the list and perform actions involving
     * callbacks that might destroy the widgets or add new ones, be aware that
     * the list of toplevels will change and emit the "items-changed" signal.
     * @return the list
     *   of toplevel widgets
     */
    public static @NotNull org.gtk.gio.ListModel getToplevels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_get_toplevels.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a list of all existing toplevel windows.
     * <p>
     * The widgets in the list are not individually referenced.
     * If you want to iterate through the list and perform actions
     * involving callbacks that might destroy the widgets, you must
     * call {@code g_list_foreach (result, (GFunc)g_object_ref, NULL)} first,
     * and then unref all the widgets afterwards.
     * @return list of
     *   toplevel widgets
     */
    public static @NotNull org.gtk.glib.List listToplevels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_window_list_toplevels.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Sets whether the window should request startup notification.
     * <p>
     * By default, after showing the first {@code GtkWindow}, GTK calls
     * {@link org.gtk.gdk.Display#notifyStartupComplete}. Call this function
     * to disable the automatic startup notification. You might do this
     * if your first window is a splash screen, and you want to delay
     * notification until after your real main window has been shown,
     * for example.
     * <p>
     * In that example, you would disable startup notification
     * temporarily, show your splash screen, then re-enable it so that
     * showing the main window would automatically result in notification.
     * @param setting {@code true} to automatically do startup notification
     */
    public static void setAutoStartupNotification(boolean setting) {
        try {
            DowncallHandles.gtk_window_set_auto_startup_notification.invokeExact(
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets an icon to be used as fallback.
     * <p>
     * The fallback icon is used for windows that
     * haven't had {@link Window#setIconName}
     * called on them.
     * @param name the name of the themed icon
     */
    public static void setDefaultIconName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_window_set_default_icon_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Opens or closes the <a href="running.html#interactive-debugging">interactive debugger</a>.
     * <p>
     * The debugger offers access to the widget hierarchy of the application
     * and to useful debugging tools.
     * @param enable {@code true} to enable interactive debugging
     */
    public static void setInteractiveDebugging(boolean enable) {
        try {
            DowncallHandles.gtk_window_set_interactive_debugging.invokeExact(
                    enable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateDefault {
        void signalReceived(Window source);
    }
    
    /**
     * Emitted when the user activates the default widget
     * of {@code window}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Window.ActivateDefault> onActivateDefault(Window.ActivateDefault handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-default"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Window.Callbacks.class, "signalWindowActivateDefault",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Window.ActivateDefault>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateFocus {
        void signalReceived(Window source);
    }
    
    /**
     * Emitted when the user activates the currently focused
     * widget of {@code window}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Window.ActivateFocus> onActivateFocus(Window.ActivateFocus handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Window.Callbacks.class, "signalWindowActivateFocus",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Window.ActivateFocus>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CloseRequest {
        boolean signalReceived(Window source);
    }
    
    /**
     * Emitted when the user clicks on the close button of the window.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Window.CloseRequest> onCloseRequest(Window.CloseRequest handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close-request"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Window.Callbacks.class, "signalWindowCloseRequest",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Window.CloseRequest>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EnableDebugging {
        boolean signalReceived(Window source, boolean toggle);
    }
    
    /**
     * Emitted when the user enables or disables interactive debugging.
     * <p>
     * When {@code toggle} is {@code true}, interactive debugging is toggled on or off,
     * when it is {@code false}, the debugger will be pointed at the widget
     * under the pointer.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are Ctrl-Shift-I
     * and Ctrl-Shift-D.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Window.EnableDebugging> onEnableDebugging(Window.EnableDebugging handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enable-debugging"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Window.Callbacks.class, "signalWindowEnableDebugging",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Window.EnableDebugging>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeysChanged {
        void signalReceived(Window source);
    }
    
    /**
     * emitted when the set of accelerators or mnemonics that
     * are associated with {@code window} changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Window.KeysChanged> onKeysChanged(Window.KeysChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("keys-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Window.Callbacks.class, "signalWindowKeysChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Window.KeysChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_window_new = Interop.downcallHandle(
            "gtk_window_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_close = Interop.downcallHandle(
            "gtk_window_close",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_destroy = Interop.downcallHandle(
            "gtk_window_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_fullscreen = Interop.downcallHandle(
            "gtk_window_fullscreen",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_fullscreen_on_monitor = Interop.downcallHandle(
            "gtk_window_fullscreen_on_monitor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_application = Interop.downcallHandle(
            "gtk_window_get_application",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_child = Interop.downcallHandle(
            "gtk_window_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_decorated = Interop.downcallHandle(
            "gtk_window_get_decorated",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_default_size = Interop.downcallHandle(
            "gtk_window_get_default_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_default_widget = Interop.downcallHandle(
            "gtk_window_get_default_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_deletable = Interop.downcallHandle(
            "gtk_window_get_deletable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_destroy_with_parent = Interop.downcallHandle(
            "gtk_window_get_destroy_with_parent",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_focus = Interop.downcallHandle(
            "gtk_window_get_focus",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_focus_visible = Interop.downcallHandle(
            "gtk_window_get_focus_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_group = Interop.downcallHandle(
            "gtk_window_get_group",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_handle_menubar_accel = Interop.downcallHandle(
            "gtk_window_get_handle_menubar_accel",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_hide_on_close = Interop.downcallHandle(
            "gtk_window_get_hide_on_close",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_icon_name = Interop.downcallHandle(
            "gtk_window_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_mnemonics_visible = Interop.downcallHandle(
            "gtk_window_get_mnemonics_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_modal = Interop.downcallHandle(
            "gtk_window_get_modal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_resizable = Interop.downcallHandle(
            "gtk_window_get_resizable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_title = Interop.downcallHandle(
            "gtk_window_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_titlebar = Interop.downcallHandle(
            "gtk_window_get_titlebar",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_transient_for = Interop.downcallHandle(
            "gtk_window_get_transient_for",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_has_group = Interop.downcallHandle(
            "gtk_window_has_group",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_is_active = Interop.downcallHandle(
            "gtk_window_is_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_is_fullscreen = Interop.downcallHandle(
            "gtk_window_is_fullscreen",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_is_maximized = Interop.downcallHandle(
            "gtk_window_is_maximized",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_maximize = Interop.downcallHandle(
            "gtk_window_maximize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_minimize = Interop.downcallHandle(
            "gtk_window_minimize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_present = Interop.downcallHandle(
            "gtk_window_present",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_present_with_time = Interop.downcallHandle(
            "gtk_window_present_with_time",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_application = Interop.downcallHandle(
            "gtk_window_set_application",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_child = Interop.downcallHandle(
            "gtk_window_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_decorated = Interop.downcallHandle(
            "gtk_window_set_decorated",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_default_size = Interop.downcallHandle(
            "gtk_window_set_default_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_default_widget = Interop.downcallHandle(
            "gtk_window_set_default_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_deletable = Interop.downcallHandle(
            "gtk_window_set_deletable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_destroy_with_parent = Interop.downcallHandle(
            "gtk_window_set_destroy_with_parent",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_display = Interop.downcallHandle(
            "gtk_window_set_display",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_focus = Interop.downcallHandle(
            "gtk_window_set_focus",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_focus_visible = Interop.downcallHandle(
            "gtk_window_set_focus_visible",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_handle_menubar_accel = Interop.downcallHandle(
            "gtk_window_set_handle_menubar_accel",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_hide_on_close = Interop.downcallHandle(
            "gtk_window_set_hide_on_close",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_icon_name = Interop.downcallHandle(
            "gtk_window_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_mnemonics_visible = Interop.downcallHandle(
            "gtk_window_set_mnemonics_visible",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_modal = Interop.downcallHandle(
            "gtk_window_set_modal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_resizable = Interop.downcallHandle(
            "gtk_window_set_resizable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_startup_id = Interop.downcallHandle(
            "gtk_window_set_startup_id",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_title = Interop.downcallHandle(
            "gtk_window_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_titlebar = Interop.downcallHandle(
            "gtk_window_set_titlebar",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_transient_for = Interop.downcallHandle(
            "gtk_window_set_transient_for",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_unfullscreen = Interop.downcallHandle(
            "gtk_window_unfullscreen",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_unmaximize = Interop.downcallHandle(
            "gtk_window_unmaximize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_unminimize = Interop.downcallHandle(
            "gtk_window_unminimize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_default_icon_name = Interop.downcallHandle(
            "gtk_window_get_default_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_get_toplevels = Interop.downcallHandle(
            "gtk_window_get_toplevels",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_list_toplevels = Interop.downcallHandle(
            "gtk_window_list_toplevels",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_auto_startup_notification = Interop.downcallHandle(
            "gtk_window_set_auto_startup_notification",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_window_set_default_icon_name = Interop.downcallHandle(
            "gtk_window_set_default_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_window_set_interactive_debugging = Interop.downcallHandle(
            "gtk_window_set_interactive_debugging",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalWindowActivateDefault(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Window.ActivateDefault) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Window(source, Ownership.UNKNOWN));
        }
        
        public static void signalWindowActivateFocus(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Window.ActivateFocus) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Window(source, Ownership.UNKNOWN));
        }
        
        public static boolean signalWindowCloseRequest(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Window.CloseRequest) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Window(source, Ownership.UNKNOWN));
        }
        
        public static boolean signalWindowEnableDebugging(MemoryAddress source, int toggle, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Window.EnableDebugging) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Window(source, Ownership.UNKNOWN), toggle != 0);
        }
        
        public static void signalWindowKeysChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Window.KeysChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Window(source, Ownership.UNKNOWN));
        }
    }
}
