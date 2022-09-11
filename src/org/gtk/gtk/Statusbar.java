package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkStatusbar` widget is usually placed along the bottom of an application's
 * main [class@Gtk.Window].
 * 
 * ![An example GtkStatusbar](statusbar.png)
 * 
 * A `GtkStatusBar` may provide a regular commentary of the application's
 * status (as is usually the case in a web browser, for example), or may be
 * used to simply output a message when the status changes, (when an upload
 * is complete in an FTP client, for example).
 * 
 * Status bars in GTK maintain a stack of messages. The message at
 * the top of the each bar’s stack is the one that will currently be displayed.
 * 
 * Any messages added to a statusbar’s stack must specify a context id that
 * is used to uniquely identify the source of a message. This context id can
 * be generated by [method@Gtk.Statusbar.get_context_id], given a message and
 * the statusbar that it will be added to. Note that messages are stored in a
 * stack, and when choosing which message to display, the stack structure is
 * adhered to, regardless of the context identifier of a message.
 * 
 * One could say that a statusbar maintains one stack of messages for
 * display purposes, but allows multiple message producers to maintain
 * sub-stacks of the messages they produced (via context ids).
 * 
 * Status bars are created using [ctor@Gtk.Statusbar.new].
 * 
 * Messages are added to the bar’s stack with [method@Gtk.Statusbar.push].
 * 
 * The message at the top of the stack can be removed using
 * [method@Gtk.Statusbar.pop]. A message can be removed from anywhere in the
 * stack if its message id was recorded at the time it was added. This is done
 * using [method@Gtk.Statusbar.remove].
 * 
 * ## CSS node
 * 
 * `GtkStatusbar` has a single CSS node with name `statusbar`.
 */
public class Statusbar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Statusbar(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Statusbar */
    public static Statusbar castFrom(org.gtk.gobject.Object gobject) {
        return new Statusbar(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkStatusbar` ready for messages.
     */
    public Statusbar() {
        super(References.get(gtk_h.gtk_statusbar_new(), false));
    }
    
    /**
     * Returns a new context identifier, given a description
     * of the actual context.
     * 
     * Note that the description is not shown in the UI.
     */
    public int getContextId(java.lang.String contextDescription) {
        var RESULT = gtk_h.gtk_statusbar_get_context_id(handle(), Interop.allocateNativeString(contextDescription).handle());
        return RESULT;
    }
    
    /**
     * Removes the first message in the `GtkStatusbar`’s stack
     * with the given context id.
     * 
     * Note that this may not change the displayed message,
     * if the message at the top of the stack has a different
     * context id.
     */
    public void pop(int contextId) {
        gtk_h.gtk_statusbar_pop(handle(), contextId);
    }
    
    /**
     * Pushes a new message onto a statusbar’s stack.
     */
    public int push(int contextId, java.lang.String text) {
        var RESULT = gtk_h.gtk_statusbar_push(handle(), contextId, Interop.allocateNativeString(text).handle());
        return RESULT;
    }
    
    /**
     * Forces the removal of a message from a statusbar’s stack.
     * The exact @context_id and @message_id must be specified.
     */
    public void remove(int contextId, int messageId) {
        gtk_h.gtk_statusbar_remove(handle(), contextId, messageId);
    }
    
    /**
     * Forces the removal of all messages from a statusbar's
     * stack with the exact @context_id.
     */
    public void removeAll(int contextId) {
        gtk_h.gtk_statusbar_remove_all(handle(), contextId);
    }
    
    @FunctionalInterface
    public interface TextPoppedHandler {
        void signalReceived(Statusbar source, int contextId, java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message is popped off a statusbar's stack.
     */
    public void onTextPopped(TextPoppedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalStatusbarTextPopped", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("text-popped").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TextPushedHandler {
        void signalReceived(Statusbar source, int contextId, java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message gets pushed onto a statusbar's stack.
     */
    public void onTextPushed(TextPushedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalStatusbarTextPushed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("text-pushed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
