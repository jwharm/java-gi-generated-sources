package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSignalListItemFactory</code> is a <code>GtkListItemFactory</code> that emits signals
 * to to manage listitems.
 * <p>
 * Signals are emitted for every listitem in the same order:
 * <p>
 *  1. {@link [signal@Gtk.SignalListItemFactory::setup] (ref=signal)} is emitted to set up permanent
 *  things on the listitem. This usually means constructing the widgets used in
 *  the row and adding them to the listitem.
 * <p>
 *  2. {@link [signal@Gtk.SignalListItemFactory::bind] (ref=signal)} is emitted to bind the item passed
 *  via {@link [property@Gtk.ListItem:item] (ref=property)} to the widgets that have been created in
 *  step 1 or to add item-specific widgets. Signals are connected to listen to
 *  changes - both to changes in the item to update the widgets or to changes
 *  in the widgets to update the item. After this signal has been called, the
 *  listitem may be shown in a list widget.
 * <p>
 *  3. {@link [signal@Gtk.SignalListItemFactory::unbind] (ref=signal)} is emitted to undo everything
 *  done in step 2. Usually this means disconnecting signal handlers. Once this
 *  signal has been called, the listitem will no longer be used in a list
 *  widget.
 * <p>
 *  4. {@link [signal@Gtk.SignalListItemFactory::bind] (ref=signal)} and
 *  {@link [signal@Gtk.SignalListItemFactory::unbind] (ref=signal)} may be emitted multiple times
 *  again to bind the listitem for use with new items. By reusing listitems,
 *  potentially costly setup can be avoided. However, it means code needs to
 *  make sure to properly clean up the listitem in step 3 so that no information
 *  from the previous use leaks into the next use.
 * <p>
 * 5. {@link [signal@Gtk.SignalListItemFactory::teardown] (ref=signal)} is emitted to allow undoing
 * the effects of {@link [signal@Gtk.SignalListItemFactory::setup] (ref=signal)}. After this signal
 * was emitted on a listitem, the listitem will be destroyed and not be used again.
 * <p>
 * Note that during the signal emissions, changing properties on the<code>GtkListItem</code>s passed will not trigger notify signals as the listitem&<code>#39</code> s
 * notifications are frozen. See g_object_freeze_notify() for details.
 * <p>
 * For tracking changes in other properties in the <code>GtkListItem</code>, the
 * ::notify signal is recommended. The signal can be connected in the
 * {@link [signal@Gtk.SignalListItemFactory::setup] (ref=signal)} signal and removed again during
 * {@link [signal@Gtk.SignalListItemFactory::teardown] (ref=signal)}.
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
     * Creates a new <code>GtkSignalListItemFactory</code>.
     * 
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
     * Emitted when a new {@link [property@Gtk.ListItem:item] (ref=property)} has been set
     * on the @listitem and should be bound for use.
     * 
     * After this signal was emitted, the listitem might be shown in
     * a {@link org.gtk.gtk.ListView} or other list widget.
     * 
     * The {@link [signal@Gtk.SignalListItemFactory::unbind] (ref=signal)} signal is the
     * opposite of this signal and can be used to undo everything done
     * in this signal.
     */
    public SignalHandle onBind(BindHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryBind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("bind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * The {@link [signal@Gtk.SignalListItemFactory::teardown] (ref=signal)} signal is the opposite
     * of this signal and can be used to undo everything done in this signal.
     */
    public SignalHandle onSetup(SetupHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactorySetup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("setup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This signal is the opposite of the {@link [signal@Gtk.SignalListItemFactory::setup] (ref=signal)}
     * signal and should be used to undo everything done in that signal.
     */
    public SignalHandle onTeardown(TeardownHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryTeardown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("teardown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * and its new {@link [property@Gtk.ListItem:item] (ref=property)} is about to be unset.
     * 
     * This signal is the opposite of the {@link [signal@Gtk.SignalListItemFactory::bind] (ref=signal)}
     * signal and should be used to undo everything done in that signal.
     */
    public SignalHandle onUnbind(UnbindHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalListItemFactoryUnbind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unbind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
