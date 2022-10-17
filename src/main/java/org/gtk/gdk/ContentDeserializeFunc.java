package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of a function that can be registered with gdk_content_register_deserializer().
 * <p>
 * When the function gets called to operate on content, it can call functions on the
 * {@code deserializer} object to obtain the mime type, input stream, user data, etc. for its
 * operation.
 */
@FunctionalInterface
public interface ContentDeserializeFunc {
        void onContentDeserializeFunc(@NotNull ContentDeserializer deserializer);
}
