package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class SignalListItemFactory extends ListItemFactory {

    public SignalListItemFactory(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SignalListItemFactory */
    public static SignalListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new SignalListItemFactory(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_signal_list_item_factory_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSignalListItemFactory}.
     * <p>
     * You need to connect signal handlers before you use it.
     */
    public SignalListItemFactory() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface BindHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
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
     */
    public SignalHandle onBind(BindHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("bind").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.class, "__signalSignalListItemFactoryBind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSignalListItemFactoryBind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalListItemFactory.BindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    @FunctionalInterface
    public interface SetupHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a new listitem has been created and needs to be setup for use.
     * <p>
     * It is the first signal emitted for every listitem.
     * <p>
     * The {@code Gtk.SignalListItemFactory::teardown} signal is the opposite
     * of this signal and can be used to undo everything done in this signal.
     */
    public SignalHandle onSetup(SetupHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("setup").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.class, "__signalSignalListItemFactorySetup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSignalListItemFactorySetup(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalListItemFactory.SetupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    @FunctionalInterface
    public interface TeardownHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a listitem is about to be destroyed.
     * <p>
     * It is the last signal ever emitted for this {@code listitem}.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::setup}
     * signal and should be used to undo everything done in that signal.
     */
    public SignalHandle onTeardown(TeardownHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("teardown").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.class, "__signalSignalListItemFactoryTeardown",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSignalListItemFactoryTeardown(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalListItemFactory.TeardownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    @FunctionalInterface
    public interface UnbindHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a listitem has been removed from use in a list widget
     * and its new {@code Gtk.ListItem:item} is about to be unset.
     * <p>
     * This signal is the opposite of the {@code Gtk.SignalListItemFactory::bind}
     * signal and should be used to undo everything done in that signal.
     */
    public SignalHandle onUnbind(UnbindHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("unbind").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalListItemFactory.class, "__signalSignalListItemFactoryUnbind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSignalListItemFactoryUnbind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalListItemFactory.UnbindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
}
