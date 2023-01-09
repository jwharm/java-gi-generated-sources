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
 * {@link Paned#setStartChild} and {@link Paned#setEndChild}.
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
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <p>
 * <strong>Creating a paned widget with minimum sizes.</strong><br/>
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
public class Paned extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPaned";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Paned proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Paned(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Paned> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Paned(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_new.invokeExact(orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPaned} widget.
     * @param orientation the paned’s orientation.
     */
    public Paned(org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Retrieves the end child of the given {@code GtkPaned}.
     * @return the end child widget
     */
    public @Nullable org.gtk.gtk.Widget getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_get_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the position of the divider between the two panes.
     * @return the position of the divider, in pixels
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:end-child} can be resized.
     * @return true if the end child is resizable
     */
    public boolean getResizeEndChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_resize_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can be resized.
     * @return true if the start child is resizable
     */
    public boolean getResizeStartChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_resize_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:end-child} can shrink.
     * @return true if the end child is shrinkable
     */
    public boolean getShrinkEndChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_shrink_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can shrink.
     * @return true if the start child is shrinkable
     */
    public boolean getShrinkStartChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_shrink_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the start child of the given {@code GtkPaned}.
     * @return the start child widget
     */
    public @Nullable org.gtk.gtk.Widget getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_get_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the separator should be wide.
     * @return {@code true} if the paned should have a wide handle
     */
    public boolean getWideHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_wide_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the end child of {@code paned} to {@code child}.
     * <p>
     * If {@code child} is {@code NULL}, the existing child will be removed.
     * @param child the widget to add
     */
    public void setEndChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_paned_set_end_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the position of the divider between the two panes.
     * @param position pixel position of divider, a negative value means that the position
     *   is unset
     */
    public void setPosition(int position) {
        try {
            DowncallHandles.gtk_paned_set_position.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code Gtk.Paned:end-child} can be resized.
     * @param resize true to let the end child be resized
     */
    public void setResizeEndChild(boolean resize) {
        try {
            DowncallHandles.gtk_paned_set_resize_end_child.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(resize, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code Gtk.Paned:start-child} can be resized.
     * @param resize true to let the start child be resized
     */
    public void setResizeStartChild(boolean resize) {
        try {
            DowncallHandles.gtk_paned_set_resize_start_child.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(resize, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code Gtk.Paned:end-child} can shrink.
     * @param resize true to let the end child be shrunk
     */
    public void setShrinkEndChild(boolean resize) {
        try {
            DowncallHandles.gtk_paned_set_shrink_end_child.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(resize, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code Gtk.Paned:start-child} can shrink.
     * @param resize true to let the start child be shrunk
     */
    public void setShrinkStartChild(boolean resize) {
        try {
            DowncallHandles.gtk_paned_set_shrink_start_child.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(resize, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the start child of {@code paned} to {@code child}.
     * <p>
     * If {@code child} is {@code NULL}, the existing child will be removed.
     * @param child the widget to add
     */
    public void setStartChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_paned_set_start_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the separator should be wide.
     * @param wide the new value for the {@code Gtk.Paned:wide-handle} property
     */
    public void setWideHandle(boolean wide) {
        try {
            DowncallHandles.gtk_paned_set_wide_handle.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(wide, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_paned_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AcceptPosition} callback.
     */
    @FunctionalInterface
    public interface AcceptPosition {
    
        /**
         * Emitted to accept the current position of the handle when
         * moving it using key bindings.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Return&lt;/kbd&gt; or
         * &lt;kbd&gt;Space&lt;/kbd&gt;.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AcceptPosition.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to accept the current position of the handle when
     * moving it using key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Return&lt;/kbd&gt; or
     * &lt;kbd&gt;Space&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.AcceptPosition> onAcceptPosition(Paned.AcceptPosition handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("accept-position", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CancelPosition} callback.
     */
    @FunctionalInterface
    public interface CancelPosition {
    
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
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CancelPosition.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.CancelPosition> onCancelPosition(Paned.CancelPosition handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cancel-position", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CycleChildFocus} callback.
     */
    @FunctionalInterface
    public interface CycleChildFocus {
    
        /**
         * Emitted to cycle the focus between the children of the paned.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding is &lt;kbd&gt;F6&lt;/kbd&gt;.
         */
        boolean run(boolean reversed);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned, int reversed) {
            var RESULT = run(Marshal.integerToBoolean.marshal(reversed, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CycleChildFocus.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to cycle the focus between the children of the paned.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding is &lt;kbd&gt;F6&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.CycleChildFocus> onCycleChildFocus(Paned.CycleChildFocus handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cycle-child-focus", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CycleHandleFocus} callback.
     */
    @FunctionalInterface
    public interface CycleHandleFocus {
    
        /**
         * Emitted to cycle whether the paned should grab focus to allow
         * the user to change position of the handle by using key bindings.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;F8&lt;/kbd&gt;.
         */
        boolean run(boolean reversed);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned, int reversed) {
            var RESULT = run(Marshal.integerToBoolean.marshal(reversed, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CycleHandleFocus.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to cycle whether the paned should grab focus to allow
     * the user to change position of the handle by using key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;F8&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.CycleHandleFocus> onCycleHandleFocus(Paned.CycleHandleFocus handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cycle-handle-focus", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveHandle} callback.
     */
    @FunctionalInterface
    public interface MoveHandle {
    
        /**
         * Emitted to move the handle with key bindings.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         */
        boolean run(org.gtk.gtk.ScrollType scrollType);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned, int scrollType) {
            var RESULT = run(org.gtk.gtk.ScrollType.of(scrollType));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveHandle.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to move the handle with key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.MoveHandle> onMoveHandle(Paned.MoveHandle handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-handle", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleHandleFocus} callback.
     */
    @FunctionalInterface
    public interface ToggleHandleFocus {
    
        /**
         * Emitted to accept the current position of the handle and then
         * move focus to the next widget in the focus chain.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding is &lt;kbd&gt;Tab&lt;/kbd&gt;.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourcePaned) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleHandleFocus.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to accept the current position of the handle and then
     * move focus to the next widget in the focus chain.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding is &lt;kbd&gt;Tab&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.ToggleHandleFocus> onToggleHandleFocus(Paned.ToggleHandleFocus handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-handle-focus", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Paned.Builder} object constructs a {@link Paned} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Paned.Builder#build()}. 
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
         * Finish building the {@link Paned} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Paned}.
         * @return A new instance of {@code Paned} with the properties 
         *         that were set in the Builder object.
         */
        public Paned build() {
            return (Paned) org.gtk.gobject.GObject.newWithProperties(
                Paned.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The second child.
         * @param endChild The value for the {@code end-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEndChild(org.gtk.gtk.Widget endChild) {
            names.add("end-child");
            values.add(org.gtk.gobject.Value.create(endChild));
            return this;
        }
        
        /**
         * The largest possible value for the {@code Gtk.Paned:position}
         * property.
         * <p>
         * This property is derived from the size and shrinkability
         * of the widget's children.
         * @param maxPosition The value for the {@code max-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxPosition(int maxPosition) {
            names.add("max-position");
            values.add(org.gtk.gobject.Value.create(maxPosition));
            return this;
        }
        
        /**
         * The smallest possible value for the {@code Gtk.Paned:position}
         * property.
         * <p>
         * This property is derived from the size and shrinkability
         * of the widget's children.
         * @param minPosition The value for the {@code min-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinPosition(int minPosition) {
            names.add("min-position");
            values.add(org.gtk.gobject.Value.create(minPosition));
            return this;
        }
        
        /**
         * Position of the separator in pixels, from the left/top.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(int position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * Whether the {@code Gtk.Paned:position} property has been set.
         * @param positionSet The value for the {@code position-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPositionSet(boolean positionSet) {
            names.add("position-set");
            values.add(org.gtk.gobject.Value.create(positionSet));
            return this;
        }
        
        /**
         * Determines whether the second child expands and shrinks
         * along with the paned widget.
         * @param resizeEndChild The value for the {@code resize-end-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResizeEndChild(boolean resizeEndChild) {
            names.add("resize-end-child");
            values.add(org.gtk.gobject.Value.create(resizeEndChild));
            return this;
        }
        
        /**
         * Determines whether the first child expands and shrinks
         * along with the paned widget.
         * @param resizeStartChild The value for the {@code resize-start-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResizeStartChild(boolean resizeStartChild) {
            names.add("resize-start-child");
            values.add(org.gtk.gobject.Value.create(resizeStartChild));
            return this;
        }
        
        /**
         * Determines whether the second child can be made smaller
         * than its requisition.
         * @param shrinkEndChild The value for the {@code shrink-end-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShrinkEndChild(boolean shrinkEndChild) {
            names.add("shrink-end-child");
            values.add(org.gtk.gobject.Value.create(shrinkEndChild));
            return this;
        }
        
        /**
         * Determines whether the first child can be made smaller
         * than its requisition.
         * @param shrinkStartChild The value for the {@code shrink-start-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShrinkStartChild(boolean shrinkStartChild) {
            names.add("shrink-start-child");
            values.add(org.gtk.gobject.Value.create(shrinkStartChild));
            return this;
        }
        
        /**
         * The first child.
         * @param startChild The value for the {@code start-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStartChild(org.gtk.gtk.Widget startChild) {
            names.add("start-child");
            values.add(org.gtk.gobject.Value.create(startChild));
            return this;
        }
        
        /**
         * Whether the {@code GtkPaned} should provide a stronger visual separation.
         * <p>
         * For example, this could be set when a paned contains two
         * {@link Notebook}s, whose tab rows would otherwise merge visually.
         * @param wideHandle The value for the {@code wide-handle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWideHandle(boolean wideHandle) {
            names.add("wide-handle");
            values.add(org.gtk.gobject.Value.create(wideHandle));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_paned_new = Interop.downcallHandle(
                "gtk_paned_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_get_end_child = Interop.downcallHandle(
                "gtk_paned_get_end_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_position = Interop.downcallHandle(
                "gtk_paned_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_resize_end_child = Interop.downcallHandle(
                "gtk_paned_get_resize_end_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_resize_start_child = Interop.downcallHandle(
                "gtk_paned_get_resize_start_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_shrink_end_child = Interop.downcallHandle(
                "gtk_paned_get_shrink_end_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_shrink_start_child = Interop.downcallHandle(
                "gtk_paned_get_shrink_start_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_start_child = Interop.downcallHandle(
                "gtk_paned_get_start_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_get_wide_handle = Interop.downcallHandle(
                "gtk_paned_get_wide_handle",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_set_end_child = Interop.downcallHandle(
                "gtk_paned_set_end_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_set_position = Interop.downcallHandle(
                "gtk_paned_set_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_set_resize_end_child = Interop.downcallHandle(
                "gtk_paned_set_resize_end_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_set_resize_start_child = Interop.downcallHandle(
                "gtk_paned_set_resize_start_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_set_shrink_end_child = Interop.downcallHandle(
                "gtk_paned_set_shrink_end_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_set_shrink_start_child = Interop.downcallHandle(
                "gtk_paned_set_shrink_start_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_set_start_child = Interop.downcallHandle(
                "gtk_paned_set_start_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paned_set_wide_handle = Interop.downcallHandle(
                "gtk_paned_set_wide_handle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paned_get_type = Interop.downcallHandle(
                "gtk_paned_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_paned_get_type != null;
    }
}
