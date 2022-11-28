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
 * <p>
 * <strong>CSS node</strong><br/>
 * {@code GtkStatusbar} has a single CSS node with name {@code statusbar}.
 */
public class Statusbar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStatusbar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Statusbar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Statusbar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Statusbar if its GType is a (or inherits from) "GtkStatusbar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Statusbar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStatusbar", a ClassCastException will be thrown.
     */
    public static Statusbar castFrom(org.gtk.gobject.Object gobject) {
            return new Statusbar(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_statusbar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkStatusbar} ready for messages.
     */
    public Statusbar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Returns a new context identifier, given a description
     * of the actual context.
     * <p>
     * Note that the description is not shown in the UI.
     * @param contextDescription textual description of what context
     *   the new message is being used in
     * @return an integer id
     */
    public int getContextId(@NotNull java.lang.String contextDescription) {
        java.util.Objects.requireNonNull(contextDescription, "Parameter 'contextDescription' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_statusbar_get_context_id.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contextDescription));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the first message in the {@code GtkStatusbar}’s stack
     * with the given context id.
     * <p>
     * Note that this may not change the displayed message,
     * if the message at the top of the stack has a different
     * context id.
     * @param contextId a context identifier
     */
    public void pop(int contextId) {
        try {
            DowncallHandles.gtk_statusbar_pop.invokeExact(
                    handle(),
                    contextId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes a new message onto a statusbar’s stack.
     * @param contextId the message’s context id, as returned by
     *    gtk_statusbar_get_context_id()
     * @param text the message to add to the statusbar
     * @return a message id that can be used with
     *   {@link Statusbar#remove}.
     */
    public int push(int contextId, @NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_statusbar_push.invokeExact(
                    handle(),
                    contextId,
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Forces the removal of a message from a statusbar’s stack.
     * The exact {@code context_id} and {@code message_id} must be specified.
     * @param contextId a context identifier
     * @param messageId a message identifier, as returned by {@link Statusbar#push}
     */
    public void remove(int contextId, int messageId) {
        try {
            DowncallHandles.gtk_statusbar_remove.invokeExact(
                    handle(),
                    contextId,
                    messageId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Forces the removal of all messages from a statusbar's
     * stack with the exact {@code context_id}.
     * @param contextId a context identifier
     */
    public void removeAll(int contextId) {
        try {
            DowncallHandles.gtk_statusbar_remove_all.invokeExact(
                    handle(),
                    contextId);
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
            RESULT = (long) DowncallHandles.gtk_statusbar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface TextPopped {
        void signalReceived(Statusbar source, int contextId, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message is popped off a statusbar's stack.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Statusbar.TextPopped> onTextPopped(Statusbar.TextPopped handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("text-popped"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Statusbar.Callbacks.class, "signalStatusbarTextPopped",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Statusbar.TextPopped>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TextPushed {
        void signalReceived(Statusbar source, int contextId, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted whenever a new message gets pushed onto a statusbar's stack.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Statusbar.TextPushed> onTextPushed(Statusbar.TextPushed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("text-pushed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Statusbar.Callbacks.class, "signalStatusbarTextPushed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Statusbar.TextPushed>(handle(), RESULT);
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
         * A {@link Statusbar.Build} object constructs a {@link Statusbar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Statusbar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Statusbar} using {@link Statusbar#castFrom}.
         * @return A new instance of {@code Statusbar} with the properties 
         *         that were set in the Build object.
         */
        public Statusbar construct() {
            return Statusbar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Statusbar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_statusbar_new = Interop.downcallHandle(
            "gtk_statusbar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_statusbar_get_context_id = Interop.downcallHandle(
            "gtk_statusbar_get_context_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_statusbar_pop = Interop.downcallHandle(
            "gtk_statusbar_pop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_statusbar_push = Interop.downcallHandle(
            "gtk_statusbar_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_statusbar_remove = Interop.downcallHandle(
            "gtk_statusbar_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_statusbar_remove_all = Interop.downcallHandle(
            "gtk_statusbar_remove_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_statusbar_get_type = Interop.downcallHandle(
            "gtk_statusbar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalStatusbarTextPopped(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Statusbar.TextPopped) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Statusbar(source, Ownership.NONE), contextId, Interop.getStringFrom(text));
        }
        
        public static void signalStatusbarTextPushed(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Statusbar.TextPushed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Statusbar(source, Ownership.NONE), contextId, Interop.getStringFrom(text));
        }
    }
}
