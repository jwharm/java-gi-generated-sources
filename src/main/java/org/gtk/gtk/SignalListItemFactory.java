package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSignalListItemFactory} is a {@code GtkListItemFactory} that emits signals
 * to to manage listitems.
 * <p>
 * Signals are emitted for every listitem in the same order:
 * <p>
 *  1. {@code Gtk.SignalListItemFactory::setup} is emitted to set up permanent
 *  things on the listitem. This usually means constructing the widgets used in
 *  the row and adding them to the listitem.
 * <p>
 *  2. {@code Gtk.SignalListItemFactory::bind} is emitted to bind the item passed
 *  via {@code Gtk.ListItem:item} to the widgets that have been created in
 *  step 1 or to add item-specific widgets. Signals are connected to listen to
 *  changes - both to changes in the item to update the widgets or to changes
 *  in the widgets to update the item. After this signal has been called, the
 *  listitem may be shown in a list widget.
 * <p>
 *  3. {@code Gtk.SignalListItemFactory::unbind} is emitted to undo everything
 *  done in step 2. Usually this means disconnecting signal handlers. Once this
 *  signal has been called, the listitem will no longer be used in a list
 *  widget.
 * <p>
 *  4. {@code Gtk.SignalListItemFactory::bind} and
 *  {@code Gtk.SignalListItemFactory::unbind} may be emitted multiple times
 *  again to bind the listitem for use with new items. By reusing listitems,
 *  potentially costly setup can be avoided. However, it means code needs to
 *  make sure to properly clean up the listitem in step 3 so that no information
 *  from the previous use leaks into the next use.
 * <p>
 * 5. {@code Gtk.SignalListItemFactory::teardown} is emitted to allow undoing
 * the effects of {@code Gtk.SignalListItemFactory::setup}. After this signal
 * was emitted on a listitem, the listitem will be destroyed and not be used again.
 * <p>
 * Note that during the signal emissions, changing properties on the
 * {@code GtkListItem}s passed will not trigger notify signals as the listitem's
 * notifications are frozen. See g_object_freeze_notify() for details.
 * <p>
 * For tracking changes in other properties in the {@code GtkListItem}, the
 * ::notify signal is recommended. The signal can be connected in the
 * {@code Gtk.SignalListItemFactory::setup} signal and removed again during
 * {@code Gtk.SignalListItemFactory::teardown}.
 */
public class SignalListItemFactory extends org.gtk.gtk.ListItemFactory {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSignalListItemFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SignalListItemFactory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SignalListItemFactory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalListItemFactory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SignalListItemFactory(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_signal_list_item_factory_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSignalListItemFactory}.
     * <p>
     * You need to connect signal handlers before you use it.
     */
    public SignalListItemFactory() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_signal_list_item_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Bind} callback.
     */
    @FunctionalInterface
    public interface Bind {
    
        /**
         * Emitted when an object has been bound, for example when a
         * new {@code Gtk.ListItem:item} has been set on a
         * {@code GtkListItem} and should be bound for use.
         * <p>
         * After this signal was emitted, the object might be shown in
         * a {@link ListView} or other widget.
         * <p>
         * The {@code Gtk.SignalListItemFactory::unbind} signal is the
         * opposite of this signal and can be used to undo everything done
         * in this signal.
         */
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalListItemFactory, MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Bind.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when an object has been bound, for example when a
     * new {@code Gtk.ListItem:item} has been set on a
     * {@code GtkListItem} and should be bound for use.
     * <p>
     * After this signal was emitted, the object might be shown in
     * a {@link ListView} or other widget.
     * <p>
     * The {@code Gtk.SignalListItemFactory::unbind} signal is the
     * opposite of this signal and can be used to undo everything done
     * in this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Bind> onBind(SignalListItemFactory.Bind handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("bind", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Setup} callback.
     */
    @FunctionalInterface
    public interface Setup {
    
        /**
         * Emitted when a new listitem has been created and needs to be setup for use.
         * <p>
         * It is the first signal emitted for every listitem.
         * <p>
         * The {@code Gtk.SignalListItemFactory::teardown} signal is the opposite
         * of this signal and can be used to undo everything done in this signal.
         */
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalListItemFactory, MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Setup.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a new listitem has been created and needs to be setup for use.
     * <p>
     * It is the first signal emitted for every listitem.
     * <p>
     * The {@code Gtk.SignalListItemFactory::teardown} signal is the opposite
     * of this signal and can be used to undo everything done in this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Setup> onSetup(SignalListItemFactory.Setup handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("setup", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Teardown} callback.
     */
    @FunctionalInterface
    public interface Teardown {
    
        /**
         * Emitted when an object is about to be destroyed.
         * <p>
         * It is the last signal ever emitted for this {@code object}.
         * <p>
         * This signal is the opposite of the {@code Gtk.SignalListItemFactory::setup}
         * signal and should be used to undo everything done in that signal.
         */
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalListItemFactory, MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Teardown.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when an object is about to be destroyed.
     * <p>
     * It is the last signal ever emitted for this {@code object}.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::setup}
     * signal and should be used to undo everything done in that signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Teardown> onTeardown(SignalListItemFactory.Teardown handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("teardown", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Unbind} callback.
     */
    @FunctionalInterface
    public interface Unbind {
    
        /**
         * Emitted when a object has been unbound from its item, for example when
         * a listitem was removed from use in a list widget
         * and its new {@code Gtk.ListItem:item} is about to be unset.
         * <p>
         * This signal is the opposite of the {@code Gtk.SignalListItemFactory::bind}
         * signal and should be used to undo everything done in that signal.
         */
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalListItemFactory, MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Unbind.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a object has been unbound from its item, for example when
     * a listitem was removed from use in a list widget
     * and its new {@code Gtk.ListItem:item} is about to be unset.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::bind}
     * signal and should be used to undo everything done in that signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Unbind> onUnbind(SignalListItemFactory.Unbind handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unbind", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SignalListItemFactory.Builder} object constructs a {@link SignalListItemFactory} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SignalListItemFactory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ListItemFactory.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SignalListItemFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SignalListItemFactory}.
         * @return A new instance of {@code SignalListItemFactory} with the properties 
         *         that were set in the Builder object.
         */
        public SignalListItemFactory build() {
            return (SignalListItemFactory) org.gtk.gobject.GObject.newWithProperties(
                SignalListItemFactory.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_signal_list_item_factory_new = Interop.downcallHandle(
                "gtk_signal_list_item_factory_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_signal_list_item_factory_get_type = Interop.downcallHandle(
                "gtk_signal_list_item_factory_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_signal_list_item_factory_get_type != null;
    }
}
