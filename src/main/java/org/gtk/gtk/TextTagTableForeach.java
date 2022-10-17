package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every {@code GtkTextTag} inside a {@code GtkTextTagTable}.
 */
@FunctionalInterface
public interface TextTagTableForeach {
        void onTextTagTableForeach(@NotNull TextTag tag);
}
