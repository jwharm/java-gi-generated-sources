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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalListItemFactory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SignalListItemFactory if its GType is a (or inherits from) "GtkSignalListItemFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SignalListItemFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSignalListItemFactory", a ClassCastException will be thrown.
     */
    public static SignalListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSignalListItemFactory"))) {
            return new SignalListItemFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSignalListItemFactory");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface Bind {
        void signalReceived(SignalListItemFactory source, @NotNull org.gtk.gtk.ListItem listitem);
    }
    
    /**
     * Emitted when a new {@code Gtk.ListItem:item} has been set
     * on the {@code listitem} and should be bound for use.
     * <p>
     * After this signal was emitted, the listitem might be shown in
     * a {@link ListView} or other list widget.
     * <p>
     * The {@code Gtk.SignalListItemFactory::unbind} signal is the
     * opposite of this signal and can be used to undo everything done
     * in this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Bind> onBind(SignalListItemFactory.Bind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("bind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.Callbacks.class, "signalSignalListItemFactoryBind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalListItemFactory.Bind>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Setup {
        void signalReceived(SignalListItemFactory source, @NotNull org.gtk.gtk.ListItem listitem);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("setup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.Callbacks.class, "signalSignalListItemFactorySetup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalListItemFactory.Setup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Teardown {
        void signalReceived(SignalListItemFactory source, @NotNull org.gtk.gtk.ListItem listitem);
    }
    
    /**
     * Emitted when a listitem is about to be destroyed.
     * <p>
     * It is the last signal ever emitted for this {@code listitem}.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::setup}
     * signal and should be used to undo everything done in that signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Teardown> onTeardown(SignalListItemFactory.Teardown handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("teardown"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.Callbacks.class, "signalSignalListItemFactoryTeardown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalListItemFactory.Teardown>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unbind {
        void signalReceived(SignalListItemFactory source, @NotNull org.gtk.gtk.ListItem listitem);
    }
    
    /**
     * Emitted when a listitem has been removed from use in a list widget
     * and its new {@code Gtk.ListItem:item} is about to be unset.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::bind}
     * signal and should be used to undo everything done in that signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalListItemFactory.Unbind> onUnbind(SignalListItemFactory.Unbind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unbind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.Callbacks.class, "signalSignalListItemFactoryUnbind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalListItemFactory.Unbind>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_signal_list_item_factory_new = Interop.downcallHandle(
            "gtk_signal_list_item_factory_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalSignalListItemFactoryBind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalListItemFactory.Bind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalListItemFactory(source, Ownership.UNKNOWN), new org.gtk.gtk.ListItem(listitem, Ownership.NONE));
        }
        
        public static void signalSignalListItemFactorySetup(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalListItemFactory.Setup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalListItemFactory(source, Ownership.UNKNOWN), new org.gtk.gtk.ListItem(listitem, Ownership.NONE));
        }
        
        public static void signalSignalListItemFactoryTeardown(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalListItemFactory.Teardown) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalListItemFactory(source, Ownership.UNKNOWN), new org.gtk.gtk.ListItem(listitem, Ownership.NONE));
        }
        
        public static void signalSignalListItemFactoryUnbind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalListItemFactory.Unbind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalListItemFactory(source, Ownership.UNKNOWN), new org.gtk.gtk.ListItem(listitem, Ownership.NONE));
        }
    }
}
