package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget with two panes, arranged either horizontally or vertically.
 * <p>
 * <img src="./doc-files/panes.png" alt="An example GtkPaned">
 * <p>
 * The division between the two panes is adjustable by the user
 * by dragging a handle.
 * <p>
 * Child widgets are added to the panes of the widget with
 * {@code Gtk.Paned.set_end_child}.
 * The division between the two children is set by default from the size
 * requests of the children, but it can be adjusted by the user.
 * <p>
 * A paned widget draws a separator between the two child widgets and a
 * small handle that the user can drag to adjust the division. It does not
 * draw any relief around the children or around the separator. (The space
 * in which the separator is called the gutter.) Often, it is useful to put
 * each child inside a {@link Frame} so that the gutter appears as a
 * ridge. No separator is drawn if one of the children is missing.
 * <p>
 * Each child has two options that can be set, "resize" and "shrink". If
 * "resize" is true then, when the {@code GtkPaned} is resized, that child will
 * expand or shrink along with the paned widget. If "shrink" is true, then
 * that child can be made smaller than its requisition by the user.
 * Setting "shrink" to false allows the application to set a minimum size.
 * If "resize" is false for both children, then this is treated as if
 * "resize" is true for both children.
 * <p>
 * The application can set the position of the slider as if it were set
 * by the user, by calling {@link Paned#setPosition}.
 * 
 * <h1>CSS nodes</h1>
 * <pre>{@code 
 * paned
 * ├── <child>
 * ├── separator[.wide]
 * ╰── <child>
 * }</pre>
 * <p>
 * {@code GtkPaned} has a main CSS node with name paned, and a subnode for
 * the separator with name separator. The subnode gets a .wide style
 * class when the paned is supposed to be wide.
 * <p>
 * In horizontal orientation, the nodes are arranged based on the text
 * direction, so in left-to-right mode, :first-child will select the
 * leftmost child, while it will select the rightmost child in
 * RTL layouts.
 * 
 * <h2>Creating a paned widget with minimum sizes.</h2>
 * <pre>{@code c
 * GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
 * GtkWidget *frame1 = gtk_frame_new (NULL);
 * GtkWidget *frame2 = gtk_frame_new (NULL);
 * 
 * gtk_widget_set_size_request (hpaned, 200, -1);
 * 
 * gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
 * gtk_paned_set_start_child_resize (GTK_PANED (hpaned), TRUE);
 * gtk_paned_set_start_child_shrink (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame1, 50, -1);
 * 
 * gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
 * gtk_paned_set_end_child_resize (GTK_PANED (hpaned), FALSE);
 * gtk_paned_set_end_child_shrink (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame2, 50, -1);
 * }</pre>
 */
public class Paned extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Paned(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Paned */
    public static Paned castFrom(org.gtk.gobject.Object gobject) {
        return new Paned(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_paned_new = Interop.downcallHandle(
        "gtk_paned_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull Orientation orientation) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paned_new.invokeExact(orientation.getValue()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaned} widget.
     */
    public Paned(@NotNull Orientation orientation) {
        super(constructNew(orientation));
    }
    
    private static final MethodHandle gtk_paned_get_end_child = Interop.downcallHandle(
        "gtk_paned_get_end_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the end child of the given {@code GtkPaned}.
     */
    public @Nullable Widget getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paned_get_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_paned_get_position = Interop.downcallHandle(
        "gtk_paned_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the position of the divider between the two panes.
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paned_get_resize_end_child = Interop.downcallHandle(
        "gtk_paned_get_resize_end_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code Gtk.Paned:end-child} can be resized.
     */
    public boolean getResizeEndChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_resize_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paned_get_resize_start_child = Interop.downcallHandle(
        "gtk_paned_get_resize_start_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can be resized.
     */
    public boolean getResizeStartChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_resize_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paned_get_shrink_end_child = Interop.downcallHandle(
        "gtk_paned_get_shrink_end_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code Gtk.Paned:end-child} can shrink.
     */
    public boolean getShrinkEndChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_shrink_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paned_get_shrink_start_child = Interop.downcallHandle(
        "gtk_paned_get_shrink_start_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can shrink.
     */
    public boolean getShrinkStartChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_shrink_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paned_get_start_child = Interop.downcallHandle(
        "gtk_paned_get_start_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the start child of the given {@code GtkPaned}.
     */
    public @Nullable Widget getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paned_get_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_paned_get_wide_handle = Interop.downcallHandle(
        "gtk_paned_get_wide_handle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the separator should be wide.
     */
    public boolean getWideHandle() {
        int RESULT;
        try {
            RESULT = (int) gtk_paned_get_wide_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paned_set_end_child = Interop.downcallHandle(
        "gtk_paned_set_end_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the end child of {@code paned} to {@code child}.
     * <p>
     * If {@code child} is {@code NULL}, the existing child will be removed.
     */
    public @NotNull void setEndChild(@Nullable Widget child) {
        try {
            gtk_paned_set_end_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_position = Interop.downcallHandle(
        "gtk_paned_set_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the position of the divider between the two panes.
     */
    public @NotNull void setPosition(@NotNull int position) {
        try {
            gtk_paned_set_position.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_resize_end_child = Interop.downcallHandle(
        "gtk_paned_set_resize_end_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code Gtk.Paned:end-child} can be resized.
     */
    public @NotNull void setResizeEndChild(@NotNull boolean resize) {
        try {
            gtk_paned_set_resize_end_child.invokeExact(handle(), resize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_resize_start_child = Interop.downcallHandle(
        "gtk_paned_set_resize_start_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code Gtk.Paned:start-child} can be resized.
     */
    public @NotNull void setResizeStartChild(@NotNull boolean resize) {
        try {
            gtk_paned_set_resize_start_child.invokeExact(handle(), resize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_shrink_end_child = Interop.downcallHandle(
        "gtk_paned_set_shrink_end_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code Gtk.Paned:end-child} can shrink.
     */
    public @NotNull void setShrinkEndChild(@NotNull boolean resize) {
        try {
            gtk_paned_set_shrink_end_child.invokeExact(handle(), resize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_shrink_start_child = Interop.downcallHandle(
        "gtk_paned_set_shrink_start_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code Gtk.Paned:start-child} can shrink.
     */
    public @NotNull void setShrinkStartChild(@NotNull boolean resize) {
        try {
            gtk_paned_set_shrink_start_child.invokeExact(handle(), resize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_start_child = Interop.downcallHandle(
        "gtk_paned_set_start_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the start child of {@code paned} to {@code child}.
     * <p>
     * If {@code child} is {@code NULL}, the existing child will be removed.
     */
    public @NotNull void setStartChild(@Nullable Widget child) {
        try {
            gtk_paned_set_start_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paned_set_wide_handle = Interop.downcallHandle(
        "gtk_paned_set_wide_handle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the separator should be wide.
     */
    public @NotNull void setWideHandle(@NotNull boolean wide) {
        try {
            gtk_paned_set_wide_handle.invokeExact(handle(), wide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AcceptPositionHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to accept the current position of the handle when
     * moving it using key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Return&lt;/kbd&gt; or
     * &lt;kbd&gt;Space&lt;/kbd&gt;.
     */
    public SignalHandle onAcceptPosition(AcceptPositionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept-position"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedAcceptPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CancelPositionHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to cancel moving the position of the handle using key
     * bindings.
     * <p>
     * The position of the handle will be reset to the value prior to
     * moving it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Escape&lt;/kbd&gt;.
     */
    public SignalHandle onCancelPosition(CancelPositionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel-position"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCancelPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CycleChildFocusHandler {
        boolean signalReceived(Paned source, @NotNull boolean reversed);
    }
    
    /**
     * Emitted to cycle the focus between the children of the paned.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding is &lt;kbd&gt;F6&lt;/kbd&gt;.
     */
    public SignalHandle onCycleChildFocus(CycleChildFocusHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cycle-child-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCycleChildFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CycleHandleFocusHandler {
        boolean signalReceived(Paned source, @NotNull boolean reversed);
    }
    
    /**
     * Emitted to cycle whether the paned should grab focus to allow
     * the user to change position of the handle by using key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;F8&lt;/kbd&gt;.
     */
    public SignalHandle onCycleHandleFocus(CycleHandleFocusHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cycle-handle-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCycleHandleFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveHandleHandler {
        boolean signalReceived(Paned source, @NotNull ScrollType scrollType);
    }
    
    /**
     * Emitted to move the handle with key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public SignalHandle onMoveHandle(MoveHandleHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-handle"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedMoveHandle",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleHandleFocusHandler {
        boolean signalReceived(Paned source);
    }
    
    /**
     * Emitted to accept the current position of the handle and then
     * move focus to the next widget in the focus chain.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding is &lt;kbd&gt;Tab&lt;/kbd&gt;.
     */
    public SignalHandle onToggleHandleFocus(ToggleHandleFocusHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-handle-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedToggleHandleFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalPanedAcceptPosition(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.AcceptPositionHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)));
        }
        
        public static boolean signalPanedCancelPosition(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.CancelPositionHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)));
        }
        
        public static boolean signalPanedCycleChildFocus(MemoryAddress source, int reversed, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.CycleChildFocusHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)), reversed != 0);
        }
        
        public static boolean signalPanedCycleHandleFocus(MemoryAddress source, int reversed, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.CycleHandleFocusHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)), reversed != 0);
        }
        
        public static boolean signalPanedMoveHandle(MemoryAddress source, int scrollType, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.MoveHandleHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)), new ScrollType(scrollType));
        }
        
        public static boolean signalPanedToggleHandleFocus(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Paned.ToggleHandleFocusHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Paned(Refcounted.get(source)));
        }
        
    }
}
