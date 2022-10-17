package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkStatusbar} widget is usually placed along the bottom of an application's
 * main {@link Window}.
 * <p>
 * <img src="./doc-files/statusbar.png" alt="An example GtkStatusbar">
 * <p>
 * A {@code GtkStatusBar} may provide a regular commentary of the application's
 * status (as is usually the case in a web browser, for example), or may be
 * used to simply output a message when the status changes, (when an upload
 * is complete in an FTP client, for example).
 * <p>
 * Status bars in GTK maintain a stack of messages. The message at
 * the top of the each bar’s stack is the one that will currently be displayed.
 * <p>
 * Any messages added to a statusbar’s stack must specify a context id that
 * is used to uniquely identify the source of a message. This context id can
 * be generated by {@link Statusbar#getContextId}, given a message and
 * the statusbar that it will be added to. Note that messages are stored in a
 * stack, and when choosing which message to display, the stack structure is
 * adhered to, regardless of the context identifier of a message.
 * <p>
 * One could say that a statusbar maintains one stack of messages for
 * display purposes, but allows multiple message producers to maintain
 * sub-stacks of the messages they produced (via context ids).
 * <p>
 * Status bars are created using {@link Statusbar#Statusbar}.
 * <p>
 * Messages are added to the bar’s stack with {@link Statusbar#push}.
 * <p>
 * The message at the top of the stack can be removed using
 * {@link Statusbar#pop}. A message can be removed from anywhere in the
 * stack if its message id was recorded at the time it was added. This is done
 * using {@link Statusbar#remove}.
 * 
 * <h2>CSS node</h2>
 * {@code GtkStatusbar} has a single CSS node with name {@code statusbar}.
 */
public class Statusbar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Statusbar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Statusbar */
    public static Statusbar castFrom(org.gtk.gobject.Object gobject) {
        return new Statusbar(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_statusbar_new = Interop.downcallHandle(
        "gtk_statusbar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_statusbar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkStatusbar} ready for messages.
     */
    public Statusbar() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_statusbar_get_context_id = Interop.downcallHandle(
        "gtk_statusbar_get_context_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a new context identifier, given a description
     * of the actual context.
     * <p>
     * Note that the description is not shown in the UI.
     */
    public int getContextId(@NotNull java.lang.String contextDescription) {
        int RESULT;
        try {
            RESULT = (int) gtk_statusbar_get_context_id.invokeExact(handle(), Interop.allocateNativeString(contextDescription));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_statusbar_pop = Interop.downcallHandle(
        "gtk_statusbar_pop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the first message in the {@code GtkStatusbar}’s stack
     * with the given context id.
     * <p>
     * Note that this may not change the displayed message,
     * if the message at the top of the stack has a different
     * context id.
     */
    public @NotNull void pop(@NotNull int contextId) {
        try {
            gtk_statusbar_pop.invokeExact(handle(), contextId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_statusbar_push = Interop.downcallHandle(
        "gtk_statusbar_push",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Pushes a new message onto a statusbar’s stack.
     */
    public int push(@NotNull int contextId, @NotNull java.lang.String text) {
        int RESULT;
        try {
            RESULT = (int) gtk_statusbar_push.invokeExact(handle(), contextId, Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_statusbar_remove = Interop.downcallHandle(
        "gtk_statusbar_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Forces the removal of a message from a statusbar’s stack.
     * The exact {@code context_id} and {@code message_id} must be specified.
     */
    public @NotNull void remove(@NotNull int contextId, @NotNull int messageId) {
        try {
            gtk_statusbar_remove.invokeExact(handle(), contextId, messageId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_statusbar_remove_all = Interop.downcallHandle(
        "gtk_statusbar_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Forces the removal of all messages from a statusbar's
     * stack with the exact {@code context_id}.
     */
    public @NotNull void removeAll(@NotNull int contextId) {
        try {
            gtk_statusbar_remove_all.invokeExact(handle(), contextId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TextPoppedHandler {
        void signalReceived(Statusbar source, @NotNull int contextId, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message is popped off a statusbar's stack.
     */
    public SignalHandle onTextPopped(TextPoppedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("text-popped"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Statusbar.Callbacks.class, "signalStatusbarTextPopped",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TextPushedHandler {
        void signalReceived(Statusbar source, @NotNull int contextId, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message gets pushed onto a statusbar's stack.
     */
    public SignalHandle onTextPushed(TextPushedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("text-pushed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Statusbar.Callbacks.class, "signalStatusbarTextPushed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalStatusbarTextPopped(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Statusbar.TextPoppedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Statusbar(Refcounted.get(source)), contextId, text.getUtf8String(0));
        }
        
        public static void signalStatusbarTextPushed(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Statusbar.TextPushedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Statusbar(Refcounted.get(source)), contextId, text.getUtf8String(0));
        }
        
    }
}
