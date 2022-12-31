package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDropTarget} is an event controller to receive Drag-and-Drop operations.
 * <p>
 * The most basic way to use a {@code GtkDropTarget} to receive drops on a
 * widget is to create it via {@link DropTarget#DropTarget}, passing in the
 * {@code GType} of the data you want to receive and connect to the
 * {@code Gtk.DropTarget::drop} signal to receive the data:
 * <pre>{@code c
 * static gboolean
 * on_drop (GtkDropTarget *target,
 *          const GValue  *value,
 *          double         x,
 *          double         y,
 *          gpointer       data)
 * {
 *   MyWidget *self = data;
 * 
 *   // Call the appropriate setter depending on the type of data
 *   // that we received
 *   if (G_VALUE_HOLDS (value, G_TYPE_FILE))
 *     my_widget_set_file (self, g_value_get_object (value));
 *   else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
 *     my_widget_set_pixbuf (self, g_value_get_object (value));
 *   else
 *     return FALSE;
 * 
 *   return TRUE;
 * }
 * 
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDropTarget *target =
 *     gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
 * 
 *   // This widget accepts two types of drop types: GFile objects
 *   // and GdkPixbuf objects
 *   gtk_drop_target_set_gtypes (target, (GTypes [2]) {
 *     G_TYPE_FILE,
 *     GDK_TYPE_PIXBUF,
 *   }, 2);
 * 
 *   g_signal_connect (target, "drop", G_CALLBACK (on_drop), self);
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
 * }
 * }</pre>
 * <p>
 * {@code GtkDropTarget} supports more options, such as:
 * <p>
 *  * rejecting potential drops via the {@code Gtk.DropTarget::accept} signal
 *    and the {@link DropTarget#reject} function to let other drop
 *    targets handle the drop
 *  * tracking an ongoing drag operation before the drop via the
 *    {@code Gtk.DropTarget::enter}, {@code Gtk.DropTarget::motion} and
 *    {@code Gtk.DropTarget::leave} signals
 *  * configuring how to receive data by setting the
 *    {@code Gtk.DropTarget:preload} property and listening for its
 *    availability via the {@code Gtk.DropTarget:value} property
 * <p>
 * However, {@code GtkDropTarget} is ultimately modeled in a synchronous way
 * and only supports data transferred via {@code GType}. If you want full control
 * over an ongoing drop, the {@link DropTargetAsync} object gives you
 * this ability.
 * <p>
 * While a pointer is dragged over the drop target's widget and the drop
 * has not been rejected, that widget will receive the
 * {@link StateFlags#DROP_ACTIVE} state, which can be used to style the widget.
 * <p>
 * If you are not interested in receiving the drop, but just want to update
 * UI state during a Drag-and-Drop operation (e.g. switching tabs), you can
 * use {@link DropControllerMotion}.
 */
public class DropTarget extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DropTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DropTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropTarget> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DropTarget(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type type, org.gtk.gdk.DragAction actions) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_new.invokeExact(
                    type.getValue().longValue(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropTarget} object.
     * <p>
     * If the drop target should support more than 1 type, pass
     * {@code G_TYPE_INVALID} for {@code type} and then call
     * {@link DropTarget#setGtypes}.
     * @param type The supported type or {@code G_TYPE_INVALID}
     * @param actions the supported actions
     */
    public DropTarget(org.gtk.glib.Type type, org.gtk.gdk.DragAction actions) {
        super(constructNew(type, actions), Ownership.FULL);
    }
    
    /**
     * Gets the actions that this drop target supports.
     * @return the actions that this drop target supports
     */
    public org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_target_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     * @return The current drop
     */
    public @Nullable org.gtk.gdk.Drop getCurrentDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_current_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Drop.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the currently handled drop operation.
     * <p>
     * If no drop operation is going on, {@code null} is returned.
     * @return The current drop
     * @deprecated Use {@link DropTarget#getCurrentDrop} instead
     */
    @Deprecated
    public @Nullable org.gtk.gdk.Drop getDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Drop.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the data formats that this drop target accepts.
     * <p>
     * If the result is {@code null}, all formats are expected to be supported.
     * @return the supported data formats
     */
    public @Nullable org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the list of supported {@code GType}s that can be dropped on the target.
     * <p>
     * If no types have been set, {@code NULL} will be returned.
     * @param nTypes the number of {@code GType}s contained in the
     *   return value
     * @return the {@code G_TYPE_INVALID}-terminated array of types included in
     *   formats
     */
    public @Nullable org.gtk.glib.Type[] getGtypes(Out<Long> nTypes) {
        MemorySegment nTypesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_gtypes.invokeExact(
                    handle(),
                    (Addressable) (nTypes == null ? MemoryAddress.NULL : (Addressable) nTypesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (nTypes != null) nTypes.set(nTypesPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nTypes.get().intValue()];
        for (int I = 0; I < nTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Gets whether data should be preloaded on hover.
     * @return {@code true} if drop data should be preloaded
     */
    public boolean getPreload() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_target_get_preload.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the current drop data, as a {@code GValue}.
     * @return The current drop data
     */
    public @Nullable org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Rejects the ongoing drop operation.
     * <p>
     * If no drop operation is ongoing, i.e when {@code Gtk.DropTarget:current-drop}
     * is {@code null}, this function does nothing.
     * <p>
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public void reject() {
        try {
            DowncallHandles.gtk_drop_target_reject.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the actions that this drop target supports.
     * @param actions the supported actions
     */
    public void setActions(org.gtk.gdk.DragAction actions) {
        try {
            DowncallHandles.gtk_drop_target_set_actions.invokeExact(
                    handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the supported {@code GTypes} for this drop target.
     * @param types all supported {@code GType}s
     *   that can be dropped on the target
     * @param nTypes number of {@code types}
     */
    public void setGtypes(@Nullable org.gtk.glib.Type[] types, long nTypes) {
        try {
            DowncallHandles.gtk_drop_target_set_gtypes.invokeExact(
                    handle(),
                    (Addressable) (types == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false)),
                    nTypes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether data should be preloaded on hover.
     * @param preload {@code true} to preload drop data
     */
    public void setPreload(boolean preload) {
        try {
            DowncallHandles.gtk_drop_target_set_preload.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(preload, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_drop_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Accept {
        boolean run(org.gtk.gdk.Drop drop);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTarget, MemoryAddress drop) {
            var RESULT = run((org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drop)), org.gtk.gdk.Drop.fromAddress).marshal(drop, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Accept.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drop site when a drop operation is about to begin.
     * <p>
     * If the drop is not accepted, {@code false} will be returned and the drop target
     * will ignore the drop. If {@code true} is returned, the drop is accepted for now
     * but may be rejected later via a call to {@link DropTarget#reject}
     * or ultimately by returning {@code false} from a {@code Gtk.DropTarget::drop}
     * handler.
     * <p>
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the {@code drop}.
     * <p>
     * If the decision whether the drop will be accepted or rejected depends
     * on the data, this function should return {@code true}, the
     * {@code Gtk.DropTarget:preload} property should be set and the value
     * should be inspected via the ::notify:value signal, calling
     * {@link DropTarget#reject} if required.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Accept> onAccept(DropTarget.Accept handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("accept"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Drop {
        boolean run(org.gtk.gobject.Value value, double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTarget, MemoryAddress value, double x, double y) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), x, y);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Drop.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     * <p>
     * The signal handler must determine whether the pointer position is in
     * a drop zone or not. If it is not in a drop zone, it returns {@code false}
     * and no further processing is necessary.
     * <p>
     * Otherwise, the handler returns {@code true}. In this case, this handler will
     * accept the drop. The handler is responsible for using the given {@code value}
     * and performing the drop operation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Drop> onDrop(DropTarget.Drop handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drop"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Enter {
        org.gtk.gdk.DragAction run(double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTarget, double x, double y) {
            var RESULT = run(x, y);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Enter.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drop site when the pointer enters the widget.
     * <p>
     * It can be used to set up custom highlighting.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Enter> onEnter(DropTarget.Enter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("enter"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropTarget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Leave.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in
     * {@code Gtk.DropTarget::enter}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Leave> onLeave(DropTarget.Leave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("leave"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        org.gtk.gdk.DragAction run(double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTarget, double x, double y) {
            var RESULT = run(x, y);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Motion.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTarget.Motion> onMotion(DropTarget.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("motion"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DropTarget.Builder} object constructs a {@link DropTarget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DropTarget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DropTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DropTarget}.
         * @return A new instance of {@code DropTarget} with the properties 
         *         that were set in the Builder object.
         */
        public DropTarget build() {
            return (DropTarget) org.gtk.gobject.GObject.newWithProperties(
                DropTarget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GdkDragActions} that this drop target supports.
         * @param actions The value for the {@code actions} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActions(org.gtk.gdk.DragAction actions) {
            names.add("actions");
            values.add(org.gtk.gobject.Value.create(actions));
            return this;
        }
        
        /**
         * The {@code GdkDrop} that is currently being performed.
         * @param currentDrop The value for the {@code current-drop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentDrop(org.gtk.gdk.Drop currentDrop) {
            names.add("current-drop");
            values.add(org.gtk.gobject.Value.create(currentDrop));
            return this;
        }
        
        /**
         * The {@code GdkDrop} that is currently being performed.
         * @param drop The value for the {@code drop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDrop(org.gtk.gdk.Drop drop) {
            names.add("drop");
            values.add(org.gtk.gobject.Value.create(drop));
            return this;
        }
        
        /**
         * The {@code GdkContentFormats} that determine the supported data formats.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * Whether the drop data should be preloaded when the pointer is only
         * hovering over the widget but has not been released.
         * <p>
         * Setting this property allows finer grained reaction to an ongoing
         * drop at the cost of loading more data.
         * <p>
         * The default value for this property is {@code false} to avoid downloading
         * huge amounts of data by accident.
         * <p>
         * For example, if somebody drags a full document of gigabytes of text
         * from a text editor across a widget with a preloading drop target,
         * this data will be downloaded, even if the data is ultimately dropped
         * elsewhere.
         * <p>
         * For a lot of data formats, the amount of data is very small (like
         * {@code GDK_TYPE_RGBA}), so enabling this property does not hurt at all.
         * And for local-only Drag-and-Drop operations, no data transfer is done,
         * so enabling it there is free.
         * @param preload The value for the {@code preload} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPreload(boolean preload) {
            names.add("preload");
            values.add(org.gtk.gobject.Value.create(preload));
            return this;
        }
        
        /**
         * The value for this drop operation.
         * <p>
         * This is {@code null} if the data has not been loaded yet or no drop
         * operation is going on.
         * <p>
         * Data may be available before the {@code Gtk.DropTarget::drop}
         * signal gets emitted - for example when the {@code Gtk.DropTarget:preload}
         * property is set. You can use the ::notify signal to be notified
         * of available data.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(org.gtk.gobject.Value value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_target_new = Interop.downcallHandle(
            "gtk_drop_target_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_actions = Interop.downcallHandle(
            "gtk_drop_target_get_actions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_current_drop = Interop.downcallHandle(
            "gtk_drop_target_get_current_drop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_drop = Interop.downcallHandle(
            "gtk_drop_target_get_drop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_formats = Interop.downcallHandle(
            "gtk_drop_target_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_gtypes = Interop.downcallHandle(
            "gtk_drop_target_get_gtypes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_preload = Interop.downcallHandle(
            "gtk_drop_target_get_preload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_value = Interop.downcallHandle(
            "gtk_drop_target_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_reject = Interop.downcallHandle(
            "gtk_drop_target_reject",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_actions = Interop.downcallHandle(
            "gtk_drop_target_set_actions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_gtypes = Interop.downcallHandle(
            "gtk_drop_target_set_gtypes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_drop_target_set_preload = Interop.downcallHandle(
            "gtk_drop_target_set_preload",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_get_type = Interop.downcallHandle(
            "gtk_drop_target_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
