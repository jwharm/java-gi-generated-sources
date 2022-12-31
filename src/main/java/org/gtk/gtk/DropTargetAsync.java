package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDropTargetAsync} is an event controller to receive Drag-and-Drop
 * operations, asynchronously.
 * <p>
 * It is the more complete but also more complex method of handling drop
 * operations compared to {@link DropTarget}, and you should only use
 * it if {@code GtkDropTarget} doesn't provide all the features you need.
 * <p>
 * To use a {@code GtkDropTargetAsync} to receive drops on a widget, you create
 * a {@code GtkDropTargetAsync} object, configure which data formats and actions
 * you support, connect to its signals, and then attach it to the widget
 * with {@link Widget#addController}.
 * <p>
 * During a drag operation, the first signal that a {@code GtkDropTargetAsync}
 * emits is {@code Gtk.DropTargetAsync::accept}, which is meant to determine
 * whether the target is a possible drop site for the ongoing drop. The
 * default handler for the ::accept signal accepts the drop if it finds
 * a compatible data format and an action that is supported on both sides.
 * <p>
 * If it is, and the widget becomes a target, you will receive a
 * {@code Gtk.DropTargetAsync::drag-enter} signal, followed by
 * {@code Gtk.DropTargetAsync::drag-motion} signals as the pointer moves,
 * optionally a {@code Gtk.DropTargetAsync::drop} signal when a drop happens,
 * and finally a {@code Gtk.DropTargetAsync::drag-leave} signal when the
 * pointer moves off the widget.
 * <p>
 * The ::drag-enter and ::drag-motion handler return a {@code GdkDragAction}
 * to update the status of the ongoing operation. The ::drop handler
 * should decide if it ultimately accepts the drop and if it does, it
 * should initiate the data transfer and finish the operation by calling
 * {@link org.gtk.gdk.Drop#finish}.
 * <p>
 * Between the ::drag-enter and ::drag-leave signals the widget is a
 * current drop target, and will receive the {@link StateFlags#DROP_ACTIVE}
 * state, which can be used by themes to style the widget as a drop target.
 */
public class DropTargetAsync extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropTargetAsync";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DropTargetAsync proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DropTargetAsync(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropTargetAsync> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DropTargetAsync(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_async_new.invokeExact(
                    (Addressable) (formats == null ? MemoryAddress.NULL : formats.handle()),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        formats.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropTargetAsync} object.
     * @param formats the supported data formats
     * @param actions the supported actions
     */
    public DropTargetAsync(@Nullable org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        super(constructNew(formats, actions), Ownership.FULL);
    }
    
    /**
     * Gets the actions that this drop target supports.
     * @return the actions that this drop target supports
     */
    public org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_target_async_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_target_async_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the {@code drop} as not accepted on this drag site.
     * <p>
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     * @param drop the {@code GdkDrop} of an ongoing drag operation
     */
    public void rejectDrop(org.gtk.gdk.Drop drop) {
        try {
            DowncallHandles.gtk_drop_target_async_reject_drop.invokeExact(
                    handle(),
                    drop.handle());
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
            DowncallHandles.gtk_drop_target_async_set_actions.invokeExact(
                    handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the data formats that this drop target will accept.
     * @param formats the supported data formats or {@code null} for any format
     */
    public void setFormats(@Nullable org.gtk.gdk.ContentFormats formats) {
        try {
            DowncallHandles.gtk_drop_target_async_set_formats.invokeExact(
                    handle(),
                    (Addressable) (formats == null ? MemoryAddress.NULL : formats.handle()));
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
            RESULT = (long) DowncallHandles.gtk_drop_target_async_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Accept {
        boolean run(org.gtk.gdk.Drop drop);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTargetAsync, MemoryAddress drop) {
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
     * but may be rejected later via a call to {@link DropTargetAsync#rejectDrop}
     * or ultimately by returning {@code false} from a {@code Gtk.DropTargetAsync::drop}
     * handler.
     * <p>
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the {@code drop}.
     * <p>
     * If the decision whether the drop will be accepted or rejected needs
     * further processing, such as inspecting the data, this function should
     * return {@code true} and proceed as is {@code drop} was accepted and if it decides to
     * reject the drop later, it should call {@link DropTargetAsync#rejectDrop}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTargetAsync.Accept> onAccept(DropTargetAsync.Accept handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("accept"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEnter {
        org.gtk.gdk.DragAction run(org.gtk.gdk.Drop drop, double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTargetAsync, MemoryAddress drop, double x, double y) {
            var RESULT = run((org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drop)), org.gtk.gdk.Drop.fromAddress).marshal(drop, Ownership.NONE), x, y);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragEnter.class, DESCRIPTOR);
        
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
    public Signal<DropTargetAsync.DragEnter> onDragEnter(DropTargetAsync.DragEnter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-enter"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragLeave {
        void run(org.gtk.gdk.Drop drop);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropTargetAsync, MemoryAddress drop) {
            run((org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drop)), org.gtk.gdk.Drop.fromAddress).marshal(drop, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragLeave.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drop site when the pointer leaves the widget.
     * <p>
     * Its main purpose it to undo things done in
     * {@code GtkDropTargetAsync}::drag-enter.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTargetAsync.DragLeave> onDragLeave(DropTargetAsync.DragLeave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-leave"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragMotion {
        org.gtk.gdk.DragAction run(org.gtk.gdk.Drop drop, double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTargetAsync, MemoryAddress drop, double x, double y) {
            var RESULT = run((org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drop)), org.gtk.gdk.Drop.fromAddress).marshal(drop, Ownership.NONE), x, y);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragMotion.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted while the pointer is moving over the drop target.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTargetAsync.DragMotion> onDragMotion(DropTargetAsync.DragMotion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-motion"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Drop {
        boolean run(org.gtk.gdk.Drop drop, double x, double y);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDropTargetAsync, MemoryAddress drop, double x, double y) {
            var RESULT = run((org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drop)), org.gtk.gdk.Drop.fromAddress).marshal(drop, Ownership.NONE), x, y);
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
     * The signal handler must determine whether the pointer position is in a
     * drop zone or not. If it is not in a drop zone, it returns {@code false} and no
     * further processing is necessary.
     * <p>
     * Otherwise, the handler returns {@code true}. In this case, this handler will
     * accept the drop. The handler must ensure that {@link org.gtk.gdk.Drop#finish}
     * is called to let the source know that the drop is done. The call to
     * {@link org.gtk.gdk.Drop#finish} must only be done when all data has been received.
     * <p>
     * To receive the data, use one of the read functions provided by
     * {@link org.gtk.gdk.Drop} or
     * {@link org.gtk.gdk.Drop#readValueAsync}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropTargetAsync.Drop> onDrop(DropTargetAsync.Drop handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drop"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DropTargetAsync.Builder} object constructs a {@link DropTargetAsync} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DropTargetAsync.Builder#build()}. 
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
         * Finish building the {@link DropTargetAsync} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DropTargetAsync}.
         * @return A new instance of {@code DropTargetAsync} with the properties 
         *         that were set in the Builder object.
         */
        public DropTargetAsync build() {
            return (DropTargetAsync) org.gtk.gobject.GObject.newWithProperties(
                DropTargetAsync.getType(),
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
         * The {@code GdkContentFormats} that determines the supported data formats.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_target_async_new = Interop.downcallHandle(
            "gtk_drop_target_async_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_get_actions = Interop.downcallHandle(
            "gtk_drop_target_async_get_actions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_get_formats = Interop.downcallHandle(
            "gtk_drop_target_async_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_reject_drop = Interop.downcallHandle(
            "gtk_drop_target_async_reject_drop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_set_actions = Interop.downcallHandle(
            "gtk_drop_target_async_set_actions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_set_formats = Interop.downcallHandle(
            "gtk_drop_target_async_set_formats",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_target_async_get_type = Interop.downcallHandle(
            "gtk_drop_target_async_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
