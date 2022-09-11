package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSignalListItemFactory` is a `GtkListItemFactory` that emits signals
 * to to manage listitems.
 * 
 * Signals are emitted for every listitem in the same order:
 * 
 *  1. [signal@Gtk.SignalListItemFactory::setup] is emitted to set up permanent
 *  things on the listitem. This usually means constructing the widgets used in
 *  the row and adding them to the listitem.
 * 
 *  2. [signal@Gtk.SignalListItemFactory::bind] is emitted to bind the item passed
 *  via [property@Gtk.ListItem:item] to the widgets that have been created in
 *  step 1 or to add item-specific widgets. Signals are connected to listen to
 *  changes - both to changes in the item to update the widgets or to changes
 *  in the widgets to update the item. After this signal has been called, the
 *  listitem may be shown in a list widget.
 * 
 *  3. [signal@Gtk.SignalListItemFactory::unbind] is emitted to undo everything
 *  done in step 2. Usually this means disconnecting signal handlers. Once this
 *  signal has been called, the listitem will no longer be used in a list
 *  widget.
 * 
 *  4. [signal@Gtk.SignalListItemFactory::bind] and
 *  [signal@Gtk.SignalListItemFactory::unbind] may be emitted multiple times
 *  again to bind the listitem for use with new items. By reusing listitems,
 *  potentially costly setup can be avoided. However, it means code needs to
 *  make sure to properly clean up the listitem in step 3 so that no information
 *  from the previous use leaks into the next use.
 * 
 * 5. [signal@Gtk.SignalListItemFactory::teardown] is emitted to allow undoing
 * the effects of [signal@Gtk.SignalListItemFactory::setup]. After this signal
 * was emitted on a listitem, the listitem will be destroyed and not be used again.
 * 
 * Note that during the signal emissions, changing properties on the
 * `GtkListItem`s passed will not trigger notify signals as the listitem's
 * notifications are frozen. See g_object_freeze_notify() for details.
 * 
 * For tracking changes in other properties in the `GtkListItem`, the
 * ::notify signal is recommended. The signal can be connected in the
 * [signal@Gtk.SignalListItemFactory::setup] signal and removed again during
 * [signal@Gtk.SignalListItemFactory::teardown].
 */
public class SignalListItemFactory extends ListItemFactory {

    public SignalListItemFactory(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SignalListItemFactory */
    public static SignalListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new SignalListItemFactory(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkSignalListItemFactory`.
     * 
     * You need to connect signal handlers before you use it.
     */
    public SignalListItemFactory() {
        super(References.get(gtk_h.gtk_signal_list_item_factory_new(), true));
    }
    
    @FunctionalInterface
    public interface BindHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a new [property@Gtk.ListItem:item] has been set
     * on the @listitem and should be bound for use.
     * 
     * After this signal was emitted, the listitem might be shown in
     * a [class@Gtk.ListView] or other list widget.
     * 
     * The [signal@Gtk.SignalListItemFactory::unbind] signal is the
     * opposite of this signal and can be used to undo everything done
     * in this signal.
     */
    public void onBind(BindHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryBind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("bind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SetupHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a new listitem has been created and needs to be setup for use.
     * 
     * It is the first signal emitted for every listitem.
     * 
     * The [signal@Gtk.SignalListItemFactory::teardown] signal is the opposite
     * of this signal and can be used to undo everything done in this signal.
     */
    public void onSetup(SetupHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactorySetup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("setup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TeardownHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a listitem is about to be destroyed.
     * 
     * It is the last signal ever emitted for this @listitem.
     * 
     * This signal is the opposite of the [signal@Gtk.SignalListItemFactory::setup]
     * signal and should be used to undo everything done in that signal.
     */
    public void onTeardown(TeardownHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryTeardown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("teardown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnbindHandler {
        void signalReceived(SignalListItemFactory source, ListItem listitem);
    }
    
    /**
     * Emitted when a listitem has been removed from use in a list widget
     * and its new [property@Gtk.ListItem:item] is about to be unset.
     * 
     * This signal is the opposite of the [signal@Gtk.SignalListItemFactory::bind]
     * signal and should be used to undo everything done in that signal.
     */
    public void onUnbind(UnbindHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryUnbind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unbind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
