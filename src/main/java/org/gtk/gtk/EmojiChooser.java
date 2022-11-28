package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkEmojiChooser} is used by text widgets such as {@code GtkEntry} or
 * {@code GtkTextView} to let users insert Emoji characters.
 * <p>
 * <img src="./doc-files/emojichooser.png" alt="An example GtkEmojiChooser">
 * <p>
 * {@code GtkEmojiChooser} emits the {@code Gtk.EmojiChooser::emoji-picked}
 * signal when an Emoji is selected.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * popover
 * ├── box.emoji-searchbar
 * │   ╰── entry.search
 * ╰── box.emoji-toolbar
 *     ├── button.image-button.emoji-section
 *     ├── ...
 *     ╰── button.image-button.emoji-section
 * }</pre>
 * <p>
 * Every {@code GtkEmojiChooser} consists of a main node called popover.
 * The contents of the popover are largely implementation defined
 * and supposed to inherit general styles.
 * The top searchbar used to search emoji and gets the .emoji-searchbar
 * style class itself.
 * The bottom toolbar used to switch between different emoji categories
 * consists of buttons with the .emoji-section style class and gets the
 * .emoji-toolbar style class itself.
 */
public class EmojiChooser extends org.gtk.gtk.Popover implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEmojiChooser";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EmojiChooser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EmojiChooser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EmojiChooser if its GType is a (or inherits from) "GtkEmojiChooser".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EmojiChooser} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEmojiChooser", a ClassCastException will be thrown.
     */
    public static EmojiChooser castFrom(org.gtk.gobject.Object gobject) {
            return new EmojiChooser(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_emoji_chooser_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEmojiChooser}.
     */
    public EmojiChooser() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_emoji_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface EmojiPicked {
        void signalReceived(EmojiChooser source, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted when the user selects an Emoji.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EmojiChooser.EmojiPicked> onEmojiPicked(EmojiChooser.EmojiPicked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("emoji-picked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EmojiChooser.Callbacks.class, "signalEmojiChooserEmojiPicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EmojiChooser.EmojiPicked>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Popover.Build {
        
         /**
         * A {@link EmojiChooser.Build} object constructs a {@link EmojiChooser} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EmojiChooser} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EmojiChooser} using {@link EmojiChooser#castFrom}.
         * @return A new instance of {@code EmojiChooser} with the properties 
         *         that were set in the Build object.
         */
        public EmojiChooser construct() {
            return EmojiChooser.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EmojiChooser.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_emoji_chooser_new = Interop.downcallHandle(
            "gtk_emoji_chooser_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_emoji_chooser_get_type = Interop.downcallHandle(
            "gtk_emoji_chooser_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEmojiChooserEmojiPicked(MemoryAddress source, MemoryAddress text, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EmojiChooser.EmojiPicked) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EmojiChooser(source, Ownership.NONE), Interop.getStringFrom(text));
        }
    }
}
