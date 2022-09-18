package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkEmojiChooser</code> is used by text widgets such as <code>GtkEntry</code> or<code>GtkTextView</code> to let users insert Emoji characters.
 * <p>
 * !{@link [An example GtkEmojiChooser]}(emojichooser.png)
 * <p><code>GtkEmojiChooser</code> emits the {@link [signal@Gtk.EmojiChooser::emoji-picked] (ref=signal)}
 * signal when an Emoji is selected.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * popover
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  box.emoji-searchbar
 * &<code>#9474</code>    &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  entry.search
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box.emoji-toolbar
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  button.image-button.emoji-section
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  ...
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  button.image-button.emoji-section
 * </pre>
 * <p>
 * Every <code>GtkEmojiChooser</code> consists of a main node called popover.
 * The contents of the popover are largely implementation defined
 * and supposed to inherit general styles.
 * The top searchbar used to search emoji and gets the .emoji-searchbar
 * style class itself.
 * The bottom toolbar used to switch between different emoji categories
 * consists of buttons with the .emoji-section style class and gets the
 * .emoji-toolbar style class itself.
 */
public class EmojiChooser extends Popover implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public EmojiChooser(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EmojiChooser */
    public static EmojiChooser castFrom(org.gtk.gobject.Object gobject) {
        return new EmojiChooser(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_emoji_chooser_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkEmojiChooser</code>.
     */
    public EmojiChooser() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface EmojiPickedHandler {
        void signalReceived(EmojiChooser source, java.lang.String text);
    }
    
    /**
     * Emitted when the user selects an Emoji.
     */
    public SignalHandle onEmojiPicked(EmojiPickedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEmojiChooserEmojiPicked", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("emoji-picked").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
