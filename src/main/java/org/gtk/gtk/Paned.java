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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Paned(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Paned if its GType is a (or inherits from) "GtkPaned".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Paned} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPaned", a ClassCastException will be thrown.
     */
    public static Paned castFrom(org.gtk.gobject.Object gobject) {
            return new Paned(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_new.invokeExact(
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPaned} widget.
     * @param orientation the paned’s orientation.
     */
    public Paned(@NotNull org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation), Ownership.NONE);
    }
    
    /**
     * Retrieves the end child of the given {@code GtkPaned}.
     * @return the end child widget
     */
    public @Nullable org.gtk.gtk.Widget getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_get_end_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the position of the divider between the two panes.
     * @return the position of the divider, in pixels
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_position.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_paned_get_resize_end_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can be resized.
     * @return true if the start child is resizable
     */
    public boolean getResizeStartChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_resize_start_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:end-child} can shrink.
     * @return true if the end child is shrinkable
     */
    public boolean getShrinkEndChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_shrink_end_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code Gtk.Paned:start-child} can shrink.
     * @return true if the start child is shrinkable
     */
    public boolean getShrinkStartChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_shrink_start_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the start child of the given {@code GtkPaned}.
     * @return the start child widget
     */
    public @Nullable org.gtk.gtk.Widget getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paned_get_start_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the separator should be wide.
     * @return {@code true} if the paned should have a wide handle
     */
    public boolean getWideHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paned_get_wide_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    resize ? 1 : 0);
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
                    resize ? 1 : 0);
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
                    resize ? 1 : 0);
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
                    resize ? 1 : 0);
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
                    wide ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_paned_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AcceptPosition {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.AcceptPosition> onAcceptPosition(Paned.AcceptPosition handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept-position"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedAcceptPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.AcceptPosition>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CancelPosition {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.CancelPosition> onCancelPosition(Paned.CancelPosition handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel-position"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCancelPosition",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.CancelPosition>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CycleChildFocus {
        boolean signalReceived(Paned source, boolean reversed);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cycle-child-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCycleChildFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.CycleChildFocus>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CycleHandleFocus {
        boolean signalReceived(Paned source, boolean reversed);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cycle-handle-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedCycleHandleFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.CycleHandleFocus>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveHandle {
        boolean signalReceived(Paned source, @NotNull org.gtk.gtk.ScrollType scrollType);
    }
    
    /**
     * Emitted to move the handle with key bindings.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Paned.MoveHandle> onMoveHandle(Paned.MoveHandle handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-handle"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedMoveHandle",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.MoveHandle>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleHandleFocus {
        boolean signalReceived(Paned source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-handle-focus"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Paned.Callbacks.class, "signalPanedToggleHandleFocus",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Paned.ToggleHandleFocus>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Paned.Build} object constructs a {@link Paned} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Paned} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Paned} using {@link Paned#castFrom}.
         * @return A new instance of {@code Paned} with the properties 
         *         that were set in the Build object.
         */
        public Paned construct() {
            return Paned.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Paned.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The second child.
         * @param endChild The value for the {@code end-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEndChild(org.gtk.gtk.Widget endChild) {
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
        public Build setMaxPosition(int maxPosition) {
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
        public Build setMinPosition(int minPosition) {
            names.add("min-position");
            values.add(org.gtk.gobject.Value.create(minPosition));
            return this;
        }
        
        /**
         * Position of the separator in pixels, from the left/top.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPosition(int position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * Whether the {@code Gtk.Paned:position} property has been set.
         * @param positionSet The value for the {@code position-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPositionSet(boolean positionSet) {
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
        public Build setResizeEndChild(boolean resizeEndChild) {
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
        public Build setResizeStartChild(boolean resizeStartChild) {
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
        public Build setShrinkEndChild(boolean shrinkEndChild) {
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
        public Build setShrinkStartChild(boolean shrinkStartChild) {
            names.add("shrink-start-child");
            values.add(org.gtk.gobject.Value.create(shrinkStartChild));
            return this;
        }
        
        /**
         * The first child.
         * @param startChild The value for the {@code start-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStartChild(org.gtk.gtk.Widget startChild) {
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
        public Build setWideHandle(boolean wideHandle) {
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
    
    private static class Callbacks {
        
        public static boolean signalPanedAcceptPosition(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.AcceptPosition) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE));
        }
        
        public static boolean signalPanedCancelPosition(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.CancelPosition) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE));
        }
        
        public static boolean signalPanedCycleChildFocus(MemoryAddress source, int reversed, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.CycleChildFocus) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE), reversed != 0);
        }
        
        public static boolean signalPanedCycleHandleFocus(MemoryAddress source, int reversed, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.CycleHandleFocus) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE), reversed != 0);
        }
        
        public static boolean signalPanedMoveHandle(MemoryAddress source, int scrollType, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.MoveHandle) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE), new org.gtk.gtk.ScrollType(scrollType));
        }
        
        public static boolean signalPanedToggleHandleFocus(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Paned.ToggleHandleFocus) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Paned(source, Ownership.NONE));
        }
    }
}
