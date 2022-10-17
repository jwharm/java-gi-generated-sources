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
 * 
 * <h1>CSS nodes</h1>
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
public class EmojiChooser extends Popover implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public EmojiChooser(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EmojiChooser */
    public static EmojiChooser castFrom(org.gtk.gobject.Object gobject) {
        return new EmojiChooser(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_emoji_chooser_new = Interop.downcallHandle(
        "gtk_emoji_chooser_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_emoji_chooser_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkEmojiChooser}.
     */
    public EmojiChooser() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface EmojiPickedHandler {
        void signalReceived(EmojiChooser source, @NotNull java.lang.String text);
    }
    
    /**
     * Emitted when the user selects an Emoji.
     */
    public SignalHandle onEmojiPicked(EmojiPickedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("emoji-picked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EmojiChooser.Callbacks.class, "signalEmojiChooserEmojiPicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEmojiChooserEmojiPicked(MemoryAddress source, MemoryAddress text, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EmojiChooser.EmojiPickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EmojiChooser(Refcounted.get(source)), text.getUtf8String(0));
        }
        
    }
}
